package com.google.android.finsky.activities;

import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.dg implements com.google.android.finsky.dfemodel.w
{

    public final com.google.android.finsky.activities.de a;

    dg(com.google.android.finsky.activities.de p0) {
        this.a = p0;
    }

    public final void m_() {
        if (this.a.a == 0)
            this.a.a(this.a.d.b());
        else
            FinskyLog.a("Ignoring soft TTL refresh.", new Object[0]);
    }

}
