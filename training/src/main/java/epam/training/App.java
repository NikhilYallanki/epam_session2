package epam.training;
import epam.training.Cals.*;
import epam.training.Gifts.*;
public class App 
{
	private static final int START = 15;
	private static final int END = 35;

	// Creating objects
	private static final Candy CANDY1 = new Candy("Candy1", 10, 10);
	private static final Candy CANDY2 = new Candy("Candy2", 15, 15);
	private static final Candy CANDY3 = new Candy("Candy3", 25, 20);
	private static final Jamun Jamun1 = new Jamun("Jamun1", 10, 50);
	private static final Jamun Jamun2 = new Jamun("Jamun2", 20, 50);
	private static final Burfy Burfy1 = new Burfy("Burfy1", 20, 15);
	private static final Burfy Burfy2 = new Burfy("Burfy2", 30, 20);

	// Creating container
	private static final  Calculations GIFT = new Calculations();

	public static Calculations getGift() {
		return GIFT;
	}

	/**
	 * This method adds the objects to the container
	 */

	public static void createGift() {
		getGift().add(CANDY1, 7);
		getGift().add(CANDY2, 8);
		getGift().add(CANDY3, 4);
		getGift().add(Jamun1, 1);
		getGift().add(Jamun2, 1);
		getGift().add(Burfy1, 3);
		getGift().add(Burfy2, 4);
		getGift().add(Burfy2, 5);
		getGift().add(CANDY1, 14);
		getGift().add(CANDY2, 17);
		getGift().add(CANDY3, 13);
		getGift().add(Jamun1, 1);
		getGift().add(Jamun2, 1);
		getGift().add(Burfy1, 2);
		getGift().add(Burfy2, 1);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println("Getting all objects from the gift:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Sorting objects by sugarValue:");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Calculating total weight of the gift: ");
		System.out.println(getGift().calculateTotalWeight() + " gm");
		System.out.println();
		System.out
				.println("Getting all objects with selected range of sugar value(from "
						+ START + "% to " + END + "%) :");
		for (Abstract sweets : getGift().receiveBySugarValue(START, END)) {
			System.out.print(sweets.printAllValues());
		}
	}

}