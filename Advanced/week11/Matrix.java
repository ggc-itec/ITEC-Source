package week11;

import java.util.HashMap;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] nums = { { 1, 2, 3 }, { 2, 3 }, { 5, 6, 6 } };

		//System.out.println(nums[1][2]);

		boolean[][] adj = { { true, true, true }, { true, true, false },
				{ true, false, true } };

		int [][] adj2 = 
			{
				{0,10,5,7,0},
				{10,0,20,0,15},
				{5,20,0,0,0},
				{7,0,0,0,12},
				{0,15,0,12,0}
				
			};
		
		System.out.println( adj2[0][3] + adj2[3][4] );
	
		HashMap<Character, HashMap<Character,Integer>>
		 graph = new HashMap<Character, HashMap<Character,Integer>>();
		
		//connection 
		HashMap<Character,Integer> connection =
				new HashMap<Character,Integer>();
		connection.put('b',10);
		connection.put('c', 5);
		connection.put('d',7);
		graph.put('a', connection);
		
		// addConnections( graph, { 'a','b','c'}, {1,2,3} )
		
		// graph, connected node (array), weights (array)
		char [] n = {'a','b'};
		int [] w = {1,2};
		makeConnections(graph, 'a',n, w);
		int [] nums2 = new int[Integer.MAX_VALUE];
	}

	public static void makeConnections
	(HashMap<Character, HashMap<Character,Integer>> graph, char from,
			char[] nodes, int[] weight)
	{
		HashMap<Character,Integer> connection =
				new HashMap<Character,Integer>();
		for(int i=0; i<nodes.length; i++)
		{
			connection.put( nodes[i], weight[i]);
		}
		graph.put(from, connection);
	}
		
}
