package com.google.android.play.image;

import android.graphics.Bitmap;
import com.android.volley.n;
import java.util.ArrayList;
import java.util.List;

final class ar {
    public n f32015a;
    public Bitmap f32016b;
    public List f32017c = new ArrayList();
    public final /* synthetic */ ag f32018d;

    public ar(ag agVar, n nVar, an anVar) {
        this.f32018d = agVar;
        this.f32015a = nVar;
        this.f32017c.add(anVar);
    }

    public final boolean m29233a(C6365x c6365x) {
        an anVar = (an) c6365x;
        this.f32017c.remove(anVar);
        if (this.f32017c.size() != 0) {
            return false;
        }
        if (anVar.f32003g != null) {
            this.f32018d.n.m29236a(anVar.f32003g);
        }
        this.f32015a.f();
        return true;
    }
}
