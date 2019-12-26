/**
 * CindyHou
 * cindyhou0210@brandeis.edu
 * PA06
 * COSI12B
 */
import tracker.TodoItem;
import tracker.TodoPrinter;
import tracker.TodoTracker;

public class Main {

	public static void main(String[] args) {

		TodoTracker tracker = new TodoTracker();

		TodoItem item1 = tracker.addItem("Finish COSI 12B homework");
		item1.setPriority(TodoItem.PRIORITY_HIGH);

		TodoItem item2 = tracker.addItem("Do laundry");
		item2.setPriority(TodoItem.PRIORITY_MED);

		TodoItem item3 = tracker.addItem("Watch movie");
		item3.setPriority(TodoItem.PRIORITY_VLOW);

		TodoItem item4 = tracker.insertBeforeItem(item1, "Polish resume");
		item4.setPriority(TodoItem.PRIORITY_HIGH);

		TodoItem item5 = tracker.insertAfterItem(item2, "Pick-up package");
		item5.setPriority(TodoItem.PRIORITY_HIGH);
		item5.setDone(true);

		TodoPrinter printer = new TodoPrinter();

		printer.printItems("As entered", tracker.getItems());
		System.out.print(printer.toString());

		printer.printItems("By priority", tracker.getItemsSortedByPriority());
		System.out.print(printer.toString());

		printer.printItems("By title", tracker.getItemsSortedByTitle());
		System.out.print(printer.toString());

		printer.printItems("Done items", tracker.getDoneItems());
		System.out.print(printer.toString());

		printer.printItems("Before moveUp", tracker.getItems());
		System.out.print(printer.toString());

		// Move up
		tracker.moveUpItem(item2);

		printer.printItems("After moveUp", tracker.getItems());
		System.out.print(printer.toString());

		// Move down
		tracker.moveDownItem(item2);

		printer.printItems("After moveDown", tracker.getItems());
		System.out.print(printer.toString());

		// Insert after
		TodoItem item6 = tracker.insertAfterItem(item2, "Wash car");
		item6.setPriority(TodoItem.PRIORITY_VLOW);

		printer.printItems("After insertAfter", tracker.getItems());
		System.out.print(printer.toString());

		// No need to wash car
		tracker.removeItem(item6);

		printer.printItems("After remove", tracker.getItems());
		System.out.print(printer.toString());

		System.out.println("Item " + item1 + " at position " + tracker.indexOf(item1));

		System.out.println("First thing to do: " + tracker.findItemByIndex(0));

	}
}
