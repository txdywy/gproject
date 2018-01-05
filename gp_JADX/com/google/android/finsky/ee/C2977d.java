package com.google.android.finsky.ee;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C2977d implements C0657w {
    public final /* synthetic */ boolean f15646a;
    public final /* synthetic */ Resources f15647b;
    public final /* synthetic */ String f15648c;
    public final /* synthetic */ Context f15649d;
    public final /* synthetic */ String f15650e;
    public final /* synthetic */ C2974a f15651f;

    C2977d(C2974a c2974a, boolean z, Resources resources, String str, Context context, String str2) {
        this.f15651f = c2974a;
        this.f15646a = z;
        this.f15647b = resources;
        this.f15648c = str;
        this.f15649d = context;
        this.f15650e = str2;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f15649d, this.f15647b.getString(this.f15646a ? C7582R.string.wishlist_remove_error : C7582R.string.wishlist_add_error, new Object[]{this.f15648c}), 1).show();
        if (this.f15646a) {
            FinskyLog.m21667d("Unable to remove from wishlist: %s", volleyError);
        } else {
            FinskyLog.m21667d("Unable to add to wishlist: %s", volleyError);
        }
        this.f15651f.m15400a(this.f15650e, this.f15646a, true);
    }
}
