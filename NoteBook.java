import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class NoteBook {

    private String model;
    private int hdd;
    private String ram;
    private String os;
    private String color;


    public NoteBook() {
    }
    
    public NoteBook(String model, int hdd, String ram, String os, String color) {
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public int getHdd() {
        return hdd;
    }
    public String getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }

    public Set<NoteBook> newFilter(Set<NoteBook> NoteBook) {
        Scanner scan = new Scanner(System.in);
        Set<NoteBook> listNoteBook = new HashSet<>(NoteBook);

        System.out.println("Добрый день! Введите № интересующего Вас критерия: " +
                "\n1. HDD\n2. RAM\n3. OS\n4. Color");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Какой размер жёсткого диска желаете? (Тб)\nВналичии : 1, 2, 4, 6, 10");
                String enterhdd = scan.nextLine();
                int intParseEnterhdd = Integer.parseInt(enterhdd);
                for (NoteBook tempNoteBook : NoteBook) {
                    if (intParseEnterhdd != tempNoteBook.hdd) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }

            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Какое количество ОЗУ предпочитаете? (Гб)\nВналичии : 8, 16, 32, 64 ");
                String enterram = scan.nextLine();
                for (NoteBook tempNoteBook : NoteBook) {
                    if ((enterram.equals(tempNoteBook.ram)) == false) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }

            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите операционную систему\nВналичии : Linux, MacOS, Windows");
                String enteros = scan.nextLine();
                for (NoteBook tempNoteBook : NoteBook) {
                    if ((enteros.equals(tempNoteBook.os) == false)) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }

            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
                String enterColor = scan.nextLine();
                for (NoteBook tempNoteBook : NoteBook) {
                    if ((enterColor.equals(tempNoteBook.color)) == false) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }
            scan.close();
        }
        return listNoteBook;

    }
    public String toString() {
        return "\nNoteBook  ->  " + model  + ",\nhdd = " + hdd + ",\nram = " + ram+ ",\nos = " + os + ",\ncolor = " + color + "\n";
    }
}
