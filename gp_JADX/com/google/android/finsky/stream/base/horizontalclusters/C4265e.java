package com.google.android.finsky.stream.base.horizontalclusters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4264l;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4268m;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.utils.C6324f;
import java.util.List;

public final class C4265e implements C4264l, y {
    public Runnable f21541a;
    public Handler f21542b;
    public Context f21543c;
    public C1294w f21544d;
    public int[] f21545e;
    public List f21546f;
    public List f21547g;

    public C4265e(Context context, C1294w c1294w, List list, int[] iArr) {
        this.f21543c = context;
        int a = C6324f.m28966a(this.f21543c);
        Object obj = (a == 4 || a == 3 || a == 2) ? 1 : null;
        if (obj != null) {
            this.f21542b = new Handler(Looper.myLooper());
        }
        this.f21544d = c1294w;
        this.f21546f = list;
        this.f21545e = iArr;
    }

    public final void mo4077a(boolean z, int i, int i2, C4268m c4268m) {
        if (this.f21542b != null) {
            mo4076a();
            this.f21541a = new C4266f(this, i2, i, c4268m);
            if (z) {
                this.f21542b.postDelayed(this.f21541a, 500);
            } else {
                this.f21541a.run();
            }
        }
    }

    public final void mo4076a() {
        if (this.f21547g != null) {
            for (x a : this.f21547g) {
                a.a();
            }
            this.f21547g.clear();
        }
        if (this.f21542b != null && this.f21541a != null) {
            this.f21542b.removeCallbacks(this.f21541a);
        }
    }

    public final void m19799a(x xVar) {
        this.f21547g.remove(xVar);
    }

    final x m19797a(int i, int i2, int i3) {
        return af.m9223a(this.f21543c, (Document) this.f21546f.get(i), this.f21544d, i2, i3, this, this.f21545e);
    }

    public final /* synthetic */ void b_(Object obj) {
        m19799a((x) obj);
    }
}
