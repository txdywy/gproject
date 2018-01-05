package com.google.android.finsky.bc;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.p028a.p029a.C0206f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class C1574v extends C1573p implements OnClickListener, C0657w, ad {
    public final ce ah = C2482j.m13283a(ap());
    public View ai;
    public TextView aj;
    public View ak;
    public C1581k al;

    protected abstract int aj();

    protected abstract void ao();

    protected abstract int ap();

    protected final int mo1298Z() {
        return C7582R.layout.family_library_onboarding_general;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (bundle == null) {
            this.bw.m13370a(new C2488p().m13345b(this));
        }
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.ai = a.findViewById(C7582R.id.continue_button);
        this.ai.setOnClickListener(this);
        this.ai.setBackgroundColor(C0206f.m1066b(a.getResources(), this.ag.mo2349e().f8378c, null));
        this.aj = (TextView) a.findViewById(C7582R.id.continue_text);
        this.aj.setText(m592c((int) C7582R.string.continue_text).toUpperCase(m605i().getConfiguration().locale));
        this.ak = a.findViewById(C7582R.id.family_loading_indicator);
        this.ak.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) a.findViewById(C7582R.id.onboarding_content);
        viewGroup2.addView(layoutInflater.inflate(aj(), viewGroup2, false));
        return a;
    }

    public void mo138d() {
        super.mo138d();
        this.aj = null;
        this.ak = null;
    }

    public ce getPlayStoreUiElement() {
        return this.ah;
    }

    public void onClick(View view) {
        this.aj.setEnabled(false);
        this.ak.setVisibility(0);
        ao();
    }

    public final void mo1062a(VolleyError volleyError) {
        CharSequence a = C1290m.m7702a(this.bn, volleyError);
        this.ai.setEnabled(true);
        this.ak.setVisibility(8);
        if (this.bt != null) {
            Snackbar.m500a(this.bt, a, 0).m493a();
        }
    }

    protected final void m9114a(View view, int i, int i2) {
        ((TextView) view.findViewById(i)).setText(this.ag.mo2345a(i2));
    }
}
