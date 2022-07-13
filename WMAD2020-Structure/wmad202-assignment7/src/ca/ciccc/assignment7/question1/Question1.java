package ca.ciccc.assignment7.question1;

public class Question1 {
    public void invoke(){
        Student s = new Student(1, "Pedro");
        Building b = new Building(10, "MathBuild");
        Index<Student, Building> studentBuildingIndex = new Index<>(s, b);
        System.out.println(studentBuildingIndex.coutnNumberOfElementsWithSpecififcProperty(s, b));
    }
}
