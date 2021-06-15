package decorator.starbucks;

public class StarbucksCoffe {

	public static void main(String[] args) {
		
		// 에스프레소
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $ " + beverage.cost());

		// 다크로스트, 2모카, 1휘핑크림
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
		
		// 하우스블랜드, 두유, 모카, 휘핑크림
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		
		System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());

		
	}

}
