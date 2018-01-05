package com.google.android.finsky.uninstall.v2a;

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

public final class C4625r extends Fragment implements ad, C1056b {
    public LinearLayout f23804a;
    public ButtonBar f23805b;
    public String f23806c;
    public String f23807d;
    public ad f23808e;
    public C2495w f23809f;
    public ce f23810g;

    public static C4625r m21564a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("uninstall_manager_fragment_error_title", str);
        bundle.putString("uninstall_manager_fragment_error_message", str2);
        Fragment c4625r = new C4625r();
        c4625r.m600f(bundle);
        return c4625r;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f23810g = C2482j.m13283a(m21563W().f23823m.mo4289c());
        this.f23806c = bundle2.getString("uninstall_manager_fragment_error_title");
        this.f23807d = bundle2.getString("uninstall_manager_fragment_error_message");
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23804a = (LinearLayout) layoutInflater.inflate(C7582R.layout.uninstall_manager_error_fragment, viewGroup, false);
        this.f23809f = m21563W().f23821k;
        ((TextView) this.f23804a.findViewById(C7582R.id.uninstall_manager_error_title)).setText(this.f23806c);
        ((TextView) this.f23804a.findViewById(C7582R.id.uninstall_manager_error_message)).setText(this.f23807d);
        this.f23805b = (ButtonBar) this.f23804a.findViewById(C7582R.id.uninstall_manager_button_bar);
        this.f23805b.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f23805b.setPositiveButtonTitle((int) C7582R.string.uninstall_manager_retry_label);
        this.f23805b.setClickListener(this);
        this.f23808e.mo1219a(this);
        return this.f23804a;
    }

    public final void mo138d() {
        this.f23805b = null;
        this.f23804a = null;
        super.mo138d();
    }

    public final void v_() {
        this.f23809f.m13379b(new C2475d(this).m13256a(m21563W().f23823m.mo4292f()));
        m603h().finish();
    }

    public final void u_() {
        this.f23809f.m13379b(new C2475d(this).m13256a(m21563W().f23823m.mo4291e()));
        C4626s W = m21563W();
        W.m21571a(0);
        W.f23815e.m21580X();
        W.m21574b();
    }

    private final C4626s m21563W() {
        return ((C4607w) m603h()).mo1276k();
    }

    public final ce getPlayStoreUiElement() {
        return this.f23810g;
    }

    public final ad getParentNode() {
        return this.f23808e;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
