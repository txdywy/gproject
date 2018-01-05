package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class C0249n extends C0248m {
    public boolean f1585b;

    C0249n() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f1585b || i == -1)) {
            C0248m.m1489b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            C0248m.m1489b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
