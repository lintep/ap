package ap.livecodes.y404.m2.d17;

import java.util.ArrayList;

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
            System.out.println(
                    "brand="+pen.getBrand()+"\t" +
                    "color="+pen.getColor()+"\t" +
                    "price="+pen.getPrice());
        }

        for (int i=0; i<books.size(); i++) {
            System.out.println(
                    "name="+books.get(i).getName()+"\t" +
                    "price="+books.get(i).getPrice());
        }
    }

}
