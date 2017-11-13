/*
 * TO DO list:
 * ==========
 * 1.  [•]
 * 2.  [•]
 * 3.  [•]
 * 4.  [ ]
    a) [•]
    b) [•]
    c) [•]
    d) [•]
    e) [ ]
    f) [ ]
    g) [ ]
 * 5.  [ ]
 * 6.  [ ]
 * 7.  [ ]
 * 8.  [ ]
 * 9.  [ ]
 * 10. [ ]
 *
 */
package thePersonClass;

/*
 * @author MJSitarz@dundee.ac.uk
 */
public class Main {

    public static void main(String[] args) {

        // testing methods
        test1();
        test2();
        test3();
        test4();
    }

    //testing methods
    // tests getFullName method
    public static void test1() {
        System.out.println("\n[ Test: 1 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, 'M');
        System.out.println(p.getFullName());
    }

    public static void test2() {
        System.out.println("\n[ Test: 2 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, 'M');

        System.out.println("> Not married");
        System.out.println("Expected: false");
        System.out.println("Result:   " + p.getMartialStatus());

        System.out.println("> Married");
        p.setSpouse(p);
        System.out.println("Expected: true");
        System.out.println("Result:   " + p.getMartialStatus());

    }

    public static void test3() {
        System.out.println("\n[ Test: 3 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, 'M');

        System.out.println("> BMI");
        System.out.println("Expected: 18.75");
        System.out.println("Result:   " + p.getBMIindex());
    }

    public static void test4() {
        System.out.println("\n[ Test: 4 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, 'M');

        System.out.println("> BMI meaning");
        System.out.println("Expected: This person has normal weight.");
        System.out.print("Result:   ");
        p.showBMImeaning();
    }

}
