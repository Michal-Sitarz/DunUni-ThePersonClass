/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thePersonClass;

/*
 * @author MJSitarz
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private char gender;
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
    
    

}
