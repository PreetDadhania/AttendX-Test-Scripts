
public class LoginTest {

    static String login(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return "Username and password are required";
        }

        if (username.equals("student1")
                && password.equals("AttendX@123")) {
            return "Login successful";
        }

        return "Invalid username or password";
    }

    public static void main(String[] args) {

        // Test 1: Valid login
        test("Valid login",
                login("student1", "AttendX@123"),
                "Login successful");

        // Test 2: Wrong password
        test("Wrong password",
                login("student1", "wrong123"),
                "Invalid username or password");

        // Test 3: Empty username and password
        test("Empty fields",
                login("", ""),
                "Username and password are required");

        // Test 4: Empty username
        test("Empty username",
                login("", "AttendX@123"),
                "Username and password are required");
    }

    static void test(String name, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
}
