package decorator.starbucks;

public class Decaffein extends Beverage {

	public Decaffein() {
		description = "디카페인";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
