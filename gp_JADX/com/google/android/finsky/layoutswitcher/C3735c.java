package com.google.android.finsky.layoutswitcher;

import com.squareup.leakcanary.C7582R;

public final class C3735c {
    public static C3734b m17615a(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4 = C7582R.string.network_error_notify_requested;
        boolean z3 = false;
        switch (i) {
            case 1:
                i3 = 0;
                break;
            case 2:
                i3 = C7582R.drawable.check_on_grey_oval;
                break;
            default:
                i4 = C7582R.string.network_error_notify;
                i3 = 0;
                break;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return new C3734b(i3, i4, z, z2, z3, i2);
    }
}
