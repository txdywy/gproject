package com.google.android.finsky.family.management;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.utils.m;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.ag;
import com.google.wireless.android.finsky.dfe.h.a.p;
import com.google.wireless.android.finsky.dfe.h.a.q;
import com.google.wireless.android.finsky.dfe.h.a.r;
import com.google.wireless.android.finsky.dfe.h.a.w;
import com.google.wireless.android.finsky.dfe.h.a.y;
import com.squareup.leakcanary.C7582R;

public final class C3070h extends C1045b implements OnCheckedChangeListener, C0657w, C0660x, m {
    public final ce f15973a = C2482j.m13283a(5231);
    public RadioGroup ag;
    public String ah;
    public int ai;
    public int aj;
    public C2104b ak = C1473m.f7980a.as();
    public C3069g f15974c;
    public w f15975f;
    public y f15976h;

    public static C3070h m15780a(String str, w wVar, int i, String str2) {
        C1045b c3070h = new C3070h();
        c3070h.m6259c(str);
        c3070h.m6254a("MemberSettingResponse", ParcelableProto.m21671a((C0757i) wVar));
        c3070h.m6253a("LastSelectedOption", i);
        c3070h.m6258b("ConsistencyToken", str2);
        return c3070h;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.f15975f = (w) ParcelableProto.m21673a(this.f760q, "MemberSettingResponse");
        this.ai = this.f760q.getInt("LastSelectedOption");
        this.ah = this.f760q.getString("ConsistencyToken");
        if (this.f15975f != null) {
            this.f15976h = this.f15975f.b;
        }
        this.aj = -1;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putString("ConsistencyToken", this.ah);
        bundle.putInt("PendingOption", this.aj);
        bundle.putInt("LastSelectedOption", this.ai);
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        if (this.f15974c == null) {
            C2744a c2744a = new C2744a();
            this.f15974c = new C3069g();
            if (!this.f15974c.m15779a(m603h())) {
                this.bm.mo1244m();
                return;
            }
        }
        if (bundle != null) {
            this.ah = bundle.getString("ConsistencyToken");
            this.aj = bundle.getInt("PendingOption", -1);
            this.ai = bundle.getInt("LastSelectedOption", this.ai);
        }
        if ((this.f15975f != null ? 1 : null) != null) {
            cg_();
        } else {
            aa();
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f15973a;
    }

    protected final int mo1298Z() {
        return C7582R.layout.family_ask_to_buy_setting_v2;
    }

    protected final void aa() {
        this.bs.m16127a(0, null);
        this.bo.mo1658k(this.f15974c.f15971a, this, this);
    }

    protected final void cg_() {
        ViewGroup viewGroup = (ViewGroup) this.bt.findViewById(C7582R.id.purchase_setting);
        this.ag = (RadioGroup) this.bt.findViewById(C7582R.id.purchase_options);
        TextView textView = (TextView) this.bt.findViewById(C7582R.id.purchase_setting_title);
        TextView textView2 = (TextView) this.bt.findViewById(C7582R.id.purchase_setting_subtitle);
        TextView textView3 = (TextView) this.bt.findViewById(C7582R.id.purchase_setting_learn_more);
        TextView textView4 = (TextView) this.bt.findViewById(C7582R.id.purchase_setting_option_disabled_help);
        View findViewById = this.bt.findViewById(C7582R.id.family_member_settings_header);
        this.bm.mo1241c(this.f15976h.d);
        if (TextUtils.isEmpty(this.f15976h.e)) {
            viewGroup.setVisibility(8);
            return;
        }
        textView.setText(this.f15976h.e);
        textView2.setText(this.f15976h.f);
        ae.m9218a(textView3, this.f15976h.g, new C3071i(this));
        Object obj = this.f15976h.i;
        if (!TextUtils.isEmpty(obj)) {
            ae.m9218a(textView4, new StringBuilder(String.valueOf(obj).length() + 16).append("<a href=\"#\">").append(obj).append("</a>").toString(), (m) this);
        }
        q[] qVarArr = this.f15976h.h;
        this.ag.removeAllViews();
        int i = this.aj != -1 ? this.aj : this.ai;
        LayoutInflater from = LayoutInflater.from(m603h());
        for (q qVar : qVarArr) {
            RadioButton radioButton = (RadioButton) from.inflate(C7582R.layout.family_member_settings_option, this.ag, false);
            radioButton.setText(qVar.d);
            if (qVar.c == i) {
                radioButton.setChecked(true);
            }
            radioButton.setId(qVar.c);
            radioButton.setTag(Integer.valueOf(qVar.c));
            if (qVar.f) {
                radioButton.setEnabled(false);
            }
            radioButton.setOnCheckedChangeListener(this);
            this.ag.addView(radioButton);
        }
        C3069g.m15778a(findViewById, this.f15975f.d, this.f15975f.e);
    }

    public final void mo138d() {
        super.mo138d();
        this.ag = null;
    }

    public final void b_(Object obj) {
        if (obj instanceof ag) {
            this.ai = this.aj;
            this.ah = ((ag) obj).b;
            if (m610k() && at()) {
                for (int i = 0; i < this.f15976h.h.length; i++) {
                    if (this.f15976h.h[i].c == this.aj) {
                        m15781a(this.f15976h.h[i].e);
                    }
                }
                m15784a(true);
            }
            if (this.f761r != null) {
                Intent intent = new Intent();
                intent.putExtra("SelectedOptionData", this.ai);
                intent.putExtra("ConsistencyTokenResult", this.ah);
                this.f761r.mo2342a(this.f763t, -1, intent);
            }
        } else if (obj instanceof w) {
            this.f15975f = (w) obj;
            this.f15976h = this.f15975f.b;
            this.ai = this.f15976h.c.d;
            this.ah = this.f15976h.c.c;
            m_();
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            int intValue = ((Integer) compoundButton.getTag()).intValue();
            if (intValue != this.ai) {
                this.aj = intValue;
                p pVar = this.f15976h.c;
                m15784a(false);
                this.bo.mo1624b(this.ah, pVar.b, intValue, (C0660x) this, new C3072j(this));
            }
        }
    }

    public final void m15783a(View view, String str) {
        m15781a(this.f15976h.j);
    }

    private final void m15781a(r rVar) {
        if (rVar != null && !TextUtils.isEmpty(rVar.c) && !TextUtils.isEmpty(rVar.b)) {
            Fragment c3073k = new C3073k();
            Bundle bundle = new Bundle();
            bundle.putParcelable("FamilyPurchaseSettingWarning", ParcelableProto.m21671a((C0757i) rVar));
            c3073k.m600f(bundle);
            c3073k.m581a((Fragment) this, 0);
            c3073k.m625a(this.f730B, "PurchaseApprovalDialog");
        }
    }

    final void m15784a(boolean z) {
        q[] qVarArr = this.f15976h.h;
        int i = 0;
        while (i < this.ag.getChildCount()) {
            if (!z || !qVarArr[i].f) {
                ((RadioButton) this.ag.getChildAt(i)).setEnabled(z);
            }
            i++;
        }
    }
}
