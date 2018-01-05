package com.android.ex.photo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.bx;
import android.support.v4.p028a.C0211f;
import android.view.View;
import com.android.ex.photo.p050c.C0553c;

final class C0580s implements bx {
    public final /* synthetic */ C0572j f3844a;

    C0580s(C0572j c0572j) {
        this.f3844a = c0572j;
    }

    public final C0211f mo969a(int i, Bundle bundle) {
        String string = bundle.getString("image_uri");
        switch (i) {
            case 1:
                return this.f3844a.mo1000a(1, string);
            case 2:
                return this.f3844a.mo1000a(2, string);
            default:
                return null;
        }
    }

    public final void mo973b() {
    }

    public final /* synthetic */ void mo972a(C0211f c0211f, Object obj) {
        Drawable a = ((C0553c) obj).m4076a(this.f3844a.f3812c.getResources());
        C0545a n = this.f3844a.f3812c.mo996n();
        switch (c0211f.f1190o) {
            case 1:
                if (a == null) {
                    n.mo984a(null);
                    return;
                } else {
                    n.mo984a(a);
                    return;
                }
            case 2:
                bx bxVar = this.f3844a;
                if (!bxVar.f3797A) {
                    if (bxVar.m4160h()) {
                        bxVar.f3825p.setImageDrawable(a);
                    }
                    if (a != null) {
                        if (bxVar.f3822m.getMeasuredWidth() == 0) {
                            View view = bxVar.f3822m;
                            view.getViewTreeObserver().addOnGlobalLayoutListener(new C0579q(bxVar, view));
                        } else {
                            bxVar.m4163k();
                        }
                    }
                    bxVar.f3812c.b_().mo311a(100, null, bxVar);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
