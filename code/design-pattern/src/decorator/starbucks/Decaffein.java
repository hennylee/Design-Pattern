package decorator.starbucks;

public class Decaffein extends Beverage {

	public Decaffein() {
		description = "๋์นดํ์ธ";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
