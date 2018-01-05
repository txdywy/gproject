package com.google.android.finsky.scheduler;

final class C4033g {
    public long f20292a;
    public int f20293b;
    public boolean f20294c;
    public boolean f20295d;

    public C4033g(C4033g c4033g) {
        this.f20292a = c4033g.f20292a;
        this.f20293b = c4033g.f20293b;
        this.f20294c = c4033g.f20294c;
        this.f20295d = c4033g.f20295d;
    }

    public final String toString() {
        boolean z = true;
        long j = this.f20292a;
        boolean z2 = this.f20294c;
        boolean z3 = this.f20295d;
        boolean z4 = (this.f20293b & 2) != 0;
        boolean z5 = (this.f20293b & 8) != 0;
        if ((this.f20293b & 4) == 0) {
            z = false;
        }
        return "DeviceState{currentTime=" + j + ", isCharging=" + z2 + ", isIdle=" + z3 + ", netAny=" + z4 + ", netNotRoaming=" + z5 + ", netUnmetered=" + z + '}';
    }
}
