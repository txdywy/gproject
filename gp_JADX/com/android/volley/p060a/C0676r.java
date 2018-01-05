package com.android.volley.p060a;

import android.graphics.Bitmap;
import com.android.volley.C0660x;

final class C0676r implements C0660x {
    public final /* synthetic */ String f4102a;
    public final /* synthetic */ C0675q f4103b;

    C0676r(C0675q c0675q, String str) {
        this.f4103b = c0675q;
        this.f4102a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C0675q c0675q = this.f4103b;
        String str = this.f4102a;
        c0675q.f4097c.m4470a(str, bitmap);
        C0679u c0679u = (C0679u) c0675q.f4098d.remove(str);
        if (c0679u != null) {
            c0679u.f4108b = bitmap;
            c0675q.m4466a(str, c0679u);
        }
    }
}
