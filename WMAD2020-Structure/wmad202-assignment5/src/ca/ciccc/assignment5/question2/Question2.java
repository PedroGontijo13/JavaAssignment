package ca.ciccc.assignment5.question2;

public class Question2 {
    public void invoke(){
        //TestProblem2_1();
        //TestProblem2_2();
        TestProblem2_3();
    }

    public void TestProblem2_1() {
        Invoice invoice = new Invoice();
        Product p = new Product("PASTA", 2.00F);
        invoice.addItem(p);
        Product p2 = new Product("RedBull", 4.00F);
        invoice.addItem(p2);
        Product p3 = new Product("Coca-Cola", 5.00F);
        invoice.addItem(p3);
        invoice.showList();
    }

    public void TestProblem2_2() {
        Pages pages = new Pages("LOREM LOREM");
        Book book = new Book();
        book.addPage(pages);
        Pages pages1 = new Pages("LOREM LOREM");
        book.addPage(pages1);
        book.CheckWords("LOREM");
    }

    public void TestProblem2_3() {
        Transaction t = new Transaction("999" , 2.02F);
        BankStatment b = new BankStatment();
        b.addTransction(t);
        Transaction t2 = new Transaction("999" , 2.02F);
        b.addTransction(t2);
        b.totalBalance();
    }
}
