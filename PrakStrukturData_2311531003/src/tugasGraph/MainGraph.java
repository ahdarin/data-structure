package tugasGraph;

import java.util.Arrays;
import java.util.List;

public class MainGraph {

	public static void main(String[] args) {
		List<Edge> edges = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
				new Edge(0, 4, 6),new Edge(1, 0, 4),new Edge(1, 3, 8), 
				new Edge(1, 2, 3),new Edge(2, 0, 5),new Edge(2, 1, 4),
				new Edge(3, 2, 5),new Edge(4, 5, 2),new Edge(5, 3, 4),
				new Edge(5, 2, 2),new Edge(2, 5, 3));
/*
        [ 0 ]
      ^/  ^| ^\
     //   ||  \\
    //    ||   \\
   //     ||    \\
  /v      |v     \v
[ 1 ]<==>[ 2 ]   [ 4 ]
 |       ^  ^\     |
 |      /    \\    |
 |     /      \\   |
 v    /        \v  v
  [ 3 ]<--------[ 5 ]
*/
		// call graph class Constructor to construct a graph
		Graph graph = new Graph(edges);

		// print the graph as an adjacency list
		Graph.printGraph(graph);
		
        //create a graph object and add edges to it
		DepthFirstSearch dfs = new DepthFirstSearch(13); 
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(0, 4);
		dfs.addEdge(1, 0);
		dfs.addEdge(1, 3);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 1);
		dfs.addEdge(3, 2);
		dfs.addEdge(4, 5);
		dfs.addEdge(5, 3);
		dfs.addEdge(5, 2);
		dfs.addEdge(2, 5);
        //print the DFS Traversal sequence
        System.out.print("Depth First Search (starting from 0) : "); 
        dfs.DFS(0);
        System.out.println();
        
      //create a graph with 5 vertices
        BreadthFirstSearch bfs = new BreadthFirstSearch(13); 
        //add edges to the graph  
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(0, 4);
        bfs.addEdge(1, 0);
        bfs.addEdge(1, 3);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 1);
        bfs.addEdge(3, 2);
        bfs.addEdge(4, 5);
        bfs.addEdge(5, 3);
        bfs.addEdge(5, 2);
        bfs.addEdge(2, 5);
        //print BFS sequence
        System.out.print("Breadth-first Search (starting from 0) : "); 
        bfs.BFS(0); 
        System.out.println();
	}

}
