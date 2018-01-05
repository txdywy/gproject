package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.io.Serializable;

public final class bw extends bx implements Serializable {
    public final ag f34319a;
    public final ag f34320b;

    public static bw m31774a(Comparable comparable, Comparable comparable2) {
        return new bw(ag.m31702b(comparable), ag.m31702b(comparable2));
    }

    private bw(ag agVar, ag agVar2) {
        this.f34319a = (ag) C6937m.m31623a((Object) agVar);
        this.f34320b = (ag) C6937m.m31623a((Object) agVar2);
        if (agVar.mo5871a(agVar2) > 0 || agVar == ah.f34281b || agVar2 == aj.f34282b) {
            String str = "Invalid range: ";
            String valueOf = String.valueOf(bw.m31775a(agVar, agVar2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public final boolean m31777a(Comparable comparable) {
        C6937m.m31623a((Object) comparable);
        return this.f34319a.mo5874a(comparable) && !this.f34320b.mo5874a(comparable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        if (this.f34319a.equals(bwVar.f34319a) && this.f34320b.equals(bwVar.f34320b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34319a.hashCode() * 31) + this.f34320b.hashCode();
    }

    public final String toString() {
        return bw.m31775a(this.f34319a, this.f34320b);
    }

    private static String m31775a(ag agVar, ag agVar2) {
        StringBuilder stringBuilder = new StringBuilder(16);
        agVar.mo5873a(stringBuilder);
        stringBuilder.append("..");
        agVar2.mo5875b(stringBuilder);
        return stringBuilder.toString();
    }

    static int m31776b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static {
        bw bwVar = new bw(aj.f34282b, ah.f34281b);
    }
}
