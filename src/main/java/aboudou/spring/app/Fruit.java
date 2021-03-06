package aboudou.spring.app;

import java.util.List;
import java.util.Map;

public class Fruit {

	// Class variables

	private String myName;
	
	private String description;

	private String definition = "not set !";

	private List<String> fruitNameList;

	private Map<String, String> fruitNameMap;

	// Default no args constructor
	public Fruit() {

	}

	// Constuctor with args
	public Fruit(String myName) {
		super();
		this.myName = myName;
	}

	// Getters and setters

	
	
	public String getMyName() {
		return myName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Fruit [myName=" + myName + "]";
	}

	// Method that Fruit used to talk about himself
	public String talkAboutYourself() {
		String speech = "Hi I am a fruit";

		// Give the name only if the name is set
		if (this.myName != null && this.myName != "") {
			speech += " and my name is " + this.myName;
		}

		// Show the fruit list names if list exist
		if (fruitNameList != null && fruitNameList.size() > 0) {
			speech += "\n List: ";
			for (String fruitName : fruitNameList) {
				speech += " name " + fruitName;
			}
		}

		// Show the fruit map names if list exist
		if (fruitNameMap != null && fruitNameMap.size() > 0) {
			speech += "\n Map: ";
			for (Map.Entry<String, String> fruitMap : fruitNameMap.entrySet()) {
				speech += fruitMap.getKey() + " ==> " + fruitMap.getValue() + " :: ";
			}
		}

		//Add the description if this variable is set
		if(this.description!=null && this.description!="") {
			speech+=this.description;
		}
		return speech;
	}
	
	public String talkAboutYourDefinition() {
		return this.definition;
	}

	//Init and destroy method
	public void initMethod() {
		System.out.println("The fruit bean is reday to go ");
	}
	
	public void destroyMethod() {
		System.out.println("The fruit bean is about to be destroyed ");
	}
	
	
}
