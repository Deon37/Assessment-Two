public class Ride 
{
    private String ride_name;
    private int minimum_height;
    private Employee operator;

    public Ride() {
        // default constructor
    }

    public Ride(String ride_name, int minimum_height, Employee operator)
    {
        this.ride_name = ride_name;
        this.minimum_height = minimum_height;
        this.operator = operator;
    }

    public String get_ride_name() {
        return ride_name;
    }

    public void set_ride_name(String ride_name) {
        this.ride_name = ride_name;
    }

    public int get_minimum_height() {
        return minimum_height;
    }

    public void set_minimum_height(int minimum_height) {
        this.minimum_height = minimum_height;
    }

    public Employee get_operator() {
        return operator;
    }

    public void set_operator(Employee operator) {
        this.operator = operator;
    }
}