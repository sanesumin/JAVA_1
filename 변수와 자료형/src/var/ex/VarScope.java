package var.ex;

public class VarScope {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		//���� v1�� �����ϰ� �� ���� �ʱ�ȭ
		if(v1>10) {//���� v1�� ���� ��
			v2 = v1 - 10;
			//v1���� 10�� �� ���� v2�� �ʱ�ȭ�ϸ鼭v2����
			//����� �� ���� �ȿ����� ���� ��� ����
			//��� �ۿ��� ������ ��� �ۿ����� �����ؾ���
			System.out.println(v2);
			
		}
		int v3 = v1 + v2 + 5;
		
		System.out.println(v3);
	}

}
