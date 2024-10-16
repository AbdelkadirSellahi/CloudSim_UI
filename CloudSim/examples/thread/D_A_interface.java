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

import org.cloudbus.cloudsim.examples.C_A_interface.HostData;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class D_A_interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtXen;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	private int VMid;
	private double mips;
	private int size;
	private int ram;
	private int bandwidth;
	private int pesNumber;
	private String VMM;
	private int nbrcloudlet;

    private int numberofvms;
    public static List<vmData> vmDataList = new ArrayList<>();
    private int totalNumberOfVms;
    private int vmIndex = 1;
    private int vmNumber = 2;
    private int cloudlet=0;
    private int totalnbrvms;
    private int totalnbrcloudlet;
    

	public D_A_interface(int totalnbrvms) {
		this.totalnbrvms = totalnbrvms;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtXen = new JTextField();
		txtXen.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtXen.setHorizontalAlignment(SwingConstants.CENTER);
		txtXen.setText("Xen");
		txtXen.setColumns(10);
		txtXen.setBounds(325, 252, 103, 20);
		contentPane.add(txtXen);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1");
		textField_1.setColumns(10);
		textField_1.setBounds(325, 40, 103, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("1000");
		textField_2.setColumns(10);
		textField_2.setBounds(325, 94, 103, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("10000");
		textField_3.setColumns(10);
		textField_3.setBounds(325, 125, 103, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_4.setText("512");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(325, 158, 103, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("1000");
		textField_5.setToolTipText("");
		textField_5.setColumns(10);
		textField_5.setBounds(325, 190, 103, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("1");
		textField_6.setColumns(10);
		textField_6.setBounds(325, 220, 103, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("VM ID :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(81, 37, 76, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MIPS for VM :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(81, 88, 158, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Size for VM :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(81, 121, 180, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RAM for VM :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(81, 154, 158, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bandwidth for VM :");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(81, 187, 193, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pes Number for VM :");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(81, 217, 158, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("VMM for VM :");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(81, 250, 163, 22);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Next >>");
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(0, 0, 51));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(226, 330, 111, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("VMs Type :");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(79, 283, 78, 25);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Homogeneous");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBackground(new Color(0, 0, 51));
		rdbtnNewRadioButton.setBounds(185, 285, 119, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Heterogeneous");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 0, 51));
		rdbtnNewRadioButton_1.setBounds(335, 285, 133, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(rdbtnNewRadioButton);
        radioGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("VM 1");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(226, 11, 78, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Number of cloudlet :");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(81, 63, 144, 22);
		contentPane.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Roboto", Font.PLAIN, 11));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("1");
		textField_7.setBounds(325, 67, 103, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		
		txtXen.addKeyListener(new KeyAdapter() {
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

        textField_4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Disallow non-numeric characters except for backspace and period (for decimal values)
                }
            }
        });
        
        textField_5.addKeyListener(new KeyAdapter() {
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
                if (txtXen.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty()
                		|| textField_4.getText().isEmpty()|| textField_5.getText().isEmpty()|| textField_6.getText().isEmpty()|| textField_7.getText().isEmpty()) {
                } else {
                    try {
                    	if (rdbtnNewRadioButton.isSelected()) {
                            // If "homogeneous" is selected
                            for (int i = 0; i < totalnbrvms; i++) {
                            	vmData vmData = new vmData();
                            	// Store user inputs in variables
                            	vmData.VMid = i+1;
                            	vmData.mips = Double.parseDouble(textField_2.getText());
                            	vmData.size = Integer.parseInt(textField_3.getText());
                            	vmData.ram = Integer.parseInt(textField_4.getText());
                            	vmData.bandwidth = Integer.parseInt(textField_5.getText());
                            	vmData.pesNumber = Integer.parseInt(textField_6.getText());
                            	vmData.VMM = txtXen.getText();
                            	vmData.nbrcloudlet = Integer.parseInt(textField_7.getText());
                            	cloudlet = Integer.parseInt(textField_7.getText());
                                
                             // Add the data for this data center to the list
                                vmDataList.add(vmData);
                            }
                            totalnbrcloudlet = totalnbrvms * cloudlet;
                            
                            System.out.println("Total Number of cloudlet: " + totalnbrcloudlet);
                            
                         // open cloudlet interface
                            E_A_interface cloudletfirstinter = new E_A_interface(totalnbrcloudlet);
                            cloudletfirstinter.setVisible(true);
                        	 dispose();  // Close the current window
                        	 
                        	 
                            }else if (rdbtnNewRadioButton_1.isSelected()) {
                            	vmData vmData = new vmData();
                            	// Store user inputs in variables
                            	vmData.VMid = Integer.parseInt(textField_1.getText());
                            	vmData.mips = Double.parseDouble(textField_2.getText());
                            	vmData.size = Integer.parseInt(textField_3.getText());
                            	vmData.ram = Integer.parseInt(textField_4.getText());
                            	vmData.bandwidth = Integer.parseInt(textField_5.getText());
                            	vmData.pesNumber = Integer.parseInt(textField_6.getText());
                            	vmData.VMM = txtXen.getText();
                            	vmData.nbrcloudlet = Integer.parseInt(textField_7.getText());
                            	cloudlet = Integer.parseInt(textField_7.getText());
                            	
                            	vmData.vmcloudlet = nbrcloudlet; // بالاك منيش نبعت هادي 
                                
                             // Add the data for this data center to the list
                                vmDataList.add(vmData);
                                
                                if(totalnbrvms == 1) {
                                	totalnbrcloudlet = cloudlet;
                                	E_A_interface cloudletfirstinter = new E_A_interface(totalnbrcloudlet);
                                	cloudletfirstinter.setVisible(true);
                                    dispose(); // Close the current interface
                                }else {
                                	// If "heterogeneous" is selected, go to the next datacenter interface
                                    D_B_interface VMinter = new D_B_interface(totalnbrvms, vmIndex, new ArrayList<>(), Integer.parseInt(textField_1.getText()), Double.parseDouble(textField_2.getText()), 
                                    		Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()), Integer.parseInt(textField_5.getText()), 
                                    		Integer.parseInt(textField_6.getText()), txtXen.getText(), Integer.parseInt(textField_7.getText()), cloudlet);
                                    VMinter.setVisible(true);
                                    dispose();
                                }
                            }
                         

                        // Navigate to the next interface (cloudletinter)
                    } catch (NumberFormatException ex) {
                        // Numeric values are not valid, do nothing
                    }
                }
            }
        });
	}
	
	public class vmData {
		// public int VMid;
		public static int VMid;
		public double mips;
		public int size;
		public int ram;
		public int bandwidth;
		public int pesNumber;
		public String VMM;
		public int nbrcloudlet;
		public int vmcloudlet;
        
		// Getter method for hostvm
        public int getvmcloudlet() {
        	 return vmcloudlet;
    	}

        // Setter method for interhost
        public void setvmcloudlet(int vmcloudlet) {
            this.vmcloudlet = vmcloudlet;
        }

		public double getMips() {
			// TODO Auto-generated method stub
			return mips;
		}

		public long getSize() {
			// TODO Auto-generated method stub
			return size;
		}

		public int getRam() {
			// TODO Auto-generated method stub
			return ram;
		}

		public long getBandwidth() {
			// TODO Auto-generated method stub
			return bandwidth;
		}

		public int getPesNumber() {
			// TODO Auto-generated method stub
			return pesNumber;
		}

		public String getVmmName() {
			// TODO Auto-generated method stub
			return VMM;
		}

		public static int getVMid() {
			// TODO Auto-generated method stub
			return VMid;
		}
    }
}
