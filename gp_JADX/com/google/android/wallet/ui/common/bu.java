package com.google.android.wallet.ui.common;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class bu implements OnItemSelectedListener {
    public final /* synthetic */ RegionCodeSelectorSpinner f33586a;

    bu(RegionCodeSelectorSpinner regionCodeSelectorSpinner) {
        this.f33586a = regionCodeSelectorSpinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Integer num = (Integer) this.f33586a.getItemAtPosition(i);
        if (this.f33586a.f33462H != null) {
            this.f33586a.f33462H.mo5568a(num.intValue(), this.f33586a.getId(), view != null);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        Log.i("RegionCodeSelectorSpinn", "Listener fired for onNothingSelected; ignoring");
    }
}
