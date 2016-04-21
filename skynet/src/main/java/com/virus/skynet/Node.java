package com.virus.skynet;

/**
 * @author mmohamed
 *
 */
public class Node {
	
	private final int index;
	
private boolean getway=false;
	
	public Node(int index) {
		this.index = index;
	}
	public boolean isGetway() {
		return getway;
	}
	public void setGetway(boolean getway) {
		this.getway = getway;
	}
	public int getIndex() {
		return index;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
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
		Node other = (Node) obj;
		if (index != other.index)
			return false;
		return true;
	}
	
	
}
