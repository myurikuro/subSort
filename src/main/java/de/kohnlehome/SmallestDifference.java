package de.kohnlehome;

public class SmallestDifference implements ISmallestDifference {

    @Override
    public int SmallestDifference(int[] array1, int[] array2) {
        int smallest = Math.abs(array1[0] - array2[0]);
        for (int i = 1; i < Math.min(array1.length, array2.length); i++) {
            if (Math.abs(array1[i] - array2[i]) < smallest) {
                smallest = Math.abs(array1[i] - array2[i]);
            }
        }
        System.out.println(smallest);
        return smallest;
    }
}
