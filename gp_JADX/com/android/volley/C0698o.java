package com.android.volley;

final class C0698o implements Runnable {
    public final /* synthetic */ String f4172a;
    public final /* synthetic */ long f4173b;
    public final /* synthetic */ C0656n f4174c;

    C0698o(C0656n c0656n, String str, long j) {
        this.f4174c = c0656n;
        this.f4172a = str;
        this.f4173b = j;
    }

    public final void run() {
        this.f4174c.f4026a.m4486a(this.f4172a, this.f4173b);
        this.f4174c.f4026a.m4485a(toString());
    }
}
