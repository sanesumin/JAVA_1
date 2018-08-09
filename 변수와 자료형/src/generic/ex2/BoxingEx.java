package generic.ex2;

public class BoxingEx {
	//Box<Integer> box = <Integer> box(100);-->¸í½ÃÀû
	//box<Integer> box = boxing(100);-->¾Ï¹¬Àû
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		
		Box<String> box2 = Util.boxing("È«±æµ¿");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
