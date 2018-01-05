package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;

final class C0237b implements Runnable {
    public final /* synthetic */ String[] f1368a;
    public final /* synthetic */ Activity f1369b;
    public final /* synthetic */ int f1370c;

    C0237b(String[] strArr, Activity activity, int i) {
        this.f1368a = strArr;
        this.f1369b = activity;
        this.f1370c = i;
    }

    public final void run() {
        int[] iArr = new int[this.f1368a.length];
        PackageManager packageManager = this.f1369b.getPackageManager();
        String packageName = this.f1369b.getPackageName();
        int length = this.f1368a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f1368a[i], packageName);
        }
        ((C0238c) this.f1369b).onRequestPermissionsResult(this.f1370c, this.f1368a, iArr);
    }
}
