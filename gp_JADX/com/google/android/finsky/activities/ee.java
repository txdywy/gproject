package com.google.android.finsky.activities;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.notification.C1061b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.uninstall.UninstallManagerActivity;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import java.util.ArrayList;

final class ee implements C1061b {
    public final /* synthetic */ InlineAppPostPurchaseDialog f6702a;

    ee(InlineAppPostPurchaseDialog inlineAppPostPurchaseDialog) {
        this.f6702a = inlineAppPostPurchaseDialog;
    }

    public final boolean mo1351a(String str, String str2, String str3, String str4, C2495w c2495w) {
        return false;
    }

    public final boolean mo1350a(String str, String str2, String str3, int i, C2495w c2495w) {
        if (!this.f6702a.f6352J.f14885a.f12096c.equals(str) || i != 3) {
            return false;
        }
        if (C1473m.f7980a.dj().mo2294a(12610437)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.f6702a.startActivityForResult(UninstallManagerActivityV2.m21251a(arrayList, this.f6702a.f6316C, false), 100);
        } else {
            this.f6702a.startActivityForResult(UninstallManagerActivity.m21236a(this.f6702a.f6352J, this.f6702a.f6316C), 100);
        }
        return true;
    }

    public final boolean mo1352a(ArrayList arrayList, C2495w c2495w) {
        return false;
    }

    public final boolean mo1353b(String str, String str2, String str3, int i, C2495w c2495w) {
        return false;
    }

    public final boolean mo1349a(String str) {
        return false;
    }

    public final boolean mo1348a() {
        return false;
    }
}
