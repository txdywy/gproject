package com.google.android.finsky.setup;

import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.TextView;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.squareup.leakcanary.C7582R;

final class cm extends fr implements OnClickListener {
    public final TextView f20929t;
    public final Checkable f20930u;
    public fp f20931v;
    public int f20932w;
    public boolean f20933x;
    public boolean f20934y;
    public final /* synthetic */ SetupWizardSelectAppsForDeviceActivity f20935z;

    cm(SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity, View view) {
        this.f20935z = setupWizardSelectAppsForDeviceActivity;
        super(view);
        view.setOnClickListener(this);
        view.findViewById(C7582R.id.image).setVisibility(8);
        this.f20929t = (TextView) view.findViewById(C7582R.id.title);
        this.f20930u = (Checkable) view.findViewById(C7582R.id.checkbox);
        view.findViewById(C7582R.id.expander).setVisibility(8);
        view.findViewById(C7582R.id.optional_spacer).setVisibility(8);
    }

    public final void onClick(View view) {
        boolean z = true;
        boolean z2 = false;
        if (this.f20935z.f20645y && this.f20933x) {
            if (this.f20934y) {
                z = false;
            }
            this.f20934y = z;
            int i;
            while (i < this.f20935z.f20639s.length) {
                this.f20935z.f20639s[i] = this.f20934y;
                i++;
            }
            this.f20935z.f20642v.f3433a.m3638b();
        } else {
            boolean[] zArr = this.f20935z.f20639s;
            int i2 = this.f20932w;
            if (!this.f20935z.f20639s[this.f20932w]) {
                z2 = true;
            }
            zArr[i2] = z2;
            em emVar = this.f20935z.f20642v;
            int i3 = this.f20932w;
            emVar.m3631c(2);
            emVar.m3631c(i3 + 3);
            emVar.m3631c(1);
        }
        this.f20935z.m19121h();
    }
}
