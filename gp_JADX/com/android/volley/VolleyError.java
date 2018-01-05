package com.android.volley;

public class VolleyError extends Exception {
    public final C0697m f4022b;
    public long f4023c;

    public VolleyError() {
        this.f4022b = null;
    }

    public VolleyError(C0697m c0697m) {
        this.f4022b = c0697m;
    }

    public VolleyError(String str) {
        super(str);
        this.f4022b = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.f4022b = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f4022b = null;
    }
}
