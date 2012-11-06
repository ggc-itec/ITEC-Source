package week12;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DijkstraTest {

	

	@Test
	public final void testOne() {
		HashMap<Character, HashMap<Character, Integer>> graph =
				new HashMap<Character,HashMap<Character,Integer>>();
		graph.put('a',Dijkstra.getConnections(new char[]{'b','c'}, new int[] {6,1}));
		graph.put('b',Dijkstra.getConnections(new char[]{'a','e'}, new int[] {6,3}));
		graph.put('c',Dijkstra.getConnections(new char[]{'a','d'}, new int[] {1,1}));
		graph.put('d',Dijkstra.getConnections(new char[]{'c','e'}, new int[] {1,2}));
		graph.put('e',Dijkstra.getConnections(new char[]{'b','d'}, new int[] {3,2}));
		
		TreeMap<Character, Integer> results = Dijkstra.getMinCostFrom('a', graph);
		assertEquals(0,(int) results.get('a'));
		assertEquals(6,(int) results.get('b'));
		assertEquals(1,(int) results.get('c'));
		assertEquals(2,(int) results.get('d'));
		assertEquals(4,(int) results.get('e'));	
	}
	
	@Test
	public final void twoTwo() {
		
	}

}
