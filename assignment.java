import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        int[] mathMarks = new int[n];
        int[] phyMarks = new int[n];
        int[] chemMarks = new int[n];
        int[] totalMarks = new int[n];
        int[] mathPhyTotal = new int[n];
        boolean[] isEligible = new boolean[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks for student " + (i + 1) + ":");
            System.out.print("Maths: ");
            mathMarks[i] = sc.nextInt();
            System.out.print("Physics: ");
            phyMarks[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemMarks[i] = sc.nextInt();
            totalMarks[i] = mathMarks[i] + phyMarks[i] + chemMarks[i];
            mathPhyTotal[i] = mathMarks[i] + phyMarks[i];
            isEligible[i] = (mathMarks[i] >= 60 && phyMarks[i] >= 50 && chemMarks[i] >= 40) && 
                            (totalMarks[i] >= 200 || mathPhyTotal[i] >= 150);
        }
        System.out.println("List of eligible candidates:");
        for (int i = 0; i < n; i++) {
            if (isEligible[i]) {
                System.out.println("Student " + (i + 1));
            }
        }
    }

}
