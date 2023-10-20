import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        System.out.println("Welcome to taksi");
        System.out.println("please write down how many km you will go:");
        Scanner input=new Scanner(System.in);
        int km= input.nextInt();
        int start=10;
        double perKm=2.20;
        double total=start+(km*perKm);
        total=(total<20) ? 20 : total;
        System.out.println("The amount you will pay is:"+total);
    }
}
