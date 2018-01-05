package com.google.android.gms.gcm;

public final class C5203i extends C5201k {
    public long f26249a;
    public long f26250b;

    public C5203i() {
        this.f26249a = -1;
        this.f26250b = -1;
        this.g = true;
    }

    protected final void mo4640a() {
        super.mo4640a();
        if (this.f26249a == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (this.f26249a <= 0) {
            throw new IllegalArgumentException("Period set cannot be less than or equal to 0: " + this.f26249a);
        } else if (this.f26250b == -1) {
            this.f26250b = (long) (((float) this.f26249a) * 0.1f);
        } else if (this.f26250b > this.f26249a) {
            this.f26250b = this.f26249a;
        }
    }
}
