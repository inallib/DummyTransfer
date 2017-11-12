package com.ubs.opsit.interviews;

public interface TimeConverter {
    String NEW_LINE = System.getProperty("line.separator");
    String YELLOW_LIGHT_ON = "Y";
    String RED_LIGHT_ON = "R";
    String LIGHT_OFF = "O";
    int HH = 0;
    int MM = 1;
    int SS = 2;

    String convertTime(String aTime);
}
