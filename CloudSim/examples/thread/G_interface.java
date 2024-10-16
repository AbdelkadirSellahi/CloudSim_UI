package thread;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.examples.D_A_interface.vmData;
import org.cloudbus.cloudsim.examples.F_interface.brokerData;
import org.cloudbus.cloudsim.examples.E_A_interface.cloudletData;
import org.cloudbus.cloudsim.examples.B_A_interface.DataCenterData;
import org.cloudbus.cloudsim.examples.A_interface.firstData;
import org.cloudbus.cloudsim.examples.C_A_interface.HostData;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.VmSchedulerTimeShared;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

public class G_interface extends JFrame {
	
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static JTextArea resultTextArea;

    /** The cloudlet list. */
	private static List<Cloudlet> cloudletList;

	/** The vmlist. */
	private static List<Vm> vmlist;

	private static List<Vm> createVM(int userId, int vms) {

		//Creates a container to store VMs. This list is passed to the broker later
		LinkedList<Vm> list = new LinkedList<Vm>();

		for (int vmId = 0; vmId < vms; vmId++) {
	        // Fetch attributes for the current VM from combinedvmDataList
	        D_A_interface.vmData vmData = combinedvmDataList.get(vmId);

	        // Extract attributes for the current VM
	        long size = vmData.getSize();
	        int ram = vmData.getRam();
	        double mips = vmData.getMips();
	        long bw = vmData.getBandwidth();
	        int pesNumber = vmData.getPesNumber();
	        String vmm = vmData.getVmmName();

	        // Create VM and add it to the list
	        Vm vm = new Vm(vmId, userId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
	        list.add(vm);
	    }

	    return list;
	}


	private static List<Cloudlet> createCloudlet(int userId, int cloudlets){
		// Creates a container to store Cloudlets
		LinkedList<Cloudlet> list = new LinkedList<Cloudlet>();

		for (int cloudletId = 0; cloudletId < cloudlets; cloudletId++) {
	        // Fetch attributes for the current Cloudlet from combinedcloudletDataList
	        E_A_interface.cloudletData cloudletData = combinedcloudletDataList.get(cloudletId % combinedcloudletDataList.size());

	        // Extract attributes for the current Cloudlet
	        long length = cloudletData.getSizelen();
	        long fileSize = cloudletData.getSizefil();
	        long outputSize = cloudletData.getSizeout();
	        int pesNumber = cloudletData.getPesNumber();
	        UtilizationModel utilizationModel = new UtilizationModelFull();

	        // Create Cloudlet and add it to the list
	        Cloudlet cloudlet = new Cloudlet(cloudletId, length, pesNumber, fileSize, outputSize, utilizationModel, utilizationModel, utilizationModel);
	        // setting the owner of these Cloudlets
	        cloudlet.setUserId(userId);
	        list.add(cloudlet);
	    }

	    return list;
	}
    
    
    
    

	private int numberOfDataCenters;
    private int totalnbr;
    private int totalnbrvms;
    private int totalnbrcloudlet;
    private List<B_A_interface.DataCenterData> centerDataList = new ArrayList<>();
    private List<C_B_interface.HostData> HostDataList = new ArrayList<>();
    private List<D_A_interface.vmData> vmDataList = new ArrayList<>();
    private List<E_A_interface.cloudletData> cloudletDataList = new ArrayList<>();
    private List<A_interface.firstData> firstDataList = new ArrayList<>();
    private List<F_interface.brokerData> brokerDataList = new ArrayList<>();
    
    private static List<B_A_interface.DataCenterData> combinedcenterDataList;
    private static List<C_A_interface.HostData> combinedHostDataList;
    private static List<D_A_interface.vmData> combinedvmDataList;
    private static List<E_A_interface.cloudletData> combinedcloudletDataList;
    

    public G_interface(List<B_A_interface.DataCenterData> centerDataList, List<C_B_interface.HostData> HostDataList,
            List<D_A_interface.vmData> vmDataList, List<E_A_interface.cloudletData> cloudletDataList,
            List<F_interface.brokerData> brokerDataList, List<A_interface.firstData> firstDataList, int totalnbr,
            int totalnbrvms, int totalnbrcloudlet) {

        this.brokerDataList = brokerDataList;
        this.HostDataList = HostDataList;
        this.centerDataList = centerDataList;
        this.vmDataList = vmDataList;
        this.cloudletDataList = cloudletDataList;
        this.firstDataList = firstDataList;
        this.totalnbr = totalnbr;
        this.totalnbrvms = totalnbrvms;
        this.totalnbrcloudlet = totalnbrcloudlet;

        combinedHostDataList = new ArrayList<>();
        if (C_A_interface.HostDataList != null) {
            combinedHostDataList.addAll(C_A_interface.HostDataList);
        }
        if (C_B_interface.HostDataList != null) {
            combinedHostDataList.addAll(C_B_interface.HostDataList);
        }
        combinedcenterDataList = new ArrayList<>();
        if (B_A_interface.centerDataList != null) {
        	combinedcenterDataList.addAll(B_A_interface.centerDataList);
        }
        if (B_B_interface.centerDataList != null) {
        	combinedcenterDataList.addAll(B_B_interface.centerDataList);
        }
        combinedvmDataList = new ArrayList<>();
        if (D_A_interface.vmDataList != null) {
        	combinedvmDataList.addAll(D_A_interface.vmDataList);
        }

        if (D_B_interface.vmDataList != null) {
        	combinedvmDataList.addAll(D_B_interface.vmDataList);
        } 
        combinedcloudletDataList = new ArrayList<>();
        if (E_A_interface.cloudletDataList != null) {
        	combinedcloudletDataList.addAll(E_A_interface.cloudletDataList);
        }
        if (E_B_interface.cloudletDataList != null) {
        	combinedcloudletDataList.addAll(E_B_interface.cloudletDataList);
        }
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 842, 552);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnStartSimulation = new JButton("Start Simulation");
        btnStartSimulation.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
        btnStartSimulation.setForeground(new Color(0, 0, 51));
        btnStartSimulation.setBackground(Color.WHITE);
        btnStartSimulation.setBounds(347, 464, 151, 38);
        contentPane.add(btnStartSimulation);

        JLabel lblSimulationInterface = new JLabel("Simulation Interface");
        lblSimulationInterface.setForeground(new Color(255, 255, 255));
        lblSimulationInterface.setBackground(new Color(240, 240, 240));
        lblSimulationInterface.setToolTipText("");
        lblSimulationInterface.setFont(new Font("Roboto", Font.BOLD, 18));
        lblSimulationInterface.setBounds(323, 10, 175, 19);
        contentPane.add(lblSimulationInterface);

        resultTextArea = new JTextArea();
        resultTextArea.setBackground(new Color(255, 255, 255));
        resultTextArea.setEditable(false);
        resultTextArea.setBounds(10, 40, 806, 413);
        contentPane.add(resultTextArea);
        

        btnStartSimulation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Triggered when the "Start Simulation" button is clicked
                // Add your simulation setup and execution logic here
                runSimulation();
            }
        });
        
    }
    
    public void runSimulation() {
    	resultTextArea.append("Starting Simulation...");

		try {
			// First step: Initialize the CloudSim package. It should be called
			// before creating any entities.
			//int num_user = firstDataList.get(0).getNumberOfUsersText();   // number of grid users
			int num_user = firstData.getNumberOfUsersText();
			Calendar calendar = Calendar.getInstance();
			boolean trace_flag = false;  // mean trace events

			// Initialize the CloudSim library
			CloudSim.init(num_user, calendar, trace_flag);

			// Second step: Create Datacenters
			//Datacenters are the resource providers in CloudSim. We need at list one of them to run a CloudSim simulation
			List<Datacenter> datacenterList = new ArrayList<>();

			// Assuming combinedcenterDataList contains the necessary information for each datacenter
			for (int dcId = 0; dcId < combinedcenterDataList.size(); dcId++) {
			    Datacenter datacenter = createDatacenter("Datacenter_" + dcId, dcId);
			    datacenterList.add(datacenter);
			    int SleepValue = B_A_interface.getSleepTime();
			    try { Thread.sleep(SleepValue);
			    }catch(InterruptedException e) {
			        // Handle the InterruptedException, e.g., print the stack trace
			        e.printStackTrace();
			    }
			}

			//Third step: Create Broker
			DatacenterBroker broker = createBroker();
			int brokerId = broker.getId();

			// Create VMs and submit to the broker
			vmlist = createVM(brokerId, combinedvmDataList.size());

			// Create Cloudlets and submit to the broker
			cloudletList = createCloudlet(brokerId, combinedcloudletDataList.size());

			broker.submitVmList(vmlist);
			broker.submitCloudletList(cloudletList);

			// Fifth step: Starts the simulation
			CloudSim.startSimulation();

			// Final step: Print results when simulation is over
			List<Cloudlet> newList = broker.getCloudletReceivedList();

			CloudSim.stopSimulation();

			printCloudletList(newList);

			resultTextArea.append("Simulation finished!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			resultTextArea.append("The simulation has been terminated due to an unexpected error");
		}
	}

	private static Datacenter createDatacenter(String name, int dcId){

		// Here are the steps needed to create a PowerDatacenter:
		// 1. We need to create a list to store one or more
		//    Machines
		List<Host> hostList = new ArrayList<Host>();

		// 2. A Machine contains one or more PEs or CPUs/Cores. Therefore, should
		//    create a list to store these PEs before creating
		//    a Machine.
		List<List<Pe>> peLists = new ArrayList<>();

		for (D_A_interface.vmData vmData : combinedvmDataList) {
		    int numberOfPEs = vmData.getPesNumber(); // Get the number of PEs for the current VM
		    double mips = vmData.getMips(); // Get the MIPS for the PEs

		    List<Pe> peList = new ArrayList<>();

		    // Create PEs and add them to the list based on the number of PEs specified
		    for (int peId = 0; peId < numberOfPEs; peId++) {
		        peList.add(new Pe(peId, new PeProvisionerSimple(mips)));
		    }

		    // Add the PE list for the current VM to the overall list
		    peLists.add(peList);
		}

		//4. Create Hosts with its id and list of PEs and add them to the list of machines
		// Create Hosts with its id and list of PEs and add them to the list of machines
		for (C_A_interface.HostData hostData : combinedHostDataList) {
		    int hostId = hostData.gethostID();
		

		//for (hostsecondinter.HostData hostData : combinedHostDataList) {
		    int ram = hostData.getRam();
		    long storage = hostData.getStorage();
		    int bw = hostData.getBandwidth();

		    List<Pe> peList = new ArrayList<>();
		    double mips1 = hostData.getMips();
		    
		    // Assuming peList1 and peList2 are defined somewhere in your code
		    for (D_A_interface.vmData vmData : combinedvmDataList) {
			    int numberOfPEs = vmData.getPesNumber(); // Get the number of PEs for the current VM
			    // Create PEs and add them to the list based on the number of PEs specified
			    for (int peId = 0; peId < numberOfPEs; peId++) {
			        peList.add(new Pe(peId, new PeProvisionerSimple(mips1)));
			    }
			}
		    // Add more PEs if needed

		    hostList.add(new Host(
		            hostId,
		            new RamProvisionerSimple(ram),
		            new BwProvisionerSimple(bw),
		            storage,
		            peList,
		            new VmSchedulerTimeShared(peList)
		    ));

		    hostId++;
		//}

		}
		//To create a host with a space-shared allocation policy for PEs to VMs:
		//hostList.add(
    	//		new Host(
    	//			hostId,
    	//			new CpuProvisionerSimple(peList1),
    	//			new RamProvisionerSimple(ram),
    	//			new BwProvisionerSimple(bw),
    	//			storage,
    	//			new VmSchedulerSpaceShared(peList1)
    	//		)
    	//	);

		//To create a host with a oportunistic space-shared allocation policy for PEs to VMs:
		//hostList.add(
    	//		new Host(
    	//			hostId,
    	//			new CpuProvisionerSimple(peList1),
    	//			new RamProvisionerSimple(ram),
    	//			new BwProvisionerSimple(bw),
    	//			storage,
    	//			new VmSchedulerOportunisticSpaceShared(peList1)
    	//		)
    	//	);


		// 5. Create a DatacenterCharacteristics object that stores the
		//    properties of a data center: architecture, OS, list of
		//    Machines, allocation policy: time- or space-shared, time zone
		//    and its price (G$/Pe time unit).
		// Assuming combinedcenterDataList is a List<datacenterinter.DataCenterData>
		B_A_interface.DataCenterData centerData = combinedcenterDataList.get(dcId);

		// Extracting attributes for the DatacenterCharacteristics from the centerData
		String arch = centerData.getSystemArchitecture();
		String os = centerData.getOperatingSystem();
		String vmm = centerData.getVmmName();
		double time_zone = centerData.getTimeZone();
		double cost = centerData.getCostOfProcessing();
		double costPerMem = centerData.getCostOfMemory();
		double costPerStorage = centerData.getCostOfStorage();
		double costPerBw = centerData.getCostOfBandwidth();

		// Create a LinkedList<Storage> (assuming storageList is empty for now)
		LinkedList<Storage> storageList = new LinkedList<>();

		// Create DatacenterCharacteristics object
		DatacenterCharacteristics characteristics = new DatacenterCharacteristics(
		        arch, os, vmm, hostList, time_zone, cost, costPerMem,
		        costPerStorage, costPerBw);

		// Create a PowerDatacenter object
		Datacenter datacenter = null;
		try {
		    datacenter = new Datacenter(name, characteristics, new VmAllocationPolicySimple(hostList), storageList, 0);
		} catch (Exception e) {
		    e.printStackTrace();
		}

		return datacenter;
	}

	//We strongly encourage users to develop their own broker policies, to submit vms and cloudlets according
	//to the specific rules of the simulated scenario
	private static DatacenterBroker createBroker(){

		DatacenterBroker broker = null;
		try {
			broker = new DatacenterBroker("Broker");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return broker;
	}

	/**
	 * Prints the Cloudlet objects
	 * @param list  list of Cloudlets
	 */
	private static void printCloudletList(List<Cloudlet> list) {
	    int size = list.size();
	    Cloudlet cloudlet;
	    
	    String indent = "    ";
	    resultTextArea.append("\n========== OUTPUT ==========\n");
	    resultTextArea.append("Cloudlet ID" + indent + "STATUS" + indent +
	            "Data center ID" + indent + "VM ID" + indent + indent + "Time" + indent + "Start Time" + indent + "Finish Time\n");

	    DecimalFormat dft = new DecimalFormat("###.##");
	    for (int i = 0; i < size; i++) {
	        cloudlet = list.get(i);
	        resultTextArea.append(indent + cloudlet.getCloudletId() + indent + indent);

	        if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS) {
	            resultTextArea.append("SUCCESS");

	            resultTextArea.append(indent + indent + cloudlet.getResourceId() + indent + indent + indent + cloudlet.getVmId() +
	                    indent + indent + indent + dft.format(cloudlet.getActualCPUTime()) +
	                    indent + indent + dft.format(cloudlet.getExecStartTime()) + indent + indent + indent + dft.format(cloudlet.getFinishTime()) + "\n");
	        }
	    }
	    
	 // Extract and print simulation log messages
	    for (String log : simulationLogMessages) {
	        resultTextArea.append(log + "\n");
	    }
	    
	}
	// Add this variable to the class to store simulation log messages
	private static List<String> simulationLogMessages = new ArrayList<>();
}
