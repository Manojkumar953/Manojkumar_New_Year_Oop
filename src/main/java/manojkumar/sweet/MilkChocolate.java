package manojkumar.sweet;


/**
 * 
 * @author manojkumar
 * code for the MilkChocolate
 *
 */
public class MilkChocolate extends Sweets{
	public MilkChocolate() {
		setSweetness(0);
		setWeight(0);
	}
	public MilkChocolate(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}