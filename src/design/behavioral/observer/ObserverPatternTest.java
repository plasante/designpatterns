package design.behavioral.observer;

import design.behavioral.observer.MyModel.Person;

public class ObserverPatternTest {

	public static void main(String[] args) {
		MyModel model = new MyModel();
		MyObserver observer = new MyObserver(model);
		
		// we change the last name of the person, observer will get notified
		for (Person person : model.getPersons()) {
			person.setLastName(person.getLastName() + "1");
		}
		
		// we change the first name of the person, observer will get notified
		for (Person person : model.getPersons()) {
			person.setFirstName(person.getFirstName() + "1");
		}
	}
}
