package decorator.starbucks;

public abstract class CondimentDecorator extends Beverage {
	
	// 모든 첨가물 데코레이터에서 getDescription을 구현하도록 만들 계획
	public abstract String getDescription();
}
