package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class ConsentDialog extends aa implements C1056b {
    public boolean f24298q = false;
    public boolean f24299r = false;
    public boolean f24300s = false;
    public boolean f24301t = false;
    public C3982a f24302u;

    private static boolean m21995a(Intent intent) {
        return intent != null && intent.hasExtra("consent_result_intent");
    }

    private final boolean m21996b(Intent intent) {
        if (C4752d.m22288a().m22291a(new C4750c(this, intent), true) != null) {
            return true;
        }
        return false;
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m21995a(intent)) {
            m21996b(intent);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ac) C3947d.m18649a(ac.class)).mo1972a(this);
        Intent intent = getIntent();
        if (m21995a(intent) && this.f24302u.mo3875b()) {
            finish();
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("consent_result_intent");
            if (pendingIntent != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("consent_result", false);
                try {
                    pendingIntent.send(this, 0, intent2);
                } catch (CanceledException e) {
                    FinskyLog.m21667d("Cannot send consent result: pending intent was cancelled", new Object[0]);
                }
                this.f24301t = true;
                return;
            }
            return;
        }
        if (bundle == null && m21995a(intent)) {
            this.f24300s = true;
            if (!m21996b(intent)) {
                finish();
                m21997k();
                return;
            }
        } else if (bundle != null && bundle.getBoolean("STARTED_EXTERNALLY")) {
            this.f24300s = true;
        }
        if (bg.m22121a().m22129d()) {
            this.f24298q = true;
            finish();
            m21997k();
            return;
        }
        Object string;
        if (!C4752d.m22288a().m22293a(this)) {
            finish();
        }
        if (VERSION.SDK_INT >= 23) {
            string = getResources().getString(C7582R.string.package_malware_settings_path_v23);
        } else {
            String string2 = getResources().getString(C7582R.string.package_malware_settings_path);
        }
        setContentView((int) C7582R.layout.package_malware_consent_dialog);
        ((TextView) findViewById(C7582R.id.text_content)).setText(getResources().getString(C7582R.string.package_malware_consent_text, new Object[]{string}));
        setFinishOnTouchOutside(false);
        ButtonBar buttonBar = (ButtonBar) findViewById(C7582R.id.button_bar);
        buttonBar.setClickListener(this);
        buttonBar.setPositiveButtonTitle((int) C7582R.string.accept);
        buttonBar.setNegativeButtonTitle((int) C7582R.string.decline);
    }

    public void onBackPressed() {
    }

    private final void m21997k() {
        if (!this.f24301t && isFinishing()) {
            if (this.f24299r) {
                bg.m22121a().m22126a(this.f24298q);
            }
            C4752d.m22288a().m22292a(this.f24298q);
            this.f24301t = true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("STARTED_EXTERNALLY", this.f24300s);
    }

    protected void onStop() {
        super.onStop();
        if (!m21995a(getIntent()) || !this.f24302u.mo3875b()) {
            m21997k();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        if (!m21995a(getIntent()) || !this.f24302u.mo3875b()) {
            m21997k();
        }
    }

    public final void u_() {
        this.f24298q = true;
        this.f24299r = true;
        finish();
    }

    public final void v_() {
        this.f24298q = false;
        this.f24299r = true;
        finish();
    }
}
