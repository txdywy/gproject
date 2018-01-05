package com.google.android.finsky.stream.controllers.assist;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.view.MyAppsAssistCardAutoUpdate;
import com.squareup.leakcanary.C7582R;

public final class C4311b extends C4304f implements OnSharedPreferenceChangeListener {
    public C4311b(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0988c c0988c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, "AUTO_UPDATE", c0988c);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        C0954a.f5831a.m5749a().registerOnSharedPreferenceChangeListener(this);
    }

    public final void mo4061q() {
        super.mo4061q();
        C0954a.f5831a.m5749a().unregisterOnSharedPreferenceChangeListener(this);
    }

    protected final int mo4110b() {
        return 2817;
    }

    protected final int mo4111c() {
        return C7582R.layout.my_apps_assist_auto_update;
    }

    protected final void mo4109a(View view) {
        MyAppsAssistCardAutoUpdate myAppsAssistCardAutoUpdate = (MyAppsAssistCardAutoUpdate) view;
        myAppsAssistCardAutoUpdate.setEnableButtonOnClickListener(new C4312c(this));
        myAppsAssistCardAutoUpdate.setDismissButtonOnClickListener(new C4313d(this));
    }

    public final boolean mo4113d() {
        return (C1473m.f7980a.mo2265x().m18670c() || C1473m.f7980a.mo2265x().m18668a() || this.a.m20032b()) ? false : true;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(C0954a.f5854x.f5915b)) {
            m20016e();
        }
    }

    final void m20036b(int i) {
        if (this.i != null) {
            this.i.m13379b(new C2475d(this).m13256a(i));
        }
    }
}
