package com.google.android.finsky.instantapps.appmanagement;

import android.util.Log;
import com.google.android.finsky.instantapps.p214b.C3379a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import java.util.Collections;
import java.util.List;

final class C3399s implements C3379a {
    public final C3600b f17408a;
    public final List f17409b;
    public final C5710a f17410c;

    C3399s(C3600b c3600b, C5710a c5710a, List list) {
        this.f17408a = c3600b;
        this.f17409b = Collections.unmodifiableList(list);
        this.f17410c = c5710a;
    }

    public final /* synthetic */ Object call() {
        this.f17410c.mo5136a(2110);
        for (String str : this.f17409b) {
            Log.d("InstantAppUpdates", new StringBuilder(String.valueOf(str).length() + 30).append("Marking ").append(str).append(" available for update.").toString());
            this.f17408a.m17195a(str, true);
            this.f17410c.mo5136a(2111);
        }
        this.f17410c.mo5136a(2112);
        return Boolean.valueOf(true);
    }
}
