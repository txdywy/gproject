package com.google.android.finsky.cm;

public final class com.google.android.finsky.cm.aa implements com.google.android.finsky.packagemanager.c
{

    public final com.google.android.finsky.cm.d a;
    public final String b;
    public final com.google.android.finsky.cm.y c;

    aa(com.google.android.finsky.cm.y p0, com.google.android.finsky.cm.d p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    private final void b() {
        enter this.c;
        try {
            this.c.c(this.b);
            exit this.c;
            return;
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
    }

    public final void a() {
        this.b();
        this.a.a();
    }

    public final void a(int p0, Throwable p1) {
        enter this.c;
        try {
            this.b();
            this.a.a(p0, p1);
            exit this.c;
            return;
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
    }

}
