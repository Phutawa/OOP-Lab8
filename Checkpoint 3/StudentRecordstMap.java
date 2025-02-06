import java.util.Map;
import java.util.HashMap;

public class StudentRecordstMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(123, "Alice");
        if (map.containsKey(789)) {
            System.out.println("Student with ID 789 exist." );
        } else {
            System.out.println("Student with ID 789 does not exist.");
        }
    }
}

