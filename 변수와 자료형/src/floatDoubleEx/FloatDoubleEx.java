package floatDoubleEx;

public class FloatDoubleEx {

	public static void main(String[] args) {
		double var1 = 3.14;//8byte로 float의 4바이트보다
		//큰값을 가질수 있고 그래서 기본형으로 씀
		//그러므로 소수점수 중에서 기본형은 double이다.
		float var2 = 3.14f;//float는 기본형이 아니기 때문에
		//접미사 f 또는F를 붙여준다.
		
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
