package com.google.android.finsky.ratereview;

import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.cr.C2366c;
import java.util.Map;

final class C3967f implements C0660x {
    public final /* synthetic */ String f20016a;
    public final /* synthetic */ C1254c f20017b;
    public final /* synthetic */ C3974q f20018c;
    public final /* synthetic */ String f20019d;
    public final /* synthetic */ boolean f20020e;
    public final /* synthetic */ C2642m f20021f;
    public final /* synthetic */ int f20022g;

    C3967f(String str, C1254c c1254c, C3974q c3974q, String str2, boolean z, C2642m c2642m, int i) {
        this.f20016a = str;
        this.f20017b = c1254c;
        this.f20018c = c3974q;
        this.f20019d = str2;
        this.f20020e = z;
        this.f20021f = c2642m;
        this.f20022g = i;
    }

    public final /* synthetic */ void b_(Object obj) {
        C2366c c2366c;
        if (!TextUtils.isEmpty(this.f20016a)) {
            this.f20017b.mo1637c(this.f20016a);
        }
        C3974q c3974q = this.f20018c;
        String str = this.f20019d;
        boolean z = this.f20020e;
        Map map = z ? c3974q.f20057f : c3974q.f20056e;
        if (z) {
            c2366c = c3974q.f20059h;
        } else {
            c2366c = c3974q.f20058g;
        }
        if (c2366c.m12012b()) {
            c2366c.mo2869a(str);
        }
        if (map.containsKey(str)) {
            C3980w c3980w = (C3980w) map.get(str);
            if (c3980w != C3974q.f20052a) {
                c3980w.f20070d = true;
            }
        }
        if (this.f20021f != null) {
            this.f20021f.mo3085b(this.f20022g);
        }
    }
}
