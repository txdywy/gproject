package com.google.android.gms.peerdownloadmanager.comms.p294a;

public final class C5405h implements C5400g {
    public final String f28028a;
    public final int f28029b;

    public C5405h(String str, int i) {
        this.f28028a = str;
        this.f28029b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5405h c5405h = (C5405h) obj;
        if (this.f28029b != c5405h.f28029b) {
            return false;
        }
        if (this.f28028a != null) {
            return this.f28028a.equals(c5405h.f28028a);
        }
        if (c5405h.f28028a != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f28028a != null ? this.f28028a.hashCode() : 0) * 31) + this.f28029b;
    }

    public final String toString() {
        String str = this.f28028a;
        return new StringBuilder(String.valueOf(str).length() + 18).append("TCP{").append(str).append(", ").append(this.f28029b).append("}").toString();
    }

    public final String mo4985a() {
        return this.f28028a;
    }
}
