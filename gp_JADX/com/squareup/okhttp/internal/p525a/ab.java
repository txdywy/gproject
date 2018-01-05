package com.squareup.okhttp.internal.p525a;

import java.util.List;
import p526e.C7726f;
import p526e.C7728j;
import p526e.C7740w;

final class ab {
    public final C7726f f39396a;

    ab(C7726f c7726f) {
        this.f39396a = c7726f;
    }

    final void m36694a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7728j d = ((C7636x) list.get(i)).f39545h.mo6521d();
            Integer num = (Integer) C7638z.f39554b.get(d);
            if (num != null) {
                m36692a(num.intValue() + 1, 15);
                m36693a(((C7636x) list.get(i)).f39546i);
            } else {
                C7726f c7726f = this.f39396a;
                C7740w b = c7726f.m37387b(1);
                byte[] bArr = b.f40221a;
                int i2 = b.f40223c;
                b.f40223c = i2 + 1;
                bArr[i2] = (byte) 0;
                c7726f.f40188c++;
                m36693a(d);
                m36693a(((C7636x) list.get(i)).f39546i);
            }
        }
    }

    private final void m36692a(int i, int i2) {
        if (i < i2) {
            C7726f c7726f = this.f39396a;
            int i3 = i | 0;
            C7740w b = c7726f.m37387b(1);
            byte[] bArr = b.f40221a;
            int i4 = b.f40223c;
            b.f40223c = i4 + 1;
            bArr[i4] = (byte) i3;
            c7726f.f40188c++;
            return;
        }
        c7726f = this.f39396a;
        i3 = i2 | 0;
        b = c7726f.m37387b(1);
        bArr = b.f40221a;
        i4 = b.f40223c;
        b.f40223c = i4 + 1;
        bArr[i4] = (byte) i3;
        c7726f.f40188c++;
        int i5 = i - i2;
        while (i5 >= 128) {
            i3 = i5 & 127;
            C7726f c7726f2 = this.f39396a;
            i3 |= 128;
            C7740w b2 = c7726f2.m37387b(1);
            byte[] bArr2 = b2.f40221a;
            int i6 = b2.f40223c;
            b2.f40223c = i6 + 1;
            bArr2[i6] = (byte) i3;
            c7726f2.f40188c++;
            i5 >>>= 7;
        }
        C7726f c7726f3 = this.f39396a;
        b = c7726f3.m37387b(1);
        bArr = b.f40221a;
        i4 = b.f40223c;
        b.f40223c = i4 + 1;
        bArr[i4] = (byte) i5;
        c7726f3.f40188c++;
    }

    private final void m36693a(C7728j c7728j) {
        m36692a(c7728j.mo6522e(), 127);
        C7726f c7726f = this.f39396a;
        if (c7728j == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c7728j.mo6516a(c7726f);
    }
}
