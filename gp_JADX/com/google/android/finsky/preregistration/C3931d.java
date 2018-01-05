package com.google.android.finsky.preregistration;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.squareup.leakcanary.C7582R;

final class C3931d implements C0657w {
    public final /* synthetic */ boolean f19892a;
    public final /* synthetic */ C3930c f19893b;

    C3931d(C3930c c3930c, boolean z) {
        this.f19893b = c3930c;
        this.f19892a = z;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f19893b.am.setCheckboxState(!this.f19892a);
        Toast.makeText(this.f19893b.am.getContext(), C7582R.string.preregistration_dialog_opt_in_error_message, 1).show();
    }
}
