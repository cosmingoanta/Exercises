package inheritance;

public class SmallOnRoad extends OnRoad{
	
	private int aux;
	
	SmallOnRoad(String a, int n){
		super( a,  n);
	}
	
	public void test() {
		System.out.println("testSmall");
	}
}
