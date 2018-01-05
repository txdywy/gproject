package com.google.android.gms.gcm;

public final class C5202h extends C5201k {
    public long f26247a;
    public long f26248b;

    public C5202h() {
        this.f26247a = -1;
        this.f26248b = -1;
        this.g = false;
    }

    public final C5202h m23984a(long j, long j2) {
        this.f26247a = j;
        this.f26248b = j2;
        return this;
    }

    public final C5202h m23985a(Class cls) {
        this.d = cls.getName();
        return this;
    }

    protected final void mo4640a() {
        super.mo4640a();
        if (this.f26247a == -1 || this.f26248b == -1) {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        } else if (this.f26247a >= this.f26248b) {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }
    }

    public final OneoffTask m23987b() {
        mo4640a();
        return new OneoffTask(this);
    }
}
