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

	public List<Node> getGetways() {
		// pour n'est pas créer la liste des passerelles à chaque appel
		if (getways != null && !getways.isEmpty()) {
			return getways;
		}

		getways = new ArrayList<Node>();
		for (Node node : nodes) {
			if (node.isGetway()) {
				getways.add(node);
			}
		}
		return getways;
	}

	/**
	 * initialiser les noeuds du réseau.
	 * 
	 * @param nbNodes
	 */
	public void initNodes(int nbNodes) {
		for (int i = 0; i < nbNodes; i++) {
			nodes.add(new Node(i));
		}

	}

	/**
	 * cherche un noeud par son index
	 * 
	 * @param index
	 * @return
	 */
	public Node getNodeByIndex(int index) {
		for (Node node : nodes) {
			if (node.getIndex() == index) {
				return node;
			}
		}
		throw new IllegalArgumentException("No node with index : "+index);

	}
}
