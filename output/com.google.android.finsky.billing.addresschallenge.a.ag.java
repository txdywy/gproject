package com.google.android.finsky.billing.addresschallenge.a;

import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.ag implements Comparator
{

    public final Map a;

    ag(Map p0) {
        this.a = p0;
    }

    public final int compare(Object p0, Object p1) {
        return ((Integer)this.a.get((com.google.android.finsky.billing.addresschallenge.a.d)p0)).intValue() - ((Integer)this.a.get((com.google.android.finsky.billing.addresschallenge.a.d)p1)).intValue();
    }

}
