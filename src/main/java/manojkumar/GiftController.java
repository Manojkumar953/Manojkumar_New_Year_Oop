package manojkumar;

import manojkumar.sweet.*;
import java.util.ArrayList;
import java.util.Collections;
public class GiftController {
	private NewYearGift newYearGift;

    private ArrayList<Sweets> items;

    private double totalWeight = 0;

    private int counter = 1;

    private final static int START_OF_COUNT = 1;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public GiftController()  {
        items = new ArrayList<Sweets>();
        newYearGift = new NewYearGift();
        totalWeight = 0;
    }

    private void printTitle(String msg) {
        System.out.printf("%s\n\n", msg);
        System.out.printf("%-4s%-20s %6s %10s\n", "#", "Name", "Sugar", "Weight");
        System.out.printf("%-4s%-20s %6s %10s\n", "-", "----", "-----", "------");
    }

    private void print(Sweets item) {
    	System.out.printf("%-4d%-20.15s %6.3f %10.3f\n", counter++, item
                .getClass().getSimpleName(), item.getSweetness(), item
                .getWeight());
        totalWeight += item.getWeight();
    }

    private void printTotalWeight() {
    	System.out.printf("%-24s %6s %10s\n", "", "", "------");
    	System.out.printf("%-4s%-20s %6s %10.3f\n", "", "Total Weight", "",
                totalWeight);
    }

    private void printSpace() {
    	System.out.printf("\n%-40s\n\n\n",
                "==========================================");
    }

    public void generateGift(int nTimes) {
        items = newYearGift.generate(nTimes);
        showParsedData();
    }

    private void printGift() {
        for (Sweets item : items) {
            print(item);
        }
    }

    private void printGift(ArrayList<Sweets> sweets) {
        for (Sweets sweet : sweets) {
            print(sweet);
        }
    }

    public void showSortedBySugar() {
        Collections.sort(items, newYearGift.getSugarLevelComparator());
        printTitle("New Year's Gift by sorted Sugar level:");
        printGift();
        printTotalWeight();
        printSpace();
        setCountersToStart();
    }

    public void showSortedByWeight() {
        Collections.sort(items, newYearGift.getWeightComparator());
        printTitle("New Year's Gift by sorted Weight:");
        printGift(items);
        printTotalWeight();
        printSpace();
        setCountersToStart();
    }

    public void showParsedData() {
        printTitle("\n\nNew Year's Gift (list of contents):");
        for (Sweets sweet : items) {
            print(sweet);
        }
        printTotalWeight();
        printSpace();
        setCountersToStart();
        showSortedBySugar();
        showSortedByWeight();
    }

    private void setCountersToStart() {
        setCounter(START_OF_COUNT);
        setTotalWeight(0);
    }
}