package com.android.volley.p060a;

import android.graphics.Bitmap;

public final class C0681w {
    public Bitmap f4111a;
    public final C0658x f4112b;
    public final String f4113c;
    public final String f4114d;
    public final /* synthetic */ C0675q f4115e;

    public C0681w(C0675q c0675q, Bitmap bitmap, String str, String str2, C0658x c0658x) {
        this.f4115e = c0675q;
        this.f4111a = bitmap;
        this.f4114d = str;
        this.f4113c = str2;
        this.f4112b = c0658x;
    }

    public final void m4471a() {
        if (this.f4112b != null) {
            C0679u c0679u = (C0679u) this.f4115e.f4098d.get(this.f4113c);
            if (c0679u == null) {
                c0679u = (C0679u) this.f4115e.f4099e.get(this.f4113c);
                if (c0679u != null) {
                    c0679u.m4468a(this);
                    if (c0679u.f4110d.size() == 0) {
                        this.f4115e.f4099e.remove(this.f4113c);
                    }
                }
            } else if (c0679u.m4468a(this)) {
                this.f4115e.f4098d.remove(this.f4113c);
            }
        }
    }
}
