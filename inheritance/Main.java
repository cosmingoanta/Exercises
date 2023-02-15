package inheritance;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(2, 3, "T1", "bronze");
		Triangle t2 = new Triangle(2, 3, "T1", "Bronze");
		Rectangle r1 = new Rectangle(5, 98, "R1", "metal");
		Rectangle r2 = new Rectangle(11, 13, "R2", "aur");
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t1.equals(t2));
		
		ArrayList<Shape> arr = new ArrayList<Shape>();
		arr.add(t1);
		arr.add(t2);
		arr.add(r1);
		arr.add(r2);
		for(Object s : arr) {
			System.out.println(s.toString());
		}
		for(Shape s : arr) {
			System.out.println(s.getSize());
		}
		for(Shape s : arr) {
			if(s instanceof Triangle){
				((Triangle) s).displayTriangleHeight();
			} else if(s instanceof Rectangle){
				((Rectangle) s).displayRectangleHeight();
			}
		}
	}

}
