package com.google.android.finsky.instantappsbackendclient;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class C3565a {
    public final String f17837a;
    public final Uri f17838b;
    public final Map f17839c;
    public final String f17840d;
    public final int f17841e;

    public C3565a(String str, int i, String str2, Uri uri, Map map, List list) {
        this.f17837a = str2;
        this.f17838b = uri;
        this.f17839c = Collections.unmodifiableMap(map);
        Collections.unmodifiableList(list);
        this.f17840d = str;
        this.f17841e = i;
    }
}
