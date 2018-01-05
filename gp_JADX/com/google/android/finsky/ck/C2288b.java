package com.google.android.finsky.ck;

import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.ey;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import java.util.List;

public final class C2288b {
    public final C0988c f11311a;
    public final C2233o f11312b;

    public C2288b(C0988c c0988c, C2233o c2233o) {
        this.f11311a = c0988c;
        this.f11312b = c2233o;
    }

    public static int m11785a(bl[] blVarArr) {
        int i = 0;
        for (bl blVar : blVarArr) {
            if (blVar.aL_()) {
                int i2 = blVar.f11926p;
                if (i2 == 1 || i2 == 7 || i2 == 3 || i2 == 4) {
                    i++;
                }
            }
        }
        return i;
    }

    public static bl m11786a(bl[] blVarArr, boolean z, C2731v c2731v) {
        bl blVar = null;
        int length = blVarArr.length;
        int i = 0;
        long j = Long.MAX_VALUE;
        while (i < length) {
            bl blVar2;
            bl blVar3 = blVarArr[i];
            if (blVar3.aL_()) {
                int i2 = blVar3.f11926p;
                if ((i2 == 1 || i2 == 7 || i2 == 3 || i2 == 4) && (c2731v == null || c2731v.m14768a(i2))) {
                    long j2 = blVar3.f11915e;
                    if ((z || j2 != 0) && j2 < r0) {
                        j = j2;
                        blVar2 = blVar3;
                        i++;
                        blVar = blVar2;
                    }
                }
            }
            blVar2 = blVar;
            i++;
            blVar = blVar2;
        }
        return blVar;
    }

    public static float m11784a(bl blVar) {
        if (!blVar.m12278d()) {
            return 0.0f;
        }
        long j = blVar.f11921k;
        long j2 = j - blVar.f11915e;
        if (j <= 0 || j2 <= 0) {
            return 0.0f;
        }
        return ((float) j2) / ((float) j);
    }

    public final bl m11788a(Document document, DfeToc dfeToc, C2196e c2196e) {
        if (document.f14885a.f12098e != 16 && document.f14885a.f12098e != 24) {
            return C2288b.m11786a(document.f14885a.f12107n, true, null);
        }
        bl a;
        ey V = document.m14633V();
        if (V == null || !V.f12336f) {
            List b = this.f11312b.m11653b(document, dfeToc, c2196e);
            int size = b.size();
            if (size > 0) {
                bl[] blVarArr;
                if (size == 1) {
                    blVarArr = ((Document) b.get(0)).f14885a.f12107n;
                } else {
                    Object obj;
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        i += ((Document) b.get(i2)).f14885a.f12107n.length;
                    }
                    Object obj2 = new bl[i];
                    int i3 = 0;
                    for (i = 0; i < size; i++) {
                        obj = ((Document) b.get(i)).f14885a.f12107n;
                        System.arraycopy(obj, 0, obj2, i3, obj.length);
                        i3 += obj.length;
                    }
                    obj = obj2;
                }
                bl a2 = C2288b.m11786a(blVarArr, false, null);
                if (a2 == null) {
                    a = C2288b.m11786a(blVarArr, true, null);
                } else {
                    a = a2;
                }
                if (a != null) {
                    return a;
                }
            }
        }
        Document bk = document.bk();
        if (bk != null) {
            a = m11789b(bk, dfeToc, c2196e);
            if (a != null && a.aL_()) {
                return a;
            }
        }
        return null;
    }

    public final bl m11789b(Document document, DfeToc dfeToc, C2196e c2196e) {
        if (document == null) {
            return null;
        }
        if ((document.f14885a.f12098e != 17 && document.f14885a.f12098e != 25) || !this.f11312b.m11649a(document, dfeToc, c2196e)) {
            return null;
        }
        for (bl blVar : document.f14885a.f12107n) {
            if (blVar.f11926p == 1) {
                return blVar;
            }
        }
        return null;
    }

    public final bl m11790c(Document document, DfeToc dfeToc, C2196e c2196e) {
        if (document.f14885a.f12098e != 16 && document.f14885a.f12098e != 24) {
            return C2288b.m11787b(document.f14885a.f12107n);
        }
        List b = this.f11312b.m11653b(document, dfeToc, c2196e);
        float f = 0.0f;
        bl blVar = null;
        int size = b.size();
        int i = 0;
        while (i < size) {
            float f2;
            bl b2 = C2288b.m11787b(((Document) b.get(i)).f14885a.f12107n);
            if (b2 != null) {
                float a = C2288b.m11784a(b2);
                if (a > f) {
                    f2 = a;
                    i++;
                    f = f2;
                    blVar = b2;
                }
            }
            b2 = blVar;
            f2 = f;
            i++;
            f = f2;
            blVar = b2;
        }
        Document bk = document.bk();
        if (bk == null) {
            return blVar;
        }
        b2 = m11789b(bk, dfeToc, c2196e);
        if (b2 == null || !b2.aL_() || C2288b.m11784a(b2) <= f) {
            return blVar;
        }
        return b2;
    }

    private static bl m11787b(bl[] blVarArr) {
        float f = 0.0f;
        bl blVar = null;
        int length = blVarArr.length;
        int i = 0;
        while (i < length) {
            float f2;
            bl blVar2 = blVarArr[i];
            float a = C2288b.m11784a(blVar2);
            if (a > f) {
                f2 = a;
            } else {
                blVar2 = blVar;
                f2 = f;
            }
            i++;
            f = f2;
            blVar = blVar2;
        }
        return blVar;
    }
}
