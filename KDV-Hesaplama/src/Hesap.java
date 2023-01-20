import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        //Değişken tanımlıyoruz ilk önce
        double tutar,kdvOran=0.18;

        //Scanner sınıfını tanımlıyoruz
        Scanner input=new Scanner(System.in);

        //Ücret tutarını giriniz
        System.out.print("Tutarınız ne kadar?");
        tutar=input.nextDouble();

        double kdvTutar =tutar * kdvOran;
        double kdvliTutar =tutar + kdvTutar;

        System.out.println("Tutarınız "+tutar);
        System.out.println("KDV oranı "+kdvOran);
        System.out.println("KDV Tutarı "+kdvTutar);
        System.out.println("KDV'li Tutarınız "+kdvliTutar);

        }



    }

