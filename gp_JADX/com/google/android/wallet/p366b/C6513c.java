package com.google.android.wallet.p366b;

import android.support.v4.h.h;
import android.support.v4.h.u;
import com.google.a.a.a.a.b.a.b.a.i;
import com.google.a.a.a.a.b.a.b.a.k;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.q;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.y;
import com.google.android.wallet.common.util.C6591c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Locale;

public final class C6513c implements C6511g, C6512i {
    public final h f32569a;
    public final h f32570b;
    public final h f32571c;
    public final h f32572d;
    public final h f32573e;
    public final u f32574f;
    public final ArrayDeque f32575g = new ArrayDeque();
    public boolean f32576h = false;
    public C6514d f32577i;

    public C6513c(k kVar) {
        int i = 0;
        Object obj = (kVar == null || kVar.b == null) ? null : 1;
        if (obj != null) {
            i = kVar.b.length;
        }
        this.f32569a = new h(i);
        this.f32570b = new h(i);
        this.f32571c = new h(i);
        this.f32572d = new h(i);
        this.f32574f = new u(i);
        this.f32573e = new h(kVar != null ? kVar.c.length : 0);
        if (obj != null) {
            int i2 = 0;
            i[] iVarArr = kVar.b;
            int length = iVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                i iVar = iVarArr[i3];
                int i4 = i2;
                for (t tVar : iVar.d) {
                    C6515e c6515e = new C6515e(tVar, i4);
                    if (this.f32574f.containsKey(c6515e)) {
                        throw new IllegalStateException("TriggerValueKey already exists");
                    }
                    this.f32574f.put(c6515e, iVar);
                    ArrayList arrayList = (ArrayList) this.f32570b.a(tVar.c);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f32570b.a(tVar.c, arrayList);
                    }
                    arrayList.add(c6515e);
                    i4++;
                }
                for (l lVar : iVar.e) {
                    this.f32572d.a(lVar.d, Boolean.valueOf(true));
                }
                i3++;
                i2 = i4;
            }
            for (y yVar : kVar.c) {
                this.f32572d.a(yVar.b, Boolean.valueOf(true));
                this.f32573e.a(yVar.b, yVar);
                m29554a(yVar.b, (C6511g) this);
                for (long a : yVar.c) {
                    this.f32572d.a(a, Boolean.valueOf(true));
                }
            }
        }
    }

    public final void m29554a(long j, C6511g c6511g) {
        this.f32571c.a(j, c6511g);
    }

    public final void mo5460a(C6515e c6515e) {
        if (this.f32576h) {
            this.f32575g.add(c6515e);
        } else {
            mo5461b(c6515e);
        }
    }

    public final boolean mo5461b(C6515e c6515e) {
        if (this.f32576h) {
            throw new IllegalStateException("Triggers for result cannot occur before graph is initialized.");
        }
        int i;
        i iVar = (i) this.f32574f.get(c6515e);
        for (t tVar : iVar.d) {
            if (!C6516f.m29565a(tVar, c6515e.f32578a)) {
                C6508h c6508h = (C6508h) this.f32569a.a(tVar.c);
                if (c6508h == null || !c6508h.mo5457a(tVar)) {
                    i = 0;
                    break;
                }
            }
        }
        i = 1;
        if (i == 0) {
            return false;
        }
        for (l lVar : iVar.e) {
            C6511g c6511g = (C6511g) this.f32571c.a(lVar.d);
            if (c6511g == null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Resulting action component not found: %d", new Object[]{Long.valueOf(lVar.d)}));
            }
            c6511g.mo5459a(lVar, iVar.d);
        }
        if (this.f32577i != null) {
            this.f32577i.m29558a();
        }
        return true;
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        y yVar = (y) this.f32573e.a(lVar.d);
        if (yVar == null) {
            throw new IllegalArgumentException("Can not handle resulting action for component " + lVar.d);
        }
        switch (lVar.c) {
            case 12:
                q qVar;
                long[] jArr = yVar.c;
                if (lVar.a == 2) {
                    qVar = lVar.g;
                } else {
                    qVar = null;
                }
                m29553a(jArr, qVar, tVarArr);
                return;
            default:
                throw new IllegalArgumentException("Unsupported resulting action type: " + lVar.c);
        }
    }

    private final void m29553a(long[] jArr, q qVar, t[] tVarArr) {
        if (qVar.c != 2 && qVar.c != 1) {
            throw new IllegalArgumentException("Unsupported modify component list type " + qVar.c);
        } else if (qVar.b == 1 || qVar.b == 2) {
            for (long j : jArr) {
                boolean a = C6591c.m29907a(qVar.a, j);
                if (qVar.c != 1 || a) {
                    C6511g c6511g = (C6511g) this.f32571c.a(j);
                    l lVar = new l();
                    lVar.d = j;
                    int i;
                    if (a) {
                        if (qVar.b == 1) {
                            i = 1;
                        } else {
                            i = 11;
                        }
                        lVar.c = i;
                    } else {
                        if (qVar.b == 1) {
                            i = 11;
                        } else {
                            i = 1;
                        }
                        lVar.c = i;
                    }
                    c6511g.mo5459a(lVar, tVarArr);
                }
            }
        } else {
            throw new IllegalArgumentException("Unsupported modify type " + qVar.b);
        }
    }
}
