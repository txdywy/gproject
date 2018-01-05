package com.google.android.finsky.at;

import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public static class com.google.android.finsky.at.n
{

    public static final List a;

    static {
        com.google.android.finsky.at.n.a = new ArrayList();
    }

    public static void a(int p0, Bundle p1) {
        v1 = 0;
        while (v1 < com.google.android.finsky.at.n.a.size()) {
            ((com.google.android.finsky.at.m)com.google.android.finsky.at.n.a.get(v1)).a(p0, p1);
            v1 = v1 + 1;
        }
    }

    public static void a(com.google.android.finsky.at.m p0) {
        if (p0 == 0)
            FinskyLog.e("Trying to register a null SimpleAlertDialog.Listener.", new Object[0]);
        else if (com.google.android.finsky.at.n.a.contains(p0))
            FinskyLog.e("Trying to register an already registered SimpleAlertDialog.Listener.", new Object[0]);
        else
            com.google.android.finsky.at.n.a.add(p0);
    }

    public static void b(int p0, Bundle p1) {
        v1 = 0;
        while (v1 < com.google.android.finsky.at.n.a.size()) {
            ((com.google.android.finsky.at.m)com.google.android.finsky.at.n.a.get(v1)).b(p0, p1);
            v1 = v1 + 1;
        }
    }

}
