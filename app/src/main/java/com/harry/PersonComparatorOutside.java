package com.harry;

import java.util.Comparator;

/**
 * Created by hsingh on 8/26/15.
 */
public class PersonComparatorOutside implements Comparator<PersonComparatorInside> {
    @Override
    public int compare(PersonComparatorInside p1, PersonComparatorInside p2) {
       //sorting under sorted identities like name
        if (p1.getName().equals(p2.getName())) {
            return p1.getAge()-p2.getAge();
        }
        return p1.getName().compareTo(p2.getName());
    }

}
