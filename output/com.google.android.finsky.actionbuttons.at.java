package com.google.android.finsky.actionbuttons;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import com.google.android.finsky.at.k;

public static class com.google.android.finsky.actionbuttons.at
{

    public static void a(String p0, Fragment p1, boolean p2, boolean p3, boolean p4) {
        if (p1.B.a("uninstall_confirm") == 0) {
            v1 = 2131952688;
            v0 = 2131951799;
            if (p3 != 0) {
                if (p2 != 0)
                    v2 = 2131953335;
                else if (p4 != 0) {
                    v2 = 2131953294;
                    v1 = 2131953511;
                    v0 = 2131952618;
                }
                else
                    v2 = 2131953293;
            }
            else
                v2 = 2131953332;
            v4 = new com.google.android.finsky.at.k();
            v4.a(v2).d(v1).e(v0);
            v0 = new Bundle();
            v0.putString("package_name", p0);
            v4.a(p1, 1, v0);
            v4.a().a(p1.B, "uninstall_confirm");
        }
    }

}
