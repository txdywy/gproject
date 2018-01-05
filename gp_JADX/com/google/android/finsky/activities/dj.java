package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.squareup.leakcanary.C7582R;

final class dj implements C0660x {
    public final /* synthetic */ Context f6670a;

    dj(Context context) {
        this.f6670a = context;
    }

    public final /* synthetic */ void b_(Object obj) {
        Toast.makeText(this.f6670a, C7582R.string.content_flagged, 1).show();
        C1473m.f7980a.dc().m13319a(new C2474c(533).f13342a, null);
    }
}
