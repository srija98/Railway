
public class Ticket {

	String name;
	int age;
	String gender;
	String berthPreference;
	String confirmationMessage;
	
	public String getConfirmationMessage() {
		return confirmationMessage;
	}

	public void setConfirmationMessage(String confirmationMessage) {
		this.confirmationMessage = confirmationMessage;
	}

	public Ticket(String name, int age, String gender, String berthPreference) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.berthPreference = berthPreference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBerthPreference() {
		return berthPreference;
	}

	public void setBerthPreference(String berthPreference) {
		this.berthPreference = berthPreference;
	}
	
	
	
	
	
}
