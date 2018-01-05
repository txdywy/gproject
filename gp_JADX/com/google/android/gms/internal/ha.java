package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.measurement.C5338a;
import com.google.android.gms.measurement.C5341d;

public final class ha extends hz {
    public static String[] f26840a = new String[C5338a.f27840a.length];
    public static String[] f26841b = new String[C5341d.f27842a.length];

    ha(hv hvVar) {
        super(hvVar);
    }

    private static String m24599a(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        boolean z = true;
        int i = 0;
        am.m23733a((Object) strArr);
        am.m23733a((Object) strArr2);
        am.m23733a((Object) strArr3);
        am.m23742b(strArr.length == strArr2.length);
        if (strArr.length != strArr3.length) {
            z = false;
        }
        am.m23742b(z);
        while (i < strArr.length) {
            if (jl.m24921b(str, strArr[i])) {
                synchronized (strArr3) {
                    if (strArr3[i] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(strArr2[i]);
                        stringBuilder.append("(");
                        stringBuilder.append(strArr[i]);
                        stringBuilder.append(")");
                        strArr3[i] = stringBuilder.toString();
                    }
                    str = strArr3[i];
                }
                return str;
            }
            i++;
        }
        return str;
    }

    private final boolean m24600t() {
        return this.p.m24761d().m24632a(3);
    }

    protected final String m24601a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m24600t()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            } else {
                stringBuilder.append("Bundle[{");
            }
            stringBuilder.append(m24604b(str));
            stringBuilder.append("=");
            stringBuilder.append(bundle.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    protected final String m24602a(String str) {
        return str == null ? null : m24600t() ? m24599a(str, C5338a.f27841b, C5338a.f27840a, f26840a) : str;
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    protected final String m24604b(String str) {
        return str == null ? null : m24600t() ? m24599a(str, C5341d.f27843b, C5341d.f27842a, f26841b) : str;
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
    }
}
