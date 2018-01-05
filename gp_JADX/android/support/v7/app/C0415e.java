package android.support.v7.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.C0390w;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.p025c.p026a.C0439b;
import android.util.Log;
import android.view.View;

public final class C0415e implements C0390w {
    public final C0406f f2427a;
    public final DrawerLayout f2428b;
    public C0439b f2429c;
    public boolean f2430d;
    public Drawable f2431e;
    public boolean f2432f;
    public boolean f2433g;
    public final int f2434h;
    public final int f2435i;
    public boolean f2436j;

    public C0415e(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, drawerLayout, i, i2, (byte) 0);
    }

    private C0415e(Activity activity, DrawerLayout drawerLayout, int i, int i2, byte b) {
        this.f2430d = true;
        this.f2432f = true;
        this.f2436j = false;
        if (activity instanceof C0405g) {
            this.f2427a = ((C0405g) activity).F_();
        } else if (VERSION.SDK_INT >= 18) {
            this.f2427a = new C0417i(activity);
        } else {
            this.f2427a = new C0416h(activity);
        }
        this.f2428b = drawerLayout;
        this.f2434h = i;
        this.f2435i = i2;
        this.f2429c = new C0439b(this.f2427a.mo512b());
        this.f2431e = m2619b();
    }

    public final void m2616a() {
        if (this.f2428b.m2099b()) {
            m2614a(1.0f);
        } else {
            m2614a(0.0f);
        }
        if (this.f2432f) {
            m2617a(this.f2429c, this.f2428b.m2099b() ? this.f2435i : this.f2434h);
        }
    }

    public final void mo614a(View view, float f) {
        if (this.f2430d) {
            m2614a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m2614a(0.0f);
        }
    }

    public final void b_(View view) {
        m2614a(1.0f);
        if (this.f2432f) {
            m2615b(this.f2435i);
        }
    }

    public final void a_(View view) {
        m2614a(0.0f);
        if (this.f2432f) {
            m2615b(this.f2434h);
        }
    }

    public final void g_(int i) {
    }

    public final void m2617a(Drawable drawable, int i) {
        if (!(this.f2436j || this.f2427a.mo513c())) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f2436j = true;
        }
        this.f2427a.mo511a(drawable, i);
    }

    private final void m2615b(int i) {
        this.f2427a.mo510a(i);
    }

    public final Drawable m2619b() {
        return this.f2427a.mo509a();
    }

    private final void m2614a(float f) {
        if (f == 1.0f) {
            this.f2429c.m2655a(true);
        } else if (f == 0.0f) {
            this.f2429c.m2655a(false);
        }
        this.f2429c.m2654a(f);
    }
}
