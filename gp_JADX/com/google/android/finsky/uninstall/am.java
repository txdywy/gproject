package com.google.android.finsky.uninstall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import com.google.android.play.utils.UrlSpanUtils;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class am extends Fragment implements ad, C1031w, C1056b, bb {
    public bq f23486a;
    public ad af;
    public ce ag = C2482j.m13283a(5521);
    public long ah = 0;
    public ac f23487b = new ac();
    public ArrayList f23488c = new ArrayList();
    public LinearLayout f23489d;
    public PlayRecyclerView f23490e;
    public ba f23491f;
    public ButtonBar f23492g;
    public LinkTextView f23493h;
    public C2495w f23494i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.ag.e = new cf();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23489d = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_entry_selection_fragment, viewGroup, false);
        this.f23492g = (ButtonBar) this.f23489d.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.f23494i = ((UninstallManagerActivityV2) m603h()).f6316C;
        this.f23493h = (LinkTextView) this.f23489d.findViewById(C7582R.id.uninstall_manager_subtitle);
        this.f23490e = (PlayRecyclerView) this.f23489d.findViewById(C7582R.id.uninstall_selection_recycler_view);
        this.f23490e.setLayoutManager(new LinearLayoutManager());
        this.f23490e.setAdapter(new C3984a());
        C4594h c4594h = ((UninstallManagerActivityV2) m603h()).f23427N;
        this.f23486a = c4594h.f23607d;
        if (c4594h.f23608e) {
            m21292W();
        } else if (this.f23486a != null) {
            this.f23486a.mo4269a((C1031w) this);
        }
        return this.f23489d;
    }

    public final void mo979u() {
        super.mo979u();
        this.f23488c = new ArrayList();
    }

    public final void mo138d() {
        if (!(this.f23490e == null || this.f23490e.getVisibility() != 0 || this.f23491f == null)) {
            this.f23491f.m21348a(this.f23487b);
        }
        this.f23490e = null;
        if (this.f23491f != null) {
            this.f23491f.f23533h = null;
            this.f23491f = null;
        }
        this.f23492g = null;
        this.f23489d = null;
        super.mo138d();
    }

    public final void m_() {
        this.f23486a.mo4272b(this);
        m21292W();
    }

    private final void m21292W() {
        this.f23489d.setVisibility(0);
        if (this.f23486a != null) {
            CharSequence string;
            if (this.f23490e == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                boolean c = ba.m21342c(this.f23487b);
                if (this.f23491f == null) {
                    this.f23491f = new ba(m603h(), this);
                    this.f23490e.setAdapter(this.f23491f);
                    this.f23491f.f23533h = this;
                    if (c) {
                        this.f23491f.m21352b(this.f23487b);
                        this.f23487b.clear();
                    } else {
                        this.f23491f.m21349a(this.f23486a.mo4273c());
                    }
                    this.f23490e.setEmptyView(this.f23489d.findViewById(C7582R.id.no_results_view));
                } else {
                    this.f23491f.m21349a(this.f23486a.mo4273c());
                }
            }
            CharSequence string2 = m603h().getString(C7582R.string.uninstall_manager_no_installation_subtitle_accessibility);
            LinkTextView linkTextView = this.f23493h;
            PackageManager packageManager = m603h().getPackageManager();
            Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
            if (intent.resolveActivity(packageManager) == null) {
                intent = new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE");
                if (intent.resolveActivity(packageManager) == null) {
                    string = m603h().getString(C7582R.string.uninstall_manager_no_installation_subtitle_fallback);
                    linkTextView.setText(string);
                    this.f23493h.setContentDescription(string2);
                    this.f23493h.setMovementMethod(LinkMovementMethod.getInstance());
                    if (C1601a.m9200a(m601g())) {
                        C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23489d, false);
                        C1601a.m9199a(m601g(), string2, this.f23493h, false);
                    }
                    m21293Z();
                    this.af.mo1219a(this);
                    return;
                }
            }
            CharSequence fromHtml = Html.fromHtml(m603h().getString(C7582R.string.uninstall_manager_no_installation_subtitle_exact));
            UrlSpanUtils.a(fromHtml, null, new an(this, intent));
            string = fromHtml;
            linkTextView.setText(string);
            this.f23493h.setContentDescription(string2);
            this.f23493h.setMovementMethod(LinkMovementMethod.getInstance());
            if (C1601a.m9200a(m601g())) {
                C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23489d, false);
                C1601a.m9199a(m601g(), string2, this.f23493h, false);
            }
            m21293Z();
            this.af.mo1219a(this);
            return;
        }
        FinskyLog.m21669e("Binding null data model", new Object[0]);
    }

    private final void m21293Z() {
        boolean z = true;
        this.f23492g.setPositiveButtonTitle((int) C7582R.string.continue_text);
        this.f23492g.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f23492g.setClickListener(this);
        this.f23492g.setNegativeButtonEnabled(true);
        if (this.ah <= 0) {
            z = false;
        }
        this.f23492g.setPositiveButtonEnabled(z);
        Resources i = m605i();
        if (z) {
            this.f23492g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_enabled_text_color));
        } else {
            this.f23492g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_disabled_text_color));
        }
    }

    public final void v_() {
        this.f23494i.m13379b(new C2475d(this).m13256a(5526));
        this.f23488c = null;
        bl.m21377a().m21381a(this.f23488c);
        m603h().onBackPressed();
    }

    public final void u_() {
        this.f23494i.m13379b(new C2475d(this).m13256a(5525));
        this.f23488c.addAll(this.f23491f.m21351b());
        bl.m21377a().m21381a(this.f23488c);
        ((UninstallManagerActivityV2) m603h()).f23427N.m21396a(2);
    }

    public final void mo4276a(boolean z, long j) {
        if (z) {
            this.ah++;
        } else {
            this.ah--;
        }
        m21293Z();
    }

    public final ce getPlayStoreUiElement() {
        return this.ag;
    }

    public final ad getParentNode() {
        return this.af;
    }

    public final void mo1219a(ad adVar) {
        this.af.mo1219a(adVar);
    }
}
