package generic.ex2;

public class Util {
    //���ʸ� �޼ҵ�: �Ű�Ÿ�԰� ����Ÿ������ Ÿ�� �Ķ��Ʈ(T)�� ���� �޼ҵ�.
	public static <T> Box<T> boxing(T t) {
		// TODO Auto-generated method stub
		Box<T> box = new Box<T>();
		box.set(t);
		return box;

	}

}
