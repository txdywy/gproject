package com.google.android.finsky.at;

import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C1517n {
    public static final List f8206a = new ArrayList();

    public static void m8868a(C0998m c0998m) {
        if (c0998m == null) {
            FinskyLog.m21669e("Trying to register a null SimpleAlertDialog.Listener.", new Object[0]);
        } else if (f8206a.contains(c0998m)) {
            FinskyLog.m21669e("Trying to register an already registered SimpleAlertDialog.Listener.", new Object[0]);
        } else {
            f8206a.add(c0998m);
        }
    }

    public static void m8867a(int i, Bundle bundle) {
        for (int i2 = 0; i2 < f8206a.size(); i2++) {
            ((C0998m) f8206a.get(i2)).mo1202a(i, bundle);
        }
    }

    public static void m8869b(int i, Bundle bundle) {
        for (int i2 = 0; i2 < f8206a.size(); i2++) {
            ((C0998m) f8206a.get(i2)).mo1211b(i, bundle);
        }
    }
}
