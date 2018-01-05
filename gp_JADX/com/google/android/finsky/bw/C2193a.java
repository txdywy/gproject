package com.google.android.finsky.bw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.utils.FinskyLog;

public final class C2193a implements C1003o {
    public final Context f10983a;

    public C2193a(Context context) {
        this.f10983a = context;
    }

    public final void mo1205a(C3369m c3369m) {
        Intent intent;
        switch (c3369m.f17273c.f17153d) {
            case 0:
            case 11:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_ENQUEUED");
                break;
            case 1:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_DOWNLOADING");
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                boolean z;
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED");
                String str = "com.android.launcher.action.INSTALL_COMPLETED";
                if (c3369m.f17273c.f17153d == 6) {
                    z = true;
                } else {
                    z = false;
                }
                intent.putExtra(str, z);
                break;
            case 4:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_INSTALLING");
                break;
            default:
                intent = null;
                break;
        }
        if (intent != null) {
            intent.setPackage((String) C0955b.dM.m28964b());
            intent.setData(Uri.fromParts("package", c3369m.m16819a(), null));
            FinskyLog.m21662b("GEL broadcast uri=[%s], action=[%s], for package=[%s]", intent.getData(), intent.getAction(), c3369m.m16819a());
            this.f10983a.sendBroadcast(intent);
        }
    }
}
