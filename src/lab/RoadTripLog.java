package lab;

public class RoadTripLog {
    
    private String tripName;
    private double totalDistance;
    private double totalFuel;

    // Constructor
    public RoadTripLog(String name) {
        this.tripName = name;
    }

    // Fuel

    public double getTotalFuel() {
        return this.totalFuel;
    }
    public void addFuel(double d) {
        this.totalFuel += d;
    }
    
    // Distance

    public double getDistance(){
        return this.totalDistance;
    }

    public void addDistance(double d) {
        totalDistance += d;
    }

    // Miles Per Gallon

    public double getMPG() {
        return Math.round((this.totalDistance / this.totalFuel) * 100.0) / 100.0;
    }

    // Overrides

    @Override
    public String toString() {
        String output = 
        "Trip: " + this.tripName +
      "\nDistance: " + this.totalDistance +
      "\nFuel Used: " + this.totalFuel +
      "\nMPG: " + getMPG(); 

        return output;
    }
}
