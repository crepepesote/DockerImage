package co.edu.uptc.demo;

// Person.java
public class Person {
    private String name;
    private String lastName;
    private String dateBirth;
    private String bornIn;
    private int randomNumber;
    private String nameClient;

    public Person(String name, String lastName, String dateBirth, String bornIn, int randomNumber, String nameClient) {
        this.name = name;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.bornIn = bornIn;
        this.randomNumber = randomNumber;
        this.nameClient = nameClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getBornIn() {
        return bornIn;
    }

    public void setBornIn(String bornIn) {
        this.bornIn = bornIn;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
}
