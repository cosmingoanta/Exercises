package inheritance;

public abstract class Shape {
	private String text;
	private String material;

	Shape(){
		this.text = null;
		this.material = null;
	}

	Shape(String text, String material){
		this.text = text;
		this.material = material;
	}

	 public abstract double getSize();

	@Override
	public String toString() {
		return String.format("is made of %s, contains text: \"%s\".", this.material, this.text);
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

		Shape aux = (Shape) obj;
		if(this.text.equals(aux.text) && this.material.equals(aux.material)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
	    int result = 1;
	    result = prime * result + ((text == null) ? 0 : text.hashCode());
	    result = prime * result + ((material == null) ? 0 : material.hashCode());
	    return result;
	}
}


