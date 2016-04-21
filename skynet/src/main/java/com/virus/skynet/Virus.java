package com.virus.skynet;

/**
 * @author mmohamed
 *
 */

public class Virus {
	
	public Link findAndRemoveNextLink(Network network, SkynetAgent agent){
		// le lien par defaut à supprimer c'est le premier lien
		Link result = network.getLinks().get(0);

		Node agentPosition = agent.getCurrentPosition();

		for (Link link : network.getLinks()) {
			boolean found=false;
			// on cherche la passerelle la plus proche de la position de l'agent skynet
			for (Node getway : network.getGetways()) {
				if(link.hasNode(agentPosition) && link.hasNode(getway)){
				result=link;
				found=true;

				break;
				}
			}
			if(found) {
				break;
			}
		}
		network.getLinks().remove(result);
		return result;
	}
}
