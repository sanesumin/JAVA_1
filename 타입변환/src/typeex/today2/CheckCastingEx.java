package typeex.today2;

public class CheckCastingEx {
	//���� Ŭ����(Wrapper class) ����/���� ���ϱ�
	//byte : Byte.MAX_VALUE Byte.MIN_VALUE	
	//short : short.MAX_VALUE short.MIN_VALUE
	//int : Integer.MAX_VALUE Integer.MIN_VALUE	
	//long: Long.MAX_VALUE Long.MIN_VALUE
	//float: Float.MAX_VALUE Float.MIN_VALUE
	//double: Double.MAX_VALUE Double.MIN_VALUE
	public static void main(String[] args) {
		int i = 128;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byteŸ������ ��ȯ �� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ�����ּ���");
		}else {
			byte b = (byte)i;
			System.out.println(b);
		}

	}

}
