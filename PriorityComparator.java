package tracker;
/**
 * @author CindyHou
 * cindyhou0210@brandeis.edu
 * this is the PriorityComparator class
 */
import java.util.Comparator;

public class PriorityComparator implements Comparator<TodoItem> {
	
	/**
	 * Constructor 
	 */
	public PriorityComparator() {
		
	}

	/**
	 * compare the priority of two objects from the list
	 */
	public int compare(TodoItem o1, TodoItem o2) {
		return o1.getPriority() - o2.getPriority();
	}
}