package com.google.android.finsky.deviceconfig;

import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.C0660x;
import com.android.volley.ServerError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.wireless.android.b.a.a;
import com.google.wireless.android.finsky.dfe.e.a.d;
import com.google.wireless.android.finsky.dfe.e.a.e;
import com.google.wireless.android.finsky.dfe.nano.gt;
import com.google.wireless.android.p360b.p361a.C6333b;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class C2693e {
    public static C2693e f14830a;
    public C1463g f14831b;
    public C1461c f14832c;
    public C2701n f14833d;
    public C1289l f14834e;
    public String f14835f;
    public String f14836g;
    public ArrayList f14837h;

    public C2693e() {
        ((C1377d) C3947d.m18649a(C1377d.class)).mo1813a(this);
    }

    public abstract String mo3111a(String str);

    public abstract void mo3112a(C1254c c1254c);

    public abstract void mo3113a(String str, String str2);

    public abstract String mo3114b();

    public abstract C6333b mo3115c();

    public static synchronized C2693e m14552a() {
        C2693e c2693e;
        synchronized (C2693e.class) {
            if (f14830a == null) {
                f14830a = new C2705r();
            }
            c2693e = f14830a;
        }
        return c2693e;
    }

    public final void m14562a(C1254c c1254c, C1050j c1050j, boolean z, boolean z2) {
        CharSequence charSequence = null;
        if (c1254c.mo1620b() != null) {
            charSequence = mo3111a(c1254c.mo1636c());
        }
        if ((z && TextUtils.isEmpty(r0)) || z2) {
            m14563a(c1254c, false, c1050j);
        } else {
            c1050j.mo1306a();
        }
    }

    public final synchronized String m14570d() {
        if (this.f14835f == null) {
            this.f14835f = ab.m21687b(mo3115c());
        }
        return this.f14835f;
    }

    public final synchronized String m14571e() {
        if (this.f14836g == null) {
            this.f14836g = ab.m21687b(mo3116f());
        }
        return this.f14836g;
    }

    static String m14553a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, new StringBuilder(String.valueOf(str).length() + 16).append("No support for ").append(str).append("?").toString(), e);
            return null;
        }
    }

    public final String m14567b(String str) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21667d("Should not pass an empty accountName", new Object[0]);
            return null;
        }
        String b = mo3114b();
        if (b != null) {
            return C2693e.m14553a(new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(str).length()).append(b).append("-").append(str).toString().getBytes(), "SHA256");
        }
        FinskyLog.m21667d("Android id should not be null", new Object[0]);
        return null;
    }

    private final e m14557c(String str) {
        e eVar = null;
        if (!TextUtils.isEmpty(m14567b(str))) {
            eVar = new e();
            String b = m14567b(str);
            if (b == null) {
                throw new NullPointerException();
            }
            eVar.b |= 1;
            eVar.c = b;
        }
        return eVar;
    }

    public a mo3116f() {
        return null;
    }

    protected gt mo3117g() {
        return null;
    }

    final void m14563a(C1254c c1254c, boolean z, C1050j c1050j) {
        C2698k c2698k = new C2698k(c1254c, z, c1050j);
        if (this.f14837h == null) {
            this.f14837h = new ArrayList();
        }
        this.f14837h.add(c2698k);
        if (this.f14837h.size() == 1) {
            m14555b(c2698k);
        }
    }

    final void m14564a(C2698k c2698k) {
        if (this.f14837h == null || this.f14837h.size() == 0) {
            FinskyLog.m21669e("Empty request queue", new Object[0]);
            return;
        }
        if (((C2698k) this.f14837h.remove(0)) != c2698k) {
            FinskyLog.m21669e("Completed request mismatch", new Object[0]);
        }
        if (this.f14837h.size() > 0) {
            m14555b((C2698k) this.f14837h.get(0));
        }
    }

    private final void m14555b(C2698k c2698k) {
        C6333b c6333b;
        String a;
        a f;
        gt g;
        e eVar;
        e eVar2 = null;
        C1254c c1254c = c2698k.f14852a;
        C1050j c1050j = c2698k.f14854c;
        C2482j dc = this.f14831b.dc();
        if (c2698k.f14853b) {
            c6333b = null;
        } else {
            try {
                c6333b = mo3115c();
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Exception while getting device configuration.", new Object[0]);
                if (c1050j != null) {
                    c1050j.mo1307a(new ServerError());
                }
                m14564a(c2698k);
                return;
            }
        }
        try {
            a = this.f14833d.m14578a();
        } catch (Throwable e2) {
            FinskyLog.m21663b(e2, "Exception while getting gcm registration id.", new Object[0]);
            a = null;
        }
        if (!(c2698k.f14853b || !((Boolean) C0955b.fW.m28964b()).booleanValue() || this.f14832c.dj().mo2294a(12605648))) {
            try {
                f = mo3116f();
            } catch (Throwable e22) {
                FinskyLog.m21663b(e22, "Exception while getting data service subscriber.", new Object[0]);
            }
            if (!c2698k.f14853b && ((Boolean) C0955b.jG.m28964b()).booleanValue()) {
                g = mo3117g();
                if (!c2698k.f14853b) {
                    try {
                        if (!TextUtils.isEmpty(c1254c.mo1636c())) {
                            eVar2 = m14557c(c1254c.mo1636c());
                        }
                        eVar = eVar2;
                    } catch (Throwable e222) {
                        FinskyLog.m21663b(e222, "Unable to get user identifier", new Object[0]);
                    }
                    c1254c.mo1560a(c6333b, a, f, g, eVar, (C0660x) new C2696h(this, dc, a, c6333b, c1254c, c1050j, c2698k), new C2697i(this, dc, c1050j, c2698k));
                }
                eVar = null;
                c1254c.mo1560a(c6333b, a, f, g, eVar, (C0660x) new C2696h(this, dc, a, c6333b, c1254c, c1050j, c2698k), new C2697i(this, dc, c1050j, c2698k));
            }
            g = null;
            if (c2698k.f14853b) {
                if (TextUtils.isEmpty(c1254c.mo1636c())) {
                    eVar2 = m14557c(c1254c.mo1636c());
                }
                eVar = eVar2;
                c1254c.mo1560a(c6333b, a, f, g, eVar, (C0660x) new C2696h(this, dc, a, c6333b, c1254c, c1050j, c2698k), new C2697i(this, dc, c1050j, c2698k));
            }
            eVar = null;
            c1254c.mo1560a(c6333b, a, f, g, eVar, (C0660x) new C2696h(this, dc, a, c6333b, c1254c, c1050j, c2698k), new C2697i(this, dc, c1050j, c2698k));
        }
        f = null;
        try {
            g = mo3117g();
        } catch (Throwable e2222) {
            FinskyLog.m21663b(e2222, "Unable to get extra device config", new Object[0]);
        }
        if (c2698k.f14853b) {
            if (TextUtils.isEmpty(c1254c.mo1636c())) {
                eVar2 = m14557c(c1254c.mo1636c());
            }
            eVar = eVar2;
            c1254c.mo1560a(c6333b, a, f, g, eVar, (C0660x) new C2696h(this, dc, a, c6333b, c1254c, c1050j, c2698k), new C2697i(this, dc, c1050j, c2698k));
        }
        eVar = null;
        c1254c.mo1560a(c6333b, a, f, g, eVar, (C0660x) new C2696h(this, dc, a, c6333b, c1254c, c1050j, c2698k), new C2697i(this, dc, c1050j, c2698k));
    }

    public final void m14561a(C1254c c1254c, C1050j c1050j) {
        d dVar = new d();
        String str;
        try {
            String a = this.f14833d.m14578a();
            if (a == null) {
                throw new NullPointerException();
            }
            e[] eVarArr;
            dVar.a |= 1;
            dVar.b = a;
            str = a;
            ArrayDeque a2 = this.f14834e.m7700a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                e c = m14557c(((C1254c) it.next()).mo1636c());
                if (c != null) {
                    arrayList.add(c);
                }
            }
            if (arrayList.size() > 0) {
                eVarArr = (e[]) arrayList.toArray(new e[arrayList.size()]);
            } else {
                eVarArr = null;
            }
            c1254c.mo1567a(dVar, eVarArr, new C2694f(str, c1050j), new C2695g(c1050j));
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Exception while getting gcm registration id.", new Object[0]);
            str = null;
        }
    }

    public static int m14551a(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public static int m14554b(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public static int m14556c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public static int m14558d(int i) {
        switch (i & 15) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public final ArrayDeque m14568b(C1254c c1254c) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = this.f14834e.m7700a(false).iterator();
        while (it.hasNext()) {
            C1254c c1254c2 = (C1254c) it.next();
            if (mo3111a(c1254c2.mo1636c()) == null) {
                arrayDeque.add(c1254c2);
            }
        }
        if (!arrayDeque.isEmpty()) {
            return arrayDeque;
        }
        if (!(c1254c == null || c1254c.mo1620b() == null || arrayDeque.contains(c1254c))) {
            arrayDeque.add(c1254c);
        }
        return arrayDeque;
    }
}
