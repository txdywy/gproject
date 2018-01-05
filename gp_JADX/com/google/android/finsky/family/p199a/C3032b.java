package com.google.android.finsky.family.p199a;

import android.support.v4.view.ai;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.frameworkviews.C3145o;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.layoutswitcher.C3733a;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.utils.ac;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public abstract class C3032b implements C0657w, C1031w {
    public final C1045b f15864a;
    public final C3748a f15865b;
    public final C2495w f15866c;
    public final C1254c f15867d;
    public final ad f15868e;
    public boolean f15869f;
    public final ac f15870g = new ac();
    public final int f15871h;
    public final String f15872i;
    public VolleyError f15873j;
    public C4279n f15874k;
    public PlayRecyclerView f15875l;
    public ViewGroup f15876m;
    public LinearLayout f15877n;

    public C3032b(int i, String str, C3748a c3748a, C1045b c1045b, C2495w c2495w, C1254c c1254c, ad adVar) {
        this.f15871h = i;
        this.f15872i = str;
        this.f15865b = c3748a;
        this.f15864a = c1045b;
        this.f15866c = c2495w;
        this.f15867d = c1254c;
        this.f15868e = adVar;
    }

    public abstract void mo3287a(ImageView imageView, TextView textView, PlayActionButtonV2 playActionButtonV2);

    public abstract boolean mo3289e();

    public abstract void mo3290f();

    public abstract List mo3291g();

    public abstract boolean mo3292h();

    public final View m15644a() {
        if (this.f15876m == null) {
            this.f15876m = (ViewGroup) LayoutInflater.from(this.f15864a.m601g()).inflate(C7582R.layout.family_list_tab_recycler, null);
            this.f15875l = (PlayRecyclerView) this.f15876m.findViewById(C7582R.id.content_list);
            if (this.f15874k == null) {
                this.f15874k = new C4279n();
                this.f15874k.m19855a(mo3291g());
            }
            this.f15875l.setAdapter(this.f15874k);
            this.f15875l.m278a(new C3145o(this.f15864a.m601g().getResources()));
            int a = C1473m.f7980a.av().m9275a(this.f15875l.getResources());
            this.f15875l.m278a(new C4297g(a, a));
            this.f15874k.m19856b();
            this.f15874k.m19845a(this.f15870g);
            ai.m1823a(this.f15875l, 0, this.f15875l.getPaddingTop(), 0, this.f15875l.getPaddingBottom());
            this.f15877n = (LinearLayout) this.f15876m.findViewById(C7582R.id.family_no_results_view);
        }
        return this.f15876m;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f15873j = volleyError;
        m15648b();
    }

    public final void m15647a(boolean z) {
        if (z && !this.f15869f) {
            mo3293i();
        }
        this.f15869f = z;
    }

    public final void m15648b() {
        if (this.f15876m != null) {
            View findViewById = this.f15876m.findViewById(C7582R.id.lists_loading_indicator);
            View findViewById2 = this.f15876m.findViewById(C7582R.id.page_error_indicator);
            ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout = (ErrorIndicatorWithNotifyLayout) this.f15876m.findViewById(C7582R.id.page_error_indicator_with_notifier);
            if (this.f15873j != null) {
                C3733a.m17614a(findViewById2, errorIndicatorWithNotifyLayout, new C3033c(this), C1473m.f7980a.mo2262u().m17616a(), C1290m.m7702a(C1473m.f7980a.f7981b, this.f15873j));
                findViewById.setVisibility(8);
                this.f15875l.setVisibility(8);
            } else if (mo3289e()) {
                if (mo3292h()) {
                    this.f15875l.setVisibility(0);
                    this.f15877n.setVisibility(8);
                } else {
                    mo3287a((ImageView) this.f15877n.findViewById(C7582R.id.empty_list_image), (TextView) this.f15877n.findViewById(C7582R.id.no_results_textview), (PlayActionButtonV2) this.f15877n.findViewById(C7582R.id.navigation_button));
                    this.f15875l.setVisibility(8);
                    this.f15877n.setVisibility(0);
                }
                findViewById2.setVisibility(8);
                errorIndicatorWithNotifyLayout.setVisibility(8);
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
                errorIndicatorWithNotifyLayout.setVisibility(8);
                this.f15875l.setVisibility(8);
            }
        }
    }

    public void mo3288d() {
    }

    public void mo3293i() {
    }
}
