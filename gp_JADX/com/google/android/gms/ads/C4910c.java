package com.google.android.gms.ads;

public final class C4910c {
    public final int f25268a;
    public final int f25269b;
    public final String f25270c;

    static {
        C4910c c4910c = new C4910c(320, 50, "320x50_mb");
        c4910c = new C4910c(468, 60, "468x60_as");
        c4910c = new C4910c(320, 100, "320x100_as");
        c4910c = new C4910c(728, 90, "728x90_as");
        c4910c = new C4910c(300, 250, "300x250_as");
        c4910c = new C4910c(160, 600, "160x600_as");
        c4910c = new C4910c(-1, -2, "smart_banner");
        c4910c = new C4910c(-3, -4, "fluid");
        c4910c = new C4910c(50, 50, "50x50_mb");
        c4910c = new C4910c(-3, 0, "search_v2");
    }

    private C4910c(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f25268a = i;
            this.f25269b = i2;
            this.f25270c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4910c)) {
            return false;
        }
        C4910c c4910c = (C4910c) obj;
        return this.f25268a == c4910c.f25268a && this.f25269b == c4910c.f25269b && this.f25270c.equals(c4910c.f25270c);
    }

    public final int hashCode() {
        return this.f25270c.hashCode();
    }

    public final String toString() {
        return this.f25270c;
    }
}
