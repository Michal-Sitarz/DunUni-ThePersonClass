package thePersonClass;

/**
 * @author MJSitarz
 */
public class MalePerson extends Person {

    //ctor
    public MalePerson(String _firstName, String _lastName, int _age, int _height, int _weight) {
        super(_firstName, _lastName, _age, _height, _weight);

    }

    public void marry(Person spouse) {
        //check gender here
        if (spouse) {
            super.marry(spouse);
        } else {
            System.out.println("Sorry, both partners are of the same sex.");
        }

    }

}
