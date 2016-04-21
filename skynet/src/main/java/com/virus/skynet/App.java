package com.virus.skynet;

import java.util.Scanner;

/**
 * @author mmohamed
 *
 */
public class App {
    public static void main( String[] args ) {
    	System.out.println("\t \t \t \t BONJOUR "+"\n"+"je suis le virus du réseau skynet ma mission est d'empêcher l'agent de sortir de son sous réseau \n");
    	System.out.println("Veillez saisir la composition  du réseau skynet !");

    	Scanner in = new Scanner(System.in);
        int nbNodes = in.nextInt();
        int nbLinks = in.nextInt();
        int nbGetways = in.nextInt();

        Network network = new Network();
        // initialiser les noeuds
        network.initNodes(nbNodes);

        // construire les liens
		for (int i = 0; i < nbLinks; i++) {
			Node startNode = network.getNodeByIndex(in.nextInt());
			Node endNode = network.getNodeByIndex(in.nextInt());
			Link link = new Link(startNode, endNode);
			network.getLinks().add(link);
		}
		// construire les passerelles

		for (int i = 0; i < nbGetways; i++) {
			network.getNodeByIndex(in.nextInt()).setGetway(true);
		}
		Virus virus = new Virus();
		while (true) {
			// cherecher l'index du noeud de la position de l'agent skynet
			System.out.println("Veillez saisir la position de l'agent skynet");

			Node agentNode = network.getNodeByIndex(in.nextInt());
			SkynetAgent agent= new SkynetAgent(agentNode);
			Link nextLink = virus.findAndRemoveNextLink(network, agent);
			System.out.println("J'ai coupé le lien entre les noeuds : "+ nextLink.getStartIndex() + "  " + nextLink.getEndIndex());
		}
    }
}
