package thePersonClass;

/**
 * @author MJSitarz
 */
public class FemalePerson extends Person {

    public FemalePerson(String _firstName, String _lastName, int _age, int _height, int _weight) {
        super(_firstName, _lastName, _age, _height, _weight);

    }

    public Person procreate(String firstName, String lastName, int age, int height, int weight) {

        Person baby = new FemalePerson(firstName, lastName, age, height, weight);

        return baby;
    }

}
