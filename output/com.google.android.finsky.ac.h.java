package com.google.android.finsky.ac;

import com.google.android.finsky.by.h;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.ac.h implements com.google.android.finsky.by.m
{

    public final com.google.android.finsky.ac.e a;

    h(com.google.android.finsky.ac.e p0) {
        this.a = p0;
    }

    public final void a(String p0) {
        if (com.google.android.finsky.by.h.a.equals(p0)) {
            FinskyLog.a("App library has changed, requesting content sync.", new Object[0]);
            this.a.a();
        }
    }

}
