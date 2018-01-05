package com.google.android.finsky.settings;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class ExternalSettingsActivity extends SettingsActivity {
    public C0986a f20491a;

    protected void onCreate(Bundle bundle) {
        boolean z;
        ((C1414v) C3947d.m18649a(C1414v.class)).mo1903a(this);
        Intent intent = getIntent();
        if (!(intent.hasExtra("extra-key-daydream-account") && intent.hasExtra("extra-key-pending-intent"))) {
            FinskyLog.m21667d("intent from daydream missing extra", new Object[0]);
            finish();
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("extra-key-pending-intent");
        if (pendingIntent == null) {
            z = false;
        } else {
            z = C2744a.m14788a((Context) this, pendingIntent.getCreatorPackage());
        }
        if (!z) {
            FinskyLog.m21667d("Authentication failed on launching settings", new Object[0]);
            finish();
        }
        Account b = this.f20491a.mo1183b(intent.getStringExtra("extra-key-daydream-account"));
        if (b == null) {
            FinskyLog.m21667d("Account provided by Daydream is not in play store", new Object[0]);
            finish();
        }
        this.f20491a.mo1198c(b);
        super.onCreate(bundle);
        super.m6034d().mo500a().mo561a((int) C7582R.drawable.ic_collapse);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
