import java.util.Hashtable;
import java.util.Dictionary;
public class StudentRecordsDictionary {
    public static void main(String[] args) {
        Dictionary<Integer, String> studentRecords = new Hashtable<>();
        studentRecords.put(123, "Alice");
        String Name = studentRecords.get(123);
        System.out.println("Student with ID 123 : " + Name);
    }
}
