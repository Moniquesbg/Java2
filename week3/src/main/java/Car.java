public class Car {
    //fields
    private String licensePlate;
    private String color;

    //constructor
    public Car(String licensePlate, String color)
    {
        this.licensePlate = licensePlate;
        this.color = color;
    }

    //Getters&Setters
    public String getLicensePlate()
    {
        return this.licensePlate;
    }

    public void setLicensePlate()
    {
        this.licensePlate = licensePlate;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor()
    {
        this.color = color;
    }
}
