package diverse;
import java.util.Scanner;
class Employee {

        private final Scanner s2;
        int id;
        String name;
        float sal;

    public Employee(Scanner s1){
            s2 = s1;
    }

    public void setEmplo(){
        System.out.println("Enter ID: ");
        id = s2.nextInt();


        System.out.println("Enter Salary: ");
        sal = s2.nextFloat();


        System.out.println("Enter name: ");
        name = s2.next();
    }

    public void display(){

        System.out.println("ID= " + id);
        System.out.println("Name= " + name);
        System.out.println("Salary= " + sal);
    }
}

class MainClass{
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);

        Employee obj = new Employee(s1);
        obj.setEmplo();
        obj.display();
    }
}




