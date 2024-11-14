import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    
  
    public static int countDuplicates(int[] array) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
       
        int duplicateCount = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > 1) {
                duplicateCount++;
            }
        }
        }
    
