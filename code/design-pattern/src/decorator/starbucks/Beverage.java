package decorator.starbucks;

public abstract class Beverage {
	String description = "제목없음";
	
	public String getDescription() {
		return description;
	}
	
	// 서브클래스에서 구현해야 함
	public abstract double cost() ;
}
