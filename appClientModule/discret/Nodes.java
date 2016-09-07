package discret;

import java.awt.Graphics;

public class Nodes {
	double[] x;
	double[] y;
public	Nodes(int n,int r,Graphics g){
	
	x = new double[n];
	y = new double[n];
	int xs;
	int ys;
	double a1;
	double a = Math.PI / n * 2;
			for (int i =0 ; i < n ; i++){
		x[i] = r*Math.cos(a*i)+r+40;
		y[i] = r * Math.sin(a*i)+r+40;	
		 a1 = Math.PI / n * 2 * i;
		 xs = (int)(Math.cos(a1)*15);
		 ys = (int)(Math.sin(a1)*15); 
		g.fillRect((int)x[i], (int)y[i], 10, 10);
		g.drawString((i+1)+"", (int)x[i]+xs, (int)y[i]+ys+10);
		}
	
	
	
};
	  
	
	
}
