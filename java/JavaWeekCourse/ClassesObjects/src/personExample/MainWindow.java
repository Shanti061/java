package personExample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import static personExample.generatePeople.people;
import static personExample.generatePeople.people;

public class MainWindow implements ActionListener, ItemListener {
		JPanel btnPanel;
		JPanel fieldPanel;
		JPanel panel3;
		
		private JTextField txtFirstName;
		private JTextField txtLastName;
		private JTextField txtBirthDate;

		
		private JMenuBar menuBar;
		private JMenu fileMenu;
		private JMenuItem newMenuItem;
		private JMenuItem exitMenuItem;
		private JMenu editMenu;
		private JMenuItem indexMenuItem;
	
	
		// Declare buttons to navigate through the products in the inventory
		private JButton btnUpdate;
		private JButton btnDelete;
		
		private JList listBox;
		
		MainWindow() {
			setUp();
			panel3.setVisible(false);
		}
	
		void setUp() {
			JFrame mainFrame = new JFrame("Frame Title");
			mainFrame.setSize(800, 400);
			mainFrame.setResizable(false);
			mainFrame.setBackground(Color.DARK_GRAY);
			mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			JFrame.setDefaultLookAndFeelDecorated(true);
			
			//Centering the frame
			Dimension dim = mainFrame.getToolkit().getScreenSize();
			mainFrame.setLocation(dim.width/2 - mainFrame.getWidth()/2,
									dim.height/2 - mainFrame.getHeight()/2);
			
			
			WindowListener l = new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					int confirm = JOptionPane.showOptionDialog(mainFrame, 
							"Really Exit?", "Exit Confirmation",
							JOptionPane.YES_NO_OPTION, 
							JOptionPane.QUESTION_MESSAGE, 
							null, null, null);
					if(confirm == 0) {
						mainFrame.dispose();
						System.exit(0);
					}
				}
		};		
		//add the WindowListener
		mainFrame.addWindowListener(l);
		mainFrame.setJMenuBar(createMenu());
		mainFrame.setVisible(true);
		
		
		//get JRootPane panel
		JPanel content = (JPanel) mainFrame.getContentPane();
		content.setLayout(new GridLayout(1,2,5,5)); //(row,col,horizontal-gap,vertical-tap)
		
		//add a new panel inside
		/*
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder (BevelBorder.RAISED));
		content.add(panel);
		*/
		JPanel panel2 = new JPanel();
		panel2.setBorder(new EtchedBorder (EtchedBorder.LOWERED));
		JScrollPane scrollPane = new JScrollPane(createEmployeeList());
		scrollPane.setPreferredSize(new Dimension(380,335));
		panel2.add(scrollPane);
		content.add(panel2);
		
		panel3 = new JPanel();
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Employee Details");
		panel3.setBorder(title);
		panel3.add(createFieldsPanel(), BorderLayout.CENTER);
		panel3.add(createButtonsPanel(), BorderLayout.AFTER_LAST_LINE);
		content.add(panel3);
		/*
		JPanel panel4 = new JPanel();
		Border blackline;
		blackline = BorderFactory.createLineBorder(Color.RED);
		panel4.setBorder(blackline);
		content.add(panel4);
		*/
		
		
	}
	
	private JMenuBar createMenu() {
		// creates the menu bar
		menuBar = new JMenuBar();
		// creates the file menu
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		// creates a new menu item
		newMenuItem = new JMenuItem("New");
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.addActionListener(this);
		fileMenu.add(newMenuItem);
	
		// creates a new menu item
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.addActionListener(this);
		fileMenu.add(exitMenuItem);
	
		// creates the edit menu
		editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_D);
		// creates a new menu item
		indexMenuItem = new JMenuItem("By Index");
		indexMenuItem.setMnemonic(KeyEvent.VK_I);
		indexMenuItem.addActionListener(this);
		editMenu.add(indexMenuItem);
	
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		return menuBar;
	}
	
	private JPanel createButtonsPanel() {
		btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPanel.add(btnUpdate);
	
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPanel.add(btnDelete);
		
		return btnPanel;
	}
	
	private JPanel createFieldsPanel() {
		fieldPanel = new JPanel();
		fieldPanel.setLayout(new GridLayout(0, 2, 5, 5));
	
		fieldPanel.add(new JLabel("First Name:"));
		txtFirstName = new JTextField();
		fieldPanel.add(txtFirstName);
	
		fieldPanel.add(new JLabel("Last Name:"));
		txtLastName = new JTextField();
		fieldPanel.add(txtLastName);
	
		fieldPanel.add(new JLabel("Date of Birth:"));
		txtBirthDate = new JTextField();
		fieldPanel.add(txtBirthDate);
	
		fieldPanel.add(new JLabel("                  "));
		fieldPanel.add(new JLabel("                  "));
		
		return fieldPanel;
	}
	
	private JList createEmployeeList() {
		String[] listData = { "Item1", "Item2", "Item3"};
		listBox = new JList(people.toArray());
		listBox.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		return listBox;
	}
	
	protected void updateFields() {
		//Supplier s = products[current];
	
		//itemNumberTF.setText(String.valueOf(s.getItemNumber()));
		//productNameTF.setText(s.getProductName());
		//unitsInStockTF.setText(String.valueOf(s.getUnitsInStock()));
		//priceTF.setText(currency.format(s.getPrice()));
		//supplierNameTF.setText(s.getSupplierName());
		//restockFeeTF.setText(currency.format(s.calculateRestockFee()));
		//valueOfInventoryTF.setText(currency.format(s.calculateInventory()));
	
		//totalValueOfInventoryTF.setText(currency.format(calculateInventory()));
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
	
		if ("New".equals(action)) {
			panel3.setVisible(true);
		} else if("Exit".equals(action)) {
			System.exit(0);
		} else if("By First Name".equals(action)) {
			
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}