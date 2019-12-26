package tracker;
/**
 * @author CindyHou
 * cindyhou0210@brandeis.edu
 * Cosi 12B
 * PA06 
 * this is the TodoTrackerclass: uses internally the TodoList that developed previously. However, it encapsulates
 * it, and exposes the following public methods
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import utils.TodoList;

public class TodoTracker {
	
	TodoList list = new TodoList();
	/**
	 *  create a new TodoItem object, append it to the list
	 * @param title
	 * @return return a reference to the newly created object
	 */
	public TodoItem addItem(String title) {
		TodoItem newItem = new TodoItem(title);
		list.add(newItem);
		return newItem;
	}
	
	/**
	 * find the i-th item in the list
	 * @param i
	 * @return the object or null if the list is empty or if the index is out of bounds;
	 */
	public TodoItem findItemByIndex(int i) {
		if(list.size() == 0 || i >= list.size()) {
			return null;
		}
			TodoItem getNewItem = list.get(i);
			return getNewItem;
	}
	
	/**
	 *  find the item by exactly matching the title
	 * @param title
	 * @return null if a matching TodoItem does not exist
	 */
	public TodoItem findItemByTitle(String title) {
		Iterator<TodoItem> i = list.iterator();
		while(i.hasNext()) {
			TodoItem next = i.next();
			if(next.getTitle().equals(title)){
				return next;
			}
		}
		return null;
	}
	
	/**
	 * @param item
	 * @return the index of the TodoItem,
	 *  if this TodoItem does not exist in the list, return -1
	 */
	public int indexOf(TodoItem item) {
		return list.indexOf(item);
	}
	
	/**
	 * create a new TodoItem with that title, and insert it after the existingItem
	 * @param existingItem
	 * @param title
	 * @return a reference to the newly created object
	 */
	public TodoItem insertAfterItem(TodoItem existingItem, String title) {
		TodoItem newItem = new TodoItem(title);
		list.insertAfter(existingItem, newItem);
		return newItem;
	}
	
	/**
	 * create a new TodoItem with that title, and insert it before the existingItem
	 * @param existingItem
	 * @param title
	 * @return a reference to the newly created object
	 */
	public TodoItem insertBeforeItem(TodoItem existingItem, String title) {
		TodoItem newItem = new TodoItem(title);
		list.insertBefore(existingItem, newItem);
		return newItem;
	}
	
	/**
	 * @return an ArrayList of all the items in the TodoList linked list
	 */
	public List<TodoItem> getItems(){
		List<TodoItem> getAll = new ArrayList<TodoItem>();
		Iterator<TodoItem> i = list.iterator();
		while(i.hasNext()) {
			TodoItem next = i.next();
			getAll.add(next);
		}
		return getAll;
	}
	
	/**
	 * @return an ArrayList containing the items in the
	 * TodoList, sorted by their Title, in increasing alphabetical orde
	 */
	public List<TodoItem> getItemsSortedByTitle(){
		List<TodoItem>titleSort = getItems();
		Collections.sort(titleSort, new TitleComparator());
		return titleSort;
	}
	
	/**
	 * @return an ArrayList containing the items in the
	 * TodoList, sorted by decreasing priority
	 */
	public List<TodoItem>getItemsSortedByPriority(){
		List<TodoItem>titleSort = getItems();
		Collections.sort(titleSort, new PriorityComparator());
		return titleSort;
	}
	
	/**
	 * @return an ArrayList containing the items in the TodoList that 
	 * have the isDone field set to true
	 */
	public List<TodoItem> getDoneItems(){
		List<TodoItem> all = getItems();
		List<TodoItem> isDone = new ArrayList<TodoItem>();
		for(TodoItem i : all){
			if(i.isDone() == true) {
				isDone.add(i);
			}
		}
		return isDone;
	}
	
	/**
	 * move up (closer to the front) the corresponding item
	 * in the TodoList
	 * @param item
	 */
	public void moveUpItem(TodoItem item) {
		list.moveUp(item);
	}
	
	/**
	 * : move down (closer to the end) the corresponding item 
	 * in the TodoList. If the item cannot be found or is already at the end, do nothing
	 * @param item
	 */
	public void moveDownItem(TodoItem item) {
		list.moveDown(item);
	}
	
	/**
	 * find the item of that title in the TodoList and remove it. If the 
	 * item does not exist, do nothing
	 * @param title
	 */
	public void removeItem(String title) {
		TodoItem found = findItemByTitle(title);
		if(found != null) {
			list.remove(found);
		} else {
			System.out.println("value is null");
		}
	}
	
	/**
	 * find the corresponding item in the TodoList and remove it. 
	 * If the item does not exist, do nothing
	 * @param item
	 */
	public void removeItem(TodoItem item) {
		list.remove(item);
	}
	
	/**
	 * @return the size of the TodoList
	 */
	public int size() {
		return list.size();
	}
}
