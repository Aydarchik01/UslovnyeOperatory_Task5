import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Else-if Жардамында жасалган

        Scanner scaner = new Scanner(System.in);
        System.out.println("1-кун\n2-кун\n3-кун  ");
        int n1 = scaner.nextInt();
        if (n1==1) {
            System.out.println("1-куну биз переменныйларды оттук.");
        }else if (n1==2) {
            System.out.println("2-куну биз присваивание деген тема оттук.");
        } else if (n1==3) {
            System.out.println("3-куну биз циклдар деген тема оттук..");
        }else {
            System.out.println("EROR");
        }

        //Swich case Жардамында

        System.out.println("1-кун\n2-кун\n3-кун ");
        int  a1 = scaner.nextInt();
        switch (a1) {
            case 1 -> System.out.println("1-куну биз переменныйларды оттук.");
            case 2 -> System.out.println("2-куну биз присваивание деген тема оттук.");
            case 3 -> System.out.println("3-куну биз циклдар деген тема оттук.");
            default -> System.out.println("EROR");
        }
    }
}