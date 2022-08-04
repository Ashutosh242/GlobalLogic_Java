import java.util.ArrayList;
import java.util.List;

class Person
{
	final String name;
	final Gender gender;
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	enum Gender{
		MALE,FEMALE
	}
}
public class ImperitiveProgramming {

	public static void main(String[] args) {
		List<Person> p = new ArrayList<Person>("Ashutosh" , MALE);

	}

}
