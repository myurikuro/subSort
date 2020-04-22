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
        int[] diff1 = {1, 3, 15, 11, 2};


        //Act
        int[] difference1 = subSort.subSort(diff1);

        //Assert
        assertThat(difference1).isEqualTo(6);
    }
}
