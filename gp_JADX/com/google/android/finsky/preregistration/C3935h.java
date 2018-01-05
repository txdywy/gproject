package com.google.android.finsky.preregistration;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C3935h implements C0657w {
    public final /* synthetic */ boolean f19906a;
    public final /* synthetic */ String f19907b;
    public final /* synthetic */ Context f19908c;
    public final /* synthetic */ String f19909d;
    public final /* synthetic */ C3934g f19910e;

    C3935h(C3934g c3934g, boolean z, String str, Context context, String str2) {
        this.f19910e = c3934g;
        this.f19906a = z;
        this.f19907b = str;
        this.f19908c = context;
        this.f19909d = str2;
    }

    public final void mo1062a(VolleyError volleyError) {
        int i;
        if (this.f19906a) {
            i = C7582R.string.preregistration_remove_error;
        } else {
            i = C7582R.string.preregistration_add_error;
        }
        if (!TextUtils.isEmpty(this.f19907b)) {
            Toast.makeText(this.f19908c, this.f19908c.getResources().getString(i, new Object[]{this.f19907b}), 1).show();
        }
        if (this.f19906a) {
            FinskyLog.m21667d("Unable to remove from preregistration: %s", volleyError);
        } else {
            FinskyLog.m21667d("Unable to preregister: %s", volleyError);
        }
        this.f19910e.m18638a(this.f19909d);
    }
}
