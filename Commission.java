import java.util.Scanner;

public class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        double commissionRate;
        if (sales >= 10000) {
            commissionRate = 0.1;
        } else if (sales >= 5000) {
            commissionRate = 0.07;
        } else if (sales >= 3000) {
            commissionRate = 0.05;
        } else if (sales >= 1000) {
            commissionRate = 0.03;
        } else {
            commissionRate = 0.0;
        }
        return sales * commissionRate;
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales: ");
        double sales = sc.nextDouble();
        if (sales >= 0) {
            Commission c = new Commission(sales);
            System.out.println("Commission: $" + c.commission());
        } else {
            System.out.println("Invalid Input.");
        }
    }
}
