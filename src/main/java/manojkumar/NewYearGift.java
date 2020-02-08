package manojkumar;

import manojkumar.sweet.SweetsGenerator;

import java.util.ArrayList;
import java.util.Comparator;

import manojkumar.sweet.*;
public class NewYearGift {
	private SweetsGenerator sweetsgenerator;
	private ArrayList<Sweets> newList;
	private static SugarLevelComparator sugarComparator = new SugarLevelComparator();
    private static WeightComparator weightComparator = new WeightComparator();
    public SugarLevelComparator getSugarLevelComparator() {
        return sugarComparator;
    }

    public WeightComparator getWeightComparator() {
        return weightComparator;
    }
    public NewYearGift() {
        sweetsgenerator = new SweetsGenerator();
        newList = new ArrayList<Sweets>();
    }
    public ArrayList<Sweets> generate(int times) {

        for (int i = 0; i < times; i++) {
        	System.out.printf("\nEntering sugar and weight : ");
            newList.add(sweetsgenerator.next());
        }
        return newList;
    }
    private static class SugarLevelComparator implements Comparator<Sweets> {

        public int compare(Sweets sweetsOne, Sweets sweetsTwo) {
            return (sweetsOne.getSweetness() < sweetsTwo.getSweetness() ? -1
                    : (sweetsOne.getSweetness() == sweetsTwo.getSweetness() ? 0 : 1));
        }

    }

    private static class WeightComparator implements Comparator<Sweets> {

        public int compare(Sweets sweetsOne, Sweets sweetsTwo) {
            return (sweetsOne.getWeight() < sweetsTwo.getWeight() ? -1
                    : (sweetsOne.getWeight() == sweetsTwo.getWeight() ? 0 : 1));
        }

    }
}