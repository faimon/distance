import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StationTest {

    @Test
    public void removeOneStation() {
        List<Integer> input = List.of(40, 80, 50, 60);
        List<Integer> excepted = List.of(40, 60, 80);
        assertEquals(excepted, Station.removeStations(input, 1));
    }

    @Test
    public void removeThreeStation() {
        List<Integer> input = List.of(12, 96, 6, 34, 73);
        List<Integer> excepted = List.of(6, 96);
        assertEquals(excepted, Station.removeStations(input, 3));
    }

    @Test
    public void removeOneStationInTheSameNumbers() {
        List<Integer> input = List.of(2, 2, 2);
        List<Integer> excepted = List.of(2, 2);
        assertEquals(excepted, Station.removeStations(input, 1));
    }

    @Test
    public void removeTwoStation() {
        List<Integer> input = List.of(10, 22, 11, 12, 90);
        List<Integer> excepted = List.of(10, 22, 90);
        assertEquals(excepted, Station.removeStations(input, 2));
    }

    @Test
    public void removeTwoStations() {
        List<Integer> input = List.of(40, 140, 90, 1, 44);
        List<Integer> excepted = List.of(1, 90, 140);
        assertEquals(excepted, Station.removeStations(input, 2));
    }
}