package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.finsky.at.C1516l;
import com.squareup.leakcanary.C7582R;

public class PerSourceInstallationConsentWarningDialogView extends ScrollView implements C1516l {
    public final Bundle f24333a = new Bundle();

    public PerSourceInstallationConsentWarningDialogView(Context context) {
        super(context);
    }

    public PerSourceInstallationConsentWarningDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void mo3298a(Bundle bundle) {
        CharSequence string = bundle.getString("app_name");
        String string2 = bundle.getString("package_name");
        TextView textView = (TextView) findViewById(C7582R.id.app_name);
        ImageView imageView = (ImageView) findViewById(C7582R.id.app_icon);
        if (!TextUtils.isEmpty(string)) {
            textView.setText(string);
        }
        try {
            Drawable applicationIcon = getContext().getPackageManager().getApplicationIcon(string2);
            if (applicationIcon != null) {
                imageView.setImageDrawable(applicationIcon);
            }
        } catch (NameNotFoundException e) {
        }
    }

    public Bundle getResult() {
        return this.f24333a;
    }
}
