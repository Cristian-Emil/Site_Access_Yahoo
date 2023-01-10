package diverse;

public class DecodareTehnica {

// exercitiu de proba prin care tiparim o inima intaorsa folosint iteratiile succesive.

    public static void main(String[] args) {

// 1.Declaram variabilele si setam sa inceapa cu inima intaoarsa
        int size = 39;
// 2. setam marimea de sus a inimii intoarse
        int tri_size = 20;
// 3. setam marimea de jos a inimii intoarse
        int base_size = 6;
// 4. setam numarul de caracter ce trebuie tiparit in primul rand
        char a = 'A';
// 5. Declaram si setam numarul de caractere ce trebuie declarat in randul curent "n"
        int n = 1;
// 6. partea de sus a modelului
        for (int i = 0; i < tri_size; i++) {
// 7. declaram partile albe di stanga si dreapta modelului
            int spaces = (size - n) / 2;
// 8. iteram si utilizam un loop pentru tiparirea spatiilor
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
// 9. iteram si utilizam un loop pentru tiparirea caracterelor
            for (int j = 0; j < n; j++) {
                System.out.print(a);
            }
// 10. iteram si utilizam un loop pentru tiparirea spatiilor
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
// 11. am terminat cu randul "n" , trecem la randul "n+1"
            System.out.println();
            n = n + 2;
// 12. crestem pozitia caracterelor tiparite, trecem de la "a" la "b"
            a++;
        }
// 13. declaram si initializam numarul de spatii ce trebuie declarat la baza
        int spaces_end = 0;
/* 14. declaram si initializam numarul de variabile ce reprezinat numarul de
spatii ce trebuie declarat pt a tiparii cele 2 parti ale inimii la baza
 */
        int spaces_between = 0;
// 15. utilizam o iterare pentru generare spatii
        for (int i = 0; i < base_size; i++) {
            n = (size - (2 * (spaces_end)) - spaces_between)
                    / 2;
// 16. utilizam o iterare pentru generare si tiparire la baza randul -1
            for (int j = 0; j < spaces_end; j++) {
                System.out.print(" ");
            }
// 17. utilizam o iterare pentru tiparire baza-1
            for (int j = 0; j < n; j++) {
                System.out.print(a);
            }
// 18. utilizam o iterare pentr tiparire spatii intre cele 2 baze-1
            for (int j = 0; j < spaces_between; j++) {
                System.out.print(" ");
            }
// 19. utilizam o iterare pentr tiparire baza-2
            for (int j = 0; j < n; j++) {
                System.out.print(a);
            }
// 20. utilizam o iterare pentr tiparire spatii intre cele 2 baze-2
            for (int j = 0; j < spaces_end; j++) {
                System.out.print(" ");
            }
// 21. am terminat cu randul "n" pentru zona cu jumatati , trecem la randul "n+1"
            System.out.println();
// 22. incrementam numarul de spatii si caractere cu inca o unitate pt fiecare rand
            a++;
            spaces_end++;
            spaces_between = spaces_between + 2;
        }
    }
}
