package com.google.android.finsky.uninstall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ao extends Fragment implements ad, C1056b {
    public LinearLayout f23497a;
    public ButtonBar f23498b;
    public String f23499c;
    public String f23500d;
    public ad f23501e;
    public C2495w f23502f;
    public ce f23503g = C2482j.m13283a(5523);

    public static ao m21301a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("uninstall_manager_fragment_error_title", str);
        bundle.putString("uninstall_manager_fragment_error_message", str2);
        Fragment aoVar = new ao();
        aoVar.m600f(bundle);
        return aoVar;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f23499c = bundle2.getString("uninstall_manager_fragment_error_title");
        this.f23500d = bundle2.getString("uninstall_manager_fragment_error_message");
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23497a = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_error_fragment, viewGroup, false);
        this.f23502f = ((UninstallManagerActivityV2) m603h()).f6316C;
        ((TextView) this.f23497a.findViewById(C7582R.id.uninstall_manager_error_title)).setText(this.f23499c);
        ((TextView) this.f23497a.findViewById(C7582R.id.uninstall_manager_error_message)).setText(this.f23500d);
        this.f23498b = (ButtonBar) this.f23497a.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.f23498b.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f23498b.setPositiveButtonTitle((int) C7582R.string.uninstall_manager_retry_label);
        this.f23498b.setClickListener(this);
        this.f23501e.mo1219a(this);
        return this.f23497a;
    }

    public final void mo138d() {
        this.f23498b = null;
        this.f23497a = null;
        super.mo138d();
    }

    public final void v_() {
        this.f23502f.m13379b(new C2475d(this).m13256a(5526));
        m603h().finish();
    }

    public final void u_() {
        this.f23502f.m13379b(new C2475d(this).m13256a(5525));
        ((UninstallManagerActivityV2) m603h()).f23427N.m21396a(6);
    }

    public final ce getPlayStoreUiElement() {
        return this.f23503g;
    }

    public final ad getParentNode() {
        return this.f23501e;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
