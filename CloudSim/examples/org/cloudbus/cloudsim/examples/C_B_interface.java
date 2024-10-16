package org.cloudbus.cloudsim.examples;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.cloudbus.cloudsim.examples.B_B_interface.DataCenterData;
import org.cloudbus.cloudsim.examples.B_B_interface.HostData;

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

public class C_B_interface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    // Variables to store user inputs
    //private int hostID;
    //private int numberOfVMs;
    //private double mips;
    //private int ram;
   // private int storage;
   // private int bandwidth;
   // private String hostType;
    
    private static int totalNumberOfVms = 0;
    private static int hostIndex = 1;
    private static int hostNumber = 2;
    //private int hostNumber;
    public static List<C_A_interface.HostData> HostDataList;
    private int totalnbr;
    private int numberofvms;
    private static int hostvm = 0;
    private int totalnbrvms = 0;
    private static int numberOfHosts;
    
 // modification
    private int textFieldValue;
    private int textField1Value;
    private double textField2Value;
    private int textField3Value;
    private int textField4Value;
    private int textField5Value;

    public C_B_interface(int hostIndex, int totalnbr, List<C_A_interface.HostData> HostDataList, int hostID, int numberOfVMs, double mips, int ram, int storage, int bandwidth, int numberofvms) {
    	this.totalNumberOfVms = totalNumberOfVms;
    	this.hostIndex = hostIndex;
    	//hostNumber++; 
    	this.totalnbr = totalnbr;
    	this.hostvm = numberofvms;
    	this.HostDataList = HostDataList;
    	
    	// Store the parameters in the instance variables
        this.textFieldValue = hostID;
        this.textField1Value = numberOfVMs;
        this.textField2Value = mips;
        this.textField3Value = ram;
        this.textField4Value = storage;
        this.textField5Value = bandwidth;
        
        if (hostvm == 0 && !HostDataList.isEmpty()) {
        	hostvm = HostDataList.get(0).numberOfVMs;
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 587, 426);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHostID = new JLabel("Host ID:");
        lblHostID.setForeground(new Color(255, 255, 255));
        lblHostID.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        lblHostID.setBounds(166, 127, 70, 22);
        contentPane.add(lblHostID);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("1");
        textField.setColumns(10);
        textField.setBounds(345, 132, 98, 20);
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
        lblNumberOfVMs.setBounds(166, 160, 138, 22);
        contentPane.add(lblNumberOfVMs);

        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setText("1");
        textField_1.setColumns(10);
        textField_1.setBounds(345, 163, 98, 20);
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
        lblMIPS.setBounds(166, 193, 70, 22);
        contentPane.add(lblMIPS);

        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setText("1000");
        textField_2.setColumns(10);
        textField_2.setBounds(345, 194, 98, 20);
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
        lblRAM.setBounds(166, 226, 85, 22);
        contentPane.add(lblRAM);

        textField_3 = new JTextField();
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setText("2048");
        textField_3.setColumns(10);
        textField_3.setBounds(345, 228, 98, 20);
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
        lblStorage.setBounds(166, 259, 70, 22);
        contentPane.add(lblStorage);

        textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setText("1000000");
        textField_4.setColumns(10);
        textField_4.setBounds(345, 262, 98, 20);
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
        lblBandwidth.setBounds(166, 292, 85, 22);
        contentPane.add(lblBandwidth);
        
        JLabel lblNewLabel = new JLabel("Host "+hostNumber); // Use the updated host number
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
        lblNewLabel.setBounds(252, 69, 85, 22);
        contentPane.add(lblNewLabel);

        textField_5 = new JTextField();
        textField_5.setText("10000");
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setColumns(10);
        textField_5.setBounds(345, 293, 98, 20);
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

        // Create a ButtonGroup and add radio buttons to it
        ButtonGroup radioGroup = new ButtonGroup();

        JButton btnNewButton = new JButton("Next >>");
        btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 15));
        btnNewButton.setForeground(new Color(0, 0, 51));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(238, 341, 121, 36);
        contentPane.add(btnNewButton);
        
        
     // Add an ActionListener to the "Next" button
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty()|| textField_4.getText().isEmpty()|| textField_5.getText().isEmpty()) {
                } else {
                    try {
                    	C_A_interface.HostData hostData = new C_A_interface(totalnbr).new HostData();
                    	// Store user inputs in variables
                    	hostData.hostID = Integer.parseInt(textField.getText());
                	    hostData.numberOfVMs = Integer.parseInt(textField_1.getText());
                	    
                	    
                        totalNumberOfVms += hostData.numberOfVMs;
                        //System.out.println("totalNumberOfVms: " + totalNumberOfVms);
                	    
                	    //System.out.println(" Vms: " + totalNumberOfVms);
                	    //System.out.println("hostvm: " + hostvm);s
                	    
                	    totalnbrvms = totalNumberOfVms + hostvm;
                	    System.out.println("Total Number of Vms: " + totalnbrvms);
                	    
                	    
                	    hostData.mips = Double.parseDouble(textField_2.getText());
                	    hostData.ram = Integer.parseInt(textField_3.getText());
                	    hostData.storage = Integer.parseInt(textField_4.getText());
                	    hostData.bandwidth = Integer.parseInt(textField_5.getText());

                	 // Add the data for this data center to the Data Center list
                	    HostDataList.add(hostData); // Add the HostData object to the list   
                    	
                        // Determine the selected data center type
                	    if (hostIndex < totalnbr - 2) {
                	    	hostNumber++;
                            int nextHostIndex = hostIndex + 1;
                            C_B_interface hostinter = new C_B_interface(nextHostIndex, totalnbr, HostDataList, Integer.parseInt(textField.getText()),
                                    Integer.parseInt(textField_1.getText()), Double.parseDouble(textField_2.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()), Integer.parseInt(textField_5.getText()), numberofvms);
                            hostinter.setVisible(true);
                            dispose(); // Close the current window
                        } else {
                        	// int numberofhosts = centerData.numberOfHosts; // Set numberofhosts
                        	totalnbrvms = totalNumberOfVms + hostvm;
                            // All data centers processed, open hostsecondinter
                            D_A_interface VMfirstinter = new D_A_interface(totalnbrvms);
                            VMfirstinter.setVisible(true);
                            dispose(); // Close the current interface
                            
                            
                        }

                        // Navigate to the next interface (VMinter)
                    } catch (NumberFormatException ex) {
                        // Numeric values are not valid, do nothing
                    }
                }
                
                for(C_A_interface.HostData h : HostDataList) {
                	System.out.println(" hostID: " + h.hostID);
            	    System.out.println("ram: " + h.ram);
            	    System.out.println("------------------------");
                	
                }
                
            }
        });
    }

	class HostData {
        public int hostID;
        public int numberOfVMs;
        public double mips;
        public int ram;
        public int storage;
    }
}