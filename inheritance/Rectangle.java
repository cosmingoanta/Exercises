package inheritance;

public class Rectangle extends Shape {
	private int width;
	private int height;

	Rectangle()	{
		super();
	}

	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}

	Rectangle(int width, int height, String name, String material){
		super(name, material);
		this.width = width;
		this.height = height;
	}

	public void displayRectangleHeight()	{
		System.out.println("Recatngle height: " + this.height);
	}

	@Override
	public double getSize() {
		double res = this.width * this.height;
		return res;
	}

	@Override
	public String toString() {
		return String.format("Rectangle had height: %d, width: %d, ", this.height, this.width) + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null){
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}

		Rectangle aux = (Rectangle) obj;
		if(super.equals(aux) && this.width == aux.width && this.height == aux.height) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = super.hashCode();
		result = prime * result + width;
		result = prime * result + height;
		return result;
	}
}
