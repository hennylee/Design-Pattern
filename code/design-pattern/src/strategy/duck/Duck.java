package strategy.duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
	
	// 나는 행동 실행
	public void performFly() {
		flyBehavior.fly();
	}
	
	// 소리 행동 실행
	public void performQuack() {
		quackBehavior.quack();
	}
	
	// 동적으로 나는 행동을 지정
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	// 동적으로 소리 행동을 지정
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	
}


