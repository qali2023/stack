import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<delivery> deliveries=new ArrayList<>();
        System.out.println("how many deliveries :");
        int n=input.nextInt();
        for (int i=0 ;i<n;i++) {
            System.out.println("enter delivery type (R/E) :");

            char type = input.next().charAt(0);
            System.out.println("enter distance :");
            int Distance = input.nextInt();
            System.out.println("enter weight :");
            int weight = input.nextInt();
            if (type == 'R' || type == 'r') {
                deliveries.add(new Regular_delivery(Distance, weight));
            } else if (type == 'E' || type == 'e') {
                deliveries.add(new express_delivery(Distance, weight));
            }
        }
        long total=0;
        System.out.println("\n.......delivery summary....");
        for (delivery d:deliveries){
            long fee=d.calculateFee();
            System.out.println("delivery fee "+fee);
            total+=fee;

        }
        System.out.println("total fee :"+total);
        input.close();

    }
}
