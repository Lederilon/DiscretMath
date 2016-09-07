package discret;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class result extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;

	

	/**
	 * Create the frame.
	 */
	public result() {
		setResizable(false);
		
		setBounds(100, 100, 877, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(432, 11, 419, 419);
				
			
	    tableHeader head =  new tableHeader(Title.graph.matrix.length);
	    table = new JTable(Title.graph.matrix,head.head);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setEnabled(false);
		table.setRowHeight(20);
		
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		
		panel = new DrawPanel();
		panel.setBounds(10, 11, 412, 419);
		contentPane.add(panel);
		contentPane.add(scrollPane);
		
		this.setVisible(true);
	}
}
