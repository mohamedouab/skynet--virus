package com.virus.skynet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mmohamed
 *
 */
public class Network {

	private final List<Node> nodes = new ArrayList<Node>();
	private final List<Link> links = new ArrayList<Link>();
	private ArrayList<Node> getways;
	public List<Link> getLinks() {
		return links;
	}
}

