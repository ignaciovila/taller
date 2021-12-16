package com.mercadolibre.dojos;

import java.util.*;

class Main {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++ ) {
                for (int k = 2; k < array.length; k++) {
                    for (int l = 3; l < array.length; l++) {
                        List<Integer> candidates = List.of(i, j, k, l);
                        Integer[] integers = new Integer[]{array[i], array[j], array[k], array[l]};

                        boolean unique = candidates.stream().distinct().count() == 4;
                        boolean visited = result.stream().anyMatch(r -> List.of(r).containsAll(List.of(integers)));

                        if (unique && !visited) {
                            if (array[i] + array[j] + array[k] + array[l] == targetSum) {
                                result.add(integers);
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}