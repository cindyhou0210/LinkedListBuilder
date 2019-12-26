package tracker;
/**
 * @author CindyHou
 * cindyhou0210@brandeis.edu
 * this is the TitleComparator class
 */
import java.util.Comparator;

public class TitleComparator implements Comparator<TodoItem>{
	
	
	/**
	 * constructor
	 */
	public TitleComparator() {
		
	}
	
	/**
	 * compare two objects from the list
	 */
	public int compare(TodoItem a, TodoItem b) {
	
		return a.getTitle().compareTo(b.getTitle());
	}
	

}