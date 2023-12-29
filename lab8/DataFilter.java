package lab8;

import java.util.List;

public class DataFilter {
    @DataProcessor
    public static void filterData(List<String> data) {
        data.removeIf(line -> !line.toLowerCase().contains("java"));
    }
}