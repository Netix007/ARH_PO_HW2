public class Freelancer extends Employee{
    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return this.salary*15*6;
    }
    public String toString() {
        return String.format("%s %s; ���������; �������������� ���������� �����: %.2f (���.); ��������� ������: %.2f (���.)", this.surname, this.name, calculateSalary(), this.salary);
    }
}
