import org.cloudbus.cloudsim.*;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class DynamicCloudSimExample {
    public void runCloudSimExample() {
        // Initialize the CloudSim library
        int num_user = 1; // number of cloud users
        Calendar calendar = Calendar.getInstance();
        boolean trace_flag = false; // mean trace events

        CloudSim.init(num_user, calendar, trace_flag);

        // Create Datacenter
        Datacenter datacenter0 = createDatacenter("Datacenter_0");

        // Create Broker
        DatacenterBroker broker = createBroker();
        int brokerId = broker.getId();

        // Create a virtual machine
        List<Vm> vmlist = new ArrayList<Vm>();

        int vmid = 0;
        int mips = 1000;
        long size = 10000; // image size (MB)
        int ram = 512; // vm memory (MB)
        long bw = 1000;
        int pesNumber = 1; // number of CPUs
        String vmm = "Xen"; // VMM name

        Vm vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());

        vmlist.add(vm);

        broker.submitVmList(vmlist);

        // Create a Cloudlet
        List<Cloudlet> cloudletList = new ArrayList<Cloudlet>();

        int id = 0;
        long length = 400000;
        long fileSize = 300;
        long outputSize = 300;
        UtilizationModel utilizationModel = new UtilizationModelFull();

        Cloudlet cloudlet = new Cloudlet(id, length, pesNumber, fileSize, outputSize, utilizationModel, utilizationModel, utilizationModel);
        cloudlet.setUserId(brokerId);
        cloudlet.setVmId(vmid);

        cloudletList.add(cloudlet);

        broker.submitCloudletList(cloudletList);

        // Start the simulation
        CloudSim.startSimulation();

        CloudSim.stopSimulation();

        // Print simulation results
        List<Cloudlet> newList = broker.getCloudletReceivedList();
        printCloudletList(newList);
    }

    private Datacenter createDatacenter(String name) {
        List<Host> hostList = new ArrayList<Host>();

        List<Pe> peList = new ArrayList<Pe>();

        int mips = ###; // Placeholder for VM MIPS

        peList.add(new Pe(0, new PeProvisionerSimple(mips));

        int hostId = 0;
        int ram = ###; // Placeholder for VM RAM
        long storage = 1000000;
        int bw = ###; // Placeholder for VM Bandwidth

        hostList.add(new Host(hostId, new RamProvisionerSimple(ram), new BwProvisionerSimple(bw), storage, peList, new VmSchedulerTimeShared(peList));

        String arch = "x86";
        String os = "Linux";
        String vmm = "Xen"; // VMM name
        double time_zone = 10.0;
        double cost = 3.0;
        double costPerMem = 0.05;
        double costPerStorage = 0.001;
        double costPerBw = 0.0;
        LinkedList<Storage> storageList = new LinkedList<Storage>();

        DatacenterCharacteristics characteristics = new DatacenterCharacteristics(arch, os, vmm, hostList, time_zone, cost, costPerMem, costPerStorage, costPerBw);

        Datacenter datacenter = null;
        try {
            datacenter = new Datacenter(name, characteristics, new VmAllocationPolicySimple(hostList), storageList, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datacenter;
    }

    private DatacenterBroker createBroker() {
        DatacenterBroker broker = null;
        try {
            broker = new DatacenterBroker("Broker");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return broker;
    }

    private void printCloudletList(List<Cloudlet> list) {
        int size = list.size();
        Cloudlet cloudlet;

        String indent = "    ";
        simulationOutput.append("\n========== OUTPUT ==========\n");
        simulationOutput.append("Cloudlet ID" + indent + "STATUS" + indent + "Data center ID" + indent + "VM ID" + indent + "Time" + indent + "Start Time" + indent + "Finish Time\n");

        DecimalFormat dft = new DecimalFormat("###.##");
        for (int i = 0; i < size; i++) {
            cloudlet = list.get(i);
            simulationOutput.append(indent + cloudlet.getCloudletId() + indent + indent);

            if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS) {
                simulationOutput.append("SUCCESS");
                simulationOutput.append(indent + indent + cloudlet.getResourceId() + indent + indent + indent + cloudlet.getVmId() + indent + indent + dft.format(cloudlet.getActualCPUTime()) + indent + indent + dft.format(cloudlet.getExecStartTime()) + indent + indent + dft.format(cloudlet.getFinishTime()) + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CloudSimExample1GUI gui = new CloudSimExample1GUI();
                gui.setVisible(true);
            }
        });
    }
}
