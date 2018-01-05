package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class da extends C7203j {
    public static final int[] f35323d;
    public final int f35324e;
    public final C7203j f35325f;
    public final C7203j f35326g;
    public final int f35327h;
    public final int f35328i;

    da(C7203j c7203j, C7203j c7203j2) {
        this.f35325f = c7203j;
        this.f35326g = c7203j2;
        this.f35327h = c7203j.mo6170a();
        this.f35324e = this.f35327h + c7203j2.mo6170a();
        this.f35328i = Math.max(c7203j.mo6179e(), c7203j2.mo6179e()) + 1;
    }

    static C7203j m33220a(C7203j c7203j, C7203j c7203j2) {
        if (c7203j2.mo6170a() == 0) {
            return c7203j;
        }
        if (c7203j.mo6170a() == 0) {
            return c7203j2;
        }
        int a = c7203j2.mo6170a() + c7203j.mo6170a();
        if (a < 128) {
            return m33221b(c7203j, c7203j2);
        }
        if (c7203j instanceof da) {
            da daVar = (da) c7203j;
            if (daVar.f35326g.mo6170a() + c7203j2.mo6170a() < 128) {
                return new da(daVar.f35325f, m33221b(daVar.f35326g, c7203j2));
            } else if (daVar.f35325f.mo6179e() > daVar.f35326g.mo6179e() && daVar.mo6179e() > c7203j2.mo6179e()) {
                return new da(daVar.f35325f, new da(daVar.f35326g, c7203j2));
            }
        }
        if (a >= f35323d[Math.max(c7203j.mo6179e(), c7203j2.mo6179e()) + 1]) {
            return new da(c7203j, c7203j2);
        }
        db dbVar = new db();
        dbVar.m33235a(c7203j);
        dbVar.m33235a(c7203j2);
        C7203j c7203j3 = (C7203j) dbVar.f35329a.pop();
        while (!dbVar.f35329a.isEmpty()) {
            c7203j3 = new da((C7203j) dbVar.f35329a.pop(), c7203j3);
        }
        return c7203j3;
    }

    private static C7203j m33221b(C7203j c7203j, C7203j c7203j2) {
        int a = c7203j.mo6170a();
        int a2 = c7203j2.mo6170a();
        byte[] bArr = new byte[(a + a2)];
        c7203j.m33212a(bArr, 0, 0, a);
        c7203j2.m33212a(bArr, 0, a, a2);
        return C7203j.m33200a(bArr);
    }

    public final byte mo6169a(int i) {
        C7203j.m33204b(i, this.f35324e);
        if (i < this.f35327h) {
            return this.f35325f.mo6169a(i);
        }
        return this.f35326g.mo6169a(i - this.f35327h);
    }

    public final int mo6170a() {
        return this.f35324e;
    }

    protected final int mo6179e() {
        return this.f35328i;
    }

    protected final boolean mo6181f() {
        return this.f35324e >= f35323d[this.f35328i];
    }

    public final C7203j mo6172a(int i, int i2) {
        int c = C7203j.m33205c(i, i2, this.f35324e);
        if (c == 0) {
            return C7203j.f35320a;
        }
        if (c == this.f35324e) {
            return this;
        }
        if (i2 <= this.f35327h) {
            return this.f35325f.mo6172a(i, i2);
        }
        if (i >= this.f35327h) {
            return this.f35326g.mo6172a(i - this.f35327h, i2 - this.f35327h);
        }
        C7203j c7203j = this.f35325f;
        return new da(c7203j.mo6172a(i, c7203j.mo6170a()), this.f35326g.mo6172a(0, i2 - this.f35327h));
    }

    protected final void mo6176b(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.f35327h) {
            this.f35325f.mo6176b(bArr, i, i2, i3);
        } else if (i >= this.f35327h) {
            this.f35326g.mo6176b(bArr, i - this.f35327h, i2, i3);
        } else {
            int i4 = this.f35327h - i;
            this.f35325f.mo6176b(bArr, i, i2, i4);
            this.f35326g.mo6176b(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    final void mo6174a(C7195i c7195i) {
        this.f35325f.mo6174a(c7195i);
        this.f35326g.mo6174a(c7195i);
    }

    protected final String mo6173a(Charset charset) {
        byte[] bArr;
        int a = mo6170a();
        if (a == 0) {
            bArr = bb.f35209b;
        } else {
            bArr = new byte[a];
            mo6176b(bArr, 0, 0, a);
        }
        return new String(bArr, charset);
    }

    public final boolean mo6177c() {
        if (this.f35326g.mo6171a(this.f35325f.mo6171a(0, 0, this.f35327h), 0, this.f35326g.mo6170a()) == 0) {
            return true;
        }
        return false;
    }

    protected final int mo6171a(int i, int i2, int i3) {
        if (i2 + i3 <= this.f35327h) {
            return this.f35325f.mo6171a(i, i2, i3);
        }
        if (i2 >= this.f35327h) {
            return this.f35326g.mo6171a(i, i2 - this.f35327h, i3);
        }
        int i4 = this.f35327h - i2;
        return this.f35326g.mo6171a(this.f35325f.mo6171a(i, i2, i4), 0, i3 - i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7203j)) {
            return false;
        }
        C7203j c7203j = (C7203j) obj;
        if (this.f35324e != c7203j.mo6170a()) {
            return false;
        }
        if (this.f35324e == 0) {
            return true;
        }
        int i = this.f35322c;
        int i2 = c7203j.f35322c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        Iterator dcVar = new dc(this);
        C7203j c7203j2 = (C7210p) dcVar.next();
        Iterator dcVar2 = new dc(c7203j);
        C7203j c7203j3 = (C7210p) dcVar2.next();
        int i3 = 0;
        C7203j c7203j4 = c7203j2;
        int i4 = 0;
        i = 0;
        while (true) {
            boolean a;
            int a2 = c7203j4.mo6170a() - i4;
            int a3 = c7203j3.mo6170a() - i3;
            int min = Math.min(a2, a3);
            if (i4 == 0) {
                a = c7203j4.mo6223a(c7203j3, i3, min);
            } else {
                a = c7203j3.mo6223a(c7203j4, i4, min);
            }
            if (!a) {
                return false;
            }
            i2 = i + min;
            if (i2 >= this.f35324e) {
                break;
            }
            if (min == a2) {
                c7203j4 = (C7210p) dcVar.next();
                i4 = 0;
            } else {
                i4 += min;
            }
            if (min == a3) {
                c7203j3 = (C7210p) dcVar2.next();
                i3 = 0;
                i = i2;
            } else {
                i3 += min;
                i = i2;
            }
        }
        if (i2 == this.f35324e) {
            return true;
        }
        throw new IllegalStateException();
    }

    protected final int mo6175b(int i, int i2, int i3) {
        if (i2 + i3 <= this.f35327h) {
            return this.f35325f.mo6175b(i, i2, i3);
        }
        if (i2 >= this.f35327h) {
            return this.f35326g.mo6175b(i, i2 - this.f35327h, i3);
        }
        int i4 = this.f35327h - i2;
        return this.f35326g.mo6175b(this.f35325f.mo6175b(i, i2, i4), 0, i3 - i4);
    }

    public final C7225s mo6178d() {
        return C7225s.m33628a(new dd(this));
    }

    static {
        int i = 1;
        List arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        f35323d = new int[arrayList.size()];
        for (i2 = 0; i2 < f35323d.length; i2++) {
            f35323d[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
    }
}
