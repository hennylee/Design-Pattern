package decorator.starbucks;

public class DarkLoast extends Beverage {

	public DarkLoast() {
		description = "다크로스트";
	}
	
	@Override
	public double cost() {
		return .99;
	}

}
