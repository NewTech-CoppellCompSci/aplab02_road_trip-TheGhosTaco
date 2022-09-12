package lab;

public class RoadTripLog {
    
    private String tripName;
    private double totalDistance;

    private double totalFuel;

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
        return (double) Math.round((this.totalDistance / this.totalFuel) * 100.0) / 100.0;
        
    }

    @Override
    public String toString() {
        String output = 
        "Trip : " + this.tripName +
      "\n*    Distance: " + this.totalDistance +
      "\n*    Fuel Used: " + this.totalFuel +
      "\n*    MPG: " + getMPG(); 

        return output;
    }
}
