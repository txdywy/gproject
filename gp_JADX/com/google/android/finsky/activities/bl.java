package com.google.android.finsky.activities;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.DfeToc;

public final class bl {
    public static cu m6308a(DfeToc dfeToc, int i, Account account) {
        if (C1473m.f7980a.dj().mo2294a(12607603)) {
            switch (i) {
                case 1:
                    return new cj(dfeToc, account);
                case 2:
                    return new ct(dfeToc, account);
                case 3:
                    return new ch(dfeToc, account, C1473m.f7980a.mo2254m(), C1473m.f7980a.bw(), C1473m.f7980a.mo2029I(), C1473m.f7980a.ah());
                case 4:
                    return new cp(dfeToc, account);
                case 6:
                    return new cl(dfeToc, account);
                default:
                    return new dc(dfeToc, account);
            }
        }
        switch (i) {
            case 1:
                return new ci(dfeToc, account);
            case 2:
                return new cq(dfeToc, account);
            case 3:
                return new bq(dfeToc, account, C1473m.f7980a.mo2254m(), C1473m.f7980a.mo2256o(), C1473m.f7980a.bw(), C1473m.f7980a.mo2029I(), C1473m.f7980a.ah());
            case 4:
                return new cm(dfeToc, account);
            case 6:
                return new ck(dfeToc, account);
            default:
                return new cu(dfeToc, account);
        }
    }
}
