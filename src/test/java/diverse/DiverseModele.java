package diverse;

import java.util.Scanner;

public class DiverseModele {


//Cream o metoda "Non statica"  cu argumente  care returneaza o valoare
    public int add(int a, int b) {
        int result;
        result=a+b;
        System.out.println(result);
        return result;

    }

//Cream o metoda "Non statica"  cu argumente  care nu returneaza valoare
    public void sub() {
        int x=100;
        int y=50;
        System.out.println(x-y);
    }

//Cream o metoda "Statica"  cu argumente  care returneaza o valoare
    public static int multiply(int num1, int num2) {
        int result= num1*num2;
        return result;
    }

//Cream o metoda "Statica"  cu argumente  care nu returneaza o valoare
    public static void comparision() {
        int x=100, y=50;

        if (x>y) {
            System.out.println("X is Big Number");
        }
        else {
            System.out.println("Y is Big Number");
        }
    }

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String myName = scan.nextLine();
        System.out.println("My Name is: " + myName);

        int a; // Declaram variabila
        a = 100;
        int b = 200; // Declaram variabila si o initializam
        char x = 'Y';
        String myCountry = "Romania";
        int c, d, e; //Declaram variabile multiple
        int f = 20, g = 40, h = 60; //Declaram variabile multiple si le initializam
        final int price = 100;


        if (a > b) {
            System.out.println("A is Big Number");
        } else {
            System.out.println("B is Big Number");
        }
        System.out.println("");

                for (int i = 1; i <= 10; i++) { // Print 1 to 10 Numbers
            System.out.println(i);
        }
        System.out.println("");

        int i = 1;
        while (i <= 7) {
            System.out.println(i);
            i++;
        }
        System.out.println("My Output");

//      Tipareste numerele de la 1 la 10 dar sari peste 5
        for (int j = 1; j <= 10; j++) {
            if (j != 5 ) {
                System.out.println(j);
            }
        }

    }

}
