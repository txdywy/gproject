package com.google.android.finsky.appdiscoveryservice.b;

import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import java.util.Map;

public final class com.google.android.finsky.appdiscoveryservice.b.l implements Comparator
{

    public final Map a;

    l(Map p0) {
        this.a = p0;
    }

    public final int compare(Object p0, Object p1) {
        return ((String)this.a.get(((InstantAppInfo)p0).a())).compareTo((String)this.a.get(((InstantAppInfo)p1).a()));
    }

}
