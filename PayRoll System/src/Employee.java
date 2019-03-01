
public class Employee {
	private int empID;
	private String name;
	private Vehicle vehicle;
	private Vehicle getVehicle() {
		return vehicle;
	}
	private void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getEmpID() {
		return empID;
	}
	private void setEmpID(int empID) {
		this.empID = empID;
	}
}
