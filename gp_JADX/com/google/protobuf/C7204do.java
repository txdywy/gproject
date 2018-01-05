package com.google.protobuf;

import java.util.Map.Entry;

final class C7204do implements Comparable, Entry {
    public final Comparable f35357a;
    public Object f35358b;
    public final /* synthetic */ dh f35359c;

    C7204do(dh dhVar, Entry entry) {
        this(dhVar, (Comparable) entry.getKey(), entry.getValue());
    }

    C7204do(dh dhVar, Comparable comparable, Object obj) {
        this.f35359c = dhVar;
        this.f35357a = comparable;
        this.f35358b = obj;
    }

    public final Object getValue() {
        return this.f35358b;
    }

    public final Object setValue(Object obj) {
        this.f35359c.m33295e();
        Object obj2 = this.f35358b;
        this.f35358b = obj;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (C7204do.m33298a(this.f35357a, entry.getKey()) && C7204do.m33298a(this.f35358b, entry.getValue())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f35357a == null ? 0 : this.f35357a.hashCode();
        if (this.f35358b != null) {
            i = this.f35358b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35357a);
        String valueOf2 = String.valueOf(this.f35358b);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean m33298a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    public final /* synthetic */ Object getKey() {
        return this.f35357a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C7204do) obj).getKey());
    }
}
