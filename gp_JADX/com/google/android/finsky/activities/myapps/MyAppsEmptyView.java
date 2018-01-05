package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.squareup.leakcanary.C7582R;

public class MyAppsEmptyView extends ScrollView {
    public TextView f6968a;
    public TextView f6969b;
    public View f6970c;
    public View f6971d;

    public MyAppsEmptyView(Context context) {
        super(context);
    }

    public MyAppsEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6968a = (TextView) findViewById(C7582R.id.account_name);
        this.f6969b = (TextView) findViewById(C7582R.id.empty_myapps_textview);
        this.f6970c = findViewById(C7582R.id.myapps_browse_apps);
        this.f6971d = findViewById(C7582R.id.myapps_browse_games);
    }

    public final void m6773a(DfeToc dfeToc, C3748a c3748a, boolean z, int i, C2495w c2495w) {
        if (z) {
            this.f6968a.setText(C1473m.f7980a.mo2041U().mo1186d(C1473m.f7980a.cY()));
        } else {
            this.f6968a.setVisibility(8);
        }
        this.f6969b.setText(i);
        gj a = dfeToc == null ? null : dfeToc.m14606a(3);
        if (a == null) {
            this.f6970c.setVisibility(8);
        } else {
            this.f6970c.setOnClickListener(new C1104c(c3748a, a, dfeToc, c2495w));
        }
        String str = (String) C0955b.f5900p.m28964b();
        if (dfeToc == null || TextUtils.isEmpty(str) || C1473m.f7980a.mo2033M().m8818a()) {
            this.f6971d.setVisibility(8);
        } else {
            this.f6971d.setOnClickListener(new C1105d(this, c3748a, str, dfeToc, c2495w));
        }
    }
}
