package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;

public final class LicenseActivity extends aa {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6189i.libraries_social_licenses_license_activity);
        License license = (License) getIntent().getParcelableExtra("license");
        G_().mo500a().mo565a(license.f30713a);
        G_().mo500a().mo559a();
        G_().mo500a().mo566a(true);
        G_().mo500a().mo563a(null);
        TextView textView = (TextView) findViewById(C6188h.license_activity_textview);
        CharSequence a = C6187g.m28522a((Context) this, license);
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = (TextView) findViewById(C6188h.license_activity_textview);
        bundle.putInt("scroll_pos", textView.getLayout().getLineStart(textView.getLayout().getLineForVertical(((ScrollView) findViewById(C6188h.license_activity_scrollview)).getScrollY())));
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(C6188h.license_activity_scrollview);
        scrollView.post(new C6183b(this, bundle.getInt("scroll_pos"), scrollView));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
