import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		/*Method  reference*/
		
		List<Person> list =new ArrayList<>();
		list.add(new Person(20,"Bran","Kingslanding"));
		list.add(new Person(40,"Khaleesi","Esos"));
		list.add(new Person(30,"Jon","Wall"));
		list.add(new Person(26,"Sansa","Winterfell"));
		list.add(new Person(20,"Arya","west of Westeros"));
		
		Person person = new Person();
		
		//by instance
		Collections.sort(list, person::compareByName);
		System.out.println("Sorted by name: "+list);
		
		//static method:: used ClassName not instance
		Collections.sort(list,Person::sortByAge);
		System.out.println("Sorted by age: "+list);


	}

}
