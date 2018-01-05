package com.google.android.finsky.family.p201c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.m;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.ak;
import com.google.wireless.android.finsky.dfe.h.a.al;
import com.squareup.leakcanary.C7582R;

public final class C3039a extends C1045b implements OnClickListener, OnCheckedChangeListener, C0998m, m {
    public final ce f15892a = C2482j.m13283a(5224);
    public RadioButton ag;
    public RadioButton ah;
    public ImageView ai;
    public int f15893c;
    public String f15894f;
    public al[] f15895h;

    protected final int mo1298Z() {
        return C7582R.layout.family_vertical_sharing_setting;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.bt.setBackgroundColor(m605i().getColor(C7582R.color.play_white));
        this.f15893c = this.f760q.getInt("backend");
        this.ag = (RadioButton) a.findViewById(C7582R.id.radio_automatic);
        this.ah = (RadioButton) a.findViewById(C7582R.id.radio_manual);
        this.ai = (ImageView) a.findViewById(C7582R.id.default_settings_extra_description_icon);
        this.ai.setImageDrawable(C0722q.m4782a(m605i(), (int) C7582R.raw.ic_info_grey_24dp, new as()));
        if (this.f760q.getBoolean("autoSharingEnabled")) {
            this.ag.setChecked(true);
        } else {
            this.ah.setChecked(true);
        }
        this.ag.setOnCheckedChangeListener(this);
        this.ah.setOnCheckedChangeListener(this);
        this.ag.setText(m15691b(3, new Object[0]));
        this.ah.setText(m15691b(4, new Object[0]));
        m15685a(a, C7582R.id.default_settings_title, 1, new Object[0]);
        switch (this.f15893c) {
            case 1:
                i = 23;
                break;
            case 3:
                i = 24;
                break;
            case 4:
                i = 22;
                break;
            default:
                FinskyLog.m21669e("Unsupported backend: " + this.f15893c, new Object[0]);
                i = 0;
                break;
        }
        m15685a(a, C7582R.id.default_settings_description, i, new Object[0]);
        m15685a(a, C7582R.id.default_settings_extra_description, 20, new Object[0]);
        m15685a(a, C7582R.id.remove_purchases_title, 5, new Object[0]);
        TextView textView = (TextView) a.findViewById(C7582R.id.remove_purchases);
        textView.setText(m592c((int) C7582R.string.family_remove_purchases).toUpperCase(m605i().getConfiguration().locale));
        textView.setOnClickListener(this);
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        ac();
        cg_();
    }

    protected final void aa() {
    }

    public final void ac() {
        this.bm.mo1241c(this.f15894f);
        this.bm.mo1237a(0, false);
        this.bm.mo1246z();
        this.bq.mo1267c();
    }

    protected final void cg_() {
        int i;
        switch (this.f15893c) {
            case 1:
                i = 26;
                break;
            case 3:
                i = 27;
                break;
            case 4:
                i = 25;
                break;
            default:
                FinskyLog.m21669e("Unsupported backend: " + this.f15893c, new Object[0]);
                i = 0;
                break;
        }
        ae.m9218a((TextView) this.bt.findViewById(C7582R.id.remove_purchases_description), m15691b(i, new Object[0]), (m) this);
    }

    public final void mo138d() {
        super.mo138d();
        this.ag = null;
        this.ah = null;
    }

    public final ce getPlayStoreUiElement() {
        return this.f15892a;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            return;
        }
        if (compoundButton == this.ag) {
            int i;
            C1508k c1508k = new C1508k();
            switch (this.f15893c) {
                case 1:
                    i = 30;
                    break;
                case 3:
                    i = 28;
                    break;
                case 4:
                    i = 29;
                    break;
                default:
                    FinskyLog.m21669e("Unsupported backend: " + this.f15893c, new Object[0]);
                    i = 0;
                    break;
            }
            c1508k.m8859c(m15691b(i, new Object[0])).m8852a(m15691b(8, new Object[0])).m8862e((int) C7582R.string.no_thanks).m8860d((int) C7582R.string.yes_im_in).m8853a(false).m8851a(this, 1, null).mo2272a().m625a(this.f730B, "auto_share");
            return;
        }
        m15686a(false, false);
    }

    private final void m15686a(boolean z, boolean z2) {
        ak akVar = new ak();
        akVar.a(z);
        akVar.a(this.f15893c);
        this.bo.mo1608a(new ak[]{akVar}, new C3040b(this, z, z2), new C3041c(this, z));
    }

    public final void mo1202a(int i, Bundle bundle) {
        boolean z = i == 1;
        this.bo.mo1553a(this.f15893c, z, new C3042d(this, z), new C3043e(this, z));
        if (z) {
            m15686a(true, false);
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        if (i == 1) {
            m15686a(true, true);
        }
    }

    public final void onClick(View view) {
        int i = 32;
        switch (this.f15893c) {
            case 1:
                i = 33;
                break;
            case 3:
                i = 31;
                break;
            case 4:
                break;
            default:
                FinskyLog.m21669e("Unsupported backend: " + this.f15893c, new Object[0]);
                i = 10;
                break;
        }
        new C1508k().m8859c(m15691b(9, new Object[0])).m8852a(m15691b(i, new Object[0])).m8862e((int) C7582R.string.cancel).m8860d((int) C7582R.string.proceed_action).m8853a(false).m8851a(this, 2, null).mo2272a().m625a(this.f730B, "auto_unshare");
    }

    private final void m15685a(View view, int i, int i2, Object... objArr) {
        ((TextView) view.findViewById(i)).setText(m15691b(i2, objArr));
    }

    final String m15691b(int i, Object... objArr) {
        return C3049j.m15706a(this.f15895h, i, objArr);
    }

    public final void m15690a(View view, String str) {
        C1473m.f7980a.as().m10992a(m603h(), "family_library_removepurchases", false);
    }
}
