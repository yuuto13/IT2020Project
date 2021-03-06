package commandline;


/**
 * represents each card
 */
public class Model_Card {
	
	String name;
	Model_CardCategory category;
	
	
	/**
	 * Constructor
	 */
	public Model_Card(String name, Model_CardCategory category) {
		this.name = name;
		this.category = category;
	}
	
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setCategory(Model_CardCategory category) {
		this.category = category;
	}
	
	public Model_CardCategory getCategory() {
		return category;
	}
	
	
	/**
	 * Constructor: Create a card by categorys
	 * @param attributes : the category that represents in deck file
	 */
	public Model_Card(Model_CardCategory attributes) {
		//TODO:
	}
	
	
	
	@Override
	/**
	 * @return all attributes' String as form:
	 * 
	 *  	"> attribute1 name : attribute2 value"
	 *  	"> attribute2 name : attribute1 value"
	 *  	....
	 */
	public String toString() {
		return category.toString();
	}
	
	
	/**
	 * 
	 * @param choice : the choice that we input
	 * @return all attributes/ the attributes that selected was added "<--"
	 */
	public String toString(int choice) {
		return category.toString(choice);
	}
	
}
