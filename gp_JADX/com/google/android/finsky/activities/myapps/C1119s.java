package com.google.android.finsky.activities.myapps;

import com.google.android.finsky.activities.gt;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.utils.ac;

public final class C1119s {
    public final int f7064a;
    public final String f7065b;
    public final String f7066c;
    public gt f7067d;
    public ac f7068e;
    public ai f7069f;
    public C2730u f7070g;

    public C1119s(int i, String str, ad adVar, int i2, String str2) {
        this.f7064a = i;
        this.f7065b = str;
        this.f7066c = str2;
        this.f7069f = new ai(i2, null, adVar);
    }

    public C1119s(String str, ad adVar) {
        this(-2, str, adVar, 455, null);
    }
}
