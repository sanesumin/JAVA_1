package apple.box.ex;



public class BoxEx {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("�ڼ���");
		//���׸� Ÿ��: Ŭ������ ������ �� ��ü���� Ÿ���� ������� �ʰ�,
		//Ÿ�� �Ķ���ͷ� ��ü �ߴٰ� ���� Ŭ������ ��� �ɶ� ��ü���� Ÿ������ ����
		
		String name = box.get();
		
		
		System.out.println(name);
		
		//box.set(new Apple());
		
		//Apple apple = (Apple)box.get();

	}

}
