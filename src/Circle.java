
public class Circle {

	public Circle(double radius) { //radius of a circle *2 (?)
		double circle = 2 * radius;
		return;
	}

	public static double getCircumference(double radius) { //3.14 * (radius*2)
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		double circumference = 0.00; 
		return null;
	}

	public static double getArea(double radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}

	public String getFormattedArea() {
		double area = 0.00;
		return null;
	}

	private String formatNumber(double x) {//why do i need this?
		return null;

	}

	public static int getObjectCount(String choice, int value) {
		if (choice.equals("y")) {// counts the number of times user builds circle object
			value = value + 1;
		}
		return value;
	}

}// end public class Circle