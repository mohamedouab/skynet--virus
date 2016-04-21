package com.virus.skynet;

/**
 * @author mmohamed
 * 
 */

public class Link {

	private final Node start;
	private final Node end;

	public Link(Node start, Node end) {
		this.start = start;
		this.end = end;
	}

	public int getStartIndex() {
		return start.getIndex();
	}

	public int getEndIndex() {
		return end.getIndex();
	}
}
