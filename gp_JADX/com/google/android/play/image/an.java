package com.google.android.play.image;

import android.graphics.Bitmap;
import com.android.volley.x;
import com.google.android.play.utils.PlayCommonLog;

public final class an implements C6365x {
    public Bitmap f31997a;
    public C6362y f31998b;
    public final String f31999c;
    public final String f32000d;
    public final int f32001e;
    public final int f32002f;
    public x f32003g;
    public boolean f32004h = false;
    public boolean f32005i;
    public final /* synthetic */ ag f32006j;

    public an(ag agVar, Bitmap bitmap, String str, String str2, int i, int i2, C6362y c6362y) {
        this.f32006j = agVar;
        this.f31997a = bitmap;
        this.f31999c = str;
        this.f32000d = str2;
        this.f32001e = i;
        this.f32002f = i2;
        this.f31998b = c6362y;
    }

    public final void mo5399a() {
        if (this.f31998b != null) {
            this.f32005i = true;
            if (!this.f32004h) {
                this.f32006j.n.m29236a(this.f32003g);
            } else if (this.f32006j.l) {
                PlayCommonLog.m29463d("Attempt to cancel a bitmap request from BitmapLoadedHandler.onResponse", new Object[0]);
            } else {
                ar arVar = (ar) this.f32006j.g.get(this.f32000d);
                if (arVar == null) {
                    arVar = (ar) this.f32006j.h.get(this.f32000d);
                    if (arVar != null && arVar.m29233a(this)) {
                        this.f32006j.h.remove(this.f32000d);
                    }
                } else if (arVar.m29233a(this)) {
                    this.f32006j.g.remove(this.f32000d);
                }
            }
        }
    }

    public final Bitmap mo5401b() {
        return this.f31997a;
    }

    public final String mo5402c() {
        return this.f31999c;
    }

    public final int mo5403d() {
        return this.f32001e;
    }

    public final int mo5404e() {
        return this.f32002f;
    }

    public final void mo5400a(Bitmap bitmap) {
        if (!this.f32005i) {
            this.f31997a = bitmap;
            this.f31998b.mo5394a(this);
        }
    }
}
