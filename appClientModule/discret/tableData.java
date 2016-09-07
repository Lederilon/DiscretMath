package discret;

public class tableData {
	Integer[][] incedent;
	tableData(int numNodes){
		
		int numEdges = numNodes*numNodes/2;
		incedent = new Integer[numNodes][numEdges];
		for(int i = 0 ; i < numNodes ; i++)
			for (int j = 0; j < numEdges ; j++)
				incedent[i][j] = 0;	
	}
  public void addEdge(Edge e,int n){
	  if(e.begin != -1 && e.end != -1) 
  	{incedent[e.begin][n] = 1;
  	 incedent[e.end][n] = 1;	 
  }
  }
	
}
