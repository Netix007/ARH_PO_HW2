import java.util.Random;

public enum EmployeeType {
    WORKER,
    FREELANCER;

    private static final Random randomizer = new Random();

    public static EmployeeType randomEmployeeType() {
        EmployeeType[] employeeTypes = values();
        return employeeTypes[randomizer.nextInt(employeeTypes.length)];
    }
}
