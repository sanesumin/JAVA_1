package day0604.operator;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------");
		x++; //����������
		++x;
		System.out.println("x="+x);
		System.out.println("-----------");
		
		System.out.println("-----------");
		y--; //���� ����������
		--y; //���� ����������
		System.out.println("y="+y);
		System.out.println("-----------");
		
		z= x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-----------");
		
		z= ++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-----------");
		
		z = ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
