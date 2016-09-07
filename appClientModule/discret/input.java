package discret;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;

public class input extends JFrame {
	private JTable table;

	
	
	/**
	 * Create the frame.
	 */
	public input() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 504, 373);
		getContentPane().setLayout(null);			
		Canvas canvas = new Canvas();
		canvas.setBounds(287, 43, 191, 279);
		getContentPane().add(canvas);
		 String[] columnNames = {
                 "Name",
                 "Last modified",
                 "Type",
                 "Size"
       };
        
       String[][] data = {
                 {"addins", "02.11.2006 19:15", "Folder", ""},
                 {"AppPatch", "03.10.2006 14:10", "Folder", ""},
                 {"assembly", "02.11.2006 14:20", "Folder", ""},
                 {"Boot", "13.10.2007 10:46", "Folder", ""},
                 {"Branding", "13.10.2007 12:10", "Folder", ""},
                 {"Cursors", "23.09.2006 16:34", "Folder", ""},
                 {"Debug", "07.12.2006 17:45", "Folder", ""},
                 {"Fonts", "03.10.2006 14:08", "Folder", ""},
                 {"Help", "08.11.2006 18:23", "Folder", ""},
                 {"explorer.exe", "18.10.2006 14:13", "File", "2,93MB"},
                 {"helppane.exe", "22.08.2006 11:39", "File", "4,58MB"},
                 {"twunk.exe", "19.08.2007 10:37", "File", "1,08MB"},
                 {"nsreg.exe", "07.08.2007 11:14", "File", "2,10MB"},
                 {"avisp.exe", "17.12.2007 16:58", "File", "12,67MB"},
       };
        
       JTable table = new JTable(data, columnNames);
       table.setBounds(0, 251, 205, -251);
      
   
      
        
       getContentPane().add(table);
		
		
	
		
	}
}
