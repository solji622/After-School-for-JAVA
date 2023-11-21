package BlackBox.arrayList;

import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book("태백산맥","조정래");

        ArrayList<Book> Library = new ArrayList<>();
        Library.add(new Book("태백산맥","조정래"));
        Library.add(new Book("데미안", "헤르만 헤세"));
        Library.add(new Book("토지","박경리"));
        Library.add(new Book("어린왕자","생택쥐페리"));

        System.out.println(Library.get(2));
        for (int i=0; i<=Library.size(); i++){
            Book book = Library.get(i);
            book.showBookInfo();
        }

        Library.remove(0);

        for (Book book : Library) {
            book.showBookInfo();
        }
    }
}
