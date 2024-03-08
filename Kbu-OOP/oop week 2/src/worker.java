public class worker {

    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public void displayInfo() {
        System.out.println("Name:" + name + "\nsocial Security number:" + socialSecurityNumber);
    }


    public void displaySalary() {

        float salary = wage * workingHours;
        System.out.println("Salary:" + salary);
    }

}
