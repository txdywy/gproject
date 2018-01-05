package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class C4750c implements C4749e {
    public final /* synthetic */ Intent f24523a;
    public final /* synthetic */ ConsentDialog f24524b;

    C4750c(ConsentDialog consentDialog, Intent intent) {
        this.f24524b = consentDialog;
        this.f24523a = intent;
    }

    public final void mo4372a(boolean z) {
        PendingIntent pendingIntent = (PendingIntent) this.f24523a.getParcelableExtra("consent_result_intent");
        Intent intent = new Intent();
        intent.putExtra("consent_result", this.f24524b.f24298q);
        try {
            pendingIntent.send(this.f24524b, 0, intent);
        } catch (CanceledException e) {
            FinskyLog.m21667d("Cannot send consent result: pending intent was cancelled", new Object[0]);
        }
    }
}
