import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polidrom kelime bulma uygulamasına hoş geldiniz!");
        Scanner input = new Scanner(System.in);
        String kelime = input.nextLine();

        String tersKelime = "";
        for (int i = kelime.length()-1;i>=0;i--){
            tersKelime += kelime.charAt(i);

        }
        System.out.println(tersKelime);
        if (kelime.equals(tersKelime)){
            System.out.println("palidrom kelimedir");
        }else{
            System.out.println("palidrom değildir");
        }




    }
}