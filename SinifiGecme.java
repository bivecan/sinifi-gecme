import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        int total=0,i=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        int mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        int fiz = input.nextInt();

        System.out.println("Turkçe notunuz: ");
        int turk = input.nextInt();

        System.out.println("Kimya notunuz: ");
        int kim = input.nextInt();

        System.out.println("Muzik notunuz: ");
        int muz = input.nextInt();

        if ((0 <= mat) && ( mat<= 100)) {
            total = mat;
            i++;
        }
        if ((0<=fiz) && (fiz<=100)) {
            total = total +fiz;
            i++;
        }
        if((0<=turk) && (turk<=100)){
            total = total+turk;
            i++;
        }
        if((0<=kim) && (kim<=100)){
            total = total+kim;
            i++;
        }
        if((0<=muz) && (muz<=100)){
            total = total + muz;
            i++;
        }

        if(total!=0){
            double ort = total/i;
            System.out.println("Ortalamanız: " + ort);
            if (ort>55.0){
                System.out.println("Sınıfı gectiniz");
            }
            else {
                System.out.println("Sınıfta kaldınız");
            }
        }
        else {
            System.out.println("Ortalamanız hesaplanamadı");
        }
    }
}
