package com.google.android.finsky.bw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.installer.b.a.e;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.bw.a implements com.google.android.finsky.installqueue.o
{

    public final Context a;

    a(Context p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
        switch (p0.c.d) {
            case 0:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_ENQUEUED");
                break;
            case 1:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_DOWNLOADING");
                break;
            case 2:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED");
                if (p0.c.d == 6)
                    v0 = 1;
                else
                    v0 = 0;
                v3.putExtra("com.android.launcher.action.INSTALL_COMPLETED", v0);
                break;
            case 3:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED");
                if (p0.c.d == 6)
                    v0 = 1;
                else
                    v0 = 0;
                v3.putExtra("com.android.launcher.action.INSTALL_COMPLETED", v0);
                break;
            case 4:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_INSTALLING");
                break;
            case 5:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED");
                if (p0.c.d == 6)
                    v0 = 1;
                else
                    v0 = 0;
                v3.putExtra("com.android.launcher.action.INSTALL_COMPLETED", v0);
                break;
            case 6:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED");
                if (p0.c.d == 6)
                    v0 = 1;
                else
                    v0 = 0;
                v3.putExtra("com.android.launcher.action.INSTALL_COMPLETED", v0);
                break;
            case 7:
                v3 = 0;
                break;
            case 8:
                v3 = 0;
                break;
            case 9:
                v3 = 0;
                break;
            case 10:
                v3 = 0;
                break;
            case 11:
                v3 = new Intent("com.android.launcher.action.ACTION_PACKAGE_ENQUEUED");
                break;
            default:
                v3 = 0;
                break;
        }
        if (v3 != 0) {
            v3.setPackage((String)com.google.android.finsky.aa.b.dM.b());
            v3.setData(Uri.fromParts("package", p0.a(), 0));
            v4 = new Object[3];
            v4[0] = v3.getData();
            v4[1] = v3.getAction();
            v4[2] = p0.a();
            FinskyLog.b("GEL broadcast uri=[%s], action=[%s], for package=[%s]", v4);
            this.a.sendBroadcast(v3);
        }
    }

}
