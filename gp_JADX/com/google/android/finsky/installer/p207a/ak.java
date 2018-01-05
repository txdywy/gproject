package com.google.android.finsky.installer.p207a;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cm.C2297d;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class ak implements C2297d {
    public final /* synthetic */ int f16927a;
    public final /* synthetic */ String f16928b;
    public final /* synthetic */ ah f16929c;

    ak(ah ahVar, int i, String str) {
        this.f16929c = ahVar;
        this.f16927a = i;
        this.f16928b = str;
    }

    public final void mo2939a() {
        FinskyLog.m21659a("Successful install of %s (isid: %s)", this.f16929c.f16878I, this.f16929c.m16445e());
        boolean z = this.f16929c.f16889T;
        if (this.f16929c.f16890U && !this.f16929c.f16911s.dj().mo2294a(12628004)) {
            z = true;
        }
        if (z && !this.f16929c.f16891V && ((Boolean) C0968o.f5934k.m5760a()).booleanValue()) {
            this.f16929c.m16446f();
        }
        C2129c a = this.f16929c.f16900h.mo2657a(this.f16929c.f16878I);
        if (!(a == null || a.f10832z == null || a.f10832z.f13153B == null)) {
            if (((a.f10832z.f13153B.f12309a & 32) != 0 ? 1 : 0) != 0) {
                this.f16929c.f16909q.mo3825b(this.f16929c.f16878I, a.f10832z.f13153B.f12317i);
            }
        }
        if (!(a == null || this.f16929c.f16911s.dj().mo2294a(12633855) || (a.f10819m & 33554432) == 0)) {
            this.f16929c.f16912t.sendBroadcast(new Intent("com.google.android.finsky.instantapps.APP_UPGRADE").setPackage(this.f16929c.f16912t.getPackageName()).setData(new Builder().scheme("package").authority(this.f16929c.f16878I).build()).putExtra("instantAppVersionCode", this.f16927a));
        }
        m16456a(110, 0, null);
    }

    public final void mo2940a(int i, Throwable th) {
        String str = "Install failure of %s (isid: %s): %d, Exception: %s";
        Object[] objArr = new Object[4];
        objArr[0] = this.f16929c.f16878I;
        objArr[1] = this.f16929c.m16445e();
        objArr[2] = Integer.valueOf(i);
        objArr[3] = th == null ? "n/a" : th.getClass().getSimpleName();
        FinskyLog.m21665c(str, objArr);
        if (this.f16929c.f16888S) {
            ah ahVar = this.f16929c;
            str = this.f16929c.f16878I;
            ahVar.f16899g.mo3782a(str);
            ahVar.f16899g.mo3784a(ahVar.f16894Y, str, i, ahVar.f16906n.m13365a());
        }
        m16456a(111, i, th);
    }

    private final void m16456a(int i, int i2, Throwable th) {
        if (this.f16928b != null) {
            this.f16929c.f16898f.mo3179c(Uri.parse(this.f16928b));
        }
        this.f16929c.f16874E.m11221a(this.f16929c.f16878I, new C2474c(i).m13236a(this.f16929c.f16878I).m13210a(i2).m13238a(th).m13231a(this.f16929c.f16893X).f13342a);
        this.f16929c.m16439b(70, null);
        this.f16929c.m16443c();
    }
}
