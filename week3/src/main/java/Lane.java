import java.util.Arrays;
import java.util.Objects;
import java.util.Iterator;


public class Lane {
    private int id;
    private Car[] parkedCars;
    private final static int MAX_AMOUNT_OF_CARS_IN_LANE = 23;

    public Lane(int id)
    {
        this.id = id;
        this.parkedCars = new Car[MAX_AMOUNT_OF_CARS_IN_LANE];
    }

    //Getters & Setters
    public void setParkedCars()
    {
        this.parkedCars = parkedCars;
    }

    public Car getCar(int index)
    {
        return this.parkedCars[index];
    }

    public int getAmountOfCarsInLane()
    {
        int counter = 0;
        for(int i =0; i < parkedCars.length; i++)
        {
            if(this.parkedCars[i] != null)//checks if array is empty
            {
                counter++;
            }
        }
        return counter;
    }

    //methods
    /**
     * Method that parks a car in the lane
     * @param car
     * @return returns a String if the car is parked or not
     */
    public String parkCar(Car car){
        for(int parkingNumber = 0; parkingNumber < parkedCars.length; parkingNumber++)
        {
            if(this.parkedCars[parkingNumber] == null)
            {
                this.parkedCars[parkingNumber] = car;
                return "Car is parked";
            }
        }
        return "Car couldnt park, het was een vrouw";
    }

    /**
     * Method that removes a car from the lane by license plate
     * @param licensePlate
     * @return true or false if car is removed or not
     */
    public boolean removeCarByLicensePlate(String licensePlate) {
        Iterator<Car> it = Arrays.stream(parkedCars).iterator();
        while(it.hasNext()) {
            Car car = it.next();
            if (car == null)
            {
                return false;
            }
            if (car.getLicensePlate().equals(licensePlate)) {
                this.parkedCars[Arrays.asList(this.parkedCars).indexOf(car)] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * method that checks is a parkingspot is free or occupied
     * @param parkingNumber
     * @return "Free" if the parkingspot is free | "Occupied" if the parkingspot is occupied
     */
    public String getSpotAvailability(int parkingNumber){
        return (this.parkedCars[parkingNumber] == null && parkingNumber < this.MAX_AMOUNT_OF_CARS_IN_LANE  ? "Free" : "Occupied");
    }
}
