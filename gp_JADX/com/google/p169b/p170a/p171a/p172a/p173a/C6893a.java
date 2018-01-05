package com.google.p169b.p170a.p171a.p172a.p173a;

final class C6893a extends C6892z {
    public final int f34017a;
    public final String f34018b;

    C6893a(int i, String str) {
        this.f34017a = i;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f34018b = str;
    }

    public final int mo5745a() {
        return this.f34017a;
    }

    public final String mo5746b() {
        return this.f34018b;
    }

    public final String toString() {
        int i = this.f34017a;
        String str = this.f34018b;
        return new StringBuilder(String.valueOf(str).length() + 42).append("Entry{packageId=").append(i).append(", packageName=").append(str).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6892z)) {
            return false;
        }
        C6892z c6892z = (C6892z) obj;
        if (this.f34017a == c6892z.mo5745a() && this.f34018b.equals(c6892z.mo5746b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f34017a ^ 1000003) * 1000003) ^ this.f34018b.hashCode();
    }
}
