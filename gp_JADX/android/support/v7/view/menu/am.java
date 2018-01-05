package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.p040a.C0397d;
import android.support.v7.p040a.C0400g;
import android.support.v7.widget.dz;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class am extends ac implements af, OnKeyListener, OnItemClickListener, OnDismissListener {
    public final Context f2692a;
    public final C0471p f2693b;
    public final C0483o f2694c;
    public final boolean f2695d;
    public final int f2696e;
    public final int f2697f;
    public final int f2698g;
    public final dz f2699h;
    public final OnGlobalLayoutListener f2700i = new an(this);
    public final OnAttachStateChangeListener f2701j = new ao(this);
    public OnDismissListener f2702k;
    public View f2703l;
    public View f2704m;
    public ag f2705n;
    public ViewTreeObserver f2706o;
    public boolean f2707p;
    public boolean f2708q;
    public int f2709r;
    public int f2710s = 0;
    public boolean f2711t;

    public am(Context context, C0471p c0471p, View view, int i, int i2, boolean z) {
        this.f2692a = context;
        this.f2693b = c0471p;
        this.f2695d = z;
        this.f2694c = new C0483o(c0471p, LayoutInflater.from(context), this.f2695d);
        this.f2697f = i;
        this.f2698g = i2;
        Resources resources = context.getResources();
        this.f2696e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0397d.abc_config_prefDialogWidth));
        this.f2703l = view;
        this.f2699h = new dz(this.f2692a, this.f2697f, this.f2698g);
        c0471p.m2822a((af) this, context);
    }

    public final void mo673b(boolean z) {
        this.f2694c.f2810d = z;
    }

    public final void mo662a(int i) {
        this.f2710s = i;
    }

    public final void mo671b() {
        boolean z = true;
        if (!mo677d()) {
            if (this.f2707p || this.f2703l == null) {
                z = false;
            } else {
                this.f2704m = this.f2703l;
                this.f2699h.m3211a((OnDismissListener) this);
                this.f2699h.f3143A = this;
                this.f2699h.m3217f();
                View view = this.f2704m;
                boolean z2 = this.f2706o == null;
                this.f2706o = view.getViewTreeObserver();
                if (z2) {
                    this.f2706o.addOnGlobalLayoutListener(this.f2700i);
                }
                view.addOnAttachStateChangeListener(this.f2701j);
                this.f2699h.f3172y = view;
                this.f2699h.f3165r = this.f2710s;
                if (!this.f2708q) {
                    this.f2709r = ac.m2771a(this.f2694c, null, this.f2692a, this.f2696e);
                    this.f2708q = true;
                }
                this.f2699h.m3213b(this.f2709r);
                this.f2699h.m3219h();
                this.f2699h.f3151I = this.f2678A;
                this.f2699h.mo671b();
                ViewGroup viewGroup = this.f2699h.f3156i;
                viewGroup.setOnKeyListener(this);
                if (this.f2711t && this.f2693b.f2728o != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2692a).inflate(C0400g.abc_popup_menu_header_item_layout, viewGroup, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f2693b.f2728o);
                    }
                    frameLayout.setEnabled(false);
                    viewGroup.addHeaderView(frameLayout, null, false);
                }
                this.f2699h.mo753a(this.f2694c);
                this.f2699h.mo671b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void mo674c() {
        if (mo677d()) {
            this.f2699h.mo674c();
        }
    }

    public final void mo664a(C0471p c0471p) {
    }

    public final boolean mo677d() {
        return !this.f2707p && this.f2699h.f3153K.isShowing();
    }

    public final void onDismiss() {
        this.f2707p = true;
        this.f2693b.close();
        if (this.f2706o != null) {
            if (!this.f2706o.isAlive()) {
                this.f2706o = this.f2704m.getViewTreeObserver();
            }
            this.f2706o.removeGlobalOnLayoutListener(this.f2700i);
            this.f2706o = null;
        }
        this.f2704m.removeOnAttachStateChangeListener(this.f2701j);
        if (this.f2702k != null) {
            this.f2702k.onDismiss();
        }
    }

    public final void mo668a(boolean z) {
        this.f2708q = false;
        if (this.f2694c != null) {
            this.f2694c.notifyDataSetChanged();
        }
    }

    public final void mo663a(ag agVar) {
        this.f2705n = agVar;
    }

    public final boolean mo670a(ap apVar) {
        if (apVar.hasVisibleItems()) {
            boolean z;
            ad adVar = new ad(this.f2692a, apVar, this.f2704m, this.f2695d, this.f2697f, this.f2698g);
            adVar.m2788a(this.f2705n);
            adVar.m2789a(ac.m2773b((C0471p) apVar));
            adVar.f2685g = this.f2710s;
            adVar.f2689k = this.f2702k;
            this.f2702k = null;
            this.f2693b.m2824a(false);
            int i = this.f2699h.f3159l;
            int g = this.f2699h.m3218g();
            if (adVar.m2793e()) {
                z = true;
            } else if (adVar.f2684f == null) {
                z = false;
            } else {
                adVar.m2787a(i, g, true, true);
                z = true;
            }
            if (z) {
                if (this.f2705n != null) {
                    this.f2705n.mo554a(apVar);
                }
                return true;
            }
        }
        return false;
    }

    public final void mo665a(C0471p c0471p, boolean z) {
        if (c0471p == this.f2693b) {
            mo674c();
            if (this.f2705n != null) {
                this.f2705n.mo553a(c0471p, z);
            }
        }
    }

    public final boolean mo669a() {
        return false;
    }

    public final void mo666a(View view) {
        this.f2703l = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo674c();
        return true;
    }

    public final void mo667a(OnDismissListener onDismissListener) {
        this.f2702k = onDismissListener;
    }

    public final ListView mo678e() {
        return this.f2699h.f3156i;
    }

    public final void mo672b(int i) {
        this.f2699h.f3159l = i;
    }

    public final void mo675c(int i) {
        this.f2699h.m3208a(i);
    }

    public final void mo676c(boolean z) {
        this.f2711t = z;
    }
}
