package com.google.android.finsky.stream.controllers.inlinetopcharts.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.p028a.C0216d;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ev;
import android.support.v7.widget.ew;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2733z;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.nestedrecyclerviews.NestedChildRecyclerView;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.utils.ac;
import com.squareup.leakcanary.C7582R;

public final class C4428h implements gt, C1031w, C2733z, C1043h {
    public final Context f22506a;
    public final C3748a f22507b;
    public final C2495w f22508c;
    public final ao f22509d;
    public final LayoutInflater f22510e = LayoutInflater.from(this.f22506a);
    public final boolean f22511f;
    public C2720j f22512g;
    public ai f22513h;
    public ViewGroup f22514i;
    public boolean f22515j;
    public C4423c f22516k;
    public NestedChildRecyclerView f22517l;
    public C3166e f22518m;
    public Parcelable f22519n;
    public C4425k f22520o;
    public ff f22521p;
    public int f22522q;

    public C4428h(Context context, C3748a c3748a, C2495w c2495w, ao aoVar, Parcelable parcelable, C4425k c4425k, ff ffVar, boolean z, ai aiVar) {
        this.f22506a = context;
        this.f22508c = c2495w;
        this.f22509d = aoVar;
        this.f22507b = c3748a;
        this.f22519n = parcelable;
        this.f22520o = c4425k;
        this.f22521p = ffVar;
        this.f22511f = z;
        this.f22513h = aiVar;
        this.f22516k = new C4423c(this.f22506a, this.f22507b, this.f22508c, this.f22509d);
    }

    public final void m20737a(C2720j c2720j) {
        if (c2720j != null) {
            if (this.f22512g != null) {
                this.f22512g.m11922b((C1031w) this);
                this.f22512g.m14690b((C2733z) this);
            }
            this.f22512g = c2720j;
            this.f22512g.m11918a((C1031w) this);
            this.f22512g.m14682a((C2733z) this);
            if (this.f22514i != null) {
                m20734b(true);
            }
        }
    }

    public final Parcelable m20742c() {
        if (this.f22517l == null || this.f22517l.getLayoutManager() == null) {
            return null;
        }
        return this.f22517l.getLayoutManager().mo742d();
    }

    public final View mo1309a() {
        if (this.f22514i == null) {
            this.f22514i = (FrameLayout) this.f22510e.inflate(C7582R.layout.nested_child_recycler_tab_wrapper, null);
            this.f22518m = new C3166e(this.f22514i, C7582R.id.data_view, C7582R.id.page_error_indicator, C7582R.id.lists_loading_indicator, this, 0);
            this.f22517l = (NestedChildRecyclerView) this.f22514i.findViewById(C7582R.id.tab_recycler_view);
            ew linearLayoutManager = new LinearLayoutManager();
            this.f22517l.setLayoutManager(linearLayoutManager);
            this.f22517l.setHasFixedSize(true);
            this.f22517l.setRecycledViewPool(this.f22521p);
            this.f22517l.setAdapter(this.f22516k);
            Drawable a = C0216d.m1112a(this.f22506a, (int) C7582R.drawable.inline_top_charts_item_divider);
            if (a != null) {
                ev c4429i = new C4429i(this.f22517l.getContext(), linearLayoutManager.f2962i);
                if (a == null) {
                    throw new IllegalArgumentException("Drawable cannot be null.");
                }
                c4429i.f20083b = a;
                this.f22517l.m278a(c4429i);
            }
            m20734b(true);
        }
        return this.f22514i;
    }

    public final void mo1311a(boolean z) {
        if (z != this.f22515j) {
            this.f22515j = z;
            if (z && this.f22517l != null && this.f22511f) {
                if ((this.f22517l.aI != null ? 1 : null) != null) {
                    this.f22517l.mo2964u();
                } else {
                    NestedChildRecyclerView nestedChildRecyclerView = this.f22517l;
                    C4430j c4430j = new C4430j(this);
                    if (!nestedChildRecyclerView.aG.contains(c4430j)) {
                        nestedChildRecyclerView.aG.add(c4430j);
                    }
                }
            }
            if (this.f22513h != null) {
                C2482j.m13305c(this.f22513h);
                this.f22513h.m13206a(z);
                if (this.f22513h.getParentNode().getPlayStoreUiElement().f.length == 0) {
                    C2482j.m13290a(this.f22514i);
                }
            }
        }
    }

    public final ac mo1312b() {
        this.f22514i = null;
        this.f22516k = null;
        if (this.f22517l != null) {
            this.f22517l.setAdapter(null);
            this.f22517l.setRecycledViewPool(null);
            this.f22517l = null;
        }
        if (this.f22512g != null) {
            this.f22512g.m11922b((C1031w) this);
            this.f22512g.m14690b((C2733z) this);
            this.f22512g = null;
        }
        return null;
    }

    public final void mo1310a(ac acVar) {
    }

    public final void n_() {
        this.f22520o.mo4203e();
    }

    public final void m_() {
        m20734b(false);
    }

    public final void mo4162a(int i, int i2) {
        if (this.f22516k != null) {
            this.f22516k.m3634d(i, i2);
            this.f22522q = this.f22512g.m14698m();
        }
    }

    public final void mo4165b(int i, int i2) {
        if (this.f22516k != null) {
            if (this.f22517l != null) {
                boolean z;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f22517l.getLayoutManager();
                if (linearLayoutManager != null) {
                    View a = linearLayoutManager.m3091a(0, linearLayoutManager.m3060p(), true, false);
                    if ((a == null ? -1 : ew.m2979a(a)) == 0) {
                        z = true;
                        if (z) {
                            this.f22517l.mo2963c(0);
                        }
                    }
                }
                z = false;
                if (z) {
                    this.f22517l.mo2963c(0);
                }
            }
            this.f22516k.m3632c(i, i2);
            this.f22522q = this.f22512g.m14698m();
        }
    }

    public final void mo4170e() {
    }

    private final void m20734b(boolean z) {
        if (this.f22514i != null && this.f22518m != null) {
            if (this.f22512g != null && this.f22512g.mo3128h()) {
                this.f22518m.m16127a(1, C1290m.m7702a(this.f22506a, this.f22512g.mo3127g()));
            } else if (this.f22512g == null || !this.f22512g.mo2861a() || this.f22512g.m14698m() <= 0 || this.f22516k == null) {
                this.f22518m.m16127a(0, null);
            } else {
                this.f22518m.mo3397a();
                C4423c c4423c = this.f22516k;
                C2720j c2720j = this.f22512g;
                ad adVar = this.f22513h;
                c4423c.f22484c = c2720j;
                c4423c.f22487f = adVar;
                if (z) {
                    this.f22522q = this.f22512g.m14698m();
                    this.f22516k.f3433a.m3638b();
                } else {
                    int i = this.f22522q;
                    this.f22522q = this.f22512g.m14698m();
                    if (this.f22522q > i) {
                        this.f22516k.m3632c(i, this.f22522q - i);
                    } else if (i > this.f22522q) {
                        this.f22516k.m3634d(this.f22522q, i - this.f22522q);
                    } else {
                        this.f22516k.f3433a.m3638b();
                    }
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f22517l.getLayoutManager();
                if (this.f22519n != null && linearLayoutManager != null) {
                    linearLayoutManager.mo728a(this.f22519n);
                    this.f22519n = null;
                }
            }
        }
    }
}
