package com.google.protobuf;

final class ai {
    public final Object f35110a;
    public final int f35111b;

    ai(Object obj, int i) {
        this.f35110a = obj;
        this.f35111b = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f35110a) * 65535) + this.f35111b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        if (this.f35110a == aiVar.f35110a && this.f35111b == aiVar.f35111b) {
            return true;
        }
        return false;
    }
}
