package com.mercadolibre.dojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class MainTest {

    @Before
    public void setup() {

    }

    @Test
    public void test1() {
        int[] array = {7, 6, 4, -1, 1, 2};

        List<Integer[]> result = Main.fourNumberSum(array, 16);

        List<Integer[]> expected = List.of(new Integer[]{7, 6, 4, -1}, new Integer[]{7, 6, 1, 2});

        Assert.assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer[]> result = Main.fourNumberSum(array, 10);

        List<Integer[]> expected = new ArrayList<>();
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        expected.add(arr);

        Assert.assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void test3() {
        int[] array = {5, -5, -2, 2, 3, -3};

        List<Integer[]> result = Main.fourNumberSum(array, 0);

        List<Integer[]> expected = List.of(new Integer[]{5, -5, -2, 2}, new Integer[]{5, -5, 3, -3}, new Integer[]{-2, 2, 3, -3});

        Assert.assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void test4() {
        int[] array = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer[]> result = Main.fourNumberSum(array, 4);

        List<Integer[]> expected = List.of(
                new Integer[]{-2, -1, 1, 6},
                new Integer[]{-2, -1, 2, 5},
                new Integer[]{-2, -1, 3, 4},
                new Integer[]{-2, 1, 2, 3});

        Assert.assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void test5() {
        int[] array = {-1, 22, 18, 4, 7, 11, 2, -5, -3};

        List<Integer[]> result = Main.fourNumberSum(array, 30);
        List<Integer[]> expected = List.of(
				new Integer[]{-1, 22, 7, 2},
				new Integer[]{-1, 18, 11, 2},
				new Integer[]{22, 4, 7, -3},
				new Integer[]{22, 11, 2, -5},
				new Integer[]{18, 4, 11, -3});

        Assert.assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), result.get(i));
        }
    }

	@Test
	public void test6() {
		int[] array = {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5};

		List<Integer[]> result = Main.fourNumberSum(array, 20);
		List<Integer[]> expected = List.of(
                new Integer[]{-10, -3, 28, 5},
                new Integer[]{-10, 28, -6, 8},
                new Integer[]{-3, 2, -7, 28},
                new Integer[]{-5, 2, 15, 8},
                new Integer[]{-5, 2, 12, 11},
                new Integer[]{-5, 12, 8, 5},
                new Integer[]{-7, 28, -6, 5}
		);

		Assert.assertEquals(expected.size(), result.size());

		for (int i = 0; i < result.size(); i++) {
			Assert.assertArrayEquals(expected.get(i), result.get(i));
		}
	}

    @Test
    public void test7() {
        int[] array = {1, 2, 3, 4, 5};

        List<Integer[]> result = Main.fourNumberSum(array, 100);
        List<Integer[]> expected = Collections.emptyList();

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void test8() {
        int[] array = {1, 2, 3, 4, 5, -5, 6, -6};

        List<Integer[]> result = Main.fourNumberSum(array, 5);
        List<Integer[]> expected = List.of(
                new Integer[]{1, 3, -5, 6},
                new Integer[]{1, 4, 5, -5},
                new Integer[]{1, 4, 6, -6},
                new Integer[]{2, 3, 5, -5},
                new Integer[]{2, 3, 6, -6},
                new Integer[]{2, 4, 5, -6}
        );

        Assert.assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), result.get(i));
        }
    }
}
