package com.google.android.finsky.stream.myapps;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.cv.p177a.C2427b;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.cv.p177a.gn;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C4543h implements C4542a {
    public final /* synthetic */ int f23244a;
    public final /* synthetic */ C2427b f23245b;
    public final /* synthetic */ C4539f f23246c;

    C4543h(C4539f c4539f, int i, C2427b c2427b) {
        this.f23246c = c4539f;
        this.f23244a = i;
        this.f23245b = c2427b;
    }

    public final void mo4262a(View view) {
        gn gnVar = null;
        this.f23246c.f23237g.m13379b(new C2475d((ad) view).m13256a(this.f23244a));
        C4536c c4536c = this.f23246c.f23233c;
        Context context = this.f23246c.f23236f;
        C2427b c2427b = this.f23245b;
        C3748a c3748a = this.f23246c.f23234d;
        DfeToc dn = this.f23246c.f23231a.dn();
        C2495w c2495w = this.f23246c.f23237g;
        if (c2427b.f11838a == 0) {
            eu euVar;
            if (c2427b.f11838a == 0) {
                euVar = c2427b.f11839b;
            } else {
                euVar = null;
            }
            c3748a.mo3639a(euVar, dn, c4536c.f23226a, c2495w);
        } else if (c2427b.f11838a == 1) {
            if (!((Boolean) C0954a.f5854x.m5760a()).booleanValue()) {
                C0954a.f5855y.m5763a(Boolean.valueOf(true));
            }
            C0954a.f5854x.m5763a(Boolean.valueOf(true));
            Snackbar.m500a(view, view.getResources().getString(C7582R.string.myapps_auto_update_assist_enabled_toast), 0).m502a(view.getResources().getString(C7582R.string.myapps_auto_update_assist_enabled_toast_undo), new C4538e(c2495w, view, C4537d.f23227a)).m493a();
        } else if (c2427b.f11838a == 2) {
            if (c2427b.f11838a == 2) {
                gnVar = c2427b.f11841d;
            }
            String str = gnVar.f12465b;
            Intent launchIntentForPackage = c4536c.f23226a.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
                context.startActivity(launchIntentForPackage);
            } else {
                c3748a.mo3692b(C1289l.m7694a(str), c2495w);
            }
        } else {
            FinskyLog.m21667d("Found unknown Action type", new Object[0]);
        }
        if (this.f23245b.f11842e != null) {
            this.f23246c.f23235e.m18280a(this.f23246c.f23232b.cZ(), this.f23246c.f23239i, this.f23245b.f11842e.f12046b);
        }
        this.f23246c.f23238h.m21163a();
    }
}
