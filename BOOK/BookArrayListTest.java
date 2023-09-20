package classExample;

import java.util.ArrayList;

public class BookArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("데미안","헤르만 해세"));
        library.add(new Book("어린왕자","생텍쥐페리"));
        
        for(int i=0; i<library.size(); i++){
            Book book = library.get(i);
            book.showBookinfo();
        }
        
//        for (Book book : library) {
//            book.showBookinfo();
//        }
    }
}
