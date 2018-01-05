package com.google.android.finsky.dn;

import android.content.res.Resources;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C2836d implements C0657w {
    public final /* synthetic */ Resources f15236a;
    public final /* synthetic */ boolean f15237b;
    public final /* synthetic */ String f15238c;
    public final /* synthetic */ C2833a f15239d;

    public C2836d(C2833a c2833a, Resources resources, boolean z, String str) {
        this.f15239d = c2833a;
        this.f15236a = resources;
        this.f15237b = z;
        this.f15238c = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        int i;
        C2833a c2833a = this.f15239d;
        Resources resources = this.f15236a;
        if (this.f15237b) {
            i = C7582R.string.testing_program_opt_out_error;
        } else {
            i = C7582R.string.testing_program_opt_in_error;
        }
        Toast.makeText(c2833a.f15222a, resources.getString(i), 1).show();
        if (this.f15237b) {
            FinskyLog.m21667d("Unable to opt out testing program: %s", volleyError);
        } else {
            FinskyLog.m21667d("Unable to opt in testing program: %s", volleyError);
        }
        this.f15239d.f15228g.remove(this.f15238c);
        this.f15239d.m14985a(this.f15238c, false);
    }
}
