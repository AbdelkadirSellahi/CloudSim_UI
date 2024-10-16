package org.cloudbus.cloudsim.examples;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.cloudbus.cloudsim.examples.D_A_interface.vmData;
import org.cloudbus.cloudsim.examples.C_B_interface.HostData;

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
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.SwingConstants;

public class B_A_interface extends JFrame {

    private static final long serialVersionUID = 1L;
	protected static final List<HostData> HostDataList = null;
    private JTextField textField;
    private JTextField txtX;
    private JTextField txtLinux;
    private JTextField txtXen;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;

    private int numberOfDataCenters;
    private int numberofhosts=0;
    public static List<DataCenterData> centerDataList  = new ArrayList<>();
    private int totalNumberOfHosts = 0;
    public int interhost ;
    private int type; // عدد ليهوست لي دخلتو في كل انترفاص
    private int hostindex;
    private int totalnbr;
    
    //private int hostNumber;

    public B_A_interface(int numberOfDataCenters) {
        this.numberOfDataCenters = numberOfDataCenters;


        getContentPane().setBackground(new Color(0, 0, 51));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 726, 557);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Number of Hosts :");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel.setBounds(164, 70, 127, 25);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setText("1");
        textField.setToolTipText("");
        textField.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setColumns(10);
        textField.setBounds(410, 73, 101, 20);
        getContentPane().add(textField);

        JLabel lblNewLabel_1 = new JLabel("System Architecture :");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(164, 106, 200, 25);
        getContentPane().add(lblNewLabel_1);

        txtX = new JTextField();
        txtX.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        txtX.setHorizontalAlignment(SwingConstants.CENTER);
        txtX.setText("x86");
        txtX.setColumns(10);
        txtX.setBounds(410, 108, 101, 20);
        getContentPane().add(txtX);

        JLabel lblNewLabel_2 = new JLabel("Operating System :");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(164, 142, 200, 25);
        getContentPane().add(lblNewLabel_2);

        txtLinux = new JTextField();
        txtLinux.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        txtLinux.setHorizontalAlignment(SwingConstants.CENTER);
        txtLinux.setText("Linux");
        txtLinux.setColumns(10);
        txtLinux.setBounds(410, 144, 101, 20);
        getContentPane().add(txtLinux);

        txtXen = new JTextField();
        txtXen.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        txtXen.setHorizontalAlignment(SwingConstants.CENTER);
        txtXen.setText("Xen");
        txtXen.setColumns(10);
        txtXen.setBounds(410, 177, 101, 20);
        getContentPane().add(txtXen);

        textField_4 = new JTextField();
        textField_4.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setText("10.0");
        textField_4.setColumns(10);
        textField_4.setBounds(410, 215, 101, 20);
        getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setText("3.0");
        textField_5.setColumns(10);
        textField_5.setBounds(410, 250, 101, 20);
        getContentPane().add(textField_5);

        textField_6 = new JTextField();
        textField_6.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
        textField_6.setText("0.05");
        textField_6.setColumns(10);
        textField_6.setBounds(410, 284, 101, 20);
        getContentPane().add(textField_6);

        textField_7 = new JTextField();
        textField_7.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField_7.setHorizontalAlignment(SwingConstants.CENTER);
        textField_7.setText("0.001");
        textField_7.setColumns(10);
        textField_7.setBounds(410, 321, 101, 20);
        getContentPane().add(textField_7);

        textField_8 = new JTextField();
        textField_8.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField_8.setHorizontalAlignment(SwingConstants.CENTER);
        textField_8.setText("0.0");
        textField_8.setColumns(10);
        textField_8.setBounds(410, 358, 101, 20);
        getContentPane().add(textField_8);

        JLabel lblNewLabel_3 = new JLabel("VMM Name :");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(164, 178, 152, 25);
        getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Time Zone :");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(164, 214, 166, 25);
        getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Cost of Processing :");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(164, 250, 221, 25);
        getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Cost of Memory :");
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(164, 286, 200, 25);
        getContentPane().add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Cost of Storage :");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(164, 322, 200, 25);
        getContentPane().add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("Cost of Bandwidth :");
        lblNewLabel_8.setForeground(new Color(255, 255, 255));
        lblNewLabel_8.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_8.setBounds(164, 358, 221, 25);
        getContentPane().add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("Data Center Type :");
        lblNewLabel_9.setForeground(new Color(255, 255, 255));
        lblNewLabel_9.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_9.setBounds(150, 409, 127, 25);
        getContentPane().add(lblNewLabel_9);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Homogeneous");
        rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
        rdbtnNewRadioButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        rdbtnNewRadioButton.setBackground(new Color(0, 0, 51));
        rdbtnNewRadioButton.setBounds(301, 410, 142, 23);
        getContentPane().add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Heterogeneous");
        rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
        rdbtnNewRadioButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        rdbtnNewRadioButton_1.setBackground(new Color(0, 0, 51));
        rdbtnNewRadioButton_1.setBounds(450, 411, 127, 23);
        getContentPane().add(rdbtnNewRadioButton_1);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(rdbtnNewRadioButton);
        radioGroup.add(rdbtnNewRadioButton_1);

