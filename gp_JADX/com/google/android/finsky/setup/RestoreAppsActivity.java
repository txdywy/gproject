package com.google.android.finsky.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.ListView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RestoreAppsActivity extends Activity {
    public C4127a f20566a;

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    protected void onCreate(Bundle bundle) {
        fp[] fpVarArr = null;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("backup_document_infos_bundle");
        if (bundleExtra == null) {
            FinskyLog.m21669e("Missing backup_document_infos_bundle", new Object[0]);
        } else {
            ParcelableProtoArray parcelableProtoArray = (ParcelableProtoArray) bundleExtra.getParcelable("backup_document_infos");
            if (parcelableProtoArray == null) {
                FinskyLog.m21669e("Missing backup_document_infos", new Object[0]);
            } else {
                fpVarArr = (fp[]) parcelableProtoArray.f24027a;
            }
        }
        if (fpVarArr == null) {
            finish();
            return;
        }
        boolean z;
        this.f20566a = new C4127a(fpVarArr);
        C4127a c4127a = this.f20566a;
        if (bundle == null) {
            z = false;
        } else {
            boolean[] booleanArray = bundle.getBooleanArray("SetupWizardAppListDialog.selectedBackupDocs");
            if (booleanArray == null) {
                FinskyLog.m21669e("Missing SetupWizardAppListDialog.selectedBackupDocs", new Object[0]);
                z = false;
            } else {
                c4127a.f20753b = Arrays.copyOf(booleanArray, booleanArray.length);
                c4127a.m19180a();
                z = true;
            }
        }
        if (!z) {
            C4127a c4127a2 = this.f20566a;
            boolean[] zArr = new boolean[fpVarArr.length];
            String[] stringArrayExtra = intent.getStringArrayExtra("selected_apps");
            int i;
            if (stringArrayExtra == null) {
                for (i = 0; i < fpVarArr.length; i++) {
                    zArr[i] = true;
                }
            } else {
                Set hashSet = new HashSet(Arrays.asList(stringArrayExtra));
                for (i = 0; i < fpVarArr.length; i++) {
                    zArr[i] = hashSet.contains(fpVarArr[i].e.f11833b);
                }
            }
            c4127a2.m19182a(zArr);
        }
        if (intent.getBooleanExtra("confirm_restore", false)) {
            C1473m.f7980a.cK().mo3927a(getApplicationContext(), getIntent().getStringExtra("authAccount"), this.f20566a.m19183b(), true);
            finish();
            return;
        }
        setTheme(C7582R.style.SetupWizardTheme.Light);
        setContentView(C7582R.layout.restore_apps_activity_layout);
        this.f20566a.m19181a(this, (ListView) findViewById(C7582R.id.restore_apps_list));
        findViewById(C7582R.id.cancel).setOnClickListener(new ai(this));
        findViewById(C7582R.id.done).setOnClickListener(new aj(this));
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBooleanArray("SetupWizardAppListDialog.selectedBackupDocs", this.f20566a.f20753b);
        super.onSaveInstanceState(bundle);
    }
}
