package com.google.android.gms.peerdownloadmanager.common;

import com.google.android.gms.peerdownloadmanager.comms.p294a.C5406i;

public final class C5371a {
    public final String f27935a;
    public final String f27936b;

    private C5371a(String str, String str2) {
        this.f27935a = str;
        this.f27936b = str2;
    }

    public static C5371a m26134a(String str, String str2) {
        return new C5371a(str, str2);
    }

    public final String toString() {
        String concat;
        if (this.f27936b.length() > 16) {
            concat = String.valueOf(this.f27936b.substring(0, 16)).concat("...");
        } else {
            concat = this.f27936b;
        }
        String a = C5406i.m26184a(this.f27935a);
        return new StringBuilder((String.valueOf(a).length() + 9) + String.valueOf(concat).length()).append("AppId(").append(a).append(", ").append(concat).append(")").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5371a c5371a = (C5371a) obj;
        if (this.f27935a.equals(c5371a.f27935a) && this.f27936b.equals(c5371a.f27936b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27935a.hashCode() * 31) + this.f27936b.hashCode();
    }
}
