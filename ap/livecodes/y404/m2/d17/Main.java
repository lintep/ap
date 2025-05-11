package ap.livecodes.y404.m2.d17;

import ap.livecodes.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pen> pens =new ArrayList<>();
        pens.add(new Pen("b1","black",12000));
        pens.add(new Pen("b2","black",4000));
        pens.add(new Pen("b2","red",5600));

        ArrayList<Book> books =new ArrayList<>();
        books.add(new Book("book1",120000));
        books.add(new Book("book2",180000));
        books.add(new Book("book3",580000));

        for (Pen pen : pens) {
//            pen.printInfo();
            System.out.println(pen);
        }

        for (int i=0; i<books.size(); i++) {
//            books.get(i).printInfo();
            System.out.println(books.get(i));
        }

        List<Product> products = new ArrayList<>();
        products.addAll(pens);
        products.addAll(books);
        for (Product product : products) {
//            System.out.println(product);
            product.printInfo();
        }

        ArrayList<PrintInfoInterface> printInfoList=new ArrayList<>();
        printInfoList.add(pens.get(0));
        printInfoList.add(books.get(0));
        printInfoList.add(products.get(3));
        printInfoList.add(new Student("ali","ahmadi","zanjan"));


        for (PrintInfoInterface printInfoItem : printInfoList) {
            printInfoItem.printInfo();
        }

//        new PrintInfoInterface() {
//            @Override
//            public void printInfo() {
//
//            }
//        };

//        Book book1 = new Book("name1", 11111){
//            @Override
//            public String toString() {
//                return "BOOK[Name="+getName()+",Price:"+price+"]";
//            }
//        };
//
//        System.out.println(book1);
    }

}
