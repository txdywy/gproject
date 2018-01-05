package com.google.protobuf;

final class cy {
    public final String f35318a;
    public int f35319b = 0;

    cy(String str) {
        this.f35318a = str;
    }

    final boolean m33153a() {
        return this.f35319b < this.f35318a.length();
    }

    final int m33154b() {
        String str = this.f35318a;
        int i = this.f35319b;
        this.f35319b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < '?') {
            return charAt;
        }
        i = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f35318a;
            int i3 = this.f35319b;
            this.f35319b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < '?') {
                return (charAt2 << i2) | i;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
