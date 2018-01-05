package com.google.android.wallet.instrumentmanager.redirect;

import android.content.Intent;
import android.net.Uri;
import com.google.android.wallet.redirect.C6644d;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;

public class ImFinishAndroidAppRedirectActivity extends C6644d {
    protected final Intent mo5545a(Uri uri) {
        Intent a = StartAndroidAppRedirectActivity.m30040a(this, uri);
        a.setClassName(getPackageName(), ImStartAndroidAppRedirectActivity.class.getName());
        return a;
    }
}
