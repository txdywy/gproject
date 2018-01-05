package com.google.android.finsky.az;

import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class com.google.android.finsky.az.b implements Runnable
{

    public final String a;
    public final com.google.android.finsky.az.a b;

    b(com.google.android.finsky.az.a p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        FinskyLog.a("Request cache cleared.", new Object[0]);
        enter this.b;
        try {
            this.b.b.put(this.a, Boolean.valueOf(1));
            exit this.b;
            return;
            exit this.b;
        }
        catch (Throwable ex) {
            exit this.b;
            throw ex;
        }
    }

}
