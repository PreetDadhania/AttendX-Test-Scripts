
import java.util.HashMap;
import java.util.Map;

public class AttendanceTest {

    private final Map<String, String> records = new HashMap<>();

    // Marks attendance and prevents duplicate records.
    String markAttendance(String studentId) {

        if (studentId.isEmpty()) {
            return "Student ID is required";
        }

        if (records.containsKey(studentId)) {
            return "Attendance already marked";
        }

        records.put(studentId, "Present");
        return "Attendance marked successfully";
    }

    void test(String name, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }

    public static void main(String[] args) {

        AttendanceTest app = new AttendanceTest();

        // Test 1: Mark attendance
        app.test("Mark attendance",
                app.markAttendance("STU101"),
                "Attendance marked successfully");

        // Test 2: Prevent duplicate attendance
        app.test("Duplicate attendance",
                app.markAttendance("STU101"),
                "Attendance already marked");

        // Test 3: Empty student ID
        app.test("Empty student ID",
                app.markAttendance(""),
                "Student ID is required");
    }
}
