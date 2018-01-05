package com.google.android.wallet.ui.common;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.google.android.wallet.a.a;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;

public final class cw extends C6665h {
    public static cw m30919a(String str, int i) {
        if (((Boolean) a.n.a()).booleanValue()) {
            Object obj = (TextUtils.isEmpty(str) || !str.startsWith("https://")) ? null : 1;
            if (obj == null) {
                String str2 = "web view url should start form 'https', url : ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        Bundle b = C6665h.m30137b(i);
        b.putString("url", str);
        Fragment cwVar = new cw();
        cwVar.f(b);
        return cwVar;
    }

    public final Dialog mo5575W() {
        View view = (WebViewLayout) m30140Y().inflate(C6623g.view_web_view_layout, null, false);
        view.m30704a(this.q.getString("url"), null);
        return new C6760a(m30139X()).m30716a(view).m30715a(C6625i.wallet_uic_close, null).m30713a();
    }
}
