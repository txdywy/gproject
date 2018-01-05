package com.google.android.finsky.uninstall;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Html;
import android.text.format.Formatter;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.frameworkviews.LinkTextView;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.bb;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class ap extends C1045b implements C1056b, C0983h, bb, C4587q {
    public Document f23504a;
    public ac ag = new ac();
    public List ah = new ArrayList();
    public LinearLayout ai;
    public PlayRecyclerView aj;
    public ba ak;
    public ButtonBar al;
    public LinkTextView am;
    public TextView an;
    public ProgressBar ao;
    public ce ap = C2482j.m13283a(5521);
    public long aq;
    public C4597k f23505c;
    public as f23506f;
    public C3300k f23507h = C1473m.f7980a.mo2256o();

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        Bundle bundle2 = this.f760q;
        this.f23504a = (Document) bundle2.getParcelable("uninstall_manager_fragment_installing_doc");
        bundle2.getString("uninstall_manager_fragment_account_name");
        this.ap.e = new cf();
        this.ap.e.a(this.f23504a.m14625N().f13171k);
    }

    protected final int mo1298Z() {
        return C7582R.layout.uninstall_manager;
    }

    public final void mo139d(Bundle bundle) {
        CharSequence string;
        boolean z;
        super.mo139d(bundle);
        this.f23506f = (as) this.bm;
        this.ai = (LinearLayout) this.bt;
        this.al = (ButtonBar) this.bt.findViewById(C7582R.id.button_bar);
        this.am = (LinkTextView) this.bt.findViewById(C7582R.id.uninstall_manager_subtitle);
        this.an = (TextView) this.bt.findViewById(C7582R.id.uninstall_manager_storage_text);
        this.aj = (PlayRecyclerView) this.bt.findViewById(C7582R.id.uninstall_recycler_view);
        this.ao = (ProgressBar) this.bt.findViewById(C7582R.id.uninstall_manager_progress_bar);
        this.ao.setScaleY(2.0f);
        this.aj.setLayoutManager(new LinearLayoutManager());
        this.aj.setAdapter(new C3984a());
        CharSequence c = m592c((int) C7582R.string.uninstall_manager_subtitle_accessibility);
        LinkTextView linkTextView = this.am;
        PackageManager packageManager = this.bn.getPackageManager();
        Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
        if (intent.resolveActivity(packageManager) == null) {
            intent = new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE");
            if (intent.resolveActivity(packageManager) == null) {
                string = this.bn.getString(C7582R.string.uninstall_manager_subtitle_fallback);
                linkTextView.setText(string);
                this.am.setContentDescription(c);
                this.am.setMovementMethod(LinkMovementMethod.getInstance());
                C1473m.f7980a.mo2254m().mo3818a((C0983h) this);
                if (this.f23505c == null && this.f23505c.m21406a()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    au();
                    aa();
                } else {
                    cg_();
                }
                C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title), this.ai, false);
                C1601a.m9199a(m601g(), c, this.am, false);
            }
        }
        CharSequence fromHtml = Html.fromHtml(this.bn.getString(C7582R.string.uninstall_manager_subtitle_exact));
        UrlSpanUtils.a(fromHtml, null, new ar(this, intent));
        string = fromHtml;
        linkTextView.setText(string);
        this.am.setContentDescription(c);
        this.am.setMovementMethod(LinkMovementMethod.getInstance());
        C1473m.f7980a.mo2254m().mo3818a((C0983h) this);
        if (this.f23505c == null) {
        }
        z = false;
        if (z) {
            cg_();
        } else {
            au();
            aa();
        }
        C1601a.m9199a(m601g(), m592c((int) C7582R.string.uninstall_manager_title), this.ai, false);
        C1601a.m9199a(m601g(), c, this.am, false);
    }

    public final void mo138d() {
        C1473m.f7980a.mo2254m().mo3819b(this);
        if (!(this.aj == null || this.aj.getVisibility() != 0 || this.ak == null)) {
            this.ak.m21348a(this.ag);
        }
        this.aj = null;
        if (this.ak != null) {
            this.ak.f23533h = null;
            this.ak = null;
        }
        this.al = null;
        this.an = null;
        this.ao = null;
        this.ai = null;
        super.mo138d();
    }

    public final void cf_() {
        Activity h = m603h();
        if (!(h == null || h.isFinishing())) {
            h.finish();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new aq(this.f23504a.f14885a.f12100g, this.f23504a.m14625N().f13171k, this.bw), 500);
    }

    protected final void aa() {
        if (this.f23505c == null) {
            this.f23505c = new C4597k(this.f23504a);
            this.f23505c.f23637m = this;
            this.f23505c.f23636l = this;
        }
        Object obj = this.f23505c;
        Context h = m603h();
        obj.f23627c = false;
        obj.f23628d = false;
        obj.f23626b = false;
        if (obj.f23635k != null) {
            obj.f23635k.clear();
        }
        obj.f23639o = h;
        if (!obj.f23625a) {
            bb.m21792a(new C4602p(obj), new Void[0]);
        }
        new C4603r(obj).execute(new Void[0]);
        bb.m21792a(new C4601o(obj), new Void[0]);
        bl.m21377a().f23571a = obj;
        bl.m21377a().m21380a(obj.f23639o);
    }

    protected final void cg_() {
        this.ai.setVisibility(0);
        if (this.f23505c != null) {
            if (this.aj == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                boolean c = ba.m21342c(this.ag);
                if (this.ak == null) {
                    this.ak = new ba(this.bn, this);
                    this.aj.setAdapter(this.ak);
                    this.ak.f23533h = this;
                    if (c) {
                        this.ak.m21352b(this.ag);
                        this.ag.clear();
                    } else {
                        this.ak.m21349a(this.f23505c.f23634j);
                    }
                    this.aj.setEmptyView(this.bt.findViewById(C7582R.id.no_results_view));
                } else {
                    this.ak.m21349a(this.f23505c.f23634j);
                }
            }
            aj();
            ao();
            ap();
            return;
        }
        FinskyLog.m21669e("Binding null data model", new Object[0]);
    }

    private final void aj() {
        Resources i = m605i();
        if ((this.f23505c.f23631g - this.f23505c.f23632h) - this.aq > 0) {
            this.an.setText(i.getString(C7582R.string.uninstall_manager_space_to_free, new Object[]{Formatter.formatFileSize(this.bn, (this.f23505c.f23631g - this.f23505c.f23632h) - this.aq)}));
        } else {
            this.an.setText(i.getString(C7582R.string.uninstall_manager_done));
        }
        if (C1601a.m9200a(this.bn)) {
            C1601a.m9199a(this.bn, this.an.getText(), this.an, false);
        }
    }

    private final void ao() {
        long j = this.f23505c.f23631g - this.f23505c.f23632h;
        if (j > 0) {
            this.ao.setProgress((int) ((((float) this.aq) / ((float) j)) * ((float) this.ao.getMax())));
            return;
        }
        this.ao.setProgress(this.ao.getMax());
    }

    private final void ap() {
        boolean z = true;
        this.al.setPositiveButtonTitle((int) C7582R.string.continue_text);
        this.al.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.al.setClickListener(this);
        this.al.setNegativeButtonEnabled(true);
        if (this.f23505c.f23632h + this.aq <= this.f23505c.f23631g) {
            z = false;
        }
        this.al.setPositiveButtonEnabled(z);
        if (VERSION.SDK_INT <= 19) {
            Resources i = m605i();
            if (z) {
                this.al.setPositiveButtonTextColor(i.getColor(C7582R.color.play_uninstall_wizard_button_text_color));
            } else {
                this.al.setPositiveButtonTextColor(i.getColor(C7582R.color.play_secondary_text));
            }
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.ap;
    }

    public final void v_() {
        this.bw.m13379b(new C2475d(this).m13256a(5526));
        m603h().onBackPressed();
    }

    public final void u_() {
        this.bw.m13379b(new C2475d(this).m13256a(5525));
        this.ah.addAll(this.ak.m21351b());
        if (this.f23506f != null) {
            this.f23506f.mo4266d(1);
        }
    }

    public final void mo4276a(boolean z, long j) {
        if (z) {
            this.aq += j;
        } else {
            this.aq -= j;
        }
        if (this.aq < 0) {
            this.aq = 0;
        }
        ao();
        aj();
        ap();
    }

    public final void mo1176c(String str, boolean z) {
        if (!z) {
            for (C4604s c4604s : this.ah) {
                if (c4604s.f23653a.equals(str)) {
                    this.ah.remove(c4604s);
                    break;
                }
            }
            if (this.ah.isEmpty()) {
                this.aq = 0;
            }
        }
    }

    public final void mo1175b(String str, boolean z) {
        aa();
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
