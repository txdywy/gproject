package com.google.android.finsky.family.management;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.em;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.billing.myaccount.C1998e;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5095d;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C3066d extends C1998e implements C1054h, C3065c {
    public final C2910a ag = C1473m.f7980a.au();
    public List f15962h;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ag.m15182a((C1054h) this);
        return super.mo970a(layoutInflater, viewGroup, bundle);
    }

    public final void mo138d() {
        super.mo138d();
        this.ag.m15191b((C1054h) this);
    }

    protected final em ai() {
        this.f15962h = C1473m.f7980a.aY().mo2315e();
        return new C3063a(m603h(), this, this.f15962h, this.a, this, this.bw);
    }

    protected final int aj() {
        return C7582R.string.family_title;
    }

    protected final int ao() {
        return 2670;
    }

    public final void mo3297c() {
        this.bp.mo3699d(this.bw);
    }

    public final void ae_() {
        String str;
        String str2;
        Context h = m603h();
        Account b = this.bo.mo1620b();
        Intent intent = h.getIntent();
        if (intent == null) {
            str = null;
        } else {
            str = intent.getStringExtra("family_app_id");
        }
        if (str == null) {
            int i;
            for (C2231n c2231n : C1473m.f7980a.ah().mo2811a(b).mo2786c()) {
                if (c2231n.f11104k.startsWith((String) C0955b.dj.m28964b())) {
                    i = 1;
                    break;
                }
            }
            i = 0;
            if (i != 0) {
                str2 = "pfm";
            } else {
                str2 = "pfl";
            }
        } else {
            str2 = str;
        }
        String str3 = b.name;
        Parcelable putExtra = new Intent(h, FamilyMemberSettingsActivity.class).putExtra("accountName", str3).putExtra("memberSettingTheme", C7582R.style.FamilyMemberSettingTheme);
        Intent putExtra2 = new Intent("com.google.android.gms.family.v2.MANAGE").setPackage((String) C0955b.eX.m28964b()).putExtra("accountName", str3).putExtra("appId", str2).putExtra("manageMemberIntent", putExtra).putExtra("manageKIntent", putExtra);
        putExtra2.putExtra("predefinedTheme", "play");
        if (h.getPackageManager().resolveActivity(putExtra2, 0) == null || C5095d.m23664d(h) < ((Integer) C0955b.eZ.m28964b()).intValue()) {
            intent = null;
        } else {
            FinskyLog.m21659a("Using Unicorn family management v2 API [appId=%s].", str2);
            intent = putExtra2;
        }
        if (intent == null) {
            Toast.makeText(m603h(), C7582R.string.generic_error, 1).show();
        } else {
            startActivityForResult(intent, 1);
        }
    }

    public final void af_() {
        this.bp.mo3703f();
    }

    public final void ag_() {
        this.bp.mo3642a(null);
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        int i3 = 1;
        if (i == 1) {
            FinskyLog.m21659a("Family activity result, resultCode: %d", Integer.valueOf(i2));
            if (intent == null) {
                FinskyLog.m21659a("Family activity returned null data from early exit.", new Object[0]);
            } else {
                boolean z;
                if (i2 == 8 || i2 == 9 || intent.getBooleanExtra("familyChanged", false)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String stringExtra = intent.getStringExtra("accountName");
                    if (TextUtils.isEmpty(stringExtra)) {
                        FinskyLog.m21669e("Family activity result expected to return an account name.", new Object[0]);
                    } else {
                        String stringExtra2 = intent.getStringExtra("consistencyToken");
                        if (stringExtra2 != null) {
                            FinskyLog.m21659a("Saving consistency token from family creation.", new Object[0]);
                            C1473m.f7980a.aY().mo2306a(stringExtra).mo2321b(stringExtra2);
                        }
                        if (i3 != 0) {
                            FinskyLog.m21659a("Requerying family state by refreshing user settings.", new Object[0]);
                            this.ag.m15184a(this.bo.mo1636c(), 3);
                            au();
                            return;
                        }
                        return;
                    }
                }
            }
            i3 = 0;
            if (i3 != 0) {
                FinskyLog.m21659a("Requerying family state by refreshing user settings.", new Object[0]);
                this.ag.m15184a(this.bo.mo1636c(), 3);
                au();
                return;
            }
            return;
        }
        super.mo2342a(i, i2, intent);
    }

    public final void P_() {
        this.f15962h = C1473m.f7980a.aY().mo2315e();
        if (this.f15962h.size() != 0) {
            O_();
            this.f = null;
            cg_();
        } else if (!this.bp.mo3682a(this.bw, true)) {
            this.bp.mo3629a(0, this.bw);
        }
    }

    public final void ce_() {
        P_();
    }
}
