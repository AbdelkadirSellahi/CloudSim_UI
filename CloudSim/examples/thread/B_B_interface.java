package thread;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.cloudbus.cloudsim.examples.C_A_interface.HostData;
import org.cloudbus.cloudsim.examples.C_B_interface;

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
import java.util.Vector;

import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.SwingConstants;

public class B_B_interface extends JFrame {

	private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JTextField txtX;
    private JTextField txtLinux;
    private JTextField txtXen;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    
    private static int numberOfDataCenters;
    public static List<B_A_interface.DataCenterData> centerDataList;
    private static int dataCenterIndex = 1;
    private int dataCenterNumber = 2;
    // private int totalNumberOfHosts;
    private static int totalNumberOfHosts = 0;
    private int totalnbr = 0;
    private int numberofhosts;
    // private int interhost = 0;
    private static int interhost = 0;
    
    //private int hostNumber;
    
    // private int type = 0;
    
    
    // modification
    private int textFieldValue;
    private String textField1Value;
    private String textField2Value;
    private String textField3Value;
    private double textField4Value;
    private double textField5Value;
    private double textField6Value;
    private double textField7Value;
    private double textField8Value;
    private JTextField textField_1;


    public B_B_interface(int numberOfDataCenters, int dataCenterIndex, List<B_A_interface.DataCenterData> centerDataList, int dataCenterNumber,int sleep_time,int numberOfHosts, String systemArchitecture, String operatingSystem, String vmmName, double timeZone,
    	    double costOfProcessing, double costOfMemory, double costOfStorage, double costOfBandwidth, int numberofhosts ) {
        this.numberOfDataCenters = numberOfDataCenters;
        this.dataCenterIndex = dataCenterIndex;
        this.centerDataList = centerDataList;
        this.dataCenterNumber = dataCenterNumber;
        this.totalNumberOfHosts = totalNumberOfHosts;
        this.interhost = numberofhosts;

        
     // Store the parameters in the instance variables
        this.textFieldValue = numberOfHosts;
        this.textField1Value = systemArchitecture;
        this.textField2Value = operatingSystem;
        this.textField3Value = vmmName;
        this.textField4Value = timeZone;
        this.textField5Value = costOfProcessing;
        this.textField6Value = costOfMemory;
        this.textField7Value = costOfStorage;
        this.textField8Value = costOfBandwidth;
        
        if (interhost == 0 && !centerDataList.isEmpty()) {
            interhost = centerDataList.get(0).numberOfHosts;
        }
        
        
        getContentPane().setBackground(new Color(0, 0, 51));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 768, 530);
        getContentPane().setLayout(null);
        
        JLabel dataCenterLabel = new JLabel("Data Center "+ dataCenterNumber);
        dataCenterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dataCenterLabel.setForeground(new Color(255, 255, 255));
        dataCenterLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
        dataCenterLabel.setBounds(304, 48, 150, 25);
        getContentPane().add(dataCenterLabel);

        JLabel lblNewLabel = new JLabel("Number of Hosts :");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel.setBounds(183, 106, 150, 25);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Roboto", Font.PLAIN, 12));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("1");
        textField.setColumns(10);
        textField.setBounds(436, 109, 101, 20);
        getContentPane().add(textField);

        JLabel lblNewLabel_1 = new JLabel("System Architecture (ex: x86) :");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(183, 142, 210, 25);
        getContentPane().add(lblNewLabel_1);

        txtX = new JTextField();
        txtX.setFont(new Font("Roboto", Font.PLAIN, 12));
        txtX.setText("x86");
        txtX.setHorizontalAlignment(SwingConstants.CENTER);
        txtX.setColumns(10);
        txtX.setBounds(436, 147, 101, 20);
        getContentPane().add(txtX);

        JLabel lblNewLabel_2 = new JLabel("Operating System (ex: Linux) :");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(183, 178, 200, 25);
        getContentPane().add(lblNewLabel_2);

        txtLinux = new JTextField();
        txtLinux.setFont(new Font("Roboto", Font.PLAIN, 12));
        txtLinux.setHorizontalAlignment(SwingConstants.CENTER);
        txtLinux.setText("Linux");
        txtLinux.setColumns(10);
        txtLinux.setBounds(436, 183, 101, 20);
        getContentPane().add(txtLinux);

