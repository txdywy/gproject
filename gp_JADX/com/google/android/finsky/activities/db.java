package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.squareup.leakcanary.C7582R;

final class db implements C0657w {
    public final /* synthetic */ cu f6656a;

    db(cu cuVar) {
        this.f6656a = cuVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f6656a.f6532Q = false;
        this.f6656a.mo1326i();
        Toast.makeText(this.f6656a.f6517B, C7582R.string.cancel_preorder_error, 0).show();
    }
}
