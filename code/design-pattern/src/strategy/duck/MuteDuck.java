package strategy.duck;

public class MuteDuck implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<조용~~>>");

	}

}
