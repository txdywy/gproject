package com.firebase.jobdispatcher;

import java.util.List;

public final class ao {
    public static final aj f4673a = new aj();

    public static ai m4829a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Window start can't be less than 0");
        } else if (i2 >= i) {
            return new ai(i, i2);
        } else {
            throw new IllegalArgumentException("Window end can't be less than window start");
        }
    }

    public static ah m4828a(List list) {
        if (list != null && !list.isEmpty()) {
            return new ah(list);
        }
        throw new IllegalArgumentException("Uris must not be null or empty.");
    }
}
