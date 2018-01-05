package com.google.android.play.utils.p146c;

public final class C6446b implements C6444c {
    public final int f32411a;
    public final int f32412b;
    public final float f32413c;
    public final float f32414d;
    public final float f32415e;
    public final float f32416f;

    public C6446b(int i, float f, int i2, float f2) {
        if (i == i2) {
            throw new IllegalArgumentException("Latencies cannot be equal");
        }
        this.f32413c = Math.max(f, f2);
        this.f32414d = Math.min(f, f2);
        this.f32416f = (f - f2) / ((float) (i - i2));
        this.f32415e = f - (this.f32416f * ((float) i));
        this.f32411a = Math.max(i, i2);
        this.f32412b = Math.min(i, i2);
    }

    public final float mo5445a(int i) {
        if (i > this.f32411a) {
            return m29495b(this.f32411a);
        }
        if (i < this.f32412b) {
            return m29495b(this.f32412b);
        }
        return m29495b(i);
    }

    public final float mo5444a() {
        return this.f32413c;
    }

    public final float mo5446b() {
        return this.f32414d;
    }

    private final float m29495b(int i) {
        return (this.f32416f * ((float) i)) + this.f32415e;
    }
}
