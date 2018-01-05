package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0690f;
import com.android.volley.C0700r;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.p354b.C6322j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class C6320d implements C6319q, C1294w {
    public final C0700r f31554a;
    public final o f31555b;
    public final u f31556c;
    public final HashMap f31557d;
    public final HashMap f31558e;
    public final Handler f31559f;
    public final by f31560g;
    public final C1455n f31561h;
    public final C1454l f31562i;
    public ab f31563j;
    public Runnable f31564k;
    public boolean f31565l;
    public aa f31566m;
    public C1279z f31567n;
    public int f31568o;

    public C6320d(C0700r c0700r, by byVar, C1455n c1455n, boolean z, int i) {
        this(c0700r, byVar, c1455n, z, i, 1, null);
    }

    public C6320d(C0700r c0700r, by byVar, C1455n c1455n, boolean z, int i, int i2, C1454l c1454l) {
        o oVar;
        this.f31557d = new HashMap();
        this.f31558e = new HashMap();
        this.f31559f = new Handler(Looper.getMainLooper());
        this.f31568o = 100;
        this.f31554a = c0700r;
        int max = Math.max(((Integer) C6322j.f31611y.m28964b()).intValue(), i / 6);
        if (z) {
            this.f31556c = new bv(i, max);
        } else {
            this.f31556c = new b(i, max);
        }
        this.f31560g = byVar;
        this.f31561h = c1455n;
        this.f31562i = c1454l;
        if (i2 > 1) {
            oVar = new o(i2);
        } else {
            oVar = null;
        }
        this.f31555b = oVar;
    }

    public final void mo1676a(C1279z c1279z) {
        this.f31567n = c1279z;
    }

    public final u mo1670a() {
        return this.f31556c;
    }

    public final void mo1674a(aa aaVar) {
        this.f31566m = aaVar;
    }

    public final void mo1675a(ab abVar) {
        this.f31563j = abVar;
    }

    public final void mo1673a(int i) {
        List arrayList = new ArrayList();
        for (String str : this.f31557d.keySet()) {
            C0656n c0656n = ((bu) this.f31557d.get(str)).b;
            if (c0656n == null || c0656n.m4369c() < i) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            this.f31557d.remove((String) obj);
        }
    }

    public final void mo1678b() {
        this.f31556c.a();
    }

    public final x mo1671a(String str, int i, int i2, y yVar) {
        return mo1672a(str, i, i2, true, yVar, false);
    }

    public final x mo1677b(String str, int i, int i2, y yVar) {
        return mo1672a(str, i, i2, false, yVar, false);
    }

    public final x mo1672a(String str, int i, int i2, boolean z, y yVar, boolean z2) {
        String a;
        if (i > 0 || i2 > 0) {
            a = bf.a(str, i, i2);
        } else {
            a = str;
        }
        m mVar = new m(str, a, str, i, i2, Config.RGB_565, ScaleType.CENTER_INSIDE, z2);
        if (TextUtils.isEmpty(str)) {
            return new j(this, null, mVar, null);
        }
        v vVar;
        v vVar2;
        if (z2) {
            vVar = null;
        } else {
            vVar = this.f31556c.a(str, i, i2);
        }
        if (vVar == null || vVar.a == null || !vVar.a.isRecycled()) {
            vVar2 = vVar;
        } else {
            vVar2 = null;
        }
        if (vVar2 != null) {
            int i3 = (vVar2.b == i && vVar2.c == i2) ? 1 : 0;
            br brVar = bp.m28936a().f31547c;
            if (brVar != null) {
                i3 |= brVar.a();
            }
            if (i3 != 0) {
                if (this.f31567n != null) {
                    this.f31567n.mo1666a();
                }
                return new j(this, vVar2.a, mVar, null);
            }
        }
        Bitmap bitmap = null;
        if (z && vVar2 != null) {
            bitmap = vVar2.a;
        }
        if (this.f31567n != null) {
            this.f31567n.mo1668a(bitmap != null);
        }
        x jVar = new j(this, bitmap, mVar, yVar);
        if (z && bitmap == null && this.f31563j != null) {
            this.f31563j.mo2358a(jVar, this.f31556c);
        }
        bu buVar = (bu) this.f31557d.get(a);
        if (buVar != null) {
            buVar.a.add(jVar);
        } else if (this.f31555b == null) {
            C0656n kVar;
            this.f31560g.m28937a((i * i2) * 2);
            C0660x eVar = new e(this, mVar);
            C0657w fVar = new f(this, a);
            if (this.f31561h == null) {
                kVar = new k(mVar, eVar, fVar);
            } else {
                kVar = this.f31561h.mo2009a(mVar, eVar, fVar);
            }
            if (this.f31566m != null) {
                kVar.f4038m = new C0690f(this.f31566m.mo2012a(), 2, 2.0f);
            }
            this.f31554a.m4510a(kVar);
            this.f31557d.put(a, new bu(kVar, jVar));
        } else {
            C0656n btVar;
            bu buVar2 = new bu(null, jVar);
            C0657w gVar = new g(this, a);
            o oVar = this.f31555b;
            by byVar = this.f31560g;
            if (this.f31562i == null) {
                btVar = new bt(mVar, gVar, oVar, this, byVar, buVar2);
            } else {
                btVar = this.f31562i.mo2008a(mVar, gVar, oVar, this, byVar, buVar2);
            }
            buVar2.b = btVar;
            if (this.f31566m != null) {
                btVar.f4038m = new C0690f(this.f31566m.mo2012a(), 2, 2.0f);
            }
            this.f31554a.m4510a(btVar);
            this.f31557d.put(a, buVar2);
        }
        return jVar;
    }

    public final void mo5389a(Bitmap bitmap, m mVar) {
        m28954b(bitmap, mVar);
    }

    public final void mo5390a(String str) {
        m28955b(str);
    }

    final void m28954b(Bitmap bitmap, m mVar) {
        if (mVar.h) {
            PlayCommonLog.a("%s is not cached", new Object[]{mVar.b});
        } else {
            this.f31556c.a(mVar.c, mVar.d, mVar.e, bitmap);
        }
        bu buVar = (bu) this.f31557d.remove(mVar.b);
        if (buVar != null) {
            buVar.d = bitmap;
            if (this.f31568o == 0) {
                m28941b(buVar);
            } else {
                m28940a(mVar.b, buVar);
            }
            PlayCommonLog.f("Loaded bitmap %s", new Object[]{buVar.b.mo1545d()});
        }
    }

    final void m28955b(String str) {
        bu buVar = (bu) this.f31557d.remove(str);
        if (buVar != null) {
            if (this.f31568o == 0) {
                m28941b(buVar);
            } else {
                m28940a(str, buVar);
            }
            C0656n c0656n = buVar.b;
            String d = c0656n != null ? c0656n.mo1545d() : "<null request>";
            PlayCommonLog.f("Bitmap error %s", new Object[]{d});
        }
    }

    private final void m28940a(String str, bu buVar) {
        this.f31558e.put(str, buVar);
        if (this.f31564k == null) {
            this.f31564k = new i(this);
            this.f31559f.postDelayed(this.f31564k, (long) this.f31568o);
        }
    }

    private final void m28941b(bu buVar) {
        this.f31559f.post(new h(this, buVar));
    }

    final void m28949a(bu buVar) {
        if (this.f31567n != null) {
            this.f31567n.mo1667a(buVar.b);
        }
        List list = buVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) list.get(i);
            jVar.a = buVar.d;
            if (jVar.b != null) {
                jVar.b.a(jVar);
            }
        }
    }
}
