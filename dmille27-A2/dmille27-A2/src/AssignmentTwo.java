public class AssignmentTwo 
{
    public static void main(String[] args) 
    {
        partThree(); // Tested & Works
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

        // Remove One From Queue
        roller_coaster.removeVisitorFromQueue();

        // Print Queue
        roller_coaster.printQueue();
    }


    public void partFourA() 
    {

    }

    public void partFourB()
    {

    }

    public void partFive()
    {

    }

    public void partSix()
    {

    }

    public void partSeven()
    {
        
    }
}