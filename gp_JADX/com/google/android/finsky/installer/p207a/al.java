package com.google.android.finsky.installer.p207a;

import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class al extends AsyncTask {
    public final /* synthetic */ C3647b f16930a;
    public final /* synthetic */ int f16931b;
    public final /* synthetic */ ah f16932c;

    al(ah ahVar, C3647b c3647b, int i) {
        this.f16932c = ahVar;
        this.f16930a = c3647b;
        this.f16931b = i;
    }

    private final Integer m16459a() {
        try {
            return Integer.valueOf(this.f16932c.f16909q.mo3820a(this.f16930a.f18026a, this.f16931b));
        } catch (NameNotFoundException e) {
            return Integer.valueOf(-3);
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int intValue;
        Integer num = (Integer) obj;
        this.f16932c.f16915w.mo2856b(this.f16930a.f18026a);
        if (num.intValue() != 1) {
            ah ahVar = this.f16932c;
            String str = this.f16930a.f18026a;
            int intValue2 = num.intValue();
            ahVar.f16899g.mo3782a(str);
            ahVar.f16899g.mo3784a(ahVar.f16894Y, str, intValue2, ahVar.f16906n.m13365a());
            intValue = num.intValue();
        } else if (this.f16932c.f16889T && ((Boolean) C0968o.f5934k.m5760a()).booleanValue()) {
            this.f16932c.m16446f();
            intValue = 0;
        } else {
            intValue = 0;
        }
        FinskyLog.m21659a("installExistingPackage %s result %d", this.f16930a.f18026a, num);
        this.f16932c.f16874E.m11221a(this.f16932c.f16878I, new C2474c(109).m13236a(this.f16932c.f16878I).m13210a(intValue).m13231a(this.f16932c.f16893X).f13342a);
        this.f16932c.m16439b(70, null);
        this.f16932c.m16443c();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m16459a();
    }
}
