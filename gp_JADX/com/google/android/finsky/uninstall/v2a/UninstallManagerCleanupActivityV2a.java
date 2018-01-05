package com.google.android.finsky.uninstall.v2a;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.aw;
import android.support.v7.app.aa;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Collections;

public class UninstallManagerCleanupActivityV2a extends aa implements ah, C4607w {
    public final C2471a f23683q = C1473m.f7980a.aR();
    public Handler f23684r;
    public long f23685s;
    public ce f23686t = C2482j.m13283a(6420);
    public C2495w f23687u;
    public C4626s f23688v;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = View.inflate(this, C7582R.layout.uninstall_manager_activity_v2, null);
        setContentView(inflate);
        String stringExtra = getIntent().getStringExtra("uninstall_manager_activity_removed_account_name");
        this.f23684r = new Handler(getMainLooper());
        if (bundle != null) {
            this.f23687u = this.f23683q.m13179a(bundle);
        } else {
            this.f23687u = C1473m.f7980a.dd().m13380b(stringExtra);
        }
        C4626s c4626s = new C4626s(this, this, inflate, true, false, this.f23687u);
        c4626s.f23823m = new an();
        c4626s.f23824n = Collections.EMPTY_LIST;
        c4626s.f23827q = true;
        c4626s.f23828r = new aq(this);
        if (c4626s.f23815e == null) {
            c4626s.f23815e = new C4630x();
            aw a = H_().mo284a();
            a.mo328a(c4626s.f23815e, "uninstall_manager_base_fragment");
            a.mo334c();
            c4626s.m21571a(0);
        } else {
            c4626s.m21570a();
            if (c4626s.m21576d()) {
                c4626s.m21577e();
            }
        }
        this.f23688v = c4626s;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f23687u.m13377a(bundle);
    }

    public void onStop() {
        this.f23688v.m21575c();
        super.onStop();
    }

    public final C4626s mo1276k() {
        return this.f23688v;
    }

    public ce getPlayStoreUiElement() {
        return this.f23686t;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f23684r, this.f23685s, this, adVar, this.f23687u);
    }

    public final void o_() {
        this.f23685s = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f23684r, this.f23685s, (ah) this, this.f23687u);
    }

    public final C2495w mo1224n() {
        return this.f23687u;
    }
}
