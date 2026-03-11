package dsa;

public class GraphImpl {

	static int[][] graph;
	
	static void addEdges(int i,int j)
	{
		graph[i][j]=1; 
		graph[j][i]=1;
	}
	public static void main(String[] args) {
		
		graph=new int[5][5];	
		
		addEdges(0, 1);
		addEdges(0, 3);
		addEdges(1, 2);
		addEdges(3, 2);
		addEdges(2, 4);
		addEdges(4, 3);
		
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[i].length;j++)
			{
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}
}
