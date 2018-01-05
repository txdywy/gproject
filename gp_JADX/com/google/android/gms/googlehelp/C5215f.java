package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5085j;
import com.google.android.gms.googlehelp.internal.common.C5224g;

public final class C5215f {
    public static C5085j f26297a = new C5085j();
    public static C4931e f26298b = new C5216g();
    public static final C5053a f26299c = new C5053a("Help.API", f26298b, f26297a);

    public static C5224g m23998a(Activity activity) {
        return new C5224g(activity);
    }

    public static C5224g m23999a(Context context) {
        return new C5224g(context);
    }
}
