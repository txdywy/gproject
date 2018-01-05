package com.android.ex.photo.p050c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.p028a.C0212a;
import com.android.ex.photo.C0572j;
import com.android.ex.photo.p052e.C0559b;

public class C0552a extends C0212a implements C0551b {
    public String f3749g;
    public Bitmap f3750h;

    public C0552a(Context context, String str) {
        super(context);
        this.f3749g = str;
    }

    public final void mo981a(String str) {
        this.f3749g = str;
    }

    public C0553c mo3892f() {
        C0553c c0553c = new C0553c();
        Context context = this.f1193r;
        if (!(context == null || this.f3749g == null)) {
            try {
                c0553c = C0559b.m4092a(context.getContentResolver(), Uri.parse(this.f3749g), C0572j.f3796b);
                if (c0553c.f3752b != null) {
                    c0553c.f3752b.setDensity(160);
                }
            } catch (UnsupportedOperationException e) {
                c0553c.f3753c = 1;
            }
        }
        return c0553c;
    }

    public final void m4067a(C0553c c0553c) {
        Bitmap bitmap = c0553c != null ? c0553c.f3752b : null;
        if (!this.f1196u) {
            Bitmap bitmap2 = this.f3750h;
            this.f3750h = bitmap;
            if (this.f1194s) {
                super.mo273b(c0553c);
            }
            if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                mo3891a(bitmap2);
            }
        } else if (bitmap != null) {
            mo3891a(bitmap);
        }
    }

    protected final void mo276g() {
        if (this.f3750h != null) {
            C0553c c0553c = new C0553c();
            c0553c.f3753c = 0;
            c0553c.f3752b = this.f3750h;
            m4067a(c0553c);
        }
        if (m1089k() || this.f3750h == null) {
            mo266a();
        }
    }

    protected final void mo277h() {
        mo268b();
    }

    protected final void mo278i() {
        super.mo278i();
        mo277h();
        if (this.f3750h != null) {
            mo3891a(this.f3750h);
            this.f3750h = null;
        }
    }

    public void mo3891a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public /* synthetic */ Object mo274d() {
        return mo3892f();
    }

    public final /* synthetic */ void mo272a(Object obj) {
        C0553c c0553c = (C0553c) obj;
        super.mo272a(c0553c);
        if (c0553c != null) {
            mo3891a(c0553c.f3752b);
        }
    }

    public final /* synthetic */ void mo273b(Object obj) {
        m4067a((C0553c) obj);
    }
}
