package day0604.operator;

public class SingleOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		
		short s = 100;
		//short result3 = -s; //어떤 연산이던지 숫자연산은
		//int형으로 변환.short는 공간이 작아서 에러
		int result3 = -s;
		System.out.println("result3:"+result3);
	}

}
