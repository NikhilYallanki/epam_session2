package epam.training.Gifts;

public class Candy extends Abstract{

	public Candy(String name, int sugarValue, int weight) {
		super(sugarValue, weight);
		setName(name);
	}

}
