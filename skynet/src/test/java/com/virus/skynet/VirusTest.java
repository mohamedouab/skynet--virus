package com.virus.skynet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirusTest {

	private Network network;
	
	@Before
	public void init() {
		network = new Network();
		network.initNodes(4);
	}

	@Test
	public void should_find_link_when_agent_on_a_start_node() {
		// arrange
		Link expectedLink = new Link(network.getNodeByIndex(0), network.getNodeByIndex(1));
		network.getLinks().add(expectedLink);
		SkynetAgent agent = new SkynetAgent(network.getNodeByIndex(1));
		// act
		Link nextLink = new Virus().findAndRemoveNextLink(network, agent);
		// assert
		assertEquals(expectedLink, nextLink);
	}

	@Test
	public void should_find_first_link_when_agent_on_an_arbitrary_node() {
		// arrange
		Link expectedLink = new Link(network.getNodeByIndex(0), network.getNodeByIndex(1));
		Link secondLink = new Link(network.getNodeByIndex(0), network.getNodeByIndex(2));

		network.getLinks().add(expectedLink);
		network.getLinks().add(secondLink);
		SkynetAgent agent = new SkynetAgent(network.getNodeByIndex(2));
		// act
		Link nextLink = new Virus().findAndRemoveNextLink(network, agent);
		// assert
		assertEquals(expectedLink, nextLink);
	}
	@Test
	public void should_find_getway_link_when_agent_near_getway_node() {
		// arrange
		Link firstLink = new Link(network.getNodeByIndex(0), network.getNodeByIndex(1));
		Link secondLink = new Link(network.getNodeByIndex(1), network.getNodeByIndex(2));

		network.getNodeByIndex(2).setGetway(true);
		network.getLinks().add(firstLink);
		network.getLinks().add(secondLink);
		SkynetAgent agent = new SkynetAgent(network.getNodeByIndex(1));
		// act
		Link nextLink = new Virus().findAndRemoveNextLink(network, agent);
		// assert
		assertEquals(secondLink, nextLink);
	}


}
