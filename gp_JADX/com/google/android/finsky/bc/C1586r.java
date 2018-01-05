package com.google.android.finsky.bc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1586r extends C1573p implements OnClickListener {
    public String f8405a;

    protected final int mo1298Z() {
        return C7582R.layout.family_library_onboarding_error;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        ((TextView) a.findViewById(C7582R.id.error_message)).setText(this.f8405a);
        a.findViewById(C7582R.id.continue_button).setOnClickListener(this);
        ((TextView) a.findViewById(C7582R.id.continue_text)).setText(17039370);
        return a;
    }

    public final void onClick(View view) {
        this.ag.mo2348d().m9153a();
    }

    public final ce getPlayStoreUiElement() {
        return null;
    }
}
