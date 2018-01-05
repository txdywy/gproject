package com.google.android.finsky.stream.controllers.minitopcharts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.playcluster.C4285g;
import com.google.android.finsky.utils.ac;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;

public final class C4453b implements gt, C1043h {
    public final C3906g f22619a;
    public final Context f22620b;
    public final LayoutInflater f22621c;
    public final C3748a f22622d;
    public final C2495w f22623e;
    public final C4285g f22624f;
    public final ao f22625g;
    public Document f22626h;
    public C2720j f22627i;
    public int f22628j;
    public ac f22629k = ac.f24031a;
    public ai f22630l;
    public ViewGroup f22631m;
    public C3166e f22632n;
    public boolean f22633o = false;
    public final String[] f22634p;
    public boolean f22635q;

    C4453b(Context context, C3748a c3748a, LayoutInflater layoutInflater, C2495w c2495w, C4285g c4285g, int i, ao aoVar) {
        this.f22620b = context;
        this.f22622d = c3748a;
        this.f22621c = layoutInflater;
        this.f22623e = c2495w;
        this.f22624f = c4285g;
        this.f22628j = i;
        this.f22625g = aoVar;
        this.f22619a = new C3906g(C7582R.layout.flat_card_listing, 0, 0, 0.0f);
        this.f22634p = new String[i];
        Arrays.fill(this.f22634p, null);
    }

    public final View mo1309a() {
        if (this.f22631m == null) {
            this.f22631m = (ViewGroup) this.f22621c.inflate(C7582R.layout.jpkr_flat_mini_top_charts_tab_wrapper, null);
            this.f22632n = new C3166e(this.f22631m, C7582R.id.data_view, C7582R.id.page_error_indicator, C7582R.id.lists_loading_indicator, this, 0);
            m20811c();
        }
        return this.f22631m;
    }

    public final ac mo1312b() {
        ViewGroup viewGroup = (ViewGroup) this.f22631m.findViewById(C7582R.id.tab_content_view);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof d) {
                this.f22624f.m19889a((d) childAt, this.f22619a.f19735a);
            }
        }
        viewGroup.removeAllViews();
        this.f22631m = null;
        this.f22633o = false;
        return null;
    }

    public final void mo1310a(ac acVar) {
        if (this.f22629k != null) {
            this.f22629k = acVar;
        }
    }

    public final void m20813a(C2720j c2720j, ai aiVar) {
        this.f22627i = c2720j;
        this.f22630l = aiVar;
        if (this.f22631m != null) {
            m20811c();
        }
    }

    private final void m20811c() {
        if (this.f22631m != null) {
            if (this.f22627i.mo3128h()) {
                if (!this.f22633o) {
                    this.f22632n.m16127a(1, C1290m.m7702a(this.f22620b, this.f22627i.mo3127g()));
                }
            } else if (this.f22627i.mo2861a()) {
                this.f22626h = this.f22627i.f14908a;
                this.f22632n.mo3397a();
                ViewGroup viewGroup = (ViewGroup) this.f22631m.findViewById(C7582R.id.tab_content_view);
                View findViewById = this.f22631m.findViewById(C7582R.id.no_results_view);
                if (this.f22627i.m14698m() == 0) {
                    viewGroup.setVisibility(8);
                    findViewById.setVisibility(0);
                    return;
                }
                viewGroup.setVisibility(0);
                findViewById.setVisibility(8);
                if (viewGroup.getChildCount() == 0) {
                    for (int i = 0; i < this.f22628j; i++) {
                        viewGroup.addView(this.f22624f.m19888a(this.f22619a, this.f22621c, viewGroup));
                        this.f22634p[i] = "*dummy*";
                    }
                }
                this.f22630l.m13206a(this.f22635q);
                int min = Math.min(this.f22628j, this.f22627i.m14698m());
                for (int i2 = 0; i2 < min; i2++) {
                    Document document = (Document) this.f22627i.m14679a(i2, true);
                    if (!document.f14885a.f12096c.equals(this.f22634p[i2])) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!(childAt instanceof d)) {
                            viewGroup.removeViewAt(i2);
                            childAt = this.f22624f.m19888a(this.f22619a, this.f22621c, viewGroup);
                            viewGroup.addView(childAt, i2);
                        }
                        this.f22625g.m18517a((d) childAt, document, this.f22626h.f14885a.f12096c, this.f22622d, this.f22630l, this.f22627i.m14692c(i2), this.f22623e);
                        this.f22634p[i2] = document.f14885a.f12096c;
                    }
                }
                for (int i3 = min; i3 < this.f22628j; i3++) {
                    if (!"".equals(this.f22634p[i3])) {
                        findViewById = viewGroup.getChildAt(i3);
                        if (findViewById instanceof d) {
                            this.f22624f.m19889a((d) findViewById, this.f22619a.f19735a);
                            viewGroup.removeViewAt(i3);
                            viewGroup.addView(this.f22621c.inflate(C7582R.layout.jpkr_mini_top_charts_play_card_empty_list, viewGroup, false), i3);
                            this.f22634p[i3] = "";
                        } else {
                            String valueOf = String.valueOf(findViewById);
                            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unexpected view type found").append(valueOf).toString());
                        }
                    }
                }
            } else {
                this.f22632n.m16127a(0, null);
            }
        }
    }

    public final void n_() {
        this.f22627i.ac_();
        this.f22627i.f14893l = null;
        this.f22627i.m14699n();
        m20811c();
    }

    public final void mo1311a(boolean z) {
        if (z != this.f22635q) {
            this.f22630l.m13206a(z);
            this.f22635q = z;
        }
    }
}
