package com.google.android.finsky.activities.myapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.ListView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.layoutswitcher.C3733a;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public abstract class C1102m implements OnClickListener, C0657w, gt, C0999d, C1031w, C1003o {
    public final C1036b f6981g;
    public final LayoutInflater f6982h = LayoutInflater.from(this.f6981g);
    public final C1254c f6983i;
    public final DfeToc f6984j;
    public final C3748a f6985k;
    public VolleyError f6986l;
    public final C2206c f6987m;
    public C2335k f6988n;
    public final C2495w f6989o;

    protected C1102m(C1036b c1036b, C1254c c1254c, DfeToc dfeToc, C3748a c3748a, C2495w c2495w) {
        this.f6981g = c1036b;
        this.f6983i = c1254c;
        this.f6984j = dfeToc;
        this.f6985k = c3748a;
        this.f6989o = c2495w;
        C1473m.f7980a.mo2256o();
        C1473m.f7980a.bw().mo3481a((C1003o) this);
        this.f6987m = C1473m.f7980a.ah();
        this.f6987m.mo2814a((C0999d) this);
    }

    protected abstract Document mo1433a(View view);

    protected abstract C1100e mo1434d();

    protected abstract View mo1435e();

    protected abstract ListView mo1436f();

    protected abstract void mo1437g();

    protected abstract void mo1438h();

    public ac mo1312b() {
        m6794j();
        C1473m.f7980a.bw().mo3484b((C1003o) this);
        this.f6987m.mo2819b(this);
        return null;
    }

    protected final boolean m6793i() {
        return this.f6988n != null && this.f6988n.mo2861a();
    }

    protected final void m6794j() {
        if (this.f6988n != null) {
            this.f6988n.m11922b((C1031w) this);
            this.f6988n.m11921b((C0657w) this);
            this.f6988n = null;
        }
    }

    public void onClick(View view) {
        View view2;
        int i;
        View view3;
        if (view.getId() == C7582R.id.accessibility_overlay) {
            view2 = (View) view.getParent();
        } else {
            view2 = view;
        }
        if (mo1433a(view2) == null) {
            i = -1;
        } else {
            ViewParent f = mo1436f();
            view3 = view2;
            while (view3 != null) {
                ViewParent parent = view3.getParent();
                if (parent == f) {
                    i = f.getPositionForView(view2);
                    break;
                } else if (!(parent instanceof View)) {
                    i = -1;
                    break;
                } else {
                    view3 = (View) parent;
                }
            }
            i = -1;
        }
        if (i == -1) {
            FinskyLog.m21669e("The position of the view is invalid", new Object[0]);
            return;
        }
        Document a = mo1434d().mo1429a(i);
        this.f6989o.m13379b(new C2475d((ad) ((d) view).getLoggingData()));
        if (C3760e.m17903a()) {
            view3 = view.findViewById(C7582R.id.li_thumbnail);
        } else {
            view3 = null;
        }
        this.f6985k.mo3654a(a, null, view3, this.f6989o);
    }

    protected final void m6795l() {
        View e = mo1435e();
        View findViewById = e.findViewById(C7582R.id.lists_loading_indicator);
        View findViewById2 = e.findViewById(C7582R.id.page_error_indicator);
        ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout = (ErrorIndicatorWithNotifyLayout) e.findViewById(C7582R.id.page_error_indicator_with_notifier);
        ListView listView = (ListView) e.findViewById(C7582R.id.my_apps_content_list);
        if (this.f6986l != null) {
            C3733a.m17614a(findViewById2, errorIndicatorWithNotifyLayout, new C1113n(this), C1473m.f7980a.mo2262u().m17616a(), C1290m.m7702a(C1473m.f7980a.f7981b, this.f6986l));
            findViewById.setVisibility(8);
            listView.setVisibility(8);
        } else if (m6793i()) {
            listView.setVisibility(0);
            findViewById2.setVisibility(8);
            errorIndicatorWithNotifyLayout.setVisibility(8);
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            errorIndicatorWithNotifyLayout.setVisibility(8);
            listView.setVisibility(8);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f6986l = volleyError;
        m6795l();
    }

    public void m_() {
        this.f6986l = null;
    }

    public final void mo1311a(boolean z) {
    }

    public final void ab_() {
    }
}
