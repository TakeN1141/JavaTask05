package fmi.informatics.comparators;

import fmi.informatics.extending.Person;

public class NameDescendingComparator extends PersonComparator {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getName().equals(person2.getName())) {
            return 0;
        } else {
            return (person1.getName().compareTo(person2.getName()) * (-1 *sortOrder));
        }
    }
}
