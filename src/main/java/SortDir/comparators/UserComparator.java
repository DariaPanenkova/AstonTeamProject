package SortDir.comparators;

import DataClasses.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getName().compareTo(o2.getName())!=0)
            return o1.getName().compareTo(o2.getName());
        else if ((o1.getMail().compareTo(o2.getMail())!=0))
            return o1.getMail().compareTo(o2.getMail());
        else return o1.getPassword().compareTo(o2.getPassword());
    }
}
//сделать проверку на null?