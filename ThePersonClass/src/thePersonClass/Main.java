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
    e) [•]
    f) [ ]
    g) [ ]
 * 5.  [•]
 * 6.  [•]
 * 7.  [ ]
 * 8.  [ ]
 * 9.  [•]
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
        test5();
        
        testMyBMI();

    }

    //testing methods
    public static void testMyBMI(){
        Person me = new Person("M", "Starz", 33, 182, 55, Person.Gender.M);
        System.out.println("My BMI: "+me.getBMIindex());
        me.showBMImeaning();
    }
    
    // tests getFullName method
    public static void test1() {
        System.out.println("\n[ Test: 1 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);
        System.out.println(p.getFullName());
    }

    public static void test2() {
        System.out.println("\n[ Test: 2 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);

        System.out.println("> Not married");
        System.out.println("Expected: false");
        System.out.println("Result:   " + p.hasSpouse());

        System.out.println("> Married");
        p.setSpouse(p);
        System.out.println("Expected: true");
        System.out.println("Result:   " + p.hasSpouse());

    }

    public static void test3() {
        System.out.println("\n[ Test: 3 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);

        System.out.println("> BMI");
        System.out.println("Expected: 18.75");
        System.out.println("Result:   " + p.getBMIindex());
    }

    public static void test4() {
        System.out.println("\n[ Test: 4 ]\n===========");
        Person p = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);

        System.out.println("> BMI meaning");
        System.out.println("Expected: This person has normal weight.");
        System.out.print("Result:   ");
        p.showBMImeaning();
    }

    public static void test5() {
        System.out.println("\n[ Test: 4 ]\n===========");
        System.out.println("> marry()");
        
        Person p1 = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);
        Person p2 = new Person("Teodora", "Testy", 99, 200, 75, Person.Gender.F);
        p1.marry(p2);
        System.out.println("Expected: True");
        System.out.println("Result:   " + p1.hasSpouse());
        
        //same gender
        Person p3 = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);
        Person p4 = new Person("Teddy", "Testy", 99, 200, 75, Person.Gender.M);
        p3.marry(p4);
        System.out.println("Expected: False");
        System.out.println("Result:   " + p3.hasSpouse());
        
        //one of them underaged
        Person p5 = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);
        Person p6 = new Person("Teodora", "Testy", 17, 200, 75, Person.Gender.F);
        p5.marry(p6);
        System.out.println("Expected: False");
        System.out.println("Result:   " + p5.hasSpouse());
        
        //both of them married(p1,p2)
        Person p7 = new Person("Ted", "Testovny", 99, 200, 75, Person.Gender.M);
        Person p8 = new Person("Teodora", "Testy", 99, 200, 75, Person.Gender.F);
        p7.marry(p2);
        p8.marry(p1);
        System.out.println("Expected: False");
        System.out.println("Result:   " + p7.hasSpouse());
        System.out.println("Expected: False");
        System.out.println("Result:   " + p8.hasSpouse());

    }

}
