package day0601.car;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car mycar = new Car();
		Car mycar = new Car("�Ķ�",3000);
		
		System.out.println("����ȸ��:"+mycar.company);
		System.out.println("�𵨸�:"+mycar.model);
		System.out.println("����:"+mycar.color);
		System.out.println("�ְ�ӵ�:"+mycar.maxSpeed);
		System.out.println("����ӵ�:"+mycar.speed);
		
		mycar.speed = 60;
		System.out.println("������ �ӵ�:"+mycar.speed);
	}

}
