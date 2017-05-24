package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 23.05.2017.
 */
public class Person {

    private String name;
    private String lastname;
    private int age;
    private char sex;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }


    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
