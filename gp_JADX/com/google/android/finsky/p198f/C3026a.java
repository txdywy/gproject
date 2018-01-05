package com.google.android.finsky.p198f;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p264x.C4806a;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class C3026a {
    public final Context f15813a;
    public final C1461c f15814b;
    public final C3646a f15815c;
    public final C3028c f15816d;
    public final C4806a f15817e;
    public final String f15818f;
    public C2322b f15819g;
    public final boolean f15820h;
    public final boolean f15821i;
    public final boolean f15822j;
    public final boolean f15823k;
    public final boolean f15824l;
    public final String[] f15825m;
    public final boolean f15826n;
    public final boolean f15827o;
    public final long f15828p;
    public boolean f15829q;
    public String f15830r;
    public final boolean f15831s;
    public final boolean f15832t;
    public final boolean f15833u;
    public Boolean f15834v;
    public final List f15835w;
    public final C2129c f15836x;
    public List f15837y = null;

    C3026a(Context context, String str, C3646a c3646a, C2206c c2206c, C1461c c1461c, C3028c c3028c, C4806a c4806a) {
        boolean c;
        this.f15818f = str;
        this.f15813a = context;
        this.f15814b = c1461c;
        this.f15815c = c3646a;
        this.f15816d = c3028c;
        this.f15817e = c4806a;
        C3647b a = this.f15815c.m17243a(this.f15818f);
        this.f15820h = C3028c.m15630a(a);
        if (this.f15820h) {
            this.f15819g = a.f18028c;
            this.f15822j = this.f15819g.f11422g;
            this.f15823k = this.f15819g.f11423h;
            this.f15824l = this.f15819g.f11426k;
            c = this.f15815c.f18023c.mo2857c(this.f15818f);
            this.f15833u = this.f15819g.f11424i;
            c = c && !this.f15833u;
            this.f15831s = c;
            this.f15826n = this.f15816d.m15632a(this.f15819g, 12609316);
            this.f15825m = a.f18028c.f11417b;
        } else {
            this.f15822j = false;
            this.f15823k = false;
            this.f15824l = false;
            this.f15833u = false;
            this.f15831s = false;
            this.f15826n = false;
            this.f15825m = C2228f.f11114a;
        }
        this.f15835w = c2206c.mo2818b(this.f15818f, this.f15825m);
        this.f15827o = !this.f15835w.isEmpty();
        c = this.f15820h && this.f15827o;
        this.f15821i = c;
        this.f15836x = a == null ? null : a.f18029d;
        if (this.f15836x != null) {
            this.f15828p = this.f15836x.f10816j;
        } else {
            this.f15828p = 0;
        }
        this.f15830r = C3026a.m15618a(this.f15835w, C4678i.m21812a(), this.f15828p);
        this.f15829q = this.f15830r != null;
        if (!(!this.f15820h || this.f15827o || c2206c.mo2812a(this.f15818f).isEmpty())) {
            FinskyLog.m21659a("%s is installed but certificate mistmatch", this.f15818f);
        }
        c = (a == null || a.f18029d == null || TextUtils.isEmpty(a.f18029d.f10820n)) ? false : true;
        this.f15832t = c;
    }

    public final String m15620a(String str) {
        String str2;
        if (this.f15821i && this.f15836x != null) {
            str2 = this.f15836x.f10822p;
            if (C3026a.m15619a(str2, this.f15835w)) {
                return str2;
            }
        }
        if (this.f15821i && this.f15836x != null) {
            str2 = this.f15836x.f10815i;
            if (C3026a.m15619a(str2, this.f15835w)) {
                return str2;
            }
        }
        if (C3026a.m15619a(str, this.f15835w) || this.f15835w.size() <= 0) {
            return str;
        }
        return ((C2228f) this.f15835w.get(0)).f11101h;
    }

    public final boolean m15622a(Document document) {
        if (!this.f15820h || this.f15822j || this.f15821i) {
            return false;
        }
        if (!this.f15817e.mo4395a(this.f15825m, document.m14625N().f13176p) || new C3654j(this.f15814b).m17264a(document.m14625N()).m17262a(this.f15819g).m17269e() || document.ah()) {
            return false;
        }
        return true;
    }

    public final boolean m15624b(Document document) {
        return (this.f15821i || this.f15822j) && !this.f15826n && new C3654j(this.f15814b).m17264a(document.m14625N()).m17262a(this.f15819g).m17265a();
    }

    public final boolean m15621a() {
        if (!C0327a.m1721a() || !this.f15814b.dj().mo2294a(12612366)) {
            return true;
        }
        if (this.f15834v == null) {
            if (this.f15837y == null) {
                this.f15837y = C4672c.m21803a(C4680k.m21818a((String) C0955b.gP.m28964b()));
            }
            this.f15834v = Boolean.valueOf(!this.f15837y.contains(this.f15818f));
        }
        return this.f15834v.booleanValue();
    }

    public final boolean m15623b() {
        return this.f15820h && !this.f15824l && ((!this.f15822j || this.f15823k) && !m15625c());
    }

    @TargetApi(21)
    public final boolean m15625c() {
        return VERSION.SDK_INT > 21 && ((DevicePolicyManager) this.f15813a.getSystemService("device_policy")).isUninstallBlocked(null, this.f15818f);
    }

    private static boolean m15619a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (((C2228f) list.get(i)).f11101h.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static String m15618a(List list, long j, long j2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2228f c2228f = (C2228f) list.get(i);
            long j3 = c2228f.f11117d;
            if (j2 != 0) {
                j3 = Math.min(j3, c2228f.f11118e + j2);
            }
            if (j3 >= j) {
                return c2228f.f11101h;
            }
        }
        return null;
    }
}
