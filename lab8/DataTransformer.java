package lab8;

import java.util.List;

public class DataTransformer {
    @DataProcessor
    public static void transformData(List<String> data) {
        // Логика трансформации данных
        for (int i = 0; i < data.size(); i++) {
            data.set(i, data.get(i).toUpperCase());
        }
    }
}
