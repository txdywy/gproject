package com.google.protobuf;

final class ck extends cl {
    public final /* synthetic */ cj f35273a;

    ck(cj cjVar) {
        this.f35273a = cjVar;
    }

    final long mo6163a(int i) {
        int i2 = this.f35273a.f35255c - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i2 + i3) >>> 1;
            long j = this.f35273a.f35253a + ((long) (i4 << 4));
            int a = ea.f35383g.mo6205a(j);
            if (i == a) {
                return j;
            }
            if (i < a) {
                i2 = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }
}
