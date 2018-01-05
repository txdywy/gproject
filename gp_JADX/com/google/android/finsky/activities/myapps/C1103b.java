package com.google.android.finsky.activities.myapps;

import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.layout.play.PlayListView;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.ac;
import com.google.android.play.p203b.C6275o;
import com.squareup.leakcanary.C7582R;

public final class C1103b extends C1102m {
    public final C2197a f6990a;
    public ViewGroup f6991b;
    public final C1101a f6992c;
    public ac f6993d = ac.f24031a;
    public PlayListView f6994e;
    public boolean f6995f;

    public C1103b(C1036b c1036b, C1254c c1254c, DfeToc dfeToc, C3748a c3748a, C2197a c2197a, ad adVar, C2495w c2495w) {
        super(c1036b, c1254c, dfeToc, c3748a, c2495w);
        this.f6990a = c2197a;
        this.f6992c = new C1101a(c1036b, c3748a, adVar, c2495w);
    }

    protected final C1100e mo1434d() {
        return this.f6992c;
    }

    protected final View mo1435e() {
        return this.f6991b;
    }

    protected final ListView mo1436f() {
        return this.f6994e;
    }

    protected final Document mo1433a(View view) {
        return (Document) view.getTag();
    }

    protected final void mo1437g() {
        C2335k c2335k;
        C1101a c1101a;
        m6794j();
        String a = this.i.mo1616a(3, "u-tpl", 1, this.f6990a.mo2791f("u-tpl"));
        if (this.f6993d != null && this.f6993d.m21689a("MyAppsEarlyAccessTab.ListData")) {
            c2335k = (C2720j) this.f6993d.m21690b("MyAppsEarlyAccessTab.ListData");
            if (a.equals(c2335k.f14928d)) {
                c2335k.f14909b = this.i;
                this.n = c2335k;
                ((C2720j) this.n).m11918a((C1031w) this);
                ((C2720j) this.n).m11917a((C0657w) this);
                ((C2720j) this.n).m14699n();
                c1101a = this.f6992c;
                c1101a.f6976a = (C2720j) this.n;
                c1101a.notifyDataSetChanged();
            }
        }
        C1473m.f7980a.aO();
        c2335k = C2721l.m14733a(this.i, a, true, true);
        this.n = c2335k;
        ((C2720j) this.n).m11918a((C1031w) this);
        ((C2720j) this.n).m11917a((C0657w) this);
        ((C2720j) this.n).m14699n();
        c1101a = this.f6992c;
        c1101a.f6976a = (C2720j) this.n;
        c1101a.notifyDataSetChanged();
    }

    protected final void mo1438h() {
        ((C2720j) this.n).ac_();
        ((C2720j) this.n).f14893l = null;
        ((C2720j) this.n).m14699n();
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.f17273c.f17153d == 6 || c3369m.f17273c.f17153d == 8) {
            this.f6992c.m_();
            this.f6992c.notifyDataSetChanged();
        }
    }

    public final void mo1204a(C2197a c2197a) {
    }

    public final View mo1309a() {
        if (this.f6991b == null) {
            this.f6991b = (ViewGroup) this.h.inflate(C7582R.layout.my_apps_early_access, null);
        }
        return this.f6991b;
    }

    public final void m_() {
        super.m_();
        if (!this.f6995f) {
            this.f6995f = true;
            this.f6994e = (PlayListView) this.f6991b.findViewById(C7582R.id.my_apps_content_list);
            int a = C1473m.f7980a.av().m9275a(this.f6994e.getResources());
            ai.m1823a(this.f6994e, a, this.f6994e.getPaddingTop(), a, this.f6994e.getPaddingBottom());
            this.f6994e.setAnimateChanges(true);
            this.f6994e.setAdapter(this.f6992c);
            this.f6994e.setItemsCanFocus(true);
            this.f6994e.setRecyclerListener(this.f6992c);
            if (this.f6993d.m21689a("MyAppsEarlyAccessTab.KeyListParcel")) {
                this.f6994e.onRestoreInstanceState((Parcelable) this.f6993d.m21690b("MyAppsEarlyAccessTab.KeyListParcel"));
            }
            PlayListView playListView = this.f6994e;
            playListView.f18737d = true;
            Resources resources = playListView.getContext().getResources();
            playListView.f18739f = new C6275o(resources, resources.getColorStateList(C7582R.color.play_card_light_background), (float) resources.getDimensionPixelSize(C7582R.dimen.stream_intro_card_radius), (float) resources.getDimensionPixelSize(C7582R.dimen.play_card_default_elevation), 0.0f);
        }
        m6795l();
        this.f6992c.m_();
        if (!((C2720j) this.n).f14901t && this.f6992c.getCount() == 0) {
            MyAppsEmptyView myAppsEmptyView = (MyAppsEmptyView) mo1435e().findViewById(C7582R.id.no_results_view);
            if (myAppsEmptyView != null) {
                myAppsEmptyView.m6773a(this.f6984j, this.f6985k, false, C7582R.string.no_results, this.f6989o);
                mo1436f().setEmptyView(myAppsEmptyView);
            }
        }
    }

    public final ac mo1312b() {
        ac acVar = new ac();
        if (this.n != null && ((C2720j) this.n).mo2861a()) {
            acVar.m21688a("MyAppsEarlyAccessTab.ListData", this.n);
        }
        if (this.f6994e != null) {
            acVar.m21688a("MyAppsEarlyAccessTab.KeyListParcel", this.f6994e.onSaveInstanceState());
        }
        super.mo1312b();
        return acVar;
    }

    public final void mo1310a(ac acVar) {
        if (acVar != null) {
            this.f6993d = acVar;
        }
    }
}
