package com.ubs.opsit.interviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;

/**
 * Created by ss on 12-11-2017.
 */
public class TimeConverterImpl implements TimeConverter {

    private String[] splitedTimeInput;

    private Function<Integer, String> prepareLine_1 = (seconds) -> {return (seconds % 2 == 0) ? YELLOW_LIGHT_ON : LIGHT_OFF;};
    private Function<Integer, String> prepareLine_2 = (hours) -> {return prepareLightRow(hours / 5, 4, RED_LIGHT_ON);};
    private Function<Integer, String> prepareLine_3 = (hours) -> {return prepareLightRow(hours % 5, 4, RED_LIGHT_ON);};
    private Function<Integer, String> prepareLine_4 = (minutes) -> {return prepareLightRow(minutes / 5, 11, YELLOW_LIGHT_ON).replaceAll(YELLOW_LIGHT_ON + YELLOW_LIGHT_ON + YELLOW_LIGHT_ON
            , YELLOW_LIGHT_ON + YELLOW_LIGHT_ON + RED_LIGHT_ON);};
    private Function<Integer, String> prepareLine_5 = (minutes) -> {return prepareLightRow(minutes % 5, 4, YELLOW_LIGHT_ON);};

    private String prepareLightRow(int numberOfLightsSwitchedOn, int numberOfLightsInRow, String lampType) {
        int numberOfLightsSwitchedOff = numberOfLightsInRow - numberOfLightsSwitchedOn;
        String litesOn = String.join("", Collections.nCopies(numberOfLightsSwitchedOn, lampType));
        String litesOff = String.join("", Collections.nCopies(numberOfLightsSwitchedOff, LIGHT_OFF));

        return litesOn + litesOff;
    }

    private void clearInputTimeStringAfterEveryTest() {splitedTimeInput = null;}

    private String processTime(int hours, int minutes, int seconds) {
        clearInputTimeStringAfterEveryTest();
        return String.join(NEW_LINE, Arrays.asList(prepareLine_1.apply(seconds),
                prepareLine_2.apply(hours),
                prepareLine_3.apply(hours),
                prepareLine_4.apply(minutes),
                prepareLine_5.apply(minutes)));
    }

    private int prepareInputUnitForProcessing(String aTime, int timeUnit) {
        if (!Optional.ofNullable(splitedTimeInput).isPresent())
            this.splitedTimeInput = aTime.split(":", 3);
        return Integer.parseInt(splitedTimeInput[timeUnit]);
    }

    @Override
    public String convertTime(String aTime) {
        return processTime(prepareInputUnitForProcessing(aTime, HH),
                prepareInputUnitForProcessing(aTime, MM),
                prepareInputUnitForProcessing(aTime, SS));
    }
}