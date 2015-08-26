package com.harry;

import java.util.Comparator;

/**
 * Created by hsingh on 8/26/15.
 */
public class PersonComparatorInside {
    String name;
    String city;
    int age;

    public PersonComparatorInside(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<PersonComparatorInside> comparatorInside = new Comparator<PersonComparatorInside>() {
        @Override
        public int compare(PersonComparatorInside p1, PersonComparatorInside p2) {
//            return p1.getName().compareTo(p2.getName());
            return p1.getAge()-(p2.getAge());
        }
    };
}
