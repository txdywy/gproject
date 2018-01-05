package com.google.android.gms.internal;

public abstract class wu extends wz {
    public ww ah;

    protected int mo4701a() {
        int i = 0;
        if (this.ah == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.ah.f27647d) {
            i2 += this.ah.f27646c[i].m25917a();
            i++;
        }
        return i2;
    }

    public wu mo4948c() {
        wu wuVar = (wu) super.mo4704d();
        wy.m25924a(this, wuVar);
        return wuVar;
    }

    public /* synthetic */ Object clone() {
        return mo4948c();
    }

    public /* synthetic */ wz mo4704d() {
        return (wu) clone();
    }

    public void mo4702a(wt wtVar) {
        if (this.ah != null) {
            for (int i = 0; i < this.ah.f27647d; i++) {
                this.ah.f27646c[i].m25918a(wtVar);
            }
        }
    }

    protected final boolean m24220a(ws wsVar, int i) {
        int j = wsVar.m25881j();
        if (!wsVar.m25870b(i)) {
            return false;
        }
        byte[] bArr;
        wx wxVar;
        int i2 = i >>> 3;
        int j2 = wsVar.m25881j() - j;
        if (j2 == 0) {
            bArr = xc.f27660f;
        } else {
            bArr = new byte[j2];
            System.arraycopy(wsVar.f27632a, j + wsVar.f27633b, bArr, 0, j2);
        }
        xb xbVar = new xb(i, bArr);
        if (this.ah == null) {
            this.ah = new ww();
            wxVar = null;
        } else {
            ww wwVar = this.ah;
            j2 = wwVar.m25914b(i2);
            wxVar = (j2 < 0 || wwVar.f27646c[j2] == ww.f27644a) ? null : wwVar.f27646c[j2];
        }
        if (wxVar == null) {
            wxVar = new wx();
            ww wwVar2 = this.ah;
            j2 = wwVar2.m25914b(i2);
            if (j2 >= 0) {
                wwVar2.f27646c[j2] = wxVar;
            } else {
                j2 ^= -1;
                if (j2 >= wwVar2.f27647d || wwVar2.f27646c[j2] != ww.f27644a) {
                    if (wwVar2.f27647d >= wwVar2.f27645b.length) {
                        int a = ww.m25912a(wwVar2.f27647d + 1);
                        Object obj = new int[a];
                        Object obj2 = new wx[a];
                        System.arraycopy(wwVar2.f27645b, 0, obj, 0, wwVar2.f27645b.length);
                        System.arraycopy(wwVar2.f27646c, 0, obj2, 0, wwVar2.f27646c.length);
                        wwVar2.f27645b = obj;
                        wwVar2.f27646c = obj2;
                    }
                    if (wwVar2.f27647d - j2 != 0) {
                        System.arraycopy(wwVar2.f27645b, j2, wwVar2.f27645b, j2 + 1, wwVar2.f27647d - j2);
                        System.arraycopy(wwVar2.f27646c, j2, wwVar2.f27646c, j2 + 1, wwVar2.f27647d - j2);
                    }
                    wwVar2.f27645b[j2] = i2;
                    wwVar2.f27646c[j2] = wxVar;
                    wwVar2.f27647d++;
                } else {
                    wwVar2.f27645b[j2] = i2;
                    wwVar2.f27646c[j2] = wxVar;
                }
            }
        }
        wxVar.f27650c.add(xbVar);
        return true;
    }
}
