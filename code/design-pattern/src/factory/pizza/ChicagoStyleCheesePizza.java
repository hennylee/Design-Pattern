package factory.pizza;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		name = "시카고 스타일 딥 디쉬 치즈 피자";
		dough = "엑스트라 씬 크러스트";
		sauce = "플럼 토마토 소스";
		
		toppings.add("모짜렐라 치즈");
	}
	
	public void cut() {
		System.out.println("네모 모양으로 자르기");
	}
}
