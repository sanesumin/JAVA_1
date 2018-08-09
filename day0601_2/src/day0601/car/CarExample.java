package day0601.car;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car mycar = new Car();
		Car mycar = new Car("파랑",3000);
		
		System.out.println("제작회사:"+mycar.company);
		System.out.println("모델명:"+mycar.model);
		System.out.println("색깔:"+mycar.color);
		System.out.println("최고속도:"+mycar.maxSpeed);
		System.out.println("현재속도:"+mycar.speed);
		
		mycar.speed = 60;
		System.out.println("수정된 속도:"+mycar.speed);
	}

}
