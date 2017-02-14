package personExample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class WelcomeWindow extends JFrame {
	private JPanel contentPane;
	
	public WelcomeWindow() {
		//set frame title
		setTitle("Old Frame");
		setSize(800, 400);
		setResizable(false);
		//Centering the frame
		Dimension dim = getToolkit().getScreenSize();
		setLocation(dim.width/2 - getWidth()/2, 
								dim.height/2 - getHeight()/2);
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//set bounds of the frame
		//setBounds(100, 100, 450, 300);
		//create object of JPanel
		contentPane = new JPanel();
		//set border
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		setContentPane(contentPane);
		//set null
		contentPane.setLayout(null);
		
		//create object of JButton and set label on it
		JButton btnMainFrame = new JButton("Enter");
		//add actionListener
		btnMainFrame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				MainWindow mainFrame = new MainWindow();
			}
		});
		
		//set font of the Button
		btnMainFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnMainFrame.setBounds(360, 200, 70, 25);
		//add Button into contentPane
		contentPane.add(btnMainFrame);
		
		//set Label in the frame
		JLabel lblWelcome = new JLabel("Welcome to Employee Programme!");
		//set foreground color to the label
		lblWelcome.setForeground(Color.BLUE);
		//set font of that label
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		//set bound of the label
		lblWelcome.setBounds(220, 80, 400, 100);

		//add label to the contentPane
		contentPane.add(lblWelcome);
	}

}
