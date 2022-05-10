package be.intecbrussel.springrestdemo.model;

public class Employee {

    private Integer taxNumber;
    private String firstName;
    private String lastName;

    public Employee(Integer taxNumber, String firstName, String lastName) {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Integer taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
