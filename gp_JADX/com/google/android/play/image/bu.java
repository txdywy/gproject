package com.google.android.play.image;

import android.graphics.Bitmap;
import com.android.volley.n;
import java.util.ArrayList;
import java.util.List;

public final class bu {
    public final List f32081a = new ArrayList();
    public n f32082b;
    public C6378r f32083c;
    public Bitmap f32084d;

    bu(n nVar, C6365x c6365x) {
        this.f32082b = nVar;
        this.f32081a.add(c6365x);
    }

    final boolean m29274a(C6365x c6365x) {
        this.f32081a.remove(c6365x);
        if (this.f32081a.size() != 0) {
            return false;
        }
        if (this.f32082b != null) {
            this.f32082b.f();
            this.f32082b = null;
        }
        if (this.f32083c != null) {
            Object obj = this.f32083c;
            if (obj.f32127f != null) {
                obj.f32127f.f32120a.remove(obj);
                obj.f32127f = null;
            }
            this.f32083c = null;
        }
        return true;
    }
}
