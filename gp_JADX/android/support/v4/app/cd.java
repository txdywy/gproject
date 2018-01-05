package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public final class cd {
    public final Bundle f1465a;
    public final co[] f1466b;
    public final co[] f1467c;
    public boolean f1468d;
    public int f1469e;
    public CharSequence f1470f;
    public PendingIntent f1471g;

    public cd(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle(), null, null, true);
    }

    cd(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, co[] coVarArr, co[] coVarArr2, boolean z) {
        this.f1469e = i;
        this.f1470f = cg.m1413d(charSequence);
        this.f1471g = pendingIntent;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f1465a = bundle;
        this.f1466b = coVarArr;
        this.f1467c = coVarArr2;
        this.f1468d = z;
    }
}
