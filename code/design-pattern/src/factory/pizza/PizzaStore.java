package factory.pizza;

public abstract class PizzaStore {
	
	/*
	<분점이 없을 때의 피자>
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	*/
	
	// 서브클래스에서 orderPizza 메소드를 수정할 수 없게 하고 싶다면 final로 선언하면 된다.
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		/*
		pizza = factory.CreatePizza(type);
		*/
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// Pizza의 인스턴스를 만드는 일은 팩토리 역할을 하는 메소드에서 맡아서 처리함
	protected abstract Pizza createPizza(String type);
	
	// 기타 메소드
}
