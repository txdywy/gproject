package com.google.android.finsky.uninstall.v2a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Html;
import android.text.format.Formatter;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.frameworkviews.LinkTextView;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class ad extends Fragment implements com.google.android.finsky.p111d.ad, C1031w, C1056b, ab {
    public ak f23707a;
    public ProgressBar af;
    public ImageView ag;
    public C2495w ah;
    public com.google.android.finsky.p111d.ad ai;
    public ce aj;
    public long ak;
    public ac f23708b = new ac();
    public ArrayList f23709c = new ArrayList();
    public LinearLayout f23710d;
    public PlayRecyclerView f23711e;
    public aa f23712f;
    public ButtonBar f23713g;
    public LinkTextView f23714h;
    public TextView f23715i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.aj = C2482j.m13283a(ac().f23823m.mo4287a());
        this.aj.e = new cf();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23710d = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_selection_fragment, viewGroup, false);
        this.f23713g = (ButtonBar) this.f23710d.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.ah = ac().f23821k;
        this.f23714h = (LinkTextView) this.f23710d.findViewById(C7582R.id.uninstall_manager_subtitle);
        this.f23715i = (TextView) this.f23710d.findViewById(C7582R.id.uninstall_manager_storage_text);
        this.f23711e = (PlayRecyclerView) this.f23710d.findViewById(C7582R.id.uninstall_selection_recycler_view);
        this.af = (ProgressBar) this.f23710d.findViewById(C7582R.id.uninstall_manager_progress_bar);
        this.af.getProgressDrawable().setColorFilter(m605i().getColor(C7582R.color.play_uninstall_wizard_background_color), Mode.SRC_IN);
        this.af.setScaleY(2.0f);
        this.f23711e.setLayoutManager(new LinearLayoutManager());
        this.f23711e.setAdapter(new C3984a());
        this.ag = (ImageView) this.f23710d.findViewById(C7582R.id.uninstall_manager_storage_image);
        this.ag.setImageDrawable(C0722q.m4782a(m605i(), (int) C7582R.raw.ic_done_green_24dp, null));
        this.f23707a = ac().f23815e.f23835c;
        if (ac().f23815e.mo968W()) {
            m21448W();
        } else {
            this.f23707a.mo4300a((C1031w) this);
        }
        return this.f23710d;
    }

    public final void mo979u() {
        super.mo979u();
        this.f23709c = new ArrayList();
    }

    public final void mo138d() {
        if (!(this.f23711e == null || this.f23711e.getVisibility() != 0 || this.f23712f == null)) {
            this.f23712f.m21442a(this.f23708b);
        }
        this.f23711e = null;
        if (this.f23712f != null) {
            this.f23712f.f23703h = null;
            this.f23712f = null;
        }
        this.f23713g = null;
        this.f23715i = null;
        this.af = null;
        this.f23710d = null;
        this.ag = null;
        if (this.f23707a != null) {
            this.f23707a.mo4303b(this);
            this.f23707a = null;
        }
        super.mo138d();
    }

    public final void m_() {
        this.f23707a.mo4303b(this);
        m21448W();
    }

    private final void m21448W() {
        this.f23710d.setVisibility(0);
        if (this.f23707a != null) {
            CharSequence quantityString;
            if (this.f23711e == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                boolean c = aa.m21436c(this.f23708b);
                if (this.f23712f == null) {
                    this.f23712f = new aa(m603h(), this, ac().f23823m);
                    this.f23711e.setAdapter(this.f23712f);
                    this.f23712f.f23703h = this;
                    if (c) {
                        this.f23712f.m21446b(this.f23708b);
                        this.f23708b.clear();
                    } else {
                        this.f23712f.m21443a(this.f23707a.mo4304c());
                    }
                    this.f23711e.setEmptyView(this.f23710d.findViewById(C7582R.id.no_results_view));
                } else {
                    this.f23712f.m21443a(this.f23707a.mo4304c());
                }
            }
            int size = this.f23707a.mo4305d().size();
            CharSequence quantityString2 = m605i().getQuantityString(C7582R.plurals.uninstall_manager_subtitle_accessibility_v2, size);
            LinkTextView linkTextView = this.f23714h;
            Resources i = m605i();
            PackageManager packageManager = m603h().getPackageManager();
            Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
            if (intent.resolveActivity(packageManager) == null) {
                intent = new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE");
                if (intent.resolveActivity(packageManager) == null) {
                    quantityString = i.getQuantityString(C7582R.plurals.uninstall_manager_subtitle_fallback_v2, size);
                    linkTextView.setText(quantityString);
                    this.f23714h.setContentDescription(quantityString2);
                    this.f23714h.setMovementMethod(LinkMovementMethod.getInstance());
                    if (C1601a.m9200a(m601g())) {
                        C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23710d, false);
                        C1601a.m9199a(m601g(), quantityString2, this.f23714h, false);
                    }
                    m21449Z();
                    aa();
                    ab();
                    this.ai.mo1219a(this);
                    return;
                }
            }
            CharSequence fromHtml = Html.fromHtml(i.getQuantityString(C7582R.plurals.uninstall_manager_subtitle_exact_v2, size));
            UrlSpanUtils.a(fromHtml, null, new ae(this, intent));
            quantityString = fromHtml;
            linkTextView.setText(quantityString);
            this.f23714h.setContentDescription(quantityString2);
            this.f23714h.setMovementMethod(LinkMovementMethod.getInstance());
            if (C1601a.m9200a(m601g())) {
                C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23710d, false);
                C1601a.m9199a(m601g(), quantityString2, this.f23714h, false);
            }
            m21449Z();
            aa();
            ab();
            this.ai.mo1219a(this);
            return;
        }
        FinskyLog.m21669e("Binding null data model", new Object[0]);
    }

    private final void m21449Z() {
        Resources i = m605i();
        if ((this.f23707a.mo4299a() - this.f23707a.mo4302b()) - this.ak > 0) {
            CharSequence string = i.getString(C7582R.string.uninstall_manager_space_to_free, new Object[]{Formatter.formatFileSize(m603h(), (this.f23707a.mo4299a() - this.f23707a.mo4302b()) - this.ak)});
            this.ag.setVisibility(8);
            this.f23715i.setText(string);
        } else {
            this.ag.setVisibility(0);
            this.f23715i.setText(i.getString(C7582R.string.uninstall_manager_done));
        }
        if (C1601a.m9200a(m603h())) {
            C1601a.m9199a(m603h(), this.f23715i.getText(), this.f23715i, false);
        }
    }

    private final void aa() {
        long a = this.f23707a.mo4299a() - this.f23707a.mo4302b();
        if (a > 0) {
            this.af.setProgress((int) ((((float) this.ak) / ((float) a)) * ((float) this.af.getMax())));
            return;
        }
        this.af.setProgress(this.af.getMax());
    }

    private final void ab() {
        boolean z = true;
        this.f23713g.setPositiveButtonTitle((int) C7582R.string.continue_text);
        this.f23713g.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f23713g.setClickListener(this);
        this.f23713g.setNegativeButtonEnabled(true);
        if (this.f23707a.mo4302b() + this.ak <= this.f23707a.mo4299a()) {
            z = false;
        }
        this.f23713g.setPositiveButtonEnabled(z);
        Resources i = m605i();
        if (z) {
            this.f23713g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_enabled_text_color));
        } else {
            this.f23713g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_disabled_text_color));
        }
    }

    public final void v_() {
        this.ah.m13379b(new C2475d(this).m13256a(ac().f23823m.mo4292f()));
        this.f23709c = null;
        af.m21457a().m21460a(this.f23709c);
        m603h().onBackPressed();
    }

    public final void u_() {
        this.ah.m13379b(new C2475d(this).m13256a(ac().f23823m.mo4291e()));
        this.f23709c.addAll(this.f23712f.m21445b());
        af.m21457a().m21460a(this.f23709c);
        ((C4607w) m603h()).mo1276k().m21571a(1);
    }

    public final void mo4286a(boolean z, long j) {
        if (z) {
            this.ak += j;
        } else {
            this.ak -= j;
        }
        aa();
        m21449Z();
        ab();
    }

    private final C4626s ac() {
        return ((C4607w) m603h()).mo1276k();
    }

    public final ce getPlayStoreUiElement() {
        return this.aj;
    }

    public final com.google.android.finsky.p111d.ad getParentNode() {
        return this.ai;
    }

    public final void mo1219a(com.google.android.finsky.p111d.ad adVar) {
        C2482j.m13291a((com.google.android.finsky.p111d.ad) this, adVar);
    }
}
