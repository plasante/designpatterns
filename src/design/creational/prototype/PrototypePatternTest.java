package design.creational.prototype;

import java.util.List;

/*
 * This pattern is useful when you need to create an object
 * that is already instantiated and can be cloned.
 * 
 * If the object cloning was not provided, then it would be necessary
 * to make a a database call to fetch the employee list.
 * This is resource and time consuming.
 */
public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		Employees empsNew  = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Ginger");
		
		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}
}
