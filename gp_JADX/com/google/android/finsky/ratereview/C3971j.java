package com.google.android.finsky.ratereview;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0254u;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.dfemodel.Document;

public final class C3971j implements C2651l {
    public final /* synthetic */ String f20036a;
    public final /* synthetic */ String f20037b;
    public final /* synthetic */ int f20038c;
    public final /* synthetic */ String f20039d = null;
    public final /* synthetic */ C2642m f20040e;
    public final /* synthetic */ C0254u f20041f;
    public final /* synthetic */ int f20042g;
    public final /* synthetic */ C3964c f20043h;

    public C3971j(C3964c c3964c, String str, String str2, int i, C2642m c2642m, C0254u c0254u) {
        this.f20043h = c3964c;
        this.f20036a = str;
        this.f20037b = str2;
        this.f20038c = i;
        this.f20040e = c2642m;
        this.f20041f = c0254u;
        this.f20042g = 413;
    }

    public final void mo3091a(Document document) {
        if (((Boolean) C0954a.ai.m5760a()).booleanValue()) {
            new Handler(Looper.myLooper()).postDelayed(new C3972k(this, document), (long) (((int) (Math.random() * 1500.0d)) + 500));
            return;
        }
        this.f20043h.m18682a(this.f20036a, this.f20037b, this.f20039d, this.f20038c, "", "", document, this.f20041f, this.f20040e, this.f20042g, false);
    }

    public final void mo3090a() {
        if (this.f20040e != null) {
            this.f20040e.mo3088k();
        }
    }
}
