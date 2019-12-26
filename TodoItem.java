package tracker;
/**
 * @author CindyHou
 * cindyhou0210@brandeis.edu
 * Cosi 12B
 * PA06 
 * this is the TodoItem class: Represents a TODO item that have fields such priority, title, and isDone
 */
public class TodoItem {
	private final String title;
	private int priority;
	public static final int PRIORITY_VHIGH = 5;
	public static final int PRIORITY_HIGH = 4;
	public static final int PRIORITY_MED = 3;
	public static final int PRIORITY_LOW = 2;
	public static final int PRIORITY_VLOW = 1;
	public boolean isDone;
	
	/**
	 * construct a TodoItem by setting its title, and the default priority and
	 * whether it is done
	 * @param title
	 */
	public TodoItem(String title) {
		this.title = title;
		this.priority = PRIORITY_MED;
	}
	
	/**
	 * construct a TodoItem by setting its title and priority
	 * @param title
	 * @param priority
	 */
	public TodoItem(String title , int priority){
		this(title);
		this.priority = priority;
	}
	
	/**
	 *  construct a TodoItem by setting its title, priority and whether it is done
	 * @param title
	 * @param priority
	 * @param isDone
	 */
	public TodoItem(String title, int priority, boolean isDone){
		this(title, priority);
		this.isDone = isDone;
	}
	
	/**
	 * getter for the field 'title'; there is no setter by design, since the field 'title' is immutable
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * getter for the field 'title'; there is no setter by design, since the field 'title' is immutable;
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}
	
	/**
	 * setter for the field 'priority'
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	/**
	 *  getter for the field 'isDone'
	 * @return isDone
	 */
	public boolean isDone() {
		return isDone;
	}
	
	/**
	 * setter for the field 'isDone'
	 * @param isDone
	 */
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	/**
	 * return a user-friendly string representation of a TodoItem. Used to display each TODO item in the output.
	 */
	public String toString() {
		return  title + " " + priority + " " + isDone;
	}
	
	/**
	 * for value equality.
	 * @param item
	 * @return boolean equals
	 */
	public boolean equals(TodoItem item) {
		if(this.title.equals(item.title)) {
			return true;
		}
		return false;
	}
}