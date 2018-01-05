package com.google.android.finsky.contentfilterui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.ab.C0970b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.volley.C4774e;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import com.squareup.leakcanary.C7582R;

public final class C2346j extends C1045b implements OnClickListener, C0660x, C2345t {
    public final ce f11526a = C2482j.m13283a(5235);
    public C2162a ag;
    public C2350n ah;
    public View ai;
    public TextView aj;
    public SwitchCompat ak;
    public ViewGroup al;
    public TextView am;
    public TextView an;
    public boolean ao;
    public C0988c f11527c;
    public C2320a f11528f;
    public C4774e f11529h;
    public C1287h r_;
    public C2471a y_;

    public final void mo1292a(Activity activity) {
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1789a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        s_();
        this.f740L = true;
        if (this.f11527c.cY() == null) {
            this.bm.mo1244m();
        } else if (bundle == null) {
            this.bw.m13370a(new C2488p().m13345b(this));
        }
    }

    protected final int mo1298Z() {
        return C7582R.layout.content_filters_fragment;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.ai = a.findViewById(C7582R.id.content_filter_on_off_wrapper);
        this.aj = (TextView) a.findViewById(C7582R.id.content_filter_on_off_text);
        this.ak = (SwitchCompat) a.findViewById(C7582R.id.content_filter_on_off_toggle);
        this.am = (TextView) a.findViewById(C7582R.id.top_info_title);
        this.an = (TextView) a.findViewById(C7582R.id.top_info_text);
        this.al = (ViewGroup) a.findViewById(C7582R.id.filters_list);
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.bm.mo1241c(m592c((int) C7582R.string.content_filters3_title));
        if ((this.ah != null ? 1 : null) != null) {
            cg_();
        } else {
            aa();
        }
    }

    protected final void aa() {
        this.bs.m16127a(0, null);
        bb.m21792a(new C2357v(m603h(), this.f11527c.cY()), this);
    }

    protected final void cg_() {
        boolean z = false;
        this.al.removeAllViews();
        for (int i = 0; i < this.ah.f11536b.b.length; i++) {
            bi biVar = this.ah.f11536b.b[i];
            if (biVar.e() && biVar.e != null) {
                boolean z2;
                Object obj = biVar.l;
                int i2 = biVar.m;
                if (TextUtils.isEmpty(obj) || this.ah.m11965c()) {
                    z2 = true;
                } else {
                    int g = this.f11528f.mo2859g(obj);
                    z2 = g == -1 || g >= i2;
                }
                if (z2) {
                    ContentFilterLineView contentFilterLineView = (ContentFilterLineView) m603h().getLayoutInflater().inflate(C7582R.layout.content_filters_line, this.al, false);
                    CharSequence charSequence = biVar.f;
                    C2350n c2350n = this.ah;
                    int i3 = ((C0970b) c2350n.f11539e.get(i)).f5940c;
                    for (bh bhVar : c2350n.f11536b.b[i].e) {
                        if (C0969a.m5785a(bhVar) == i3) {
                            break;
                        }
                    }
                    bh bhVar2 = new bh();
                    CharSequence charSequence2 = bhVar2.h;
                    bd bdVar = biVar.g;
                    contentFilterLineView.f11487c.setText(charSequence);
                    if (charSequence2 != null) {
                        contentFilterLineView.f11489e.setText(charSequence2);
                    } else {
                        contentFilterLineView.f11489e.setVisibility(8);
                    }
                    if (bdVar != null) {
                        af.m9224a(contentFilterLineView.f11488d, bdVar);
                        contentFilterLineView.f11485a.m9288a(contentFilterLineView.f11488d, bdVar.f11860f, bdVar.f11863i);
                    }
                    contentFilterLineView.setOnClickListener(new C2348l(this, i));
                    this.al.addView(contentFilterLineView);
                }
            }
        }
        ContentFilterSettingsResponse contentFilterSettingsResponse = this.ah.f11536b;
        if ((contentFilterSettingsResponse.a & 2) != 0) {
            if ((contentFilterSettingsResponse.a & 4) != 0) {
                z = true;
            }
            if (z) {
                this.am.setText(Html.fromHtml(contentFilterSettingsResponse.e));
                this.an.setText(Html.fromHtml(contentFilterSettingsResponse.f));
                m11954a(this.ah.m11963a());
                this.ai.setOnClickListener(this);
            }
        }
        this.am.setVisibility(8);
        this.an.setVisibility(8);
        m11954a(this.ah.m11963a());
        this.ai.setOnClickListener(this);
    }

