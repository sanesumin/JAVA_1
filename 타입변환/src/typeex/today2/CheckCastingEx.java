package typeex.today2;

public class CheckCastingEx {
	//래퍼 클래스(Wrapper class) 상한/하한 구하기
	//byte : Byte.MAX_VALUE Byte.MIN_VALUE	
	//short : short.MAX_VALUE short.MIN_VALUE
	//int : Integer.MAX_VALUE Integer.MIN_VALUE	
	//long: Long.MAX_VALUE Long.MIN_VALUE
	//float: Float.MAX_VALUE Float.MIN_VALUE
	//double: Double.MAX_VALUE Double.MIN_VALUE
	public static void main(String[] args) {
		int i = 128;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환 할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요");
		}else {
			byte b = (byte)i;
			System.out.println(b);
		}

	}

}
