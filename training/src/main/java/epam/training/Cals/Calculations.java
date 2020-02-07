package epam.training.Cals;
import epam.training.Gifts.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Calculations {
	private List<Abstract> list = new ArrayList<Abstract>();

	public List<Abstract> getList() {
		return list;
	}

	

	public void add(Abstract absCandy, int count) {
		for (Abstract candy : getList()) {
			if (candy.getName().equals(absCandy.getName())) {
				candy.setCount(candy.getCount() + count);
				return;
			}
		}
		getList().add(absCandy);
		absCandy.setCount(count);
	}

	
	public int calculateTotalWeight() {
		int value = 0;
		for (Abstract candy : getList()) {
			value += candy.getCount() * candy.getWeight();
		}
		return value;
	}

	public void getAllCandy() {
		for (Abstract candy : getList()) {
			System.out.print(candy.printAllValues());
		}
	}

	     
	

	public List<Abstract> receiveBySugarValue(int start, int end) {
		ArrayList<Abstract> list2 = new ArrayList<Abstract>();
		sortBySugarValue(list2);
		for (Abstract candy : getList()) {
			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {
				list2.add(candy);
			}
		}
		return list2;
	}

	
	public void sortBySugarValue(List<Abstract> list) {
		Collections.sort(list, new CompareBySugarValue());
	}

	static class CompareBySugarValue implements Comparator<Abstract>,
			Serializable {

		private static final long serialVersionUID = -6923839843945617223L;

		public int compare(Abstract o1, Abstract o2) {
			return o1.getSugarValue() - o2.getSugarValue();
		}

	}
}