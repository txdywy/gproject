package com.google.android.finsky.recoverymode.impl;

import android.os.Bundle;
import android.support.v4.app.C0254u;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

public class RecoveryModeActivity extends C0254u implements C0998m {
    protected void onResume() {
        super.onResume();
        new C1508k().m8848a((int) C7582R.string.safe_mode_user_text).m8860d((int) C7582R.string.ok).m8853a(true).mo2272a().m625a(H_(), "safe_mode_dialog");
    }

    public final void mo1202a(int i, Bundle bundle) {
        finish();
    }

    public final void mo1211b(int i, Bundle bundle) {
        finish();
    }

    public final void f_(int i) {
        finish();
    }
}
