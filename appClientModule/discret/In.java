package discret;


import java.awt.Graphics;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class In extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	static int numNodes = 13;
	static int numEdges = 84;      
	static   tableHeader head;
	 static  Integer[][] incedent;
	
	 private JPanel panel;
	public In() {
		
		setBounds(100, 100, 794, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(449, 16, 324, 294);
				
		incedent  = new tableData(numNodes).incedent;				
	    head =  new tableHeader(numEdges);
	    Title.graph = new Graph(numNodes);  
		
		
		
		
		
		table = new JTable(incedent,head.head);
		
		
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setEnabled(false);
		table.setRowHeight(20);
		
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(546, 342, 86, 20);
		textField.setColumns(10);
		
	
		JButton btnNewButton = new JButton("\u0417\u0430\u0434\u0430\u0442\u0438\r\n");
		btnNewButton.setBounds(680, 342, 69, 21);
		contentPane.setLayout(null);
		
		panel = new DrawPanel();
		panel.setBounds(15, 16, 346, 347);
		contentPane.add(panel);
		contentPane.add(scrollPane);
		contentPane.add(textField);
		contentPane.add(btnNewButton);
		this.setVisible(true);
		 Graphics g = panel.getGraphics();
		 Title.nodes = new Nodes(numNodes,120,g);
		
		 
		 
		 
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {numNodes = Integer.parseInt(textField.getText());}
			    catch (Exception e ){JOptionPane.showMessageDialog(contentPane,"Некоректний ввід числа");
			    numNodes = 13;
			    }
				
				numEdges = (numNodes * numNodes)/2;
				
				
				Title.graph = new Graph(numNodes);
				head = new tableHeader(numEdges);
				incedent = new tableData(numNodes).incedent;
				DefaultTableModel m = new DefaultTableModel(incedent,head.head);
				table.setModel(m);
				panel.repaint();
				
				
												
				
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				 int column = table.columnAtPoint(event.getPoint());
		          int row = table.rowAtPoint(event.getPoint());
		      
		          
		          table.setValueAt(((int)table.getValueAt(row, column)+1)%3, row, column);
		          incedent[row][column] = (int)table.getValueAt(row, column); 
		          Title.graph = new Graph(incedent);		         	          
		          panel.repaint();	        
		          
		    
		          
			}
		});
		
		
		
		
	}
}
