
public class App {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new ConcreteEmployeeCreator().createEmployee();
        }
        for (Employee item: employees
             ) {
            System.out.println(item);
        }
    }
}
