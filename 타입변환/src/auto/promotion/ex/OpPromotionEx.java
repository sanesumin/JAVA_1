package auto.promotion.ex;

public class OpPromotionEx {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;
		//byteValue3 --> int인데 byte로 선언하여 에러가 남.
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		//컴파일 에러 원칙1에 위배: 업캐스팅된 charValue1과 charValue2는
		//int에 넣어주어야한다.
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드:"+ intValue2);
		System.out.println("출력문자 :"+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0;
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
		
	}

}
