package com.android.volley.p060a;

import android.graphics.Bitmap;
import com.android.volley.C0656n;
import com.android.volley.VolleyError;
import java.util.LinkedList;

final class C0679u {
    public final C0656n f4107a;
    public Bitmap f4108b;
    public VolleyError f4109c;
    public final LinkedList f4110d = new LinkedList();

    public C0679u(C0656n c0656n, C0681w c0681w) {
        this.f4107a = c0656n;
        this.f4110d.add(c0681w);
    }

    public final boolean m4468a(C0681w c0681w) {
        this.f4110d.remove(c0681w);
        if (this.f4110d.size() != 0) {
            return false;
        }
        this.f4107a.mo1057f();
        return true;
    }
}
