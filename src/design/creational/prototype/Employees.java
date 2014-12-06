package design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<>();
	}
	
	public Employees(List<String> list) {
		this.empList = list;
	}
	
	public void loadData() {
		empList.add("Pierre");
		empList.add("Karo");
		empList.add("Juby");
		empList.add("Ginger");
		empList.add("Suki");
	}
	
	public List<String> getEmpList() {
		return empList;
	}
	
	// To provide a deep copy of the employees list.
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
