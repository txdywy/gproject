package com.google.android.finsky.activities;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.squareup.leakcanary.C7582R;

final /* synthetic */ class C1130u implements OnClickListener {
    public final C1033t f7085a;
    public final View f7086b;

    C1130u(C1033t c1033t, View view) {
        this.f7085a = c1033t;
        this.f7086b = view;
    }

    public final void onClick(View view) {
        C1033t c1033t = this.f7085a;
        View view2 = this.f7086b;
        long parseLong = Long.parseLong(((EditText) view2.findViewById(C7582R.id.minimum_latency)).getText().toString());
        long parseLong2 = Long.parseLong(((EditText) view2.findViewById(C7582R.id.override_deadline)).getText().toString());
        boolean isChecked = ((CheckBox) view2.findViewById(C7582R.id.charging)).isChecked();
        boolean isChecked2 = ((CheckBox) view2.findViewById(C7582R.id.idle)).isChecked();
        C4023a a = new C4024b().m18839a(parseLong).m18843b(parseLong2).m18840a(isChecked).m18844b(isChecked2).m18838a(((Spinner) view2.findViewById(C7582R.id.network_selector)).getSelectedItemPosition()).m18837a();
        Context applicationContext = c1033t.getApplicationContext();
        ba a2 = C1473m.f7980a.bZ().m18890a(17);
        a2.m18887a(1).mo4398a(new az(a2, a, applicationContext));
    }
}
