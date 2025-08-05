public abstract class Person 
{
    private String first_name;
    private String last_name;
    private int age;

    public Person() {
        // default constructor
    }

    public Person(String first_name, String last_name, int age) 
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    // Getters and setters
    public String get_first_name() { 
        return first_name; 
    }

    public void set_first_name(String first_name) { 
        this.first_name = first_name;
    }

    public String get_last_name() { 
        return last_name; 
    }

    public void set_last_name(String last_name) { 
        this.last_name = last_name; 
    }

    public int get_age() { 
        return age; 
    }

    public void set_age(int age) { 
        this.age = age; 
    }
}