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
    private char gender;

    private enum Gender {
        M, F
    }
    private Person spouse;

    //ctor
    public Person(String _firstName, String _lastName, int _age, int _height, int _weight, char _gender) {
        firstName = _firstName;
        lastName = _lastName;
        age = _age;
        height = _height;
        weight = _weight;
        gender = _gender;
    }

    //SETters
    public void setFirstName(String _firstName) {
        firstName = _firstName;
    }

    public void setLastName(String _lastName) {
        lastName = _lastName;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public void setHeight(int _height) {
        height = _height;
    }

    public void setWeight(int _weight) {
        weight = _weight;
    }

    public void setSpouse(Person _spouse) {
        spouse = _spouse;
    }

    // no setter for field: gender - cannot be changed
    //GETters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public Person getSpouse() {
        return spouse;
    }

    // other methods
    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public boolean getMartialStatus() {
        return spouse != null;
        // above statement is short and return the same
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
        return (weight / height) / height;
    }

    public void showBMImeaning() {
        //get BMI index value
        double BMI = getBMIindex();
        
        // check the corresponding meaning of BMI index value
        if(BMI>=30){
            System.out.println("This person is obese.");
        }
        else if(BMI <30 && BMI >=25){
            System.out.println("This person is overweight.");
        }
        else if(BMI <25 && BMI >=18.5){
            System.out.println("This person has normal weight.");
        }
        else if(BMI<18.5){
            System.out.println("This person is underweight.");
        }
        else{
            System.out.println("BMI out of range.");
        }

    }

}
