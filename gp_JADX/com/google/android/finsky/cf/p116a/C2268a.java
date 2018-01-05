package com.google.android.finsky.cf.p116a;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.Snackbar;
import android.support.design.widget.br;
import android.view.View;
import com.google.android.finsky.cf.C2272b;
import com.google.android.finsky.cg.C2267f;
import com.google.android.finsky.cg.C2278e;

public final class C2268a implements C2267f {
    public Runnable f11254a;
    public final Handler f11255b = new Handler(Looper.getMainLooper());
    public final View f11256c;
    public final C1063d f11257d;
    public final C2272b f11258e;
    public final C1064e f11259f;
    public Snackbar f11260g;

    public C2268a(View view, C1063d c1063d, C2272b c2272b, C1064e c1064e) {
        this.f11256c = view;
        this.f11257d = c1063d;
        this.f11258e = c2272b;
        this.f11259f = c1064e;
    }

    public final void mo2832a(Context context) {
        m11729b(context);
    }

    public final void m11729b(Context context) {
        if (C2268a.m11726c(context)) {
            m11727a();
        } else if (this.f11254a == null) {
            this.f11254a = new C2269b(this, context, this.f11256c.getResources());
            this.f11255b.postDelayed(this.f11254a, 5000);
        }
    }

    public final void m11727a() {
        if (this.f11254a != null) {
            this.f11255b.removeCallbacks(this.f11254a);
            this.f11254a = null;
        }
        if (this.f11260g != null) {
            if (br.m708a().m714c(this.f11260g.f664j)) {
                this.f11260g.m494a(3);
            }
        }
    }

    static boolean m11726c(Context context) {
        NetworkInfo a = C2278e.m11746a(context);
        return a != null && a.isConnected();
    }
}
