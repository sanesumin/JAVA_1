package type.ex;

public class GarbageEx {

	public static void main(String[] args) {
		byte var1 = -128;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1:"+var1);
			//System.out.println("var2:"+var2);
		}

	}

}
