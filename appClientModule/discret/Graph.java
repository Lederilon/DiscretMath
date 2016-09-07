package discret;

import java.awt.Graphics;

public class Graph {

	public Integer	[][] matrix;
	public Graph( int n){	
		matrix = new Integer[n][n];
		 for (int i = 0; i < n; i++ )
			 for(int j = 0; j < n; j++)
				 matrix[i][j] = 0;
	}
	public Graph(Integer [][] incedent){
		this(incedent.length);
		
		 int k = 0;
         int begin = -1;
         int end = -1;
         int pet = -1;
    
         
         
         
         for (int j = 0; j < incedent[0].length; j++){
        	 k = 0;
             begin =-1;
             end = -1;
             pet = -1;
         for (int i = 0; i < incedent.length; i++)
        	 
         { 
         
        	 if( incedent[i][j] == 1 && k==0)
           {  k++;
              begin = i;
            }
         else if ( incedent[i][j] == 1 && k==1){
       	  end = i;
       	  k++; 
       	  break;
         } else if ( incedent[i][j] == 2)
           { pet = i;
            break;}
         }
         //System.out.println(begin);
         //System.out.println(end);
         if (begin != -1 && end != -1 ) 
        	 
        	 {this.matrix[begin][end] = 1;
        	  this.matrix[end][begin] = 1;
        	 }
         else if (pet != -1  ) 
        	 this.matrix[pet][pet] = 1;
           
         
         }
	}
	public void drowGraph(Nodes nodes, Graphics g){
		double a ;
		int x;
		int y; 
		for (int i = 0 ; i < matrix.length ; i++)
			for (int j = 0 ; j <= i; j++  ){
				if (i != j && matrix[i][j] == 1 ) g.drawLine((int)nodes.x[i],(int)nodes.y[i] ,(int)nodes.x[j] +5,(int)nodes.y[j]+5 );
				if (i == j && matrix[i][j] == 1) {
					 a = Math.PI / matrix.length * 2 * i;
					 x = (int)(Math.cos(a)*15);
					 y = (int)(Math.sin(a)*15); 
					g.drawOval((int)nodes.x[i] +x -10,(int)nodes.y[i] + y -10  , 30, 30);
				}
				
			}
		
	}
	
	
	
}
