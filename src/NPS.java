import java.util.Scanner;

public class NPS {
    public static void main(String[] args) {
        String a = "NPS";
        Scanner scan = new Scanner(System.in);

        System.out.print("%Detractors: ");
        System.out.print("%Promoters: ");
        double Detractors = scan.nextDouble();
        double Promoters = scan.nextDouble();

        System.out.println(a= String.valueOf(Detractors-Promoters));


    }
}
