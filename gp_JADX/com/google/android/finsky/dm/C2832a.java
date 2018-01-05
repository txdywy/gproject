package com.google.android.finsky.dm;

import android.content.Intent;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.utils.C4685p;
import com.squareup.leakcanary.C7582R;

public final class C2832a extends C1128e {
    public String af;

    public static C2832a m14981a(String str, String str2, String str3, String str4) {
        C1508k d = new C1508k().m8859c(str).m8856b(str2).m8853a(true).m8857b(true).m8863e(str3).m8861d(str4);
        C1128e c2832a = new C2832a();
        d.m8854a(c2832a);
        c2832a.af = str2;
        return c2832a;
    }

    protected final void ab() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", C4685p.m21831a(this.af).toString());
        intent.setType("text/plain");
        m580a(Intent.createChooser(intent, m605i().getText(C7582R.string.share)));
    }
}
