import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int matematik, fizik, kimya;
        double avarage;

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = inp.nextInt();
        if (matematik <= 0 || matematik >= 100) {
            System.out.println("Lütfen geçerli bir not giriniz");
            System.exit(0);
        } else {
            System.out.print("Fizik Notunuzu Giriniz: ");
            fizik = inp.nextInt();
            if (fizik <= 0 || fizik >= 100) {
                System.out.println("Lütfen geçerli bir not giriniz");
                System.exit(0);
            } else {
                System.out.print("Kimya Notunuzu Giriniz: ");
                kimya = inp.nextInt();
                if (kimya <= 0 || kimya >= 100) {
                    System.out.println("Lütfen geçerli bir not giriniz");
                    System.exit(0);
                } else {

                    avarage = (matematik + fizik + kimya) / 3;
                    System.out.println("Ortlamanız: " + avarage);

                    if (avarage >= 55) {
                        System.out.println("Tebrikler sınıfı başarı ile tmamaladınız.");
                    } else {
                        System.out.println("Sınıfı geçemediniz.");
                    }


                }
            }
        }
    }
}