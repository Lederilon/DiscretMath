package discret;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {    
    	super.paintComponent(g);
    	  Graphics2D g2 = (Graphics2D)g;
    	  g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		  g2.setColor(Color.black);    	
    	  Title.nodes = new Nodes(In.numNodes,Math.min(this.getHeight()/3,this.getWidth()),g2);
    	  Title.graph.drowGraph(Title.nodes, g2); 	
    	  	
    }
    

}
