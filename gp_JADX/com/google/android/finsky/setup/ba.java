package com.google.android.finsky.setup;

import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.finsky.dfe.nano.fr;

final class ba implements C0660x {
    public final String f20850a;
    public final /* synthetic */ RestoreService f20851b;

    public ba(RestoreService restoreService, String str) {
        this.f20851b = restoreService;
        this.f20850a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        fr frVar = (fr) obj;
        C1473m.f7980a.aS().mo3956a(this.f20850a, frVar.b, this.f20851b.f20572e.m19255a(this.f20850a));
        this.f20851b.f20575i = 0;
        this.f20851b.f20576j = 0;
        this.f20851b.f20577k = 0;
        this.f20851b.f20578l = 0;
        int i = 0;
        boolean z = !C1473m.f7980a.bP().m14777b();
        C3300k o = C1473m.f7980a.mo2256o();
        C3340g bw = C1473m.f7980a.bw();
        fp[] fpVarArr = frVar.b;
        int length = fpVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            fp fpVar = fpVarArr[i2];
            String str = fpVar.e.f11833b;
            int i4 = fpVar.g;
            String str2 = fpVar.f;
            if (this.f20851b.m19100a(str, i4, this.f20850a, false, bw, fpVar.i)) {
                int i5 = 3;
                if (fpVar.e() && fpVar.d < 100) {
                    i5 = 1;
                }
                CharSequence charSequence = null;
                if (fpVar.h != null) {
                    charSequence = fpVar.h.f11860f;
                }
                int i6 = i5 == 1 ? 1 : 0;
                this.f20851b.m19096a(str, i6, false);
                this.f20851b.f20572e.m19258a(str, i4, this.f20850a, str2, i5, null, true, charSequence, false, i6, fpVar.i);
                o.mo3440a(str, RestoreService.m19092b(), false, false);
                if (i5 == 1) {
                    o.mo3452f(str);
                }
                C2495w a = this.f20851b.f20568a.m13184a("restore");
                if (((Boolean) C0955b.hP.m28964b()).booleanValue()) {
                    o.mo3432a(str, i4, this.f20850a, str2, i5, fpVar.i, a);
                } else {
                    o.mo3434a(str, i4, this.f20850a, str2, z, i5, fpVar.i, a);
                }
                i3 = i + 1;
                if (!TextUtils.isEmpty(charSequence)) {
                    this.f20851b.m19098a(str, (String) charSequence);
                }
            } else {
                i3 = i;
            }
            i2++;
            i = i3;
        }
        FinskyLog.m21659a("Attempted to restore %d assets.", Integer.valueOf(frVar.b.length));
        FinskyLog.m21659a("  Skipped (already tracked): %d", Integer.valueOf(this.f20851b.f20575i));
        FinskyLog.m21659a("  Skipped (other account): %d", Integer.valueOf(this.f20851b.f20576j));
        FinskyLog.m21659a("  Skipped (attempts exceeded): %d", Integer.valueOf(this.f20851b.f20578l));
        FinskyLog.m21659a("  Skipped (already installed): %d", Integer.valueOf(this.f20851b.f20577k));
        if (i > 0) {
            FinskyLog.m21659a("  Posted for download/install: %d (deferred = %b)", Integer.valueOf(i), Boolean.valueOf(z));
            if (z) {
                C1473m.f7980a.cK().mo3919a(this.f20851b.getApplicationContext(), ((Long) C0955b.bi.m28964b()).longValue());
            }
        }
        this.f20851b.f20572e.m19259a(this.f20850a, true);
        this.f20851b.f20572e.m19260b();
    }
}
