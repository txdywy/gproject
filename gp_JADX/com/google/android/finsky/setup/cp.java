package com.google.android.finsky.setup;

import android.content.Intent;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView.BufferType;
import com.google.android.finsky.C1473m;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

final class cp extends fr implements OnClickListener {
    public final Button f20944t;
    public final /* synthetic */ SetupWizardSelectAppsForDeviceActivity f20945u;

    cp(SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity, View view) {
        int i;
        this.f20945u = setupWizardSelectAppsForDeviceActivity;
        super(view);
        this.f20944t = (Button) view.findViewById(C7582R.id.suw_button);
        this.f20944t.setOnClickListener(this);
        Button button = this.f20944t;
        if (setupWizardSelectAppsForDeviceActivity.m19120g() == 0) {
            i = C7582R.string.setup_wizard_next_button_label;
        } else {
            i = C7582R.string.setup_wizard_nav_restore;
        }
        button.setText(i, BufferType.NORMAL);
    }

    public final void onClick(View view) {
        SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity = this.f20945u;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < setupWizardSelectAppsForDeviceActivity.f20637q.length; i++) {
            if (setupWizardSelectAppsForDeviceActivity.f20639s[i]) {
                arrayList.add(setupWizardSelectAppsForDeviceActivity.f20637q[i]);
            }
        }
        C1473m.f7980a.cK().mo3927a(setupWizardSelectAppsForDeviceActivity.getApplicationContext(), setupWizardSelectAppsForDeviceActivity.f20635o, (fp[]) arrayList.toArray(new fp[arrayList.size()]), true);
        Intent intent = new Intent();
        intent.putExtra("restoreToken", this.f20945u.f20636p.e);
        this.f20945u.setResult(-1, intent);
        this.f20945u.finish();
    }
}
