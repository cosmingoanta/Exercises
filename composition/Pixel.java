package composition;

public class Pixel {
	String color;
	
	Pixel(){
		this.color = "#FFFFFF";
	}
	
	Pixel(String color){
		this.color = color;
	}
	
	public void setPixel(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
