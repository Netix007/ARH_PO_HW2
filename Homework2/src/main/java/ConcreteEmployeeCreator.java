import java.util.Random;

public class ConcreteEmployeeCreator extends EmployeeCreator{

    @Override
    protected Employee createEmployeeInstance(EmployeeType employeeType) {

        Random randomizer = new Random();
        String[] name = new String[] { "Иван", "Сергей", "Николай", "Александр", "Василий"};
        String[] surname = new String[] { "Смирнов", "Иванов", "Петров", "Сидоров", "Васильев"};
        Double[] salary = new Double[] { 1000.00, 5000.00, 10000.00, 20000.00, 30000.00};

        return switch (employeeType){
            case WORKER -> new Worker(name[randomizer.nextInt(name.length)],
                                    surname[randomizer.nextInt(surname.length)],
                                    salary[randomizer.nextInt(salary.length)]);
            case FREELANCER -> new Freelancer(name[randomizer.nextInt(name.length)],
                                    surname[randomizer.nextInt(surname.length)],
                                    salary[randomizer.nextInt(salary.length)]);
        };
    }
}
