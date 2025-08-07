public class AssignmentTwo 
{
    public static void main(String[] args) 
    {
        //partThree();
        //partFourA();
        //partFourB();
        partFive(); // tested and fixed output
    }

    public static void partThree()
    {
        Employee operator = new Employee("Deon", "Miller", 32, "Ride Operator", "E123");
        Ride roller_coaster = new Ride("Roller Coaster", 120, operator, 2);

        // 5 Visitors
        Visitor v1 = new Visitor("Jack", "Smith", 14, "Gold", true);
        Visitor v2 = new Visitor("Sharon", "Lee", 13, "Gold", true);
        Visitor v3 = new Visitor("Benny", "Wong", 15, "Gold", true);
        Visitor v4 = new Visitor("Leo", "Tim", 12, "Regular", false);
        Visitor v5 = new Visitor("Jason", "Taylor", 16, "Gold", true);

        roller_coaster.addVisitorToQueue(v1);
        roller_coaster.addVisitorToQueue(v2);
        roller_coaster.addVisitorToQueue(v3);
        roller_coaster.addVisitorToQueue(v4);
        roller_coaster.addVisitorToQueue(v5);

        roller_coaster.removeVisitorFromQueue();

        roller_coaster.printQueue();
    }

    static public void partFourA() 
    {
        Employee operator = new Employee("Deon", "Miller", 32, "Ride Operator", "E123");
        Ride roller_coaster = new Ride("Roller Coaster", 120, operator, 2);

         // 5 Visitors
        Visitor v1 = new Visitor("Jack", "Smith", 14, "Gold", true);
        Visitor v2 = new Visitor("Sharon", "Lee", 13, "Gold", true);
        Visitor v3 = new Visitor("Benny", "Wong", 15, "Gold", true);
        Visitor v4 = new Visitor("Leo", "Tim", 12, "Regular", false);
        Visitor v5 = new Visitor("Jason", "Taylor", 16, "Gold", true);

        roller_coaster.addVisitorToHistory(v1);
        roller_coaster.addVisitorToHistory(v2);
        roller_coaster.addVisitorToHistory(v3);
        roller_coaster.addVisitorToHistory(v4);
        roller_coaster.addVisitorToHistory(v5);

        boolean found = roller_coaster.checkVisitorFromHistory(v3);
        System.out.println(v3.get_first_name() + " is in ride history: " + found);

        int total = roller_coaster.numberOfVisitors();
        System.out.println("total visitors in ride history: " + total);

        roller_coaster.printRideHistory();
    }


    static public void partFourB()
    {
        Employee operator = new Employee("Deon", "Miller", 32, "Ride Operator", "E123");
        Ride roller_coaster = new Ride("Roller Coaster", 120, operator, 2);

        // 5 Visitors
        Visitor v1 = new Visitor("Jack", "Smith", 14, "Gold", true);
        Visitor v2 = new Visitor("Sharon", "Lee", 13, "Gold", true);
        Visitor v3 = new Visitor("Benny", "Wong", 15, "Gold", true);
        Visitor v4 = new Visitor("Leo", "Tim", 12, "Regular", false);
        Visitor v5 = new Visitor("Jason", "Taylor", 16, "Gold", true);

        roller_coaster.addVisitorToHistory(v1);
        roller_coaster.addVisitorToHistory(v2);
        roller_coaster.addVisitorToHistory(v3);
        roller_coaster.addVisitorToHistory(v4);
        roller_coaster.addVisitorToHistory(v5);

        System.out.println("visitors before sorting");
        roller_coaster.printRideHistory();

        roller_coaster.sortRideHistory(); // call sort

        System.out.println("visitors after sorting");
        roller_coaster.printRideHistory();
    }

    static public void partFive()
    {
        Employee operator = new Employee("Deon", "Miller", 32, "Ride Operator", "E123");
        Ride roller_coaster = new Ride("Roller Coaster", 120, operator, 2);

        Visitor v1 = new Visitor("Jack", "Smith", 14, "Gold", true);
        Visitor v2 = new Visitor("Sharon", "Lee", 13, "Gold", true);
        Visitor v3 = new Visitor("Benny", "Wong", 15, "Gold", true);
        Visitor v4 = new Visitor("Leo", "Tim", 12, "Regular", false);
        Visitor v5 = new Visitor("Jason", "Taylor", 16, "Gold", true);

        Visitor v6 = new Visitor("Isabella", "Clark", 15, "Gold", true);
        Visitor v7 = new Visitor("Elijah", "Martin", 12, "Gold", true);
        Visitor v8 = new Visitor("Sophia", "Hall", 14, "Regular", false);
        Visitor v9 = new Visitor("James", "Allen", 13, "Gold", true);
        Visitor v10 = new Visitor("Mia", "Young", 16, "Gold", true);

        roller_coaster.addVisitorToQueue(v1);
        roller_coaster.addVisitorToQueue(v2);
        roller_coaster.addVisitorToQueue(v3);
        roller_coaster.addVisitorToQueue(v4);
        roller_coaster.addVisitorToQueue(v5);
        roller_coaster.addVisitorToQueue(v6);
        roller_coaster.addVisitorToQueue(v7);
        roller_coaster.addVisitorToQueue(v8);
        roller_coaster.addVisitorToQueue(v9);
        roller_coaster.addVisitorToQueue(v10);

        roller_coaster.printQueue();

        roller_coaster.runOneCycle();

        roller_coaster.printQueue();

        System.out.println("\nvisitors who have been on the ride");
        roller_coaster.printRideHistory();
    }   

    public void partSix()
    {

    }

    public void partSeven()
    {
        
    }
}