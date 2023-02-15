package composition;
import java.util.ArrayList;

public class Screen {
	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;
	
	Screen(int size, int width, int length, int depth){
		this.pixels = new ArrayList<Pixel>(size);
		this.dimensions = new Dimensions(width, length, depth);
	}
	
	public void setPixel(int index, String color) {
		this.pixels.get(index).setPixel(color);
	}
	
	public String getPixel(int index) {
		return this.pixels.get(index).getColor();
	}
	
	public void colorScreen(String color) {
		for(Pixel p : pixels) {
			p.setPixel(color);
		}
	}
}
