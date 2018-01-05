package com.google.android.finsky.uninstall;

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

public final class bg extends Fragment implements ad, C1031w, C1056b, bb {
    public bq f23551a;
    public ProgressBar af;
    public ImageView ag;
    public C2495w ah;
    public ad ai;
    public ce aj = C2482j.m13283a(5521);
    public long ak;
    public ac f23552b = new ac();
    public ArrayList f23553c = new ArrayList();
    public LinearLayout f23554d;
    public PlayRecyclerView f23555e;
    public ba f23556f;
    public ButtonBar f23557g;
    public LinkTextView f23558h;
    public TextView f23559i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.aj.e = new cf();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23554d = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_selection_fragment, viewGroup, false);
        this.f23557g = (ButtonBar) this.f23554d.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.ah = ((UninstallManagerActivityV2) m603h()).f6316C;
        this.f23558h = (LinkTextView) this.f23554d.findViewById(C7582R.id.uninstall_manager_subtitle);
        this.f23559i = (TextView) this.f23554d.findViewById(C7582R.id.uninstall_manager_storage_text);
        this.f23555e = (PlayRecyclerView) this.f23554d.findViewById(C7582R.id.uninstall_selection_recycler_view);
        this.af = (ProgressBar) this.f23554d.findViewById(C7582R.id.uninstall_manager_progress_bar);
        this.af.getProgressDrawable().setColorFilter(m605i().getColor(C7582R.color.play_uninstall_wizard_background_color), Mode.SRC_IN);
        this.af.setScaleY(2.0f);
        this.f23555e.setLayoutManager(new LinearLayoutManager());
        this.f23555e.setAdapter(new C3984a());
        this.ag = (ImageView) this.f23554d.findViewById(C7582R.id.uninstall_manager_storage_image);
        this.ag.setImageDrawable(C0722q.m4782a(m605i(), (int) C7582R.raw.ic_done_green_24dp, null));
        C4594h c4594h = ((UninstallManagerActivityV2) m603h()).f23427N;
        this.f23551a = c4594h.f23607d;
        if (c4594h.f23608e) {
            m21367W();
        } else if (this.f23551a != null) {
            this.f23551a.mo4269a((C1031w) this);
        }
        return this.f23554d;
    }

    public final void mo979u() {
        super.mo979u();
        this.f23553c = new ArrayList();
    }

    public final void mo138d() {
        if (!(this.f23555e == null || this.f23555e.getVisibility() != 0 || this.f23556f == null)) {
            this.f23556f.m21348a(this.f23552b);
        }
        this.f23555e = null;
        if (this.f23556f != null) {
            this.f23556f.f23533h = null;
            this.f23556f = null;
        }
        this.f23557g = null;
        this.f23559i = null;
        this.af = null;
        this.f23554d = null;
        this.ag = null;
        if (this.f23551a != null) {
            this.f23551a.mo4272b(this);
            this.f23551a = null;
        }
        super.mo138d();
    }

    public final void m_() {
        this.f23551a.mo4272b(this);
        m21367W();
    }

    private final void m21367W() {
        this.f23554d.setVisibility(0);
        if (this.f23551a != null) {
            CharSequence quantityString;
            if (this.f23555e == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                boolean c = ba.m21342c(this.f23552b);
                if (this.f23556f == null) {
                    this.f23556f = new ba(m603h(), this);
                    this.f23555e.setAdapter(this.f23556f);
                    this.f23556f.f23533h = this;
                    if (c) {
                        this.f23556f.m21352b(this.f23552b);
                        this.f23552b.clear();
                    } else {
                        this.f23556f.m21349a(this.f23551a.mo4273c());
                    }
                    this.f23555e.setEmptyView(this.f23554d.findViewById(C7582R.id.no_results_view));
                } else {
                    this.f23556f.m21349a(this.f23551a.mo4273c());
                }
            }
            int size = this.f23551a.mo4274e().size();
            CharSequence quantityString2 = m605i().getQuantityString(C7582R.plurals.uninstall_manager_subtitle_accessibility_v2, size);
            LinkTextView linkTextView = this.f23558h;
            Resources i = m605i();
            PackageManager packageManager = m603h().getPackageManager();
            Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
            if (intent.resolveActivity(packageManager) == null) {
                intent = new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE");
                if (intent.resolveActivity(packageManager) == null) {
                    quantityString = i.getQuantityString(C7582R.plurals.uninstall_manager_subtitle_fallback_v2, size);
                    linkTextView.setText(quantityString);
                    this.f23558h.setContentDescription(quantityString2);
                    this.f23558h.setMovementMethod(LinkMovementMethod.getInstance());
                    if (C1601a.m9200a(m601g())) {
                        C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23554d, false);
                        C1601a.m9199a(m601g(), quantityString2, this.f23558h, false);
                    }
                    m21368Z();
                    aa();
                    ab();
                    this.ai.mo1219a(this);
                    return;
                }
            }
            CharSequence fromHtml = Html.fromHtml(i.getQuantityString(C7582R.plurals.uninstall_manager_subtitle_exact_v2, size));
            UrlSpanUtils.a(fromHtml, null, new bh(this, intent));
            quantityString = fromHtml;
            linkTextView.setText(quantityString);
            this.f23558h.setContentDescription(quantityString2);
            this.f23558h.setMovementMethod(LinkMovementMethod.getInstance());
            if (C1601a.m9200a(m601g())) {
                C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title_v2), this.f23554d, false);
                C1601a.m9199a(m601g(), quantityString2, this.f23558h, false);
            }
            m21368Z();
            aa();
            ab();
            this.ai.mo1219a(this);
            return;
        }
        FinskyLog.m21669e("Binding null data model", new Object[0]);
    }

    private final void m21368Z() {
        Resources i = m605i();
        if ((this.f23551a.mo4267a() - this.f23551a.mo4271b()) - this.ak > 0) {
            CharSequence string = i.getString(C7582R.string.uninstall_manager_space_to_free, new Object[]{Formatter.formatFileSize(m603h(), (this.f23551a.mo4267a() - this.f23551a.mo4271b()) - this.ak)});
            this.ag.setVisibility(8);
            this.f23559i.setText(string);
        } else {
            this.ag.setVisibility(0);
            this.f23559i.setText(i.getString(C7582R.string.uninstall_manager_done));
        }
        if (C1601a.m9200a(m603h())) {
            C1601a.m9199a(m603h(), this.f23559i.getText(), this.f23559i, false);
        }
    }

    private final void aa() {
        long a = this.f23551a.mo4267a() - this.f23551a.mo4271b();
        if (a > 0) {
            this.af.setProgress((int) ((((float) this.ak) / ((float) a)) * ((float) this.af.getMax())));
            return;
        }
        this.af.setProgress(this.af.getMax());
    }

    private final void ab() {
        boolean z = true;
        this.f23557g.setPositiveButtonTitle((int) C7582R.string.continue_text);
        this.f23557g.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f23557g.setClickListener(this);
        this.f23557g.setNegativeButtonEnabled(true);
        if (this.f23551a.mo4271b() + this.ak <= this.f23551a.mo4267a() || this.ak <= 0) {
            z = false;
        }
        this.f23557g.setPositiveButtonEnabled(z);
        Resources i = m605i();
        if (z) {
            this.f23557g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_enabled_text_color));
        } else {
            this.f23557g.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_positive_button_disabled_text_color));
        }
    }

    public final void v_() {
        this.ah.m13379b(new C2475d(this).m13256a(5526));
        this.f23553c = null;
        bl.m21377a().m21381a(this.f23553c);
        m603h().onBackPressed();
    }

    public final void u_() {
        this.ah.m13379b(new C2475d(this).m13256a(5525));
        this.f23553c.addAll(this.f23556f.m21351b());
        bl.m21377a().m21381a(this.f23553c);
        ((UninstallManagerActivityV2) m603h()).f23427N.m21396a(2);
    }

    public final void mo4276a(boolean z, long j) {
        if (z) {
            this.ak += j;
        } else {
            this.ak -= j;
        }
        aa();
        m21368Z();
        ab();
    }

    public final ce getPlayStoreUiElement() {
        return this.aj;
    }

    public final ad getParentNode() {
        return this.ai;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
