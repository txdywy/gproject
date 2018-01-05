package com.google.android.finsky.activities;

import android.net.Uri;
import android.view.View;
import com.google.android.finsky.br.a;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.a implements View$OnClickListener
{

    public final String a;
    public final AppsPermissionsActivity b;

    a(AppsPermissionsActivity p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        v0 = com.google.android.finsky.m.a.bn();
        v0.a(this.b, v0.a(Uri.parse(this.a)));
    }

}
