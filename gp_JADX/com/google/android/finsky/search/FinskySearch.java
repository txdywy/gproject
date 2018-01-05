package com.google.android.finsky.search;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.w;
import com.google.wireless.android.a.a.a.a.cm;
import com.google.wireless.android.a.a.a.a.cn;

public class FinskySearch extends PlaySearch {
    public final C2471a f20362a;
    public final Context f20363b;
    public final boolean f20364c;
    public final C4058d f20365d;
    public final int f20366e;
    public long f20367f;
    public int f20368g;
    public int f20369h;
    public AsyncTask f20370i;
    public C3748a f20371j;
    public String f20372k;
    public C2495w f20373l;

    public FinskySearch(Context context) {
        this(context, null);
    }

    public FinskySearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20362a = C1473m.f7980a.aR();
        C1552e dj = C1473m.f7980a.dj();
        this.f20363b = context;
        this.f20364c = !dj.mo2294a(12603102);
        this.f20365d = new C4058d();
        this.f20366e = ((Integer) C0955b.fb.m28964b()).intValue();
        this.f20369h = 0;
        this.f20373l = this.f20362a.m13184a(null);
    }

    public void setNavigationManager(C3748a c3748a) {
        this.f20371j = c3748a;
    }

    public void setPageLevelLoggingContext(C2495w c2495w) {
        this.f20373l = c2495w;
    }

    public void setCurrentBackendId(int i) {
        this.f20368g = i;
    }

    public void setCurrentSearchBehaviorId(int i) {
        this.f20369h = i;
    }

    public final void m18971a(String str) {
        int mode = getMode();
        super.a(str);
        C2495w c2495w;
        if (mode == 3) {
            c2495w = this.f20373l;
            if (!C1473m.f7980a.dj().mo2294a(12634278)) {
                c2495w.m13367a(new C2474c(544));
            }
        } else if (mode == 4) {
            c2495w = this.f20373l;
            if (!C1473m.f7980a.dj().mo2294a(12634278)) {
                c2495w.m13367a(new C2474c(545));
            }
        } else {
            FinskyLog.m21665c("Unknown search mode search, not logged", new Object[0]);
        }
        if (mode == 3) {
            mode = 1;
        } else {
            mode = 2;
        }
        m18967a(str, this.f20368g, this.f20369h, mode);
    }

    public final void m18969a(int i) {
        int i2 = 0;
        super.a(i);
        C2495w c2495w = this.f20373l;
        cm cmVar = new cm();
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            default:
                FinskyLog.m21669e("Unknown PlaySearchMode", new Object[0]);
                break;
        }
        cmVar.c = i2;
        cmVar.a |= 2;
        C2474c c2474c = new C2474c(543);
        c2474c.f13342a.f31700Z = cmVar;
        c2495w.m13367a(c2474c);
        if (i == 3 || i == 4) {
            m18968b();
        }
    }

    private final synchronized void m18968b() {
        this.f20367f = 0;
    }

    public final void m18972a(String str, boolean z) {
        super.a(str, z);
        if (!this.s.a() && z) {
            if (this.f20370i != null) {
                this.f20370i.cancel(true);
            }
            this.f20370i = new C4054a(this, str);
            bb.m21792a(this.f20370i, new Void[0]);
        }
    }

    public final void m18970a(w wVar) {
        C4055b c4055b = (C4055b) wVar;
        super.a(wVar);
        String str = wVar.f;
        Object obj;
        C2495w c2495w;
        cn i;
        if (c4055b.f20379c) {
            obj = this.f20372k;
            c2495w = this.f20373l;
            i = C2482j.m13314i();
            i.a(4);
            if (!TextUtils.isEmpty(obj)) {
                i.a(obj);
            }
            i.b(str);
            i.c(c4055b.f20380d);
            i.d(c4055b.f20381e);
            c2495w.m13367a(new C2474c(511).m13227a(i));
        } else {
            C4058d c4058d = this.f20365d;
            c2495w = this.f20373l;
            if (!(c4058d.f20388a == null || c4055b.f20379c)) {
                i = C2482j.m13314i();
                C4058d.m18980a(c4058d.f20388a, i);
                if (c4055b.f20378b != null && c4055b.f20378b.length > 0) {
                    byte[] bArr = c4055b.f20378b;
                    if (bArr == null) {
                        throw new NullPointerException();
                    }
                    i.a |= 64;
                    i.h = bArr;
                }
                obj = c4055b.h;
                if (TextUtils.isEmpty(obj)) {
                    i.b(str);
                } else if (obj == null) {
                    throw new NullPointerException();
                } else {
                    i.a |= 512;
                    i.k = obj;
                }
                i.c(c4055b.f20380d);
                i.d(c4055b.f20381e);
                c2495w.m13367a(new C2474c(511).m13227a(i));
            }
        }
        if (c4055b.f20377a == null) {
            m18967a(str, c4055b.f20380d, this.f20369h, 4);
            return;
        }
        if (C1473m.f7980a.dj().mo2294a(12634278)) {
            C2474c c2474c = new C2474c(550);
            c2474c.m13237a(str, null, 5, c4055b.f20380d);
            this.f20373l.m13367a(c2474c);
        }
        this.f20371j.mo3639a(c4055b.f20377a, C1473m.f7980a.dn(), this.f20363b.getPackageManager(), this.f20373l);
    }

    private final void m18967a(String str, int i, int i2, int i3) {
        b(2);
        m18968b();
        C1473m.f7980a.bg().saveRecentQuery(str, Integer.toString(i));
        if (this.f20371j != null) {
            this.f20371j.mo3663a(str, i, i2, null, i3, this.f20373l);
        }
    }
}
