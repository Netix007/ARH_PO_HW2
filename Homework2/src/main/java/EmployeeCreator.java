
abstract class EmployeeCreator {
    protected abstract Employee createEmployeeInstance(EmployeeType employeeType);
    public Employee createEmployee(){
        EmployeeType employeeType = EmployeeType.randomEmployeeType();
        Employee employee = createEmployeeInstance(employeeType);
        return employee;
    }

}
