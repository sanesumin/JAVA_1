package day0608.mainactivity;

import java.util.List;

import org.omg.CORBA.portable.OutputStream;

public class MainActivity 
	extends ActionBarActivity implements View.OnClickListener{

	static final int REQUEST_ENABLE_BT =10;
	BluetoothAdapter mBluetoothAdapter;
	int mPaireDeviceCount = 0;
	Set<BluetoothDevice> mDevices;
	BluetoothDevice mRemoteDevice;
	BluetoothSocket mSocket = null;
	OutputStream mOutputStream = null;
	InputStream mInputStream = null;
	
	Thread mWorkerThread = null;
	String mStrDelimiter = "\n";
	char mCharDelimiter = '\n';
	byte[] readBuffer;
	int readBufferPosition;
	
	EditText mEditReceive, mEditSend;
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode) {
		case REQUEST_ENABLE_BT:
			if(resultCode == RESULT_OK) {
				selectDevice();
			}
			else if(resultCode == RESULT_CANCELED) {
				finish();
			}
			break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	void checkBluetooth() {
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		if(mBluetoothAdapter == null) {
			finish();
		}
		else {
			if (!mBluetoothAdapter.isEnabled()) {
				Intent enableBtIntent =
						new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
				startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
			}
			else {
				selectDevice();
			}
		}
	}
	void SelectDevice() {
		mDevices = mBluetoothAdapter.getBondedDevices();
		mPairedDeviceCount = mDevices.size();
		
		if(mPairedDeviceCount == 0) {
			finish();
		}
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("블루투스 장치 선택");
		
		List<String> listItems = new ArrayList<String>();
		for (BluetoothDevice device : mDevices) {
			listItems.add(device.getName());
		}
		listItems.add("취소");
		
		final CharSequence[] items =
				listItems.toArray(new CharSequence[listItems.size()]);
		
		builder.setItems(items, new DialogInterface.OnClicklistener() {
			public void onClick(DialogInterface dialog, int item) {
				if(item == mPairedDeviceCount) {
					finish();
				}
				else {
					connectToSelectedDevice(items[item].toString());
				}
			}
		});
		
		builder.setCancelable(false);
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	void beginListenForData() {
		final Handler handler = new Handler();
		
		readBuffer = new byte[1024];
		readBufferPosition = 0;
		
		mWorkerThread = new Thread(new Runnable() {
			public void run() {
				while(!Thread.currentThread().isInterrupted()) {
					try {
						int byteAvailable = mInputStream.available();
						if(bytesAvailable > 0{
							byte[] packedBytes = new byte[bytesAvailable];
							mInputStream.read(packetBytes);
							for(int i = 0; i < byteAvailable; i++) {
								byte b = packetBytes[i];
								if(b == mCharDelimiter) {
									byte[] encodedBytes = new byte[readBufferPosition];
									System.arraycopy(readBuffer,0,encodedBytes,0, encodedBytes.length);
									final String data = new String(encodedBytes, "US-ASCII");
									readBufferPositioin = 0;
									
									handler.post(new Runnable() {
										public void run() {
											mEditReceive.setText(mEditReceive.getText().toString()+ data + mStrDelimiter);
										}
									});
								}
								else {
									readBuffer[readBufferPosition++] = b;
								}
							}
						}
					}
					catch (IOException ex) {
						finish();
					}
				}
			}
		});
		mWorkerThread.start();
	}
	
	void sentData(String msg) {
		msg += mStrDelimiter;
		try {
			mOutputStream.write(msg.getBytes());
		}catch(Exception e) {
			finish();
		}
	}
	
	BluetoothDevice getDeviceFromBondedList(String name) {
		BluetoothDevice selectedDevice = null;
		
		for (BluetoothDevice device : mDevices) {
			if(name.equals(device.getName())) {
				selectedDevice = device;
				break;
			}
		}
		
		return selectedDevice;
	}
	
	@Override
	protected void onDestory();
		try {
			mWorkerThread.interrupt();
			mInputStream.close();
			mOutputStream.close();
			mSocket.close();
		}catch(Exception e) {}
		
		super.onDestroy();
	}

void connectToSelectedDevice(String selectedDeviceName) {
	mRemoteDevice = getDeviceFromBondedList(selectedDeviceName);
	UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
	
	try {
		mSocket = mRemoteDevice.createRfcommSocketToServiceRecode(uuid);
		mSocket.connect();
		
		mOutputStream = mSocket.getOutputStream();
		mInputStream = mSocket.getInputStream();
		
		beginListenForData();
	}catch(Exception e) {
		finish();
	}
}

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	mEditReceive = (EditText)findViewById(R.id.receiveText);
	mEditSend = (EditText)findViewById(R.id.sendText);
	
	Button button = (Button)findViewById(R.id.sendButton);
	button.setOnClickListener(this);
	
	checkBluetooth();
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	getMenuInflater().inflate(R.menu.menu_main,menu);
	return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
	int id = item.getItemId();
	
	if (id== R.id.action_settings) {
		return true;
	}
	
	return super.onOptionsItemSelected(item);
}

@Override
public void onClick(View v) {
	sendData(mEditSend.getText().toString());
	mEditSend.setText("");
	}
}