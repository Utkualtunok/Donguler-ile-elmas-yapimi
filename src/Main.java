import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");

        int n = inp.nextInt();
        // Kodu 2 şekilde ayırdım alt ve üst bu elmasın yarısı yani ağaç şekli veren üst kısım.
        for (int i = 1; i <= n; i++) {
            for (int k= 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Bu kısım ise kodun devamında birleşen ters ağaç ile birlikte yıldız simgesini elde ediyoruz.
        for (int i = n - 1; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}