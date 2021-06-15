package decorator.starbucks;

// 휩은 데코레이터이기 때문에, CondimentDecorator를 확장함 (CondimentDecorator는 Beverage를 확장함)
public class Whip extends CondimentDecorator {

	Beverage beverage; // 감싸고자 하는 음료를 저장하기 위한 인스턴스 변수
	
	// 생성자에 감싸고자 하는 음료 객체를 전달
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// 감싸고자 하는 음료에 첨가물 설명을 더함
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑 크림";
	}

	// 감싸고자 하는 음료에 첨가물 가격을 더함
	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
