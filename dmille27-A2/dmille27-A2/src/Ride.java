import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface
{
    private String ride_name;
    private int minimum_height;
    private Employee operator;

    private int max_rider;
    private int num_of_cycles = 0;

    // final just means these variables cannot be modified and are fixed
    final private Queue<Visitor> waiting_line = new LinkedList<>();
    final private LinkedList<Visitor> ride_history = new LinkedList<>();

    public Ride() {
        // default constructor
    }

    public Ride(String ride_name, int minimum_height, Employee operator, int max_rider) 
    {
        this.ride_name = ride_name;
        this.minimum_height = minimum_height;
        this.operator = operator;
        this.max_rider = max_rider;
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

    public int get_max_rider() {
        return max_rider;
    }

    public void set_max_rider(int max_rider) {
        this.max_rider = max_rider;
    }

    public int get_num_of_cycles() {
        return num_of_cycles;
    }

    // Interface Methods

    @Override
    public void addVisitorToQueue(Visitor visitor)
    {
        waiting_line.add(visitor);
        System.out.println(visitor.get_first_name() + " added to the queue");
    }

    @Override
    public void removeVisitorFromQueue() 
    {
        if (!waiting_line.isEmpty()) 
        {
            Visitor removed_visitor = waiting_line.poll();
            System.out.println(removed_visitor.get_first_name() + " removed from the queue");
        } 
        else 
        {
            System.out.println("the queue is empty");
        }
    }

    @Override
    public void printQueue() 
    {
        System.out.println("\nwaiting line for " + ride_name + ":");

        if (waiting_line.isEmpty()) 
        {
            System.out.println("no visitors in the queue");
        } 
        else
        {
            for (Visitor visitor : waiting_line)
            {
                System.out.println("- " + visitor.get_first_name());
            }
        }
    }

    @Override
    public void runOneCycle()
    {
        System.out.println("\nattempting to run one cycle for " + ride_name + "...");

        if (operator == null) {
            System.out.println("no ride operator is assigned");
            return;
        }

        if (waiting_line.isEmpty()) {
            System.out.println("no visitors in the queue");
            return;
        }

        int count = 0;
        while (!waiting_line.isEmpty() && count < max_rider) 
        {
            Visitor visitor = waiting_line.poll();
            System.out.println("- " + visitor.get_first_name() + " is taking the ride");
            addVisitorToHistory(visitor);
            count++;
        }

        num_of_cycles++;
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        ride_history.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return ride_history.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return ride_history.size();
    }

    @Override
    public void printRideHistory() 
    {
        System.out.println("ride history for " + ride_name + ":");

        if (ride_history.isEmpty())
        {
            System.out.println("no visitors have taken the ride");
        } 
        else
        {
            // we have to use iterator instead of for-loop :(
            java.util.Iterator<Visitor> iterator = ride_history.iterator();
            while (iterator.hasNext())
            {
                Visitor visitor = iterator.next();
                System.out.println("- " + visitor.get_first_name());
            }
        }
    }

    public void sortRideHistory() 
    {
        if (ride_history.isEmpty()) 
        {
            System.out.println("no visitors in ride history to sort");
        }
        else
        {
            Collections.sort(ride_history, new VisitorComparator());
            System.out.println("ride history has been sorted by membership type and first name");
        }
    }
}

interface RideInterface
{
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
}