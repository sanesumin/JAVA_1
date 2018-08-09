package generic.ex2;

public class Box<T> {
	T object;
	
	public T get() {
		return object;
	}
	
	public void set(T object) {
		this.object = object;
	}
}
