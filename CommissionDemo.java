import java.util.Scanner;
class Q3 {
    private int sales;
    
    public Q3(int sales) {
        this.sales = sales;
    }
    
    public double commission() {
        double commissionRate = 0.0;
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else if (sales <= 1000) {
            commissionRate = 0.05;
        } else if (sales <= 5000) {
            commissionRate = 0.10;
        } else {
            commissionRate = 0.15;
        }
        return sales * commissionRate;
    }
}
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales: ");
        int sales = sc.nextInt();
        Q3 c = new Q3(sales);
        double commission = c.commission();
        if (sales >= 0) {
            System.out.println("Q3: " + commission);
        }
    }
}
