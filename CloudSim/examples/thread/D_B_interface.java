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
import org.cloudbus.cloudsim.examples.B_B_interface.DataCenterData;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class D_B_interface extends JFrame {

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

	private static int numberofvms;
    public static List<D_A_interface.vmData> vmDataList;
    private static int vmIndex = 1;
    private static int vmNumber = 2;
    private static int totalNumberOfcloudlet = 0;
    private int totalnbrvms;
    private int totalnbrcloudlet;
    private static int vmcloudlet = 0;
    private int cloudlet;
    
 // modification
    private int textFieldValue;
    private double textField1Value;
    private int textField2Value;
    private int textField3Value;
    private int textField4Value;
    private int textField5Value;
    private String textField6Value;
    private int textField7Value;
    
	public D_B_interface(int totalnbrvms, int vmIndex, List<D_A_interface.vmData> vmDataList, int VMid, double mips, int size, int ram, int bandwidth, int pesNumber, String VMM, int nbrcloudlet, int cloudlet) {
		this.totalnbrvms = totalnbrvms;
    	this.vmIndex = vmIndex;
    	//this.vmNumber = vmNumber;
    	this.totalNumberOfcloudlet = totalNumberOfcloudlet;
    	this.vmcloudlet = cloudlet;
    	this.vmDataList = vmDataList;
    	
    	// Store the parameters in the instance variables
        this.textFieldValue = VMid;
        this.textField1Value = mips;
        this.textField2Value = size;
        this.textField3Value = ram;
        this.textField4Value = bandwidth;
        this.textField5Value = pesNumber;
        this.textField6Value = VMM;
        this.textField7Value = vmcloudlet;
        
        if (vmcloudlet == 0 && !vmDataList.isEmpty()) {
        	vmcloudlet = vmDataList.get(0).nbrcloudlet;
        }
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtXen = new JTextField();
		txtXen.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtXen.setHorizontalAlignment(SwingConstants.CENTER);
		txtXen.setText("Xen");
		txtXen.setColumns(10);
		txtXen.setBounds(314, 267, 103, 20);
		contentPane.add(txtXen);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1");
		textField_1.setColumns(10);
		textField_1.setBounds(314, 46, 103, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("1000");
		textField_2.setColumns(10);
		textField_2.setBounds(314, 109, 103, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("10000");
		textField_3.setColumns(10);
		textField_3.setBounds(314, 140, 103, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("512");
		textField_4.setColumns(10);
		textField_4.setBounds(314, 171, 103, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("1000");
		textField_5.setColumns(10);
		textField_5.setBounds(314, 205, 103, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("1");
		textField_6.setColumns(10);
		textField_6.setBounds(314, 238, 103, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("VM ID :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(93, 44, 76, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MIPS for VM :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(93, 107, 171, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Size for VM :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(91, 140, 155, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RAM for VM  :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(93, 173, 153, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bandwidth for VM :");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(93, 206, 194, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pes Number for VM :");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(93, 238, 145, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("VMM for VM :");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(93, 265, 145, 22);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Next >>");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(0, 0, 51));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(197, 306, 129, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Number of cloudlet :");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(91, 76, 129, 22);
		contentPane.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("1");
		textField_7.setColumns(10);
		textField_7.setBounds(314, 76, 103, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("VM "+ vmNumber);
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_7_1.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblNewLabel_7_1.setBounds(214, 11, 78, 22);
		contentPane.add(lblNewLabel_7_1);
		
		
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
                
                	if (textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty()|| textField_4.getText().isEmpty()|| textField_5.getText().isEmpty()|| textField_6.getText().isEmpty()|| textField_7.getText().isEmpty()) {
                } else {
                    try {
                    	// Store user inputs in variables
                    	D_A_interface.vmData vmData = new D_A_interface(totalnbrvms).new vmData();
                    	// Store user inputs in variables
                    	vmData.VMid = Integer.parseInt(textField_1.getText());
                    	vmData.mips = Double.parseDouble(textField_2.getText());
                    	vmData.size = Integer.parseInt(textField_3.getText());
                    	vmData.ram = Integer.parseInt(textField_4.getText());
                    	vmData.bandwidth = Integer.parseInt(textField_5.getText());
                    	vmData.pesNumber = Integer.parseInt(textField_6.getText());
                    	vmData.VMM = txtXen.getText();
                    	vmData.nbrcloudlet = Integer.parseInt(textField_7.getText());
                    	// cloudlet = Integer.parseInt(textField_7.getText());
                    	
                    	totalNumberOfcloudlet += vmData.nbrcloudlet;
                    	totalnbrcloudlet = totalNumberOfcloudlet + vmcloudlet;
                        
                    	System.out.println("Total Number of cloudlet: " + totalnbrcloudlet);
                    	
                        // Add the data for this data center to the list
                        vmDataList.add(vmData);
                         
                     // Determine the selected data center type
                	    if (vmIndex < totalnbrvms - 1) {
                	    	vmNumber++;
                	    	D_B_interface VMinter = new D_B_interface(totalnbrvms, vmIndex + 1, vmDataList, Integer.parseInt(txtXen.getText()), Double.parseDouble(textField_1.getText()), 
                            		Integer.parseInt(textField_2.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()), 
                            		Integer.parseInt(textField_5.getText()), textField_6.getText(), Integer.parseInt(textField_7.getText()), cloudlet);
                	    	VMinter.setVisible(true);
                            dispose();  // Close the current window
                        } else {
                        	// int numberofhosts = centerData.numberOfHosts; // Set numberofhosts
                        	totalnbrcloudlet = totalNumberOfcloudlet + vmcloudlet;
                        // All data centers processed, open hostsecondinter
                        	E_A_interface cloudletfirstinter = new E_A_interface(totalnbrcloudlet);
                        	cloudletfirstinter.setVisible(true);
                            dispose(); // Close the current interface
                            
                            
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
		public int VMid;
		public double mips;
		public int size;
		public int ram;
		public int bandwidth;
		public int pesNumber;
		public String VMM;
		public int vmcloudlet;
        
    }
}
