package ex.generic.today;

public class Product<T,M> {
	//��Ƽ Ÿ�� �Ķ����: �������� Ÿ�� ������ ����ؾ� �ϴ� �ڵ��� ��쿡
	//���׸��� ��� �����ؾ� �ϴ°��� ���� ����
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
