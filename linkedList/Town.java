package linkedList;

import java.util.Objects;

public class Town implements Comparable<Town>{

	private String name;
	private int distance;

	public Town(String name, int distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distance;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		return distance == other.distance && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Town o) {
		if(this.distance < o.getDistance()) {
			return -1;
		} else if(this.distance > o.getDistance()){
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
