package ex.generic.today;

public class BoxEx {

	public static void main(String[] args) {
		Box <String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();
		System.out.println(str);
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(6);
		int value = box1.get();
		System.out.println(value);

	}

}
