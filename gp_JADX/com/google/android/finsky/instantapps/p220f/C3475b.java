package com.google.android.finsky.instantapps.p220f;

import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.instantapps.common.p219f.C3474b;
import com.squareup.leakcanary.C7582R;

final class C3475b extends C3474b {
    public RadioButton f17668t;
    public TextView f17669u;
    public C3478e f17670v;

    public C3475b(C3478e c3478e, View view) {
        super(view);
        this.f17670v = c3478e;
        this.f17668t = (RadioButton) view.findViewById(C7582R.id.account_selected);
        this.f17669u = (TextView) view.findViewById(C7582R.id.account_name);
    }

    final void m17044a(String str, boolean z) {
        this.f17668t.setOnCheckedChangeListener(null);
        this.f17668t.setChecked(z);
        if (TextUtils.isEmpty(str)) {
            this.f17669u.setText(C7582R.string.instant_apps_settings_turn_instant_apps_off);
        } else {
            this.f17669u.setText(str);
        }
        this.f17668t.setOnCheckedChangeListener(new C3476c(this, str));
        this.f17669u.setOnClickListener(new C3477d(this));
    }
}
