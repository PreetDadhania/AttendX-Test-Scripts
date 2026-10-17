
import java.util.HashMap;
import java.util.Map;

public class AttendanceTest {

    private final Map<String, String> records = new HashMap<>();

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

        app.test("Mark attendance",
                app.markAttendance("STU101"),
                "Attendance marked successfully");

        app.test("Duplicate attendance",
                app.markAttendance("STU101"),
                "Attendance already marked");

        app.test("Empty student ID",
                app.markAttendance(""),
                "Student ID is required");
    }
}