        JButton btnNewButton = new JButton("Next >>");
        btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
        btnNewButton.setForeground(new Color(0, 0, 51));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(274, 458, 152, 35);
        getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel_10 = new JLabel("Data Center 1");
        lblNewLabel_10.setForeground(new Color(255, 255, 255));
        lblNewLabel_10.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
        lblNewLabel_10.setBounds(284, 22, 142, 25);
        getContentPane().add(lblNewLabel_10);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        textField_4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        textField_5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        textField_6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        textField_7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        textField_8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty() || txtX.getText().isEmpty() || txtLinux.getText().isEmpty() || txtXen.getText().isEmpty()
                		|| textField_4.getText().isEmpty()|| textField_5.getText().isEmpty()|| textField_6.getText().isEmpty()|| textField_7.getText().isEmpty()|| textField_8.getText().isEmpty()) {
                }else {
                    try {
                        if (rdbtnNewRadioButton.isSelected()) {
                            // If "homogeneous" is selected
                            for (int i = 0; i < numberOfDataCenters; i++) {
                                DataCenterData centerData = new DataCenterData();
                                centerData.numberOfHosts = Integer.parseInt(textField.getText());
                                numberofhosts = Integer.parseInt(textField.getText());
                                centerData.systemArchitecture = txtX.getText();
                                centerData.operatingSystem = txtLinux.getText();
                                centerData.vmmName = txtXen.getText();
                                centerData.timeZone = Double.parseDouble(textField_4.getText());
                                centerData.costOfProcessing = Double.parseDouble(textField_5.getText());
                                centerData.costOfMemory = Double.parseDouble(textField_6.getText());
                                centerData.costOfStorage = Double.parseDouble(textField_7.getText());
                                centerData.costOfBandwidth = Double.parseDouble(textField_8.getText());
                                
                             

                                // Add the data for this data center to the list
                                centerDataList.add(centerData);
                            }
                         // Calculate the total number of hosts
                            totalnbr = numberofhosts * numberOfDataCenters;
                           System.out.println("Total Number of Hosts: " + totalnbr);
                            //hostNumber = 2;
                            // If all data centers are processed, open the host interface
                            C_A_interface hostsecondinter = new C_A_interface(totalnbr);
                            hostsecondinter.setVisible(true);
                            dispose(); // Close the current window
                            
                            		
                        } else if (rdbtnNewRadioButton_1.isSelected()) {
 
                         // Create a DataCenterData object for heterogeneous data center
                            DataCenterData centerData = new DataCenterData();
                            centerData.numberOfHosts = Integer.parseInt(textField.getText());
                            numberofhosts = Integer.parseInt(textField.getText());
                            
                            centerData.systemArchitecture = txtX.getText();
                            centerData.operatingSystem = txtLinux.getText();
                            centerData.vmmName = txtXen.getText();
                            centerData.timeZone = Double.parseDouble(textField_4.getText());
                            centerData.costOfProcessing = Double.parseDouble(textField_5.getText());
                            centerData.costOfMemory = Double.parseDouble(textField_6.getText());
                            centerData.costOfStorage = Double.parseDouble(textField_7.getText());
                            centerData.costOfBandwidth = Double.parseDouble(textField_8.getText());
                            
                            
                            centerData.interhost = numberofhosts;
                            //centerData.setInterhost(numberofhosts);
                            centerDataList.add(centerData);
                            // System.out.println("Number of Hosts: " + centerData.interhost);
                        	
                            int dataCenterIndex = 0;
							int dataCenterNumber = 2;
							
							if(numberOfDataCenters == 1) {
								totalnbr = numberofhosts;
								C_A_interface hostsecondinter = new C_A_interface(totalnbr);
	                            hostsecondinter.setVisible(true);
	                            dispose(); // Close the current interface
							}else {
								// If "heterogeneous" is selected, go to the next datacenter interface
	                            B_B_interface datainter = new B_B_interface(numberOfDataCenters, dataCenterIndex, new ArrayList<>(), dataCenterNumber, Integer.parseInt(textField.getText()), txtX.getText(), txtLinux.getText(), txtXen.getText(),
	                            	    Double.parseDouble(textField_4.getText()), Double.parseDouble(textField_5.getText()),
	                            	    Double.parseDouble(textField_6.getText()), Double.parseDouble(textField_7.getText()),
	                            	    Double.parseDouble(textField_8.getText()), numberofhosts);
	                           //datainter di= new datainter(centerData);
	                            datainter.setVisible(true);
	                            dispose();
							}
                            
                        }
                    } catch (NumberFormatException ex) {
                        // Numeric values are not valid, do nothing
                    }
                }
              }
        });
    }

      public class DataCenterData {
        public int totalNumberOfHosts;
        public int interhost;
		public int numberOfHosts;
		public String systemArchitecture;
		public String operatingSystem;
		public String vmmName;
		public double timeZone;
		public double costOfProcessing;
		public double costOfMemory;
		public double costOfStorage;
		public double costOfBandwidth;
        
     // Getter method for interhost
        public int getInterhost() {
        	 return interhost;
    	}

        // Setter method for interhost
        public void setInterhost(int interhost) {
            this.interhost = interhost;
        }

		public String getSystemArchitecture() {
			// TODO Auto-generated method stub
			return systemArchitecture;
		}

		public String getOperatingSystem() {
			// TODO Auto-generated method stub
			return operatingSystem;
		}

		public String getVmmName() {
			// TODO Auto-generated method stub
			return vmmName;
		}

		public double getTimeZone() {
			// TODO Auto-generated method stub
			return timeZone;
		}

		public double getCostOfProcessing() {
			// TODO Auto-generated method stub
			return costOfProcessing;
		}

		public double getCostOfMemory() {
			// TODO Auto-generated method stub
			return costOfMemory;
		}

		public double getCostOfStorage() {
			// TODO Auto-generated method stub
			return costOfStorage;
		}

		public double getCostOfBandwidth() {
			// TODO Auto-generated method stub
			return costOfBandwidth;
		}

    }

}
