import java.util.HashSet;
import java.util.Set;

public class Main {
        public static void main(String[] args) {
                
                NoteBook notebook1 = new NoteBook("Dexp Aquilon", 1, "8", "Windows", "black");
                NoteBook notebook2 = new NoteBook("Acer Aspire", 2, "16", "Windows", "white");     
                NoteBook notebook3 = new NoteBook("Asus 2023", 4, "32", "Windows", "black");
                NoteBook notebook4 = new NoteBook("Lenovo", 6, "64", "Linux", "white");
                NoteBook notebook5 = new NoteBook("MacBook Pro", 10, "64", "MacOS3", "white");
                
                Set<NoteBook> NoteBook = new HashSet<>();
                NoteBook.add(notebook1);
                NoteBook.add(notebook2);
                NoteBook.add(notebook3);
                NoteBook.add(notebook4);
                NoteBook.add(notebook5);
                
                NoteBook FilterNoteBook = new NoteBook();
                System.out.println(FilterNoteBook.newFilter(NoteBook));
        }
}