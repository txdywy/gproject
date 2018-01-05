package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C5091z;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class bz {
    public static final Status f25780a = new Status(8, "The connection to Google Play services was lost");
    public static final ct[] f25781b = new ct[0];
    public final Set f25782c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final cc f25783d = new ca(this);
    public C5091z f25784e;
    public final Map f25785f;

    public bz(Map map) {
        this.f25785f = map;
    }

    final void m23509a(ct ctVar) {
        this.f25782c.add(ctVar);
        ctVar.m23069a(this.f25783d);
    }
}
