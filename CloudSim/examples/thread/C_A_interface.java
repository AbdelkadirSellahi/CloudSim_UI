package thread;

import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import thread.B_B_interface.DataCenterData;
import thread.B_B_interface.HostData;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.SwingConstants;

public class C_A_interface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    // Variables to store user inputs
    private int hostID;
    private int numberOfVMs;
    private double mips;
    private int ram;
    private int storage;
    private int bandwidth;
    private String hostType;
    
    // private List<org.cloudbus.cloudsim.examples.datainter.HostData> HostDataList;
    //List<HostData> HostDataList = new ArrayList<>();
    List<DataCenterData> centerDataList = new ArrayList<>();
    public static List<HostData> HostDataList  = new ArrayList<>();
    private int numberofhosts;
    // private int totalNumberOfHosts;
    private int totalnbr;
    private int numberofvms=0;
    private int totalnbrvms;
    
    private int hostNumber;
    
    private int ramofhost = 0;


    public C_A_interface(int totalnbr) {
        this.totalnbr = totalnbr;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 469);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHostID = new JLabel("Host ID:");
        lblHostID.setForeground(new Color(255, 255, 255));
        lblHostID.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblHostID.setBounds(160, 100, 70, 22);
        contentPane.add(lblHostID);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("1000");
        textField.setColumns(10);
        textField.setBounds(349, 168, 98, 20);
        contentPane.add(textField);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
            }
        });

        JLabel lblNumberOfVMs = new JLabel("Number of VMs:");
        lblNumberOfVMs.setForeground(new Color(255, 255, 255));
        lblNumberOfVMs.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNumberOfVMs.setBounds(160, 133, 126, 22);
        contentPane.add(lblNumberOfVMs);

        textField_1 = new JTextField();
        textField_1.setText("1");
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setColumns(10);
        textField_1.setBounds(349, 102, 98, 20);
        contentPane.add(textField_1);

        textField_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        JLabel lblMIPS = new JLabel("MIPS:");
        lblMIPS.setForeground(new Color(255, 255, 255));
        lblMIPS.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblMIPS.setBounds(160, 166, 70, 22);
        contentPane.add(lblMIPS);

        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setText("1");
        textField_2.setColumns(10);
        textField_2.setBounds(349, 135, 98, 20);
        contentPane.add(textField_2);

        textField_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
            }
        });

        JLabel lblRAM = new JLabel("RAM:");
        lblRAM.setForeground(new Color(255, 255, 255));
        lblRAM.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblRAM.setBounds(160, 199, 85, 22);
        contentPane.add(lblRAM);

        textField_3 = new JTextField();
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setText("2048");
        textField_3.setColumns(10);
        textField_3.setBounds(349, 201, 98, 20);
        contentPane.add(textField_3);

        textField_3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
            }
        });

        JLabel lblStorage = new JLabel("Storage:");
        lblStorage.setForeground(new Color(255, 255, 255));
        lblStorage.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblStorage.setBounds(160, 232, 85, 22);
        contentPane.add(lblStorage);

        textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setText("1000000");
        textField_4.setColumns(10);
        textField_4.setBounds(349, 232, 98, 20);
        contentPane.add(textField_4);

        textField_4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        JLabel lblBandwidth = new JLabel("Bandwidth:");
        lblBandwidth.setForeground(new Color(255, 255, 255));
        lblBandwidth.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblBandwidth.setBounds(160, 265, 126, 22);
        contentPane.add(lblBandwidth);

        textField_5 = new JTextField();
        textField_5.setText("10000");
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setColumns(10);
        textField_5.setBounds(349, 267, 98, 20);
        contentPane.add(textField_5);

        textField_5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Homogeneous");
        rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
        rdbtnNewRadioButton.setFont(new Font("Roboto", Font.PLAIN, 12));
        rdbtnNewRadioButton.setBackground(new Color(0, 0, 51));
        rdbtnNewRadioButton.setBounds(248, 315, 109, 23);
        getContentPane().add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Heterogeneous");
        rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
        rdbtnNewRadioButton_1.setFont(new Font("Roboto", Font.PLAIN, 12));
        rdbtnNewRadioButton_1.setBackground(new Color(0, 0, 51));
        rdbtnNewRadioButton_1.setBounds(387, 315, 126, 23);
        getContentPane().add(rdbtnNewRadioButton_1);
        
     // Create a ButtonGroup and add radio buttons to it
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(rdbtnNewRadioButton);
        radioGroup.add(rdbtnNewRadioButton_1);

        JButton btnNewButton = new JButton("Next >>");
        btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 15));
        btnNewButton.setForeground(new Color(0, 0, 51));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(236, 366, 126, 36);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("Host Type :");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel.setBounds(135, 315, 85, 22);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Host 1");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 16));
        lblNewLabel_1.setBounds(257, 27, 85, 22);
        contentPane.add(lblNewLabel_1);
        
        
     // Add an ActionListener to the "Next" button
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || textField_4.getText().isEmpty() || textField_5.getText().isEmpty()) {
                 }else {
                    try {
                    	
                        // Determine the selected data center type
                        if (rdbtnNewRadioButton.isSelected()) {
                        	//System.out.println("Total Number of Vms: " + totalnbr);
                        	// If "homogeneous" is selected
                        	for(int i = 0; i < totalnbr; i++) {
                				
                    			HostData hostData = new HostData(); // Create an instance of HostData
                        	    hostData.hostID = i+1;
                        	    hostData.numberOfVMs = Integer.parseInt(textField_2.getText());
                        	    numberofvms = Integer.parseInt(textField_2.getText());
                        	    hostData.mips = Double.parseDouble(textField.getText());
                        	    hostData.ram = Integer.parseInt(textField_3.getText());
                        	    hostData.storage = Integer.parseInt(textField_4.getText());
                        	    hostData.bandwidth = Integer.parseInt(textField_5.getText());
                        	    

                        	   // HostDataList.addAll((Collection<? extends org.cloudbus.cloudsim.examples.datainter.HostData>) hostData); // Add the HostData object to the list 
                        	    HostDataList.add(hostData);
                    		}
                        		
                        	// Calculate the total number of hosts
                    	    totalnbrvms = numberofvms * totalnbr;
                    	    System.out.println("Total Number of vms: " + totalnbrvms);
                        	
                        	int numberofvms=0;
        					D_A_interface VMfirstinter = new D_A_interface(totalnbrvms);
        					VMfirstinter.setVisible(true);
                            dispose();  // Close the current window
                            
                            
                        } else if (rdbtnNewRadioButton_1.isSelected()) {
                        	
                        	HostData hostData = new HostData(); // Create an instance of HostData
                    	    hostData.hostID = Integer.parseInt(textField_1.getText());
                    	    hostData.numberOfVMs = Integer.parseInt(textField_2.getText());
                    	    numberofvms = Integer.parseInt(textField_2.getText());
                    	    hostData.mips = Double.parseDouble(textField.getText());
                    	    hostData.ram = Integer.parseInt(textField_3.getText());
                    	    hostData.storage = Integer.parseInt(textField_4.getText());
                    	    hostData.bandwidth = Integer.parseInt(textField_5.getText());
                    	    
                    	    hostData.hostvm = numberOfVMs;

                    	   // HostDataList.addAll((Collection<? extends org.cloudbus.cloudsim.examples.datainter.HostData>) hostData); // Add the HostData object to the list 
                    	    HostDataList.add(hostData);
                    	    
                    	    
                    	    System.out.println("Total Number of vms: " + numberofvms);
                    	    
                    	    
                    	    
                        	// List<org.cloudbus.cloudsim.examples.hostinter.HostData> hostNumber = null;
							int hostIndex=0;
							int hostNumber=2;
							
							if(totalnbr == 1) {
								totalnbrvms = numberofvms;
								System.out.println("iyad Number of vms: " + totalnbrvms);
								D_A_interface VMfirstinter = new D_A_interface(totalnbrvms);
	                            VMfirstinter.setVisible(true);
	                            dispose(); // Close the current interface
							}else {
								C_B_interface hostinter = new C_B_interface(hostIndex, totalnbr, new ArrayList<>(), Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()), Double.parseDouble(textField_2.getText()), Integer.parseInt(textField_3.getText()), 
										Integer.parseInt(textField_4.getText()), Integer.parseInt(textField_5.getText()), numberofvms);
								hostinter.setVisible(true);
	                            dispose();  // Close the current window
							}
                        }

                        // Navigate to the next interface (VMinter)
                    } catch (NumberFormatException ex) {
                        // Numeric values are not valid, do nothing
                    }
                }
                
                
                /* for(HostData hostData : HostDataList) {
                	System.out.println(" hostID: " + hostData.hostID);
            	    System.out.println("ram: " + hostData.ram);
            	    System.out.println("------------------------");
                	
                } */
            }
        });
    }
    
    public class HostData {
		public int hostID;
		public int numberOfVMs;
		public double mips;
		public int ram;
		public int storage;
		public int bandwidth;
		public int hostvm;
        
     // Getter method for hostvm
        public int gethostvm() {
        	 return hostvm;
    	}

        // Setter method for interhost
        public void sethostvm(int hostvm) {
            this.hostvm = hostvm;
        }

		public int getRam() {
			// TODO Auto-generated method stub
			return ram;
		}

		public long getStorage() {
			// TODO Auto-generated method stub
			return storage;
		}

		public int getBandwidth() {
			// TODO Auto-generated method stub
			return bandwidth;
		}

		public double getMips() {
			// TODO Auto-generated method stub
			return mips;
		}

		public int gethostID() {
			// TODO Auto-generated method stub
			return hostID;
		}

    }
}