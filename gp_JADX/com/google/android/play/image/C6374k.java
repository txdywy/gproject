package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.widget.ImageView.ScaleType;
import com.android.volley.a.y;
import com.android.volley.m;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.play.utils.C6449e;
import com.google.android.play.utils.b.j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class C6374k extends y {
    public boolean f32111k;

    public C6374k(String str, int i, Config config, x xVar, w wVar) {
        super(str, xVar, i, 0, ScaleType.CENTER_INSIDE, config, wVar);
    }

    public C6374k(C6375m c6375m, x xVar, w wVar) {
        super(c6375m.f32113b, xVar, c6375m.f32115d, c6375m.f32116e, c6375m.f32118g, c6375m.f32117f, wVar);
    }

    public v m29288a(m mVar) {
        v a = super.a(mVar);
        if (a.a() && ((Boolean) j.z.b()).booleanValue()) {
            return v.a(C6449e.m29500a((Bitmap) a.a, d(), mVar.b.length / MemoryMappedFileBuffer.DEFAULT_PADDING), a.b);
        }
        return a;
    }

    public void m29289a(Bitmap bitmap) {
        if (!this.f32111k) {
            this.f32111k = true;
            super.a(bitmap);
        }
    }
}