    public final void mo2865a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C7582R.menu.content_filters3_actions, menu);
        super.mo2865a(menu, menuInflater);
    }

    public final boolean mo2866a(MenuItem menuItem) {
        if (menuItem.getItemId() != C7582R.id.content_filters_help) {
            return super.mo2866a(menuItem);
        }
        this.ag.mo2698a(m603h(), this.ag.mo2689a(Uri.parse((String) C0955b.f5906v.m28964b())));
        return true;
    }

    public final void mo138d() {
        super.mo138d();
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.al = null;
        this.am = null;
        this.an = null;
    }

    public final ce getPlayStoreUiElement() {
        return this.f11526a;
    }

    public final void onClick(View view) {
        int i = 1;
        if (view == this.ai) {
            boolean z = !this.ak.isChecked();
            if (this.ah.m11964b()) {
                m11947e(z);
                return;
            }
            Bundle bundle = new Bundle();
            String str = "authSuccess";
            if (!z) {
                i = 2;
            }
            bundle.putInt(str, i);
            m11952a(bundle, z);
        }
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        super.mo2342a(i, i2, intent);
        if (i2 == -1) {
            String str = "result_key_extra_params";
            if (i == 2 || i == 1) {
                Object stringExtra = intent.getStringExtra("PinEntryDialog.resultPin");
                if (TextUtils.isEmpty(stringExtra)) {
                    FinskyLog.m21665c("Create / confirm PIN result OK but no PIN sent back.", new Object[0]);
                    return;
                }
                C0954a.f5839i.m5763a(stringExtra);
                m11945a(intent, "PinEntryDialog.extraParams");
            } else if (aj()) {
                m11946b(intent.getExtras(), true);
            } else {
                m11945a(intent, str);
            }
        }
    }

    private final void m11945a(Intent intent, String str) {
        this.ah.f11541g = true;
        Bundle bundleExtra = intent == null ? null : intent.getBundleExtra(str);
        if (bundleExtra != null) {
            switch (bundleExtra.getInt("authSuccess")) {
                case 1:
                    m11947e(true);
                    return;
                case 2:
                    m11947e(false);
                    return;
                case 3:
                    m11956b(bundleExtra.getInt("filterRangeIndex"));
                    return;
                default:
                    return;
            }
        }
    }

    final void m11952a(Bundle bundle, boolean z) {
        Object obj = 1;
        C2350n c2350n = this.ah;
        if (c2350n.f11536b.i.length <= 0) {
            CharSequence charSequence = c2350n.f11536b.g;
            if (TextUtils.isEmpty(charSequence) || c2350n.f11543i.cZ().equals(charSequence)) {
                obj = null;
            }
        }
        if (obj == null || (!this.ao && (this.ao || !aj()))) {
            m11946b(bundle, z);
            return;
        }
        startActivityForResult(new Intent(m603h(), GaiaPasswordVerificationDialog.class).putExtra("content_filter_response", C0757i.m4909a(this.ah.f11536b)).putExtra("result_key_extra_params", bundle), 3);
    }

    private final void m11946b(Bundle bundle, boolean z) {
        String str = (String) C0954a.f5839i.m5760a();
        C2495w a = this.y_.m13184a(null);
        if (TextUtils.isEmpty(str) || z) {
            Intent intent = new Intent(m603h(), PinEntryDialog.class);
            intent.putExtra("PinEntryDialog.isInEnterAndConfirmMode", true);
            intent.putExtra("PinEntryDialog.titleStringId", C7582R.string.pin_setup_label);
            intent.putExtra("PinEntryDialog.promptStringId", C7582R.string.pin_setup_summary);
            intent.putExtra("PinEntryDialog.confirmTitleStringId", C7582R.string.pin_confirm_label);
            intent.putExtra("PinEntryDialog.confirmPromptStringId", C7582R.string.pin_confirm_summary);
            a.m13376a(intent);
            intent.putExtra("PinEntryDialog.extraParams", bundle);
            startActivityForResult(intent, 1);
            return;
        }
        Intent intent2 = new Intent(m603h(), PinEntryDialog.class);
        intent2.putExtra("PinEntryDialog.isInEnterAndConfirmMode", false);
        intent2.putExtra("PinEntryDialog.titleStringId", C7582R.string.pin_entry_label);
        intent2.putExtra("PinEntryDialog.promptStringId", C7582R.string.pin_entry_summary);
        intent2.putExtra("PinEntryDialog.pinToMatch", str);
        a.m13376a(intent2);
        intent2.putExtra("PinEntryDialog.extraParams", bundle);
        startActivityForResult(intent2, 2);
    }

    private final void m11947e(boolean z) {
        Runnable c2347k = new C2347k(this, z);
        C2350n c2350n = this.ah;
        Context h = m603h();
        if (z) {
            C2351o c2351o = new C2351o(c2350n, h, c2350n.f11539e, true, c2347k, null);
            c2350n.f11544j.mo2015a().mo1601a(c2350n.f11538d, C2350n.m11962a(c2350n.f11539e), null, false, (C0660x) c2351o, (C0657w) c2351o);
            return;
        }
        c2350n.m11966d().m5763a(C0969a.m5791a((C0970b[]) c2350n.f11539e.toArray(new C0970b[c2350n.f11539e.size()])));
        c2351o = new C2351o(c2350n, h, c2350n.f11539e, false, c2347k, null);
        c2350n.f11544j.mo2015a().mo1601a(c2350n.f11538d, null, null, true, (C0660x) c2351o, (C0657w) c2351o);
    }

    final void m11954a(boolean z) {
        this.ak.setChecked(z);
        if (z) {
            this.am.setEnabled(true);
            this.an.setEnabled(true);
            this.aj.setText(this.ah.f11536b.k);
        } else {
            this.am.setEnabled(false);
            this.an.setEnabled(false);
            this.aj.setText(this.ah.f11536b.l);
        }
        for (int i = 0; i < this.al.getChildCount(); i++) {
            ((ContentFilterLineView) this.al.getChildAt(i)).setEnabled(z);
        }
    }

    final void m11956b(int i) {
        C2350n c2350n = this.ah;
        Fragment c2339e = new C2339e();
        c2339e.f11517c = c2350n;
        c2339e.f11518e = i;
        this.f730B.mo284a().mo331b(16908290, c2339e).mo330a(null).mo334c();
    }

    public final void mo2867b(boolean z) {
        this.ao = z;
        this.bo.mo1557a((C0660x) this, (C0657w) this, false, aj());
    }

    private final boolean aj() {
        boolean z;
        if (TextUtils.isEmpty((CharSequence) C0954a.f5834d.m5760a())) {
            z = false;
        } else {
            z = true;
        }
        boolean z2;
        if (TextUtils.isEmpty((CharSequence) C0954a.f5839i.m5760a())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || r0 || this.ao) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.ah = new C2350n((ContentFilterSettingsResponse) obj, null, this.f11527c, this.r_, this.f11529h);
        m_();
    }
}
