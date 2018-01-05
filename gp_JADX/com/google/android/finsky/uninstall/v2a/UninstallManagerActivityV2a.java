package com.google.android.finsky.uninstall.v2a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class UninstallManagerActivityV2a extends C1036b implements ah, C4607w {
    public Handler f23677G;
    public long f23678H;
    public ce f23679I = C2482j.m13283a(5520);
    public C2495w f23680J;
    public C4626s f23681K;
    public final C2471a f23682t = C1473m.f7980a.aR();

    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        View inflate = View.inflate(this, C7582R.layout.uninstall_manager_activity_v2, null);
        setContentView(inflate);
        Intent intent = getIntent();
        List stringArrayListExtra = intent.getStringArrayListExtra("uninstall_manager_activity_installing_package_names");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            FinskyLog.m21669e("Inputting list of package names is null or empty", new Object[0]);
        }
        String str2 = (String) stringArrayListExtra.get(0);
        C2129c a = C1473m.f7980a.mo2029I().f18022b.mo2657a(str2);
        if (a != null) {
            str = a.f10815i;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        boolean z;
        this.f23677G = new Handler(getMainLooper());
        if (bundle != null) {
            this.f23680J = this.f23682t.m13179a(bundle);
        } else {
            this.f23680J = this.f6316C.m13380b(str);
        }
        C3647b a2 = C1473m.f7980a.mo2029I().m17243a(str2);
        if (a2 == null || a2.f18028c == null) {
            z = false;
        } else {
            z = true;
        }
        boolean booleanExtra = intent.getBooleanExtra("uninstall_manager_activity_confirmation_flag", false);
        C4626s c4626s = new C4626s(this, this, inflate, z, booleanExtra, this.f23680J);
        c4626s.f23823m = new ap();
        c4626s.f23824n = stringArrayListExtra;
        c4626s.f23827q = false;
        c4626s.f23828r = new as(this);
        c4626s.f23820j = str;
        if (c4626s.f23815e == null) {
            c4626s.f23815e = new C4630x();
            aw a3 = H_().mo284a();
            a3.mo328a(c4626s.f23815e, "uninstall_manager_base_fragment");
            a3.mo334c();
            if (booleanExtra) {
                c4626s.m21571a(1);
            } else {
                c4626s.m21571a(0);
            }
        } else {
            c4626s.m21570a();
        }
        this.f23681K = c4626s;
        if (bundle != null) {
            this.f23681K.f23819i = bundle.getBoolean("UninstallManagerActivityV2a.shouldStartOnConfirmation");
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("UninstallManagerActivityV2a.shouldStartOnConfirmation", this.f23681K.f23819i);
        this.f23680J.m13377a(bundle);
    }

    public void onStop() {
        this.f23681K.m21575c();
        super.onStop();
    }

    public final C4626s mo1276k() {
        return this.f23681K;
    }

    public ce getPlayStoreUiElement() {
        return this.f23679I;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f23677G, this.f23678H, this, adVar, this.f6316C);
    }

    public final void o_() {
        this.f23678H = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f23677G, this.f23678H, (ah) this, this.f6316C);
    }
}
