package generic.ex2;

public class Util {
    //제너릭 메소드: 매개타입과 리턴타입으로 타입 파라미트(T)를 갖는 메소드.
	public static <T> Box<T> boxing(T t) {
		// TODO Auto-generated method stub
		Box<T> box = new Box<T>();
		box.set(t);
		return box;

	}

}
