package design.behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
	public static final String FIRSTNAME = "firstName";
	public static final String LASTNAME = "lastName";
	
	private List<Person> persons = new ArrayList<>();
	private List<PropertyChangeListener> listener = new ArrayList<>();
	
	public class Person {
		private String firstName;
		private String lastName;
		
		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			notifyListeners(this,
							FIRSTNAME,
							this.firstName,
							this.firstName = firstName);
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			notifyListeners(this,
							LASTNAME,
							this.lastName,
							this.lastName = lastName);
		}
	}
	
	public List<Person> getPersons() {
		return persons;
	}
	
	public MyModel() {
		persons.add(new Person("Pierre","Lasante"));
		persons.add(new Person("Karo","Spenard"));
	}
	
	private void notifyListeners(Object object, String property, String oldValue, String newValue) {
		for (PropertyChangeListener name : listener) {
			name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
		}
	}
	
	public void addChangeListener(PropertyChangeListener newListener) {
		listener.add(newListener);
	}
}
