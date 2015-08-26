package com.harry;

import java.util.Comparator;

/**
 * Created by hsingh on 8/26/15.
 */
public class PersonComparable implements Comparable<PersonComparable>  {
    String name;
    String city;
    int age;

    public PersonComparable(String name, String city, int age) {
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

        @Override
    public int compareTo(PersonComparable another) {
            //for age comparison
//        if( this.age==(another.getAge()))
//            return 0;
//        else if (this.age > another.getAge()) {
//            return 1;
//        }  else
//            return -1;
            
            //for string comparisons
            //sorting under sorted identities like name
            if (this.getName().equals(another.getName())) {
                return this.getAge()-another.getAge();
            }
            return this.getName().compareTo(another.getName());
//        return another.getName().compareTo(this.getName());
        }

}
