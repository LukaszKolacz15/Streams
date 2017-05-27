package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 26.05.2017.
 */
public class Employee {

    private String Name;
    private String Surname;
    private String Company;


        public Employee(String name, String surname, String company) {
        Name = name;
        Surname = surname;
        Company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Company='" + Company + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }
}
