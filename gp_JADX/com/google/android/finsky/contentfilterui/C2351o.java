package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.ab.C0970b;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class C2351o implements C0657w, C0660x {
    public Context f11546a;
    public List f11547b;
    public boolean f11548c;
    public Runnable f11549d;
    public Runnable f11550e;
    public final /* synthetic */ C2350n f11551f;

    public C2351o(C2350n c2350n, Context context, List list, boolean z, Runnable runnable, Runnable runnable2) {
        this.f11551f = c2350n;
        this.f11546a = context;
        this.f11547b = list;
        this.f11548c = z;
        this.f11549d = runnable;
        this.f11550e = runnable2;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f11546a, C7582R.string.content_filters_failed_to_save_toast, 0).show();
        if (this.f11550e != null) {
            this.f11550e.run();
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f11551f.f11539e = this.f11547b;
        this.f11551f.f11540f = this.f11548c;
        this.f11551f.f11542h = true;
        if (!this.f11551f.m11965c()) {
            C0970b[] c0970bArr = C2350n.f11535a;
            if (this.f11548c) {
                c0970bArr = (C0970b[]) this.f11551f.f11539e.toArray(new C0970b[this.f11551f.f11539e.size()]);
            } else {
                C0954a.f5839i.m5765c();
                this.f11551f.f11541g = false;
            }
            C0969a.m5795a(this.f11546a, this.f11551f.f11545k, this.f11551f.f11544j, this.f11551f.f11543i, this.f11548c, this.f11551f.f11536b, c0970bArr);
        }
        if (this.f11549d != null) {
            this.f11549d.run();
        }
    }
}
