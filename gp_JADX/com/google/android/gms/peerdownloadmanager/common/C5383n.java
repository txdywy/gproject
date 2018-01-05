package com.google.android.gms.peerdownloadmanager.common;

public final class C5383n {
    public final C5371a f27964a;
    public final String f27965b;

    public C5383n(C5371a c5371a, String str) {
        this.f27964a = c5371a;
        this.f27965b = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27964a);
        String str = this.f27965b;
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(str).length()).append("ResourceId(").append(valueOf).append(", ").append(str).append(")").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5383n c5383n = (C5383n) obj;
        if (this.f27964a.equals(c5383n.f27964a) && this.f27965b.equals(c5383n.f27965b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27964a.hashCode() * 31) + this.f27965b.hashCode();
    }
}
