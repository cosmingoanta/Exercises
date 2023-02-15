package inheritance;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	Triangle(){
		super();
	}
	
	Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	Triangle(int base, int height, String name, String material){
		super(name, material);
		this.base = base;
		this.height = height;
	}
	
	public void displayTriangleHeight() {
		System.out.println("Triangle height: " + this.height);
	}
	
	@Override
	public double getSize() {
		double res = (this.base * this.height) / 2;
		return res;
	}
	
	@Override
	public String toString() {
		return String.format("Triangle has height: %d, base: %d, ", this.height, this.base) + super.toString();
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
		
		Triangle aux = (Triangle) obj;
		if(super.equals(aux) && this.base == aux.base && this.height == aux.height) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = super.hashCode();
		result = prime * result + base;
		result = prime * result + height;
		return result;
	}
}
