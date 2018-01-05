package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v4.app.C0254u;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.p111d.C2471a;
import com.squareup.leakcanary.C7582R;

public class AccessRestrictedActivity extends C0254u implements C0998m {
    public final C2471a f6292n = C1473m.f7980a.aR();

    protected void onResume() {
        super.onResume();
        int intExtra = getIntent().getIntExtra("AccessRestrictedActivity.messageId", C7582R.string.limited_user_text);
        C1508k c1508k = new C1508k();
        c1508k.m8848a(intExtra).m8860d((int) C7582R.string.ok).m8853a(true).m8849a(308, null, -1, -1, this.f6292n.m13184a(null));
        c1508k.mo2272a().m625a(H_(), "access_restricted_dialog");
    }

    public final void mo1202a(int i, Bundle bundle) {
        finish();
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        finish();
    }
}
