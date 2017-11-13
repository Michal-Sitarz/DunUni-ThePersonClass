package thePersonClass;

/*
 * @author MJSitarz@dundee.ac.uk
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private Person spouse;
    private char gender;

    private enum Gender {
        M, F
    }

    //ctor
    public Person(String _firstName, String _lastName, int _age, int _height, int _weight, char _gender) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
        this.height = _height;
        this.weight = _weight;
        this.gender = _gender;
    }

    //SETters
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public void setHeight(int _height) {
        this.height = _height;
    }

    public void setWeight(int _weight) {
        this.weight = _weight;
    }

    public void setSpouse(Person _spouse) {
        this.spouse = _spouse;
    }

    // no setter for field: gender - cannot be changed
    //GETters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public char getGender() {
        return this.gender;
    }

    public Person getSpouse() {
        return this.spouse;
    }

    // other methods
    public String getFullName() {
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    public boolean hasSpouse() {
        return this.spouse != null;
        // above statement is short and returns the same
        // plus it's not "redundant", so it performs better xD
        /*
        if (spouse != null) {
            return true;
        } else {
            return false;
        }
         */
    }

    public double getBMIindex() {
        double height = this.height / 100;
        return (this.weight / height) / height;
    }

    public void showBMImeaning() {
        //get BMI index value
        double BMI = getBMIindex();

        // check the corresponding meaning of BMI index value
        if (BMI >= 30) {
            System.out.println("This person is obese.");
        } else if (BMI < 30 && BMI >= 25) {
            System.out.println("This person is overweight.");
        } else if (BMI < 25 && BMI >= 18.5) {
            System.out.println("This person has normal weight.");
        } else if (BMI < 18.5) {
            System.out.println("This person is underweight.");
        } else {
            System.out.println("BMI out of range.");
        }
    }

    public void marry(Person _spouse) {

        // check, if the person and spouse aren't the same gender
        if (this.gender != _spouse.getGender()) {

            // check, if both persons are single
            if (this.spouse == null && !_spouse.hasSpouse()) {

                // check, if both persons aren't under 18 years old
                if (this.age >= 18 && _spouse.getAge() >= 18) {
                    this.spouse = _spouse;
                    _spouse.setSpouse(this);
                    System.out.println("Congratulations: a couple just get married! :)");
                } else {
                    System.out.println("Sorry, one or both persons are under 18 years old.");
                }
            } else {
                System.out.println("Sorry, one or both persons are not single");
            }
        } else {
            System.out.println("Sorry, both partners are of the same gender.");
        }
        
        // !!!
        // could be implemented as a chain of if-else-if statements
        // using less lines of code...
        // !!!

    }
    
}
