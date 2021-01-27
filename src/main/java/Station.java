import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Station {
    public static List<Integer> removeStations(List<Integer> input, int numberOfDeleteStations) {
        List<Integer> rsl = new ArrayList<>(input);
        Collections.sort(rsl);
        int count = 0;
        while (count < numberOfDeleteStations) {
            deleteMinDistanceStation(rsl);
            count++;
        }
        return rsl;
    }

    private static void deleteMinDistanceStation(List<Integer> list) {
        int indexForRemove = -1;
        int prevDistance, nextDistance;
        int minDistance = Integer.MAX_VALUE;
        if (list.size() == 3) {
            list.remove(1);
            return;
        }
        for (int i = 1; i < list.size() - 2; i++) {
            prevDistance = Math.abs(list.get(i - 1) - list.get(i));
            nextDistance = Math.abs(list.get(i) - list.get(i + 1));
            if (prevDistance < minDistance) {
                minDistance = prevDistance;
                indexForRemove = i;
            } else if (nextDistance <= minDistance) {
                minDistance = nextDistance;
                indexForRemove = i + 1;
            }
        }
        list.remove(indexForRemove);
    }
}
