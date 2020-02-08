package manojkumar.sweet;

/*@manojkumar code for the DairyMilk
 
 */
public class DairyMilk extends Sweets{
	public DairyMilk() {
		setSweetness(0);
		setWeight(0);
	}
	public DairyMilk(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}