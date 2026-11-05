class UberRide {

    String riderName;
    double totalCost;


    UberRide(String riderName) {
        this.riderName = riderName;
        this.totalCost = 0;
    }


    public void addRide(double cost) {
        totalCost += cost;
        System.out.println(riderName + " added a ride of $" + cost);
    }


    public void printTotal() {
        System.out.println(riderName + "'s total cost: $" + totalCost);
    }
}

public class Main {
    public static void main(String[] args) {

        
        UberRide ride = new UberRide("Alex");

        ride.addRide(15);
        ride.addRide(20);

        ride.printTotal();
    }
}