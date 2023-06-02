import java.util.*;

class Distance{
    double distance;
    Distance(double distance)
    {
        this.distance = distance;
    }
    double travelTime()
    {
        return distance*60;
    }
}
class DistanceMKS extends Distance{
    DistanceMKS(double distance)
    {
        super(distance);
    }
    double travelTime()
    {
        return distance*100;
    }
    public static void main(String[] args){
        System.out.print("Enter the distance : ");
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        DistanceMKS d1 = new DistanceMKS(distance);
        System.out.println(d1.travelTime());
    }
}