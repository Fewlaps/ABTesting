package com.fewlaps.abtesting.android.core;

import android.content.Context;

import com.fewlaps.abtesting.core.ABTesting;
import com.fewlaps.abtesting.core.CurrentOption;
import com.fewlaps.abtesting.core.Experiment;
import com.fewlaps.abtesting.core.RandomGenerator;

import java.util.List;

public class ABTestingAndroid {

    private static ABTesting abTesting;

    public static void init(Context appContext, List<Experiment> experiments) {
        abTesting = new ABTesting(experiments, new ABTestingSharedPreferencesRepository(appContext), new RandomGenerator());
    }

    public static String getCurrentOptionFor(String experimentName) {
        return abTesting.getCurrentOptionFor(experimentName);
    }

    public static List<CurrentOption> getCurrentOptions() {
        return abTesting.getCurrentOptions();
    }

    public static Experiment getExperiment(String experimentName) {
        return abTesting.getExperiment(experimentName);
    }

    public static List<Experiment> getExperiments() {
        return abTesting.getExperiments();
    }
}