        txtXen = new JTextField();
        txtXen.setFont(new Font("Roboto", Font.PLAIN, 12));
        txtXen.setHorizontalAlignment(SwingConstants.CENTER);
        txtXen.setText("Xen");
        txtXen.setColumns(10);
        txtXen.setBounds(436, 219, 101, 20);
        getContentPane().add(txtXen);

        textField_4 = new JTextField();
        textField_4.setFont(new Font("Roboto", Font.PLAIN, 12));
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setText("10.0");
        textField_4.setColumns(10);
        textField_4.setBounds(436, 255, 101, 20);
        getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setFont(new Font("Roboto", Font.PLAIN, 12));
        textField_5.setText("3.0");
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setColumns(10);
        textField_5.setBounds(436, 291, 101, 20);
        getContentPane().add(textField_5);

        textField_6 = new JTextField();
        textField_6.setFont(new Font("Roboto", Font.PLAIN, 12));
        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
        textField_6.setText("0.05");
        textField_6.setColumns(10);
        textField_6.setBounds(436, 327, 101, 20);
        getContentPane().add(textField_6);

        textField_7 = new JTextField();
        textField_7.setFont(new Font("Roboto", Font.PLAIN, 12));
        textField_7.setHorizontalAlignment(SwingConstants.CENTER);
        textField_7.setText("0.001");
        textField_7.setColumns(10);
        textField_7.setBounds(436, 361, 101, 20);
        getContentPane().add(textField_7);

        textField_8 = new JTextField();
        textField_8.setFont(new Font("Roboto", Font.PLAIN, 12));
        textField_8.setHorizontalAlignment(SwingConstants.CENTER);
        textField_8.setText("0.0");
        textField_8.setColumns(10);
        textField_8.setBounds(436, 394, 101, 20);
        getContentPane().add(textField_8);

        JLabel lblNewLabel_3 = new JLabel("VMM Name (ex: Xen) :");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(183, 214, 167, 25);
        getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Time Zone (ex: 10.0) :");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(183, 250, 167, 25);
        getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Cost of Processing (ex: 3.0) :");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(183, 286, 187, 25);
        getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Cost of Memory (ex: 0.05) :");
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(183, 322, 200, 25);
        getContentPane().add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Cost of Storage (ex: 0.001) :");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(182, 354, 201, 25);
        getContentPane().add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("Cost of Bandwidth (ex: 0.0) :");
        lblNewLabel_8.setForeground(new Color(255, 255, 255));
        lblNewLabel_8.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_8.setBounds(182, 389, 201, 25);
        getContentPane().add(lblNewLabel_8);

        // Create a ButtonGroup and add radio buttons to it
        ButtonGroup radioGroup = new ButtonGroup();

        JButton btnNewButton = new JButton("Next >>");
        btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
        btnNewButton.setForeground(new Color(0, 0, 51));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(304, 449, 141, 35);
        getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel_8_1 = new JLabel("Sleep Time :");
        lblNewLabel_8_1.setForeground(Color.WHITE);
        lblNewLabel_8_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblNewLabel_8_1.setBounds(183, 414, 221, 25);
        getContentPane().add(lblNewLabel_8_1);
        
        textField_1 = new JTextField();
        textField_1.setText("0.0");
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
        textField_1.setColumns(10);
        textField_1.setBounds(436, 417, 101, 20);
        getContentPane().add(textField_1);

        // Validate and allow only numeric input for "Number of Hosts"
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

