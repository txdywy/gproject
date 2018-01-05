package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class dq implements OnItemSelectedListener {
    public final /* synthetic */ C0491do f3410a;

    dq(C0491do c0491do) {
        this.f3410a = c0491do;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != -1) {
            ck ckVar = this.f3410a.f3156i;
            if (ckVar != null) {
                ckVar.f3288a = false;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
