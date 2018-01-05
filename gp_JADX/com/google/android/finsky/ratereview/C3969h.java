package com.google.android.finsky.ratereview;

import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;

final class C3969h implements C0660x {
    public final /* synthetic */ String f20028a;
    public final /* synthetic */ C1254c f20029b;
    public final /* synthetic */ C2642m f20030c;

    C3969h(String str, C1254c c1254c, C2642m c2642m) {
        this.f20028a = str;
        this.f20029b = c1254c;
        this.f20030c = c2642m;
    }

    public final /* synthetic */ void b_(Object obj) {
        if (!TextUtils.isEmpty(this.f20028a)) {
            this.f20029b.mo1637c(this.f20028a);
        }
        if (this.f20030c != null) {
            this.f20030c.mo3085b(-1);
        }
    }
}
