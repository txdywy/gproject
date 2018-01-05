package com.google.android.play.image;

import android.graphics.Bitmap;
import com.google.android.play.utils.PlayCommonLog;

public final class C6373j implements C6365x {
    public Bitmap f32103a;
    public C6362y f32104b;
    public final String f32105c;
    public final String f32106d;
    public final int f32107e;
    public final int f32108f;
    public boolean f32109g;
    public final /* synthetic */ d f32110h;

    public C6373j(d dVar, Bitmap bitmap, C6375m c6375m, C6362y c6362y) {
        this.f32110h = dVar;
        this.f32103a = bitmap;
        this.f32105c = c6375m.f32112a;
        this.f32106d = c6375m.f32113b;
        this.f32107e = c6375m.f32115d;
        this.f32108f = c6375m.f32116e;
        this.f32104b = c6362y;
    }

    public final void mo5399a() {
        if (this.f32104b != null) {
            this.f32109g = true;
            if (this.f32110h.l) {
                PlayCommonLog.m29463d("Attempt to cancel a bitmap request from BitmapLoadedHandler.onResponse", new Object[0]);
                return;
            }
            bu buVar = (bu) this.f32110h.d.get(this.f32106d);
            if (buVar == null) {
                buVar = (bu) this.f32110h.e.get(this.f32106d);
                if (buVar != null && buVar.m29274a(this)) {
                    this.f32110h.e.remove(this.f32106d);
                }
            } else if (buVar.m29274a(this)) {
                this.f32110h.d.remove(this.f32106d);
            }
        }
    }

    public final Bitmap mo5401b() {
        return this.f32103a;
    }

    public final String mo5402c() {
        return this.f32105c;
    }

    public final int mo5403d() {
        return this.f32107e;
    }

    public final int mo5404e() {
        return this.f32108f;
    }

    public final void mo5400a(Bitmap bitmap) {
        if (!this.f32109g) {
            this.f32103a = bitmap;
            this.f32104b.mo5394a(this);
        }
    }
}
