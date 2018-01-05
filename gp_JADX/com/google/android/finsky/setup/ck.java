package com.google.android.finsky.setup;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.wireless.android.finsky.dfe.nano.fp;
import java.util.ArrayList;

final class ck implements OnClickListener {
    public final /* synthetic */ Activity f20926a;
    public final /* synthetic */ SetupWizardSelectAppsForDeviceActivity f20927b;

    ck(SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity, Activity activity) {
        this.f20927b = setupWizardSelectAppsForDeviceActivity;
        this.f20926a = activity;
    }

    public final void onClick(View view) {
        SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity = this.f20927b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < setupWizardSelectAppsForDeviceActivity.f20637q.length; i++) {
            if (setupWizardSelectAppsForDeviceActivity.f20639s[i]) {
                arrayList.add(setupWizardSelectAppsForDeviceActivity.f20637q[i]);
            }
        }
        C1473m.f7980a.cK().mo3927a(setupWizardSelectAppsForDeviceActivity.getApplicationContext(), setupWizardSelectAppsForDeviceActivity.f20635o, (fp[]) arrayList.toArray(new fp[arrayList.size()]), true);
        Intent intent = new Intent();
        intent.putExtra("restoreToken", this.f20927b.f20636p.e);
        this.f20926a.setResult(-1, intent);
        this.f20926a.finish();
    }
}
