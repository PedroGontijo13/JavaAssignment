package ca.ciccc.assignment5.question2;

public class Question2 {
    public void invoke(){
        Test();
    }

    public void Test() {
        Invoice invoice = new Invoice();
        Product p = new Product("PASTA", 2.00F);
        invoice.addItem(p);
        Product p2 = new Product("RedBull", 4.00F);
        invoice.addItem(p2);
        Product p3 = new Product("Coca-Cola", 5.00F);
        invoice.addItem(p3);
        invoice.showList();
    }
}
