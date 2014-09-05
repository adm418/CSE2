//Anna Malisova
//CSE2 lab02-Cyclometer
//09/05/2014

public class Cyclometer {
    //main method
    public static void main(String[] args) {

     int secsTrip1=480; //the number of seconds in the first trip (480)
     int secsTrip2=3220; //the number of seconds in the second trip(3220)
     int countsTrip1=1561; //the number of counts (rotations) in the first trip (1561)
     int countsTrip2=9037; //the number of counts (rotations) in the second trip (9037)
     double wheelDiameter=27.0, //the diameter of the wheel (27.0)
     PI=3.14159, //the value of pi
     feetPerMile=5280, //the number of feet in a mile (5280)
     inchesPerFoot=12, //the number of inches in a foot (12)
     secondsPerMinute=60; //the number of seconds in a minute (60)
     double distanceTrip1, distanceTrip2, totalDistance;
     System.out.println("Trip 1 took "+
     (secsTrip1/secondsPerMinute)+" minutes and had "+
     countsTrip1+" counts.");
     System.out.println("Trip 2 took "+
     (secsTrip2/secondsPerMinute)+" minutes and had "+
     countsTrip2+" counts.");
     distanceTrip1=countsTrip1*wheelDiameter*PI;
     // Above gives distance in inches
     //(for each count, a rotation of the wheel travels
     //the diameter in inches times PI)
     distanceTrip1/=inchesPerFoot*feetPerMile; //converts to distance in miles
     distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
     totalDistance=distanceTrip1+distanceTrip2;
     System.out.println("Trip 1 was "+distanceTrip1+" miles");
     System.out.println("Trip 2 was "+distanceTrip2+" miles");
     System.out.println("The total distance was "+totalDistance+" miles");
    }
    
}