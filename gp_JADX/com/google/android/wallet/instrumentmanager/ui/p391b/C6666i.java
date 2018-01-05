package com.google.android.wallet.instrumentmanager.ui.p391b;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import com.google.android.wallet.instrumentmanager.C6641d;
import com.google.android.wallet.instrumentmanager.C6642e;
import com.google.android.wallet.ui.common.C6665h;
import com.google.android.wallet.ui.common.C6760a;

public final class C6666i extends C6665h {
    public static C6666i m30142a(int i) {
        Fragment c6666i = new C6666i();
        c6666i.f(C6665h.m30137b(i));
        return c6666i;
    }

    public final Dialog mo5575W() {
        return new C6760a(m30139X()).m30716a(m30140Y().inflate(C6641d.view_cvc_information, null, false)).m30715a(C6642e.wallet_uic_close, null).m30713a();
    }
}
