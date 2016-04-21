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
	
	
}
