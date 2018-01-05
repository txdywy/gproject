package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v7.app.aa;
import android.view.MenuItem;

public final class LicenseMenuActivity extends aa implements C6181f {
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6189i.libraries_social_licenses_license_menu_activity);
        if (G_().mo500a() != null) {
            G_().mo500a().mo566a(true);
        }
        ab H_ = H_();
        if (!(H_.mo281a(C6188h.license_menu_fragment_container) instanceof C6185d)) {
            Fragment c6185d = new C6185d();
            if (getIntent().hasExtra("pluginLicensePaths")) {
                c6185d.m600f(getIntent().getBundleExtra("pluginLicensePaths"));
            }
            H_.mo284a().mo325a(C6188h.license_menu_fragment_container, c6185d).mo339e();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void mo5350a(License license) {
        Intent intent = new Intent(this, LicenseActivity.class);
        intent.putExtra("license", license);
        startActivity(intent);
    }
}
