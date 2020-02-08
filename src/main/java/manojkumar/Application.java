package manojkumar;

import manojkumar.sweet.*;
import java.util.ArrayList;
public class Application {
	private GiftController giftController;

    ArrayList<Sweets> sweets;

    public Application() {
        giftController = new GiftController();
    }

    private void process() {
    	int noOfTimes = (int) (Math.random() * 10);
        giftController.generateGift(noOfTimes);
    }
    public void start() {
        process();
     }

}