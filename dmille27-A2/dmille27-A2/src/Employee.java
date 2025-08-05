public class Employee extends Person 
{
    private String position;
    private String employee_id;

    public Employee() {
        // default constructor
    }

    public Employee(String first_name, String last_name, int age, String position, String employee_id) 
    {
        super(first_name, last_name, age);
        this.position = position;
        this.employee_id = employee_id;
    }

    public String get_position() {
        return position;
    }

    public void set_position(String position) {
        this.position = position;
    }

    public String get_employee_id() {
        return employee_id;
    }

    public void set_employee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}