package week12;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

/*
 * adapted from dr.jenkins dijkstra's code 
 * 
 */
public class Dijkstra {

	/**
	 * Create hashmap representing all connected nodes and corresponding weights
	 * 
	 * @param group
	 * @param cost
	 * @return
	 */
	public static HashMap<Character, Integer> getConnections(char[] group, int[] cost) {
		HashMap<Character, Integer> from = new HashMap<Character, Integer>();
		for (int i = 0; i < group.length; i++) {
			from.put(group[i], cost[i]);
		}
		return from;
	}

	/**
	 * Make sure the weights for the same edges are equal
	 * 
	 * @param graph
	 * @return
	 */
	public static boolean isWellFormed(HashMap<Character, HashMap<Character, Integer>> graph) {
		for (Character letter : graph.keySet()) {
			HashMap<Character, Integer> connections = graph.get(letter);
			for (Character other : connections.keySet()) {
				int to = connections.get(other);
				int from = graph.get(other).get(letter);
				if (to != from)
					return false;
			}
		}
		return true;
	}

	public static TreeMap<Character, Integer> getMinCostFrom(Character letter, HashMap<Character, 
			HashMap<Character, Integer>> graph)
	{
		HashMap<Character, Entry> letterMap = new HashMap<Character, Entry>();
		PriorityQueue<Entry> cost = new PriorityQueue<Entry>();
		// initialize priorityqueue and letterMap with entries
		for(Character c: graph.keySet())
		{
			Entry entry = new Entry();
			entry.letter = c;
			if(c.equals(letter))
				entry.distance =  0;
			else
				entry.distance = Integer.MAX_VALUE;
			cost.add(entry);
			letterMap.put(c, entry);
		}
		
		// remove 
		while(!cost.isEmpty())
		{
			Entry entry = cost.remove();
			HashMap<Character,Integer> connections = graph.get(entry.letter);
			for(Character target: connections.keySet())
			{
				int costThisWay = entry.distance + connections.get(target);
				Entry soFar = letterMap.get(target);
				if( costThisWay < soFar.distance)
				{
					cost.remove(soFar);
					soFar.distance = costThisWay;
					cost.add(soFar);
				}
			}
		}
		TreeMap<Character, Integer> result = new TreeMap<Character, Integer>();
		for(Character c: letterMap.keySet())
		{
			result.put(c, letterMap.get(c).distance);
		}
		
		return result;
	}
	
}
