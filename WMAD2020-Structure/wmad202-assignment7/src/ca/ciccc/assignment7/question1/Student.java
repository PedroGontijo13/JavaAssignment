package ca.ciccc.assignment7.question1;

public class Student {
    Integer Id;
    String name;

    public Student(Integer id, String name) {
        this.Id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.Id;
    }
}
