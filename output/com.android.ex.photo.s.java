package com.android.ex.photo;

import android.os.Bundle;
import android.support.v4.a.f;
import android.support.v4.app.bw;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.android.ex.photo.c.c;

public final class com.android.ex.photo.s implements android.support.v4.app.bx
{

    public final com.android.ex.photo.j a;

    s(com.android.ex.photo.j p0) {
        this.a = p0;
    }

    public final android.support.v4.a.f a(int p0, Bundle p1) {
        v0 = p1.getString("image_uri");
        switch (p0) {
            case 1:
                v0 = this.a.a(1, v0);
                break;
            case 2:
                v0 = this.a.a(2, v0);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final void a(android.support.v4.a.f p0, Object p1) {
        v0 = ((com.android.ex.photo.c.c)p1).a(this.a.c.getResources());
        v1 = this.a.c.n();
        switch (p0.o) {
            case 1:
                if (v0 == 0)
                    v1.a(0);
                else
                    v1.a(v0);
                break;
            case 2:
                if (this.a.A == 0) {
                    if (this.a.h())
                        this.a.p.setImageDrawable(v0);
                    if (v0 != 0) {
                        if (this.a.m.getMeasuredWidth() == 0)
                            this.a.m.getViewTreeObserver().addOnGlobalLayoutListener(new com.android.ex.photo.q(this.a, this.a.m));
                        else
                            this.a.k();
                    }
                    this.a.c.b_().a(100, 0, this.a);
                }
                break;
            default:
                break;
        }
    }

    public final void b() {
    }

}