        textField_6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Disallow non-numeric characters except for backspace and period (for decimal values)
                }
            }
        });

        textField_7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Disallow non-numeric characters except for backspace and period (for decimal values)
                }
            }
        });

        textField_8.addKeyListener(new KeyAdapter() {
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
				if (textField.getText().isEmpty() || txtX.getText().isEmpty() || txtLinux.getText().isEmpty() || txtXen.getText().isEmpty()
                		|| textField_4.getText().isEmpty()|| textField_5.getText().isEmpty()|| textField_6.getText().isEmpty()|| textField_7.getText().isEmpty()|| textField_8.getText().isEmpty()) {
                } else {
                    try {
                    	B_A_interface.DataCenterData centerData = new B_A_interface(numberOfDataCenters).new DataCenterData();
                    	// datacenterinter.DataCenterData centerData = new datacenterinter.DataCenterData();
                    	centerData.numberOfHosts = Integer.parseInt(textField.getText());
                    	// numberofhosts = Integer.parseInt(textField.getText());
                    	// centerData.setInterhost(interhost);
                    	//centerData.setInterhost(interhost); 
                    	// int interhost = centerData.getInterhost();
                    	
                    	
                    	
                    	   // System.out.println("Interhost value: " + interhost);
                    	
                    	
                    	// numberofhosts = Integer.parseInt(textField.getText());
                    	
                    	totalNumberOfHosts += centerData.numberOfHosts;
                        //type = centerData.numberOfHosts;
                    	// Get the interhost value from datacenterinter
                        // int totalnbr = totalNumberOfHosts + interhost;
                    	// centerData.totalNumberOfHosts = totalNumberOfHosts + centerData.numberOfHosts; 
                    	totalnbr = totalNumberOfHosts + interhost; // ميديش قيمة لي كابن فانترفاص لي فات
                    	
                    	 // System.out.println("Total Number: " + totalNumberOfHosts);
                    	 // System.out.println("Interhost value: " + interhost);
                    	 
                         System.out.println("Total Number of Hosts: " + totalnbr);
                    	 
                    	 
                    	centerData.systemArchitecture = txtX.getText();
                    	centerData.operatingSystem = txtLinux.getText();
                    	centerData.vmmName = txtXen.getText();
                    	centerData.timeZone = Double.parseDouble(textField_4.getText());
                    	centerData.costOfProcessing = Double.parseDouble(textField_5.getText());
                    	centerData.costOfMemory = Double.parseDouble(textField_6.getText());
                    	centerData.costOfStorage = Double.parseDouble(textField_7.getText());
                    	centerData.costOfBandwidth = Double.parseDouble(textField_8.getText());
                    	
                    	//centerData.totalnbr = Integer.parseInt(textField.getText());

                    	// Add the data for this data center to the Data Center list
                    	centerDataList.add(centerData);
                   	
                    	// HostData hostData = new HostData();
                       // hostData.numberOfHosts = centerData.numberOfHosts;

                       // HostDataList.add(hostData);

                        if (dataCenterIndex < numberOfDataCenters - 2) {
                            // Open the next datainter interface, passing the data collected so far
                            B_B_interface datainter = new B_B_interface(numberOfDataCenters, dataCenterIndex + 1, centerDataList, dataCenterNumber + 1,Integer.parseInt(textField_1.getText()), Integer.parseInt(textField.getText()), txtX.getText(), txtLinux.getText(), txtXen.getText(),
                                    Double.parseDouble(textField_4.getText()), Double.parseDouble(textField_5.getText()),
                                    Double.parseDouble(textField_6.getText()), Double.parseDouble(textField_7.getText()),
                                    Double.parseDouble(textField_8.getText()), numberofhosts);
                            datainter.setVisible(true);
                            dispose(); // Close the current interface
                        } else {
                        	// int numberofhosts = centerData.numberOfHosts; // Set numberofhosts
                            // All data centers processed, open hostsecondinter
                        	totalnbr = totalNumberOfHosts + interhost;
                        	//hostNumber = 2;
                        	C_A_interface hostsecondinter = new C_A_interface(totalnbr);
                            hostsecondinter.setVisible(true);
                            dispose(); // Close the current interface
                            
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Numeric values are not valid.");
                    }
                }
            }
        });
    }

    private int getInterhost() {
		// TODO Auto-generated method stub
		return 0;
	}

	// Class to hold data for a data center
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
    	public int sleep_time;
		public void setInterhost(int interhost2) {
			// TODO Auto-generated method stub
			
		}
		public int getInterhost() {
			// TODO Auto-generated method stub
			return 0;
		}
    }
    
 // Class to hold data for a host
    class HostData {
        int numberOfHosts;

		
    }
}