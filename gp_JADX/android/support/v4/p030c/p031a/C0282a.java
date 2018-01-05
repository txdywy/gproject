package android.support.v4.p030c.p031a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

public final class C0282a {
    public final Context f1659a;

    public static C0282a m1599a(Context context) {
        return new C0282a(context);
    }

    private C0282a(Context context) {
        this.f1659a = context;
    }

    public static FingerprintManager m1600b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
