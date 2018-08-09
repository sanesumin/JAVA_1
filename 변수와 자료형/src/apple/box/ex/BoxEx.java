package apple.box.ex;



public class BoxEx {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("박수민");
		//제네릭 타입: 클래스를 설계할 때 구체적인 타입을 명시하지 않고,
		//타입 파라미터로 대체 했다가 실제 클래스가 사용 될때 구체적인 타입으로 지정
		
		String name = box.get();
		
		
		System.out.println(name);
		
		//box.set(new Apple());
		
		//Apple apple = (Apple)box.get();

	}

}
