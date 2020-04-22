package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubSortTest {
    private ISubSort subSort;

    @BeforeEach
    public void init() {
        //Arrange
        subSort = new SubSort();
    }

    @Test
    public void test() {
        int[] diff1 = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};

        int[] diff2 = {11, 7, 12, 6, 7, 16, 18, 19};

        int[] diff3 = {1, 2, 4, 5, 7, 8, 12, 13, 10, 14, 15};


        //Act
        int[] difference1 = subSort.subSort(diff1);

        int[] difference2 = subSort.subSort(diff2);

        int[] difference3 = subSort.subSort(diff3);

        //Assert
        int[] answer1 = {3, 9};
        assertThat(difference1).isEqualTo(answer1);

        int[] answer2 = {0, 4};
        assertThat(difference2).isEqualTo(answer2);

        int[] answer3 = {5, 7};
        assertThat(difference3).isEqualTo(answer3);
    }
}
