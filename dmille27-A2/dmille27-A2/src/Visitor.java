public class Visitor extends Person 
{
    private String membership_type;
    private boolean has_fast_pass;

    public Visitor() {
        // default constructor
    }

    public Visitor(String first_name, String last_name, int age, String membership_type, boolean has_fast_pass) 
    {
        super(first_name, last_name, age);
        this.membership_type = membership_type;
        this.has_fast_pass = has_fast_pass;
    }

    public String get_membership_type() {
        return membership_type;
    }

    public void set_membership_type(String membership_type) {
        this.membership_type = membership_type;
    }

    public boolean get_has_fast_pass() {
        return has_fast_pass;
    }

    public void set_has_fast_pass(boolean has_fast_pass) {
        this.has_fast_pass = has_fast_pass;
    }
}