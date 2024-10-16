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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class E_A_interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public static List<cloudletData> cloudletDataList = new ArrayList<>();
	private int totalnbrcloudlet;
	private int cloudIndex = 1;
	private int cloudNumber = 2;
	private JTextField textField_4;

	public E_A_interface(int totalnbrcloudlet) {
		this.totalnbrcloudlet = totalnbrcloudlet;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("1");
		textField.setColumns(10);
		textField.setBounds(330, 52, 101, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("400000");
		textField_1.setColumns(10);
		textField_1.setBounds(330, 85, 101, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		textField_2.setText("300");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(330, 119, 101, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("300");
		textField_3.setColumns(10);
		textField_3.setBounds(330, 151, 101, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Cloudlet ID :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(81, 50, 91, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Length for Cloudlet :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(81, 83, 239, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("File Size for Cloudlet :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(81, 116, 217, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Output Size for Cloudlet :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(79, 149, 241, 22);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Next >>");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(0, 0, 51));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(205, 271, 116, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("cloudlet Type :");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(30, 223, 127, 25);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Homogeneous");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBackground(new Color(0, 0, 51));
		rdbtnNewRadioButton.setBounds(166, 224, 127, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Heterogeneous");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 0, 51));
		rdbtnNewRadioButton_1.setBounds(342, 224, 127, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(rdbtnNewRadioButton);
        radioGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Cloudlet 1");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(205, 11, 89, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pes Number :");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(81, 182, 91, 20);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("1");
		textField_4.setBounds(330, 187, 101, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
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
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty()
                		|| textField_4.getText().isEmpty()) {
                } else {
                    try {
                    	if (rdbtnNewRadioButton.isSelected()) {
                    	   for (int i = 0; i < totalnbrcloudlet; i++) {
                    		   cloudletData cloudletData = new cloudletData();
                    	       // Store user inputs in variables
                    		   cloudletData.cloudletId = i+1;
                    		   cloudletData.cloudletLength = Integer.parseInt(textField_1.getText());
                    		   cloudletData.cloudletFileSize = Integer.parseInt(textField_2.getText());
                    		   cloudletData.cloudletOutputSize = Integer.parseInt(textField_3.getText());
                    		   cloudletData.pesnumberc = Integer.parseInt(textField_4.getText());
                    		
                    		   cloudletDataList.add(cloudletData);
                    	   }
                    	
                    	
                        // open cloudlet interface تاع انترفاص 
                         F_interface brokerinter = new F_interface();
                         brokerinter.setVisible(true);
                    	 dispose();  // Close the current window
                    	   
                    	}else if (rdbtnNewRadioButton_1.isSelected()) {
                    		cloudletData cloudletData = new cloudletData();
                    		// Store user inputs in variables
                 		   cloudletData.cloudletId = Integer.parseInt(textField.getText());
                 		   cloudletData.cloudletLength = Integer.parseInt(textField_1.getText());
                 		   cloudletData.cloudletFileSize = Integer.parseInt(textField_2.getText());
                 		   cloudletData.cloudletOutputSize = Integer.parseInt(textField_3.getText());
                 		   cloudletData.pesnumberc = Integer.parseInt(textField_4.getText());
                 		  
                        	
                 		  cloudletDataList.add(cloudletData);
                 		  
                 		  if(totalnbrcloudlet == 1) {  
                 			 F_interface brokerinter = new F_interface();
                         	 brokerinter.setVisible(true);
                             dispose(); // Close the current interface 
                 		  }else {
                 			// If "heterogeneous" is selected, go to the next datacenter interface
                              E_B_interface cloudletinter = new E_B_interface(totalnbrcloudlet, cloudIndex, new ArrayList<>(), Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()), 
                              		Integer.parseInt(textField_2.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()));
                              cloudletinter.setVisible(true);
                              dispose();
                 		  }
                            
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
		
		public long getSizelen() {
			// TODO Auto-generated method stub
			return cloudletLength;
		}

		public long getSizefil() {
			// TODO Auto-generated method stub
			return cloudletFileSize;
		}

		public long getSizeout() {
			// TODO Auto-generated method stub
			return cloudletOutputSize;
		}
		
		public int getPesNumber() {
			// TODO Auto-generated method stub
			return pesnumberc;
		}
	    
	}
}

