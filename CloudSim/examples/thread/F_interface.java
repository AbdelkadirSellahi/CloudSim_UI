package thread;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import thread.D_A_interface.vmData;
import thread.E_A_interface.cloudletData;
import thread.B_B_interface.DataCenterData;
import thread.B_B_interface.HostData;
import thread.A_interface.firstData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class F_interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	List<DataCenterData> centerDataList = new ArrayList<>();
	List<HostData> HostDataList = new ArrayList<>();
	List<vmData> vmDataList = new ArrayList<>();
	List<cloudletData> cloudletDataList = new ArrayList<>();
	List<firstData> firstDataList = new ArrayList<>();
    private int totalnbr;
    private int totalnbrvms;
    private int totalnbrcloudlet;

	public List<brokerData> brokerDataList  = new ArrayList<>();
	private JTextField textField_2;
	
	public F_interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Broker Interface");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(182, 23, 140, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(109, 70, 74, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of VM :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(109, 107, 103, 19);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setText("1");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField.setBounds(282, 69, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1");
		textField_1.setBounds(282, 106, 107, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNext = new JButton("Next >>");
		btnNext.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnNext.setForeground(new Color(0, 0, 51));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(202, 208, 89, 38);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Cloudlet :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(109, 145, 142, 19);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("1");
		textField_2.setColumns(10);
		textField_2.setBounds(282, 144, 107, 20);
		contentPane.add(textField_2);
		
		btnNext.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty()) {
		        } else {
		            try {
		                brokerData brokerData = new brokerData();
		                brokerData.brokerID = Integer.parseInt(textField.getText());
		                brokerData.numberOfVMs = Integer.parseInt(textField_1.getText());
		                brokerData.numberOfCloudlet = Integer.parseInt(textField_2.getText());

		                // Create the mapping of cloudlets to VMs
		                brokerData.vmCloudletMap = generateVmCloudletMapping(brokerData.numberOfVMs, brokerData.numberOfCloudlet);

		                brokerDataList.add(brokerData);

		                // Start the simulation
		                G_interface sim = new G_interface(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
		                        new ArrayList<>(), new ArrayList<>(), 0, 0, 0);
		                sim.setVisible(true);
		                
		                
		                
		             // Create an instance of Simclass and run the simulation
                        /*Simclass simClass = new Simclass(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
		                        new ArrayList<>(), new ArrayList<>(), 0, 0, 0);
                        simClass.runSimulation();*/
		                
		                
		                
		                
		                
		                dispose(); // Close the current window
		            } catch (NumberFormatException ex) {
		                // Handle the case where the text fields do not contain valid integers
		                ex.printStackTrace();
		            }
		        }
		    }
		});
	}

		// Method to generate VM-Cloudlet mapping
		private List<Integer> generateVmCloudletMapping(int numberOfVMs, int numberOfCloudlet) {
		    List<Integer> vmCloudletMap = new ArrayList<>();

		    // Create the mapping such that each VM is associated with one cloudlet
		    for (int i = 0; i < numberOfVMs; i++) {
		        vmCloudletMap.add(i % numberOfCloudlet + 1); // Cloudlet IDs start from 1
		    }

		    return vmCloudletMap;
		}
	
		public class brokerData {
		    public int brokerID;
		    public int numberOfVMs;
		    public int numberOfCloudlet;
		    public List<Integer> vmCloudletMap; // Add this field to store the VM-Cloudlet mapping
		}
	
	}