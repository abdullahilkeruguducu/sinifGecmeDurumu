import java.util.Scanner;
// patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, avarage;
        int notlarToplami = 0, dersSayisi = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = input.nextDouble();
        if (!(mat < 0 || mat > 100)) {
            notlarToplami += mat;
            dersSayisi++;
        }

        System.out.print("Fizik Notunuz :");
        fizik = input.nextDouble();
        if (!(fizik < 0 || fizik > 100)) {
            notlarToplami += fizik;
            dersSayisi++;
        }

        System.out.print("Turkce Notunuz :");
        turkce = input.nextDouble();
        if (!(turkce < 0 || turkce > 100)) {
            notlarToplami += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya Notunuz :");
        kimya = input.nextDouble();
        if (!(kimya < 0 || kimya > 100)) {
            notlarToplami += kimya;
            dersSayisi++;
        }

        System.out.print("Muzik Notunuz :");
        muzik = input.nextDouble();
        if (!(muzik < 0 || muzik > 100)) {
            notlarToplami += muzik;
            dersSayisi++;
        }

        avarage = notlarToplami / dersSayisi;

        if (avarage < 55) {
            System.out.println("Sinifta kaldiniz tekrar gorusmek uzere!");
        } else {
            System.out.println("Tebrikler, sinifi gectiniz.");
        }

        System.out.print("Ortalamaniz :" + avarage);
    }
}