package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestDifferenceTest {
    private ISmallestDifference smallestDifference;

    @BeforeEach
    public void init() {
        //Arrange
        smallestDifference = new SmallestDifference();
    }

    @Test
    public void test() {
        int[] diff1 = {1, 3, 15, 11, 2};
        int[] diff2 = {23, 127, 235, 19, 8};

        int[] diff3 = {15, 2, 200, 10, 9};
        int[] diff4 = {11, 12, 13, 20, 45};

        int[] diff5 = {51, 23, 13, 21, 44};
        int[] diff6 = {15, 32, 12, 21, 41};


        //Act
        int difference1 = smallestDifference.SmallestDifference(diff1, diff2);
        int difference2 = smallestDifference.SmallestDifference(diff3, diff4);
        int difference3 = smallestDifference.SmallestDifference(diff5, diff6);

        //Assert
        assertThat(difference1).isEqualTo(6);
        assertThat(difference2).isEqualTo(4);
        assertThat(difference3).isEqualTo(0);
    }
}
