package com.android.volley;

public class C0690f implements C0689z {
    public int f4150a;
    public int f4151b;
    public final int f4152c;
    public final float f4153d;

    public C0690f() {
        this(2500, 1, 1.0f);
    }

    public C0690f(int i, int i2, float f) {
        this.f4150a = i;
        this.f4152c = i2;
        this.f4153d = f;
    }

    public final int mo1077a() {
        return this.f4150a;
    }

    public final int mo1079b() {
        return this.f4151b;
    }

    public void mo1078a(VolleyError volleyError) {
        this.f4151b++;
        this.f4150a = (int) (((float) this.f4150a) + (((float) this.f4150a) * this.f4153d));
        if ((this.f4151b <= this.f4152c ? 1 : null) == null) {
            throw volleyError;
        }
    }
}
