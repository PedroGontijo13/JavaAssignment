package ca.ciccc.assignment7.question1;

public class Book extends Student {
    private Integer pages;
    private String Category;
    public Book(Integer id, String name, Integer Pages, String category) {
        super(id, name);
        this.pages = Pages;
        this.Category = category;
    }
}
