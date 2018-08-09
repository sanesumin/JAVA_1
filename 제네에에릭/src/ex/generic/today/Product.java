package ex.generic.today;

public class Product<T,M> {
	//멀티 타입 파라미터: 여러개의 타입 종류를 사용해야 하는 코딩의 경우에
	//제네릭을 어떻게 적용해야 하는가에 대한 문법
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
