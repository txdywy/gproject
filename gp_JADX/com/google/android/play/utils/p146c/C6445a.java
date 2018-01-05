package com.google.android.play.utils.p146c;

public final class C6445a implements C6444c {
    public final C6444c f32407a;
    public final float f32408b;
    public final int f32409c;
    public final float f32410d;

    public C6445a(C6444c c6444c, int i) {
        this.f32407a = c6444c;
        if (i < 2) {
            throw new IllegalArgumentException("numBuckets must be greater than 1");
        }
        this.f32409c = i;
        float a = this.f32407a.mo5444a() - this.f32407a.mo5446b();
        this.f32408b = a / ((float) this.f32409c);
        this.f32410d = a / ((float) (this.f32409c - 1));
    }

    public final float mo5445a(int i) {
        float a = this.f32407a.mo5445a(i);
        if (this.f32408b == 0.0f) {
            return a;
        }
        float b = mo5446b();
        return (this.f32410d * ((float) Math.min((long) (this.f32409c - 1), (long) Math.floor((double) ((a - b) / this.f32408b))))) + b;
    }

    public final float mo5444a() {
        return this.f32407a.mo5444a();
    }

    public final float mo5446b() {
        return this.f32407a.mo5446b();
    }
}
