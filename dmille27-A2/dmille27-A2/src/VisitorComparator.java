import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> 
{
    @Override
    public int compare(Visitor v1, Visitor v2)
    {
        // we use membership type & name variables to compare
        int compare_result = v1.get_membership_type().compareTo(v2.get_membership_type());

        // if membership type result is same then we must use names as fallback
        if (compare_result  == 0) {
            compare_result = v1.get_first_name().compareTo(v2.get_first_name());
        }
        
        return compare_result;
    }
}