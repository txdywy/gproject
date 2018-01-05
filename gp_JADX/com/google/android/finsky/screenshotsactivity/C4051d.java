package com.google.android.finsky.screenshotsactivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.ex.photo.p050c.C0552a;
import com.android.ex.photo.p050c.C0553c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.bf;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

public final class C4051d extends C0552a implements y {
    public Bitmap f20354h;
    public final C1294w f20355i;
    public int f20356j;
    public String f20357k;
    public float f20358l = 1.0f;

    public C4051d(Context context, String str, C1294w c1294w) {
        super(context, str);
        this.f20355i = c1294w;
        this.f20357k = str;
        this.f20358l = Math.min(this.f20358l, bf.a(context));
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        float min = (float) Math.min(displayMetrics.densityDpi, 250);
        this.f20356j = Math.round((((float) (Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.densityDpi)) * min) * this.f20358l);
    }

    public final C0553c mo3892f() {
        C0553c c0553c = new C0553c();
        if (this.f20354h == null || this.f20354h.isRecycled()) {
            x a;
            if (this.f1190o == 2) {
                a = this.f20355i.mo1672a(this.f20357k, this.f20356j, this.f20356j, true, this, true);
            } else {
                a = this.f20355i.mo1672a(this.f20357k, this.f20356j, this.f20356j, false, this, true);
            }
            if (a != null) {
                c0553c.f3752b = a.b();
                if (c0553c.f3752b != null && c0553c.f3752b.isRecycled()) {
                    c0553c.f3752b = null;
                    FinskyLog.m21669e("Using recycled bitmap for Id:%d", Integer.valueOf(this.f1190o));
                }
            }
        } else {
            c0553c.f3752b = this.f20354h;
        }
        c0553c.f3753c = 0;
        return c0553c;
    }

    public final void m18957a(x xVar) {
        C0553c c0553c = new C0553c();
        if (xVar != null) {
            c0553c.f3752b = xVar.b();
            c0553c.f3753c = 0;
            if (c0553c.f3752b != null && c0553c.f3752b.isRecycled()) {
                c0553c.f3752b = null;
                FinskyLog.m21667d("Using recycled bitmap for Id:%d", Integer.valueOf(this.f1190o));
                return;
            }
        }
        c0553c.f3753c = 1;
        this.f20354h = c0553c.f3752b;
        m4067a(c0553c);
    }

    protected final void mo3891a(Bitmap bitmap) {
        if (this.f20354h == bitmap) {
            this.f20354h = null;
        }
        if (bitmap != null && this.f1190o != 2 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public final void mo3893l() {
        this.f20354h = null;
        super.mo3893l();
    }

    public final /* synthetic */ Object mo274d() {
        return mo3892f();
    }

    public final /* synthetic */ void b_(Object obj) {
        m18957a((x) obj);
    }
}
