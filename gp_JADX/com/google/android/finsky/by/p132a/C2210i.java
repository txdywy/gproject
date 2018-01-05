package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C2210i implements Runnable {
    public final /* synthetic */ C2207f f11053a;

    C2210i(C2207f c2207f) {
        this.f11053a = c2207f;
    }

    public final void run() {
        al alVar = this.f11053a.f11036b;
        List cX = this.f11053a.f11035a.cX();
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[cX.size()];
        for (int i = 0; i < cX.size(); i++) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append('?');
            strArr[i] = ((Account) cX.get(i)).name;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (alVar.f11028c.getWritableDatabase().delete("ownership", new StringBuilder(String.valueOf(stringBuilder2).length() + 17).append("account NOT IN (").append(stringBuilder2).append(")").toString(), strArr) > 0) {
            FinskyLog.m21659a("Removed %d obsolete library rows.", Integer.valueOf(alVar.f11028c.getWritableDatabase().delete("ownership", new StringBuilder(String.valueOf(stringBuilder2).length() + 17).append("account NOT IN (").append(stringBuilder2).append(")").toString(), strArr)));
        }
    }
}
