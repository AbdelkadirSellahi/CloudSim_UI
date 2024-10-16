# MyCloud - CloudSim Simulation Project

### Description
**MyCloud** is a graphical application designed to simulate a Cloud infrastructure using **CloudSim**. The application enables the configuration of data centers (DataCenters), hosts, virtual machines (VMs), and simulates resource scheduling policies to execute tasks (cloudlets) in a custom network topology.

### Main Features
- **Add Data Centers**: Customize the characteristics of DataCenters (architecture, OS, VMM, storage costs, bandwidth, etc.).
- **Configure Hosts and VMs**: Manage entities (hosts, VMs) to create a heterogeneous infrastructure.
- **Custom Network Topology**: Dynamically configure network links between entities.
- **Resource Scheduling Policies**: Choose between two scheduling and allocation policies for VMs and Cloudlets.
- **Graphical Display of Results**: Visualize DataCenters, hosts, VMs, and the network topology.

### Graphical User Interface (UI)
The user interface (built with **Java Swing**) allows:
- **Input of DataCenter characteristics** (number of hosts, architecture, costs for storage, memory, etc.).
- **Input of the number of DataCenters** to configure.
- **Dynamic addition and removal of entities** (VMs, hosts).
- **Generation of the network topology** and graphical display of results.

### Prerequisites
To run this project, you will need:
- **Java JDK 8+**
- **Swing (Java's built-in library for UI)** 
- **CloudSim 4.0** or higher
- **IDE** (Eclipse, IntelliJ IDEA, or NetBeans recommended)

### Installation
1. Clone this Git repository:
   ```bash
   git clone https://github.com/AbdelkadirSellahi/CloudSim_UI.git
2. Import the project into your IDE.
3. Add the CloudSim libraries to your project.
4. Run the application via the main class.

### Usage
1. On launch, input the number of DataCenters you want to create.
2. Configure each DataCenter by specifying the required characteristics (hosts, costs, architecture, etc.).
3. Add or remove entities (VMs, hosts) dynamically through the interface.
4. View graphical results, including the network topology and resource usage.

### Screenshots
**DataCenter Configuration Screen**:

![image alt](https://github.com/AbdelkadirSellahi/CloudSim_UI/blob/571c39dd4fc139c14cb27d42a41597037419936e/DataCenter%20Configuration%20Screen.png)

**Application Welcome Screen**:

![image alt](https://github.com/AbdelkadirSellahi/CloudSim_UI/blob/571c39dd4fc139c14cb27d42a41597037419936e/Application%20Welcome%20Screen.png)
### Contribution
Contributions are welcome! If you'd like to suggest improvements, feel free to submit a pull request or open an issue.

## Authors
- [**ABDELKADIR Sellahi**](https://github.com/AbdelkadirSellahi)
