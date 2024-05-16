class Vehicle {

    private String model;

    private String make;

    private String color;


    private int Vin;

    private int year;

    private int odometer;


    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return Vin;
    }

    public void setVin(int vin) {
        Vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", Vin=" + Vin +
                ", year=" + year +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }

    public Vehicle(String model, String make, String color, int vin, int year, int odometer, double price) {
        this.model = model;
        this.make = make;
        this.color = color;
        Vin = vin;
        this.year = year;
        this.odometer = odometer;
        this.price = price;


    }

    public void add(Vehicle vehicle) {


    }
}

