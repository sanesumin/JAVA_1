package floatDoubleEx;

public class FloatDoubleEx {

	public static void main(String[] args) {
		double var1 = 3.14;//8byte�� float�� 4����Ʈ����
		//ū���� ������ �ְ� �׷��� �⺻������ ��
		//�׷��Ƿ� �Ҽ����� �߿��� �⺻���� double�̴�.
		float var2 = 3.14f;//float�� �⺻���� �ƴϱ� ������
		//���̻� f �Ǵ�F�� �ٿ��ش�.
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
		
		int var6 = 3000000;
		double var7 =3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		

	}

}
