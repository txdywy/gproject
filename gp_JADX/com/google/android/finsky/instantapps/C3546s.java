package com.google.android.finsky.instantapps;

import android.widget.Toast;
import com.google.android.finsky.instantapps.p220f.C3485l;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.gms.ac;
import com.squareup.leakcanary.C7582R;

final class C3546s implements C3485l {
    public final /* synthetic */ SettingsActivity f17806a;

    C3546s(SettingsActivity settingsActivity) {
        this.f17806a = settingsActivity;
    }

    public final void mo3543a(String str) {
        this.f17806a.f17337w.mo5136a(2213);
        Toast.makeText(this.f17806a.getApplicationContext(), C7582R.string.instant_apps_settings_excluded_apps_remove_toast_text, 0).show();
        C5785k c5785k = this.f17806a.f17333s;
        c5785k.f29224b.m27167a(new ac(c5785k, str, new C3557t(str)));
    }
}
