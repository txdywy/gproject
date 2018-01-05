package com.google.android.finsky.instantapps.p218e;

final class C3455c implements Runnable {
    public final /* synthetic */ String f17632a;
    public final /* synthetic */ C3426j f17633b;
    public final /* synthetic */ C3454b f17634c;

    C3455c(C3454b c3454b, String str, C3426j c3426j) {
        this.f17634c = c3454b;
        this.f17632a = str;
        this.f17633b = c3426j;
    }

    public final void run() {
        Object obj = null;
        for (C3451h c3451h : this.f17634c.f17627b) {
            if (obj != null) {
                break;
            }
            String a = c3451h.mo3531a(this.f17632a);
        }
        if (obj != null) {
            this.f17634c.f17630e.put(C3454b.m17012a(this.f17632a), obj);
            this.f17634c.m17014a(this.f17632a, this.f17633b);
        }
    }
}
