package parking.lot.system;

/**
 * information obout amount free parking space
 * int maxParkingSpace - max amount parking space;
 * int occupiedParkingSpace - amount accupied parking space;
 * author Mikhailo Tyurin
 */
public class ParkingLot {

    int maxParkingSpace;
    int occupiedParkingSpace;

    public int freParkingSpace() {
      return maxParkingSpace-occupiedParkingSpace;
    }
}
