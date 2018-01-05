package com.google.common.flogger;

import com.google.common.flogger.p423b.C7011b;

final class C7063k {
    public final C7065m f34572a;
    public final String f34573b;

    C7063k(C7065m c7065m, String str) {
        this.f34572a = (C7065m) C7011b.m31954a(c7065m, "log site");
        this.f34573b = (String) C7011b.m31954a(str, "log site key");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7063k)) {
            return false;
        }
        C7063k c7063k = (C7063k) obj;
        if (this.f34572a.equals(c7063k.f34572a) && this.f34573b.equals(c7063k.f34573b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34572a.hashCode() ^ this.f34573b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34572a);
        String str = this.f34573b;
        return new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(str).length()).append("SpecializedLogSiteKey{ logSite=").append(valueOf).append(", extraKey='").append(str).append("' }").toString();
    }
}
