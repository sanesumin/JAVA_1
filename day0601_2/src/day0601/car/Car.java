package day0601.car;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Car(){
		super();
	}
	Car(String color, int cc){
		this.color =color;
		//this.cc= cc;
	}
}
