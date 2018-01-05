package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class C0474d implements af {
    public Context f2752a;
    public Context f2753b;
    public C0471p f2754c;
    public LayoutInflater f2755d;
    public ag f2756e;
    public int f2757f;
    public int f2758g;
    public ah f2759h;

    public C0474d(Context context, int i, int i2) {
        this.f2752a = context;
        this.f2755d = LayoutInflater.from(context);
        this.f2757f = i;
        this.f2758g = i2;
    }

    public abstract void mo924a(C0485t c0485t, ai aiVar);

    public void mo659a(Context context, C0471p c0471p) {
        this.f2753b = context;
        LayoutInflater.from(this.f2753b);
        this.f2754c = c0471p;
    }

    public ah mo922a(ViewGroup viewGroup) {
        if (this.f2759h == null) {
            this.f2759h = (ah) this.f2755d.inflate(this.f2757f, viewGroup, false);
            this.f2759h.mo64a(this.f2754c);
            mo668a(true);
        }
        return this.f2759h;
    }

    public void mo668a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2759h;
        if (viewGroup != null) {
            int i;
            if (this.f2754c != null) {
                this.f2754c.m2839i();
                ArrayList h = this.f2754c.m2838h();
                int size = h.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    C0485t c0485t = (C0485t) h.get(i2);
                    if (mo925a(c0485t)) {
                        View childAt = viewGroup.getChildAt(i);
                        C0485t itemData = childAt instanceof ai ? ((ai) childAt).getItemData() : null;
                        View a = mo923a(c0485t, childAt, viewGroup);
                        if (c0485t != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f2759h).addView(a, i);
                        }
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo926a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean mo926a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public final void mo663a(ag agVar) {
        this.f2756e = agVar;
    }

    public View mo923a(C0485t c0485t, View view, ViewGroup viewGroup) {
        ai aiVar;
        if (view instanceof ai) {
            aiVar = (ai) view;
        } else {
            aiVar = (ai) this.f2755d.inflate(this.f2758g, viewGroup, false);
        }
        mo924a(c0485t, aiVar);
        return (View) aiVar;
    }

    public boolean mo925a(C0485t c0485t) {
        return true;
    }

    public void mo665a(C0471p c0471p, boolean z) {
        if (this.f2756e != null) {
            this.f2756e.mo553a(c0471p, z);
        }
    }

    public boolean mo670a(ap apVar) {
        if (this.f2756e != null) {
            return this.f2756e.mo554a(apVar);
        }
        return false;
    }

    public boolean mo669a() {
        return false;
    }

    public final boolean mo660b(C0485t c0485t) {
        return false;
    }

    public final boolean mo661c(C0485t c0485t) {
        return false;
    }
}
