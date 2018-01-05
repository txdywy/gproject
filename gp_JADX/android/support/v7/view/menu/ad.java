package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0397d;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class ad {
    public final Context f2679a;
    public final C0471p f2680b;
    public final boolean f2681c;
    public final int f2682d;
    public final int f2683e;
    public View f2684f;
    public int f2685g;
    public boolean f2686h;
    public ag f2687i;
    public ac f2688j;
    public OnDismissListener f2689k;
    public final OnDismissListener f2690l;

    public ad(Context context, C0471p c0471p, View view, boolean z, int i) {
        this(context, c0471p, view, z, i, 0);
    }

    public ad(Context context, C0471p c0471p, View view, boolean z, int i, int i2) {
        this.f2685g = 8388611;
        this.f2690l = new ae(this);
        this.f2679a = context;
        this.f2680b = c0471p;
        this.f2684f = view;
        this.f2681c = z;
        this.f2682d = i;
        this.f2683e = i2;
    }

    public final void m2789a(boolean z) {
        this.f2686h = z;
        if (this.f2688j != null) {
            this.f2688j.mo673b(z);
        }
    }

    public final ac m2786a() {
        if (this.f2688j == null) {
            ac c0475g;
            Display defaultDisplay = ((WindowManager) this.f2679a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= this.f2679a.getResources().getDimensionPixelSize(C0397d.abc_cascading_menus_min_smallest_width)) {
                c0475g = new C0475g(this.f2679a, this.f2684f, this.f2682d, this.f2683e, this.f2681c);
            } else {
                c0475g = new am(this.f2679a, this.f2680b, this.f2684f, this.f2682d, this.f2683e, this.f2681c);
            }
            c0475g.mo664a(this.f2680b);
            c0475g.mo667a(this.f2690l);
            c0475g.mo666a(this.f2684f);
            c0475g.mo663a(this.f2687i);
            c0475g.mo673b(this.f2686h);
            c0475g.mo662a(this.f2685g);
            this.f2688j = c0475g;
        }
        return this.f2688j;
    }

    public final boolean m2790b() {
        if (m2793e()) {
            return true;
        }
        if (this.f2684f == null) {
            return false;
        }
        m2787a(0, 0, false, false);
        return true;
    }

    final void m2787a(int i, int i2, boolean z, boolean z2) {
        ac a = m2786a();
        a.mo676c(z2);
        if (z) {
            if ((C0357n.m2043a(this.f2685g, ai.f1848a.mo400k(this.f2684f)) & 7) == 5) {
                i += this.f2684f.getWidth();
            }
            a.mo672b(i);
            a.mo675c(i2);
            int i3 = (int) ((this.f2679a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f2678A = new Rect(i - i3, i2 - i3, i + i3, i3 + i2);
        }
        a.mo671b();
    }

    public final void m2791c() {
        if (m2793e()) {
            this.f2688j.mo674c();
        }
    }

    public void mo927d() {
        this.f2688j = null;
        if (this.f2689k != null) {
            this.f2689k.onDismiss();
        }
    }

    public final boolean m2793e() {
        return this.f2688j != null && this.f2688j.mo677d();
    }

    public final void m2788a(ag agVar) {
        this.f2687i = agVar;
        if (this.f2688j != null) {
            this.f2688j.mo663a(agVar);
        }
    }
}
