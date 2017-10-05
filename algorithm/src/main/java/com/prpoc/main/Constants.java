package com.prpoc.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
    public static Double defaultSynapseWeight = 0.5;
    public static Double defaultFireThreshold = 1.0;

    // last column indicates decision class (1 / 0)
    public static List<List<Integer>> input = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1)),
            new ArrayList<>(Arrays.asList(1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0))
    ));

}
