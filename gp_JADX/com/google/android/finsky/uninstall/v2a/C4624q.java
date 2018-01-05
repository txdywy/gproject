package com.google.android.finsky.uninstall.v2a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.frameworkviews.LinkTextView;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C4624q extends Fragment implements ad, C1031w, C1056b, ab {
    public ak f23795a;
    public C2495w af;
    public ad ag;
    public ce ah;
    public long ai = 0;
    public ac f23796b = new ac();
    public ArrayList f23797c = new ArrayList();
    public LinearLayout f23798d;
    public PlayRecyclerView f23799e;
    public aa f23800f;
    public ButtonBar f23801g;
    public LinkTextView f23802h;
    public TextView f23803i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.ah = C2482j.m13283a(aa().f23823m.mo4287a());
        this.ah.e = new cf();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23798d = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_entry_selection_fragment, viewGroup, false);
        this.f23801g = (ButtonBar) this.f23798d.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.af = aa().f23821k;
        this.f23802h = (LinkTextView) this.f23798d.findViewById(C7582R.id.uninstall_manager_subtitle);
        this.f23803i = (TextView) this.f23798d.findViewById(C7582R.id.uninstall_manager_title);
        this.f23799e = (PlayRecyclerView) this.f23798d.findViewById(C7582R.id.uninstall_selection_recycler_view);
        this.f23799e.setLayoutManager(new LinearLayoutManager());
        this.f23799e.setAdapter(new C3984a());
        this.f23795a = aa().f23815e.f23835c;
        if (aa().f23815e.mo968W()) {
            m21555W();
        } else {
            this.f23795a.mo4300a((C1031w) this);
        }
        return this.f23798d;
    }

    public final void mo979u() {
        super.mo979u();
        this.f23797c = new ArrayList();
    }

    public final void mo138d() {
        if (!(this.f23799e == null || this.f23799e.getVisibility() != 0 || this.f23800f == null)) {
            this.f23800f.m21442a(this.f23796b);
        }
        this.f23799e = null;
        if (this.f23800f != null) {
            this.f23800f.f23703h = null;
            this.f23800f = null;
        }
        this.f23801g = null;
        this.f23798d = null;
        super.mo138d();
    }

    public final void m_() {
        this.f23795a.mo4303b(this);
        m21555W();
    }

    private final void m21555W() {
        this.f23798d.setVisibility(0);
        if (this.f23795a != null) {
            if (this.f23799e == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                boolean c = aa.m21436c(this.f23796b);
                if (this.f23800f == null) {
                    this.f23800f = new aa(m603h(), this, aa().f23823m);
                    this.f23799e.setAdapter(this.f23800f);
                    this.f23800f.f23703h = this;
                    if (c) {
                        this.f23800f.m21446b(this.f23796b);
                        this.f23796b.clear();
                    } else {
                        this.f23800f.m21443a(this.f23795a.mo4304c());
                    }
                    this.f23799e.setEmptyView(this.f23798d.findViewById(C7582R.id.no_results_view));
                } else {
                    this.f23800f.m21443a(this.f23795a.mo4304c());
                }
            }
            CharSequence string = m603h().getString(C7582R.string.uninstall_manager_no_installation_subtitle_accessibility);
            this.f23803i.setText(aa().f23828r.mo4294a());
            this.f23802h.setText(aa().f23828r.mo4296b());
            this.f23802h.setContentDescription(string);
            this.f23802h.setMovementMethod(LinkMovementMethod.getInstance());
            if (C1601a.m9200a(m601g())) {
                C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23798d, false);
                C1601a.m9199a(m601g(), string, this.f23802h, false);
            }
            m21556Z();
            this.ag.mo1219a(this);
            return;
        }
        FinskyLog.m21669e("Binding null data model", new Object[0]);
    }

    private final void m21556Z() {
        boolean z = true;
        this.f23801g.setPositiveButtonTitle(aa().f23828r.mo4297c());
        this.f23801g.setNegativeButtonTitle(aa().f23828r.mo4298d());
        this.f23801g.setClickListener(this);
        this.f23801g.setNegativeButtonEnabled(true);
        if (this.ai <= 0) {
            z = false;
        }
        this.f23801g.setPositiveButtonEnabled(z);
        Resources i = m605i();
        if (z) {
            this.f23801g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_enabled_text_color));
        } else {
            this.f23801g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_disabled_text_color));
        }
    }

    public final void v_() {
        this.af.m13379b(new C2475d(this).m13256a(aa().f23823m.mo4291e()));
        this.f23797c = null;
        af.m21457a().m21460a(this.f23797c);
        m603h().onBackPressed();
    }

    public final void u_() {
        this.af.m13379b(new C2475d(this).m13256a(aa().f23823m.mo4291e()));
        this.f23797c.addAll(this.f23800f.m21445b());
        af.m21457a().m21460a(this.f23797c);
        aa().m21571a(1);
    }

    public final void mo4286a(boolean z, long j) {
        if (z) {
            this.ai++;
        } else {
            this.ai--;
        }
        m21556Z();
    }

    private final C4626s aa() {
        return ((C4607w) m603h()).mo1276k();
    }

    public final ce getPlayStoreUiElement() {
        return this.ah;
    }

    public final ad getParentNode() {
        return this.ag;
    }

    public final void mo1219a(ad adVar) {
        this.ag.mo1219a(adVar);
    }
}
