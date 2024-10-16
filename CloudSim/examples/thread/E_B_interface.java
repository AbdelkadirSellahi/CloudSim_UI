package thread;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.cloudbus.cloudsim.examples.D_A_interface.vmData;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class E_B_interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private static int cloudIndex = 1;
	private static int cloudNumber = 2;
	public static List<E_A_interface.cloudletData> cloudletDataList;
	private int totalnbrcloudlet;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	
	public E_B_interface(int totalnbrcloudlet, int cloudIndex, List<E_A_interface.cloudletData> cloudletDataList, int cloudletId, int cloudletLength, int cloudletFileSize, int cloudletOutputSize, int pesnumberc) {
		this.cloudIndex = cloudIndex;
		this.cloudletDataList = cloudletDataList;
		this.totalnbrcloudlet = totalnbrcloudlet;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("1");
		textField.setColumns(10);
		textField.setBounds(329, 89, 101, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("400000");
		textField_1.setColumns(10);
		textField_1.setBounds(329, 125, 101, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("300");
		textField_2.setColumns(10);
		textField_2.setBounds(329, 156, 101, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("300");
		textField_3.setColumns(10);
		textField_3.setBounds(329, 187, 101, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Cloudlet ID :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(81, 89, 91, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Length for Cloudlet :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(81, 122, 247, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("File Size for Cloudlet :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(81, 155, 203, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Output Size for Cloudlet :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(79, 188, 235, 22);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Next >>");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(0, 0, 51));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(194, 257, 121, 38);
		contentPane.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("Cloudlet "+ cloudNumber);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(205, 47, 91, 20);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Pes Number :");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(81, 221, 91, 20);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("1");
		textField_4.setColumns(10);
		textField_4.setBounds(329, 218, 101, 20);
		contentPane.add(textField_4);
		
		
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
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Disallow non-numeric characters except for backspace and period (for decimal values)
                }
            }
        });

        textField_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Disallow non-numeric characters except for backspace and period (for decimal values)
                }
            }
        });

        textField_3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Disallow non-numeric characters except for backspace and period (for decimal values)
                }
            }
        });
		
		
		// Add an ActionListener to the "Next" button
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || textField_4.getText().isEmpty()) {     
                } else {
                    try {
                    	E_A_interface.cloudletData cloudletData = new E_A_interface(totalnbrcloudlet).new cloudletData();
                    	// Store user inputs in variables
                    	cloudletData.cloudletId = Integer.parseInt(textField.getText());
                    	cloudletData.cloudletLength = Integer.parseInt(textField_1.getText());
                    	cloudletData.cloudletFileSize = Integer.parseInt(textField_2.getText());
                    	cloudletData.cloudletOutputSize = Integer.parseInt(textField_3.getText());
                    	cloudletData.pesnumberc = Integer.parseInt(textField_4.getText());
                    	
                    	cloudletDataList.add(cloudletData);
                    	
                    	// Determine the selected data center type
                	    if (cloudIndex < totalnbrcloudlet - 1) {
                	    	cloudNumber++;
                	    	E_B_interface cloudletinter = new E_B_interface(totalnbrcloudlet, cloudIndex + 1, new ArrayList<>(), Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()), 
                            		Integer.parseInt(textField_2.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()));
                	    	cloudletinter.setVisible(true);
                            dispose();  // Close the current window
                        } else {
                        	
                        	F_interface brokerinter = new F_interface();
                        	brokerinter.setVisible(true);
                            dispose(); // Close the current interface 
                            
                            
                        }


                        // Navigate to the next interface (VMinter)
                    } catch (NumberFormatException ex) {
                        // Numeric values are not valid, do nothing
                    }
                }
            }
        });
	}
	
	public class cloudletData {
		public int cloudletId;
		public int cloudletLength;
		public int cloudletFileSize;
		public int cloudletOutputSize;
		public int pesnumberc;
	    
	}

}
