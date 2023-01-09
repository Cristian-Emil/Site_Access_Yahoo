package diverse;

// Acesta este un exercitiu de logare automata care se poate aplica pe orice pagina ce solicita logare:

import java.util.Scanner;

class LoginAutomat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LoginAutomat A = new LoginAutomat(scan);
    }

    Scanner scan;
    String user,pass;
    public LoginAutomat(Scanner scan){
        this.scan=scan;
        insertData();
    }
    public void insertData(){
        System.out.println("Enter Username: ");
        user = scan.nextLine();

        System.out.println("Enter Password: ");
        pass = scan.nextLine();
        validation();
    }
    public void validation(){
        if (user.equals("user")) {
            if (pass.equals("pass")) {
                System.out.println("Succesful Login");
            } else {
                System.out.println("Wrong Password, please try another Password");
            }
        }else{
            System.out.println("Wrong Username, please try another User");
        }
    }

}

