import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        int n,k;
        int total=1;
        Scanner inp =new Scanner(System.in);
        System.out.println("Sayıyı Giriniz: ");
        n=inp.nextInt();
        System.out.println("Üssü Giriniz: ");
        k=inp.nextInt();

        for (int i=1;i<=k;i++){
            total=total*n;
        }
        System.out.println("Sonuç: "+total);
    }
}
