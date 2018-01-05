package com.google.android.gms.internal;

import java.util.Map.Entry;

final class vv implements Comparable, Entry {
    public final Comparable f27576a;
    public Object f27577b;
    public /* synthetic */ vq f27578c;

    vv(vq vqVar, Comparable comparable, Object obj) {
        this.f27578c = vqVar;
        this.f27576a = comparable;
        this.f27577b = obj;
    }

    vv(vq vqVar, Entry entry) {
        this(vqVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean m25807a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((vv) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m25807a(this.f27576a, entry.getKey()) && m25807a(this.f27577b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f27576a;
    }

    public final Object getValue() {
        return this.f27577b;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f27576a == null ? 0 : this.f27576a.hashCode();
        if (this.f27577b != null) {
            i = this.f27577b.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f27578c.m25805d();
        Object obj2 = this.f27577b;
        this.f27577b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27576a);
        String valueOf2 = String.valueOf(this.f27577b);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}
