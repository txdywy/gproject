package com.google.android.finsky.actionbuttons;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.squareup.leakcanary.C7582R;

final class C1025u implements C0657w {
    public final /* synthetic */ C1024t f6281a;

    C1025u(C1024t c1024t) {
        this.f6281a = c1024t;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f6281a.a, C7582R.string.cancel_preorder_error, 0).show();
    }
}
