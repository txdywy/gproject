package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

abstract class C0248m extends cr {
    public boolean f1584a;

    C0248m() {
    }

    abstract View mo342a(View view, String str, Context context, AttributeSet attributeSet);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo342a(view, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo342a(null, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!(this.f1584a || i == -1)) {
            C0248m.m1489b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    static void m1489b(int i) {
        if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
