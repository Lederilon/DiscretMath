package discret;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Title extends JFrame {
	static int variant;
	private JPanel contentPane;
	private JTextField textField;
    static int[][] incedent;
    static Edge[] edges;
    static Graph graph = new Graph(13);
    static Nodes nodes;
    final static int  dotsCount = 13;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Title frame = new Title();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Title() {
		setTitle("\u041B\u0430\u0431\u0430\u0440\u0430\u0442\u043E\u0440\u043D\u0430 \u0440\u043E\u0431\u043E\u0442\u0430 4");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u0412\u0412\u0456\u0434");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame in = new In();
				in.setVisible(true);
			}
		});
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("\u041E\u043F\u0435\u0440\u0430\u0446\u0456\u044F");
		menu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {JFrame res = new result();}
				catch (Exception e){ JOptionPane.showMessageDialog(contentPane, "Задайте граф");}
			}
		});
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("\u0412\u0438\u0445\u0456\u0434");
		menu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			    System.exit(0);	
				
			}
		});
		menuBar.add(menu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setColumns(10);
		textArea.setTabSize(0);
		textArea.setRows(2);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textArea.setText("         \u041D\u0430\u0446\u0456\u043E\u043D\u0430\u043B\u044C\u043D\u0438\u0439 \u0442\u0435\u0445\u043D\u0456\u0447\u043D\u0438\u0439 \u0443\u043D\u0456\u0432\u0435\u0440\u0441\u0438\u0442\u0435\u0442 \u0423\u043A\u0440\u0430\u0457\u043D\u0438\r\n                  \u041A\u0438\u0457\u0432\u0441\u044C\u043A\u0438\u0439 \u043F\u043E\u043B\u0456\u0442\u0435\u0445\u043D\u0456\u0447\u043D\u0438\u0439 \u0456\u043D\u0441\u0442\u0438\u0442\u0443\u0442\r\n                       \u041B\u0430\u0431\u0430\u0440\u0430\u0442\u043E\u0440\u043D\u0430 \u0440\u043E\u0431\u043E\u0442\u0430 4");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton = new JButton("\u0412\u0412\u0456\u0434");
		panel.add(btnNewButton);
		
		JLabel variantShow = new JLabel("\u0412\u0430\u0440\u0456\u0430\u043D\u0442");
		panel.add(variantShow);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				variant = Integer.parseInt(textField.getText())%8+1;
				variantShow.setText("Варіант: " + variant);
			}
		});
		
		
		
	}

}
