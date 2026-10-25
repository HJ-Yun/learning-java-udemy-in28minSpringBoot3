package com.in28minutes.mockitodemo.business;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl (DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMaxValue() {
        int[] retrieveAllData = dataService.retrieveAllData();
        int maxValue = Integer.MIN_VALUE;
        for (int value : retrieveAllData) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

interface DataService {
    int[] retrieveAllData();
}
