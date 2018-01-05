package com.google.android.finsky.activities;

import java.util.HashMap;

public final class com.google.android.finsky.activities.fh implements Comparator
{

    public final HashMap a;

    fh(HashMap p0) {
        this.a = p0;
    }

    public final int compare(Object p0, Object p1) {
        return ((String)this.a.get((String)p0)).compareTo((String)this.a.get((String)p1));
    }

}
