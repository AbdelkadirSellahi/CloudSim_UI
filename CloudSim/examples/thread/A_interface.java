package thread;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.cloudbus.cloudsim.examples.B_A_interface.DataCenterData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;

public class A_interface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private ButtonGroup radioGroup;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    A_interface frame = new A_interface();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static List<firstData> firstDataList  = new ArrayList<>();
    
    public A_interface() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 631, 412);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Number user :");
        lblNewLabel.setForeground(new Color(255, 255, 204));
        lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel.setBounds(127, 196, 218, 14);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("1");
        textField.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        textField.setForeground(new Color(0, 0, 0));
        textField.setColumns(10);
        textField.setBackground(new Color(255, 255, 255));
        textField.setBounds(361, 194, 105, 20);
        contentPane.add(textField);

        JLabel lblNewLabel_1 = new JLabel("Number of Data Centers :");
        lblNewLabel_1.setForeground(new Color(255, 255, 204));
        lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(127, 243, 174, 26);
        contentPane.add(lblNewLabel_1);

        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setText("1");
        textField_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        textField_1.setForeground(Color.BLACK);
        textField_1.setColumns(10);
        textField_1.setBackground(Color.WHITE);
        textField_1.setBounds(361, 247, 105, 20);
        contentPane.add(textField_1);

        radioGroup = new ButtonGroup();

        JButton btnNext = new JButton("Next >>");
        btnNext.setFont(new Font("Roboto Black", Font.BOLD, 15));
        btnNext.setForeground(new Color(0, 0, 51));
        btnNext.setBackground(new Color(255, 255, 255));
        btnNext.setBounds(209, 300, 189, 34);
        contentPane.add(btnNext);
        
        JLabel lblNewLabel_2 = new JLabel("CloudSim Interfaces");
        lblNewLabel_2.setForeground(new Color(255, 255, 204));
        lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(209, 26, 189, 20);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Part 1");
        lblNewLabel_3.setForeground(new Color(255, 255, 204));
        lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 19));
        lblNewLabel_3.setBounds(275, 70, 56, 14);
        contentPane.add(lblNewLabel_3);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 119, 615, 3);
        contentPane.add(panel);

        // Validate and allow only numeric input
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        textField_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (textField.getText().isEmpty() || textField_1.getText().isEmpty()) { 
                }else {
            	firstData firstData = new firstData();
            	firstData.numberOfUsersText = Integer.parseInt(textField.getText());
                int numberOfUsers = Integer.parseInt(textField.getText());
                firstData.numberOfDataCentersText = Integer.parseInt(textField_1.getText());
                int numberOfDataCenters = Integer.parseInt(textField_1.getText());

                try {
                	// to start simulation
                	
                    B_A_interface dataCenterInterFrame = new B_A_interface(numberOfDataCenters); // Pass the value
                    dataCenterInterFrame.setVisible(true);
                    dispose();  // Close the current window
                } catch (NumberFormatException ex) {
                    // Handle the case where the text fields do not contain valid integers
                }
              }
            }
        });
    }
    
    public class firstData {
		public static int numberOfUsersText;
		public int numberOfDataCentersText;
		
		public static int getNumberOfUsersText() {
			// TODO Auto-generated method stub
			return numberOfUsersText;
		}

        
    	}
}