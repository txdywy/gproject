package com.google.android.gms.gcm;

public final class C5204j {
    public static final C5204j f26251a = new C5204j(0);
    public final int f26252b;
    public final int f26253c = 30;
    public final int f26254d = 3600;

    static {
        C5204j c5204j = new C5204j(1);
    }

    private C5204j(int i) {
        this.f26252b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5204j)) {
            return false;
        }
        C5204j c5204j = (C5204j) obj;
        return c5204j.f26252b == this.f26252b && c5204j.f26253c == this.f26253c && c5204j.f26254d == this.f26254d;
    }

    public final int hashCode() {
        return (((((this.f26252b + 1) ^ 1000003) * 1000003) ^ this.f26253c) * 1000003) ^ this.f26254d;
    }

    public final String toString() {
        int i = this.f26252b;
        int i2 = this.f26253c;
        return "policy=" + i + " initial_backoff=" + i2 + " maximum_backoff=" + this.f26254d;
    }
}
