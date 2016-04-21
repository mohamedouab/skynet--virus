package com.virus.skynet;

/**
 * @author mmohamed
 *
 */
public class SkynetAgent {
	private Node currentPosition;

	public SkynetAgent(Node currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Node getCurrentPosition() {
		return currentPosition;
	}
}
