package com.google.android.finsky.family.remoteescalation.p202a;

import android.content.Context;
import android.os.Build.VERSION;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.family.remoteescalation.C3098p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.aa;
import com.google.wireless.android.finsky.dfe.h.a.ae;

public final class C3078a implements C0657w, C0660x {
    public final C1557b f15991a = C1473m.f7980a.aY();
    public final Context f15992b;
    public final String f15993c;
    public final C1254c f15994d;
    public final C3081d f15995e;
    public final C2495w f15996f;

    public C3078a(Context context, String str, C3081d c3081d, C2495w c2495w) {
        this.f15992b = context;
        this.f15993c = str;
        this.f15994d = C1473m.f7980a.mo2112b(str);
        this.f15995e = c3081d;
        this.f15996f = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21660a(volleyError, "Error listing remote notifications", new Object[0]);
    }

    private static boolean m15795a() {
        return VERSION.SDK_INT >= 24;
    }

    final void m15797a(ae aeVar, boolean z) {
        this.f15995e.m15805a(aeVar, this.f15993c, this.f15996f, true);
        C3098p.m15868a(this.f15994d, aeVar.g, aeVar.h, z, new C3079b(this, aeVar), new C3080c(this, aeVar));
    }

    public final /* synthetic */ void b_(Object obj) {
        int i = 0;
        aa aaVar = (aa) obj;
        if (this.f15991a.mo2306a(this.f15993c).mo2328i()) {
            for (ae aeVar : aaVar.e) {
                switch (aeVar.i) {
                    case 1:
                        i = 1;
                        if (!C3078a.m15795a()) {
                            break;
                        }
                        this.f15995e.m15804a(aeVar, this.f15993c, this.f15996f);
                        break;
                    case 2:
                        if (!C3078a.m15795a()) {
                            break;
                        }
                        this.f15995e.m15803a(aeVar);
                        break;
                    default:
                        break;
                }
            }
            if ((this.f15995e.f16004c || r0 != 0) && aaVar.f != null) {
                aaVar.f.e();
                this.f15995e.m15804a(aaVar.f, this.f15993c, this.f15996f);
            } else if (aaVar.f == null) {
                this.f15995e.m15801a();
            }
        } else {
            ae[] aeVarArr = aaVar.e;
            int length = aeVarArr.length;
            while (i < length) {
                ae aeVar2 = aeVarArr[i];
                if (C3098p.m15870a(aeVar2)) {
                    this.f15995e.m15804a(aeVar2, this.f15993c, this.f15996f);
                }
                i++;
            }
            if (C3078a.m15795a()) {
                this.f15995e.m15804a(new ae().e(), this.f15993c, this.f15996f);
            }
        }
        C0954a.aW.m5777b(this.f15993c).m5763a(Long.valueOf(aaVar.d));
    }
}
