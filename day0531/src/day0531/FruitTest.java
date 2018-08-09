package day0531;

public class FruitTest {

	public static void main(String[] args) {
		Fruit banana;
		Fruit tomato;
		Fruit apple;
		
		banana = new Fruit();
		tomato = new Fruit();
		apple = new Fruit();
		
		/*banana.name = "바나나";
		tomato.name = "토마토";
		apple.name = "사과";
		
		banana.amount = 10;
		tomato.amount = 20;
		apple.amount = 30;*/
		
		banana.setName("banana");
		System.out.println(banana.getName()+"입니다!");
		
		banana.eat(banana, 5);
		tomato.eat(tomato, 10);
		apple.eat(apple, 20);

	}

}
