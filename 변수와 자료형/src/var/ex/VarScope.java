package var.ex;

public class VarScope {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		//변수 v1을 선언하고 그 값을 초기화
		if(v1>10) {//변수 v1의 값을 비교
			v2 = v1 - 10;
			//v1에서 10을 뺀 값을 v2에 초기화하면서v2선언
			//블록을 싼 범위 안에서만 변수 사용 가능
			//블록 밖에서 쓰려면 블록 밖에서도 선언해야함
			System.out.println(v2);
			
		}
		int v3 = v1 + v2 + 5;
		
		System.out.println(v3);
	}

}
