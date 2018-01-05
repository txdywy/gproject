package com.google.android.wallet.ui.address;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.wallet.p366b.C6516f;

final class C6720j implements OnItemSelectedListener {
    public final /* synthetic */ C6713c f33163a;

    C6720j(C6713c c6713c) {
        this.f33163a = c6713c;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f33163a.f33129V != null) {
            C6516f.m29560a(this.f33163a.f33129V, this.f33163a.f33142l, null);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
