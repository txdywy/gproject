package com.google.android.finsky.dialogbuilder.p154b;

import android.os.Bundle;
import com.google.wireless.android.finsky.dfe.c.a.ad;
import java.util.ArrayList;

public final class C2792h {
    public final Bundle f15092a = new Bundle();
    public C2781i f15093b;

    public C2792h(Bundle bundle) {
        if (bundle != null && bundle.containsKey("DialogUserInputModel")) {
            this.f15092a.putAll(bundle.getBundle("DialogUserInputModel"));
        }
    }

    public final void m14869a(String str) {
        this.f15092a.remove(str);
    }

    public final void m14870a(String str, String str2) {
        this.f15092a.putString(str, str2);
    }

    public final String m14872b(String str) {
        return this.f15092a.getString(str);
    }

    public final boolean m14874c(String str) {
        return this.f15092a.containsKey(str);
    }

    public final ad[] m14871a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15092a.keySet()) {
            String string = this.f15092a.getString(str);
            ad adVar = new ad();
            if (str == null) {
                throw new NullPointerException();
            }
            adVar.b |= 1;
            adVar.c = str;
            if (string == null) {
                throw new NullPointerException();
            }
            adVar.b |= 2;
            adVar.d = string;
            arrayList.add(adVar);
        }
        return (ad[]) arrayList.toArray(new ad[arrayList.size()]);
    }

    public final void m14873b() {
        if (this.f15093b != null) {
            this.f15093b.mo3136b();
        }
    }
}
