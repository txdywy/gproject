package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.C5088n;
import com.google.android.gms.googlehelp.C5213d;
import com.google.android.gms.googlehelp.C5215f;

public final class C5224g extends C5022m {
    public static C5213d f26310j = new C5234q();
    public final Activity f26311k;

    public C5224g(Activity activity) {
        super(activity, C5215f.f26299c, C5088n.f25913a);
        this.f26311k = activity;
    }

    public C5224g(Context context) {
        super(context, C5215f.f26299c, C5088n.f25913a);
        this.f26311k = null;
    }
}
