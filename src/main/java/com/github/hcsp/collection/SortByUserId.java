package com.github.hcsp.collection;

import java.util.Comparator;

public class SortByUserId implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        if (u1.getAge() > u2.getAge()) {
            return 1;
        }
        return -1;
    }
}

