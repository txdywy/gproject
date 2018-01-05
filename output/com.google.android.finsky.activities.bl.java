package com.google.android.finsky.activities;

import android.accounts.Account;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.m;

public static class com.google.android.finsky.activities.bl
{

    public static com.google.android.finsky.activities.cu a(DfeToc p0, int p1, Account p2) {
        if (com.google.android.finsky.m.a.dj().a(12607603)) {
            switch (p1) {
                case 1:
                    v0 = new com.google.android.finsky.activities.cj(p0, p2);
                    break;
                case 2:
                    v0 = new com.google.android.finsky.activities.ct(p0, p2);
                    break;
                case 3:
                    v0 = new com.google.android.finsky.activities.ch(p0, p2, com.google.android.finsky.m.a.m(), com.google.android.finsky.m.a.bw(), com.google.android.finsky.m.a.I(), com.google.android.finsky.m.a.ah());
                    break;
                case 4:
                    v0 = new com.google.android.finsky.activities.cp(p0, p2);
                    break;
                case 5:
                    v0 = new com.google.android.finsky.activities.dc(p0, p2);
                    break;
                case 6:
                    v0 = new com.google.android.finsky.activities.cl(p0, p2);
                    break;
                default:
                    v0 = new com.google.android.finsky.activities.dc(p0, p2);
                    break;
            }
            return v0;
        }
        switch (p1) {
            case 1:
                v0 = new com.google.android.finsky.activities.ci(p0, p2);
                break;
            case 2:
                v0 = new com.google.android.finsky.activities.cq(p0, p2);
                break;
            case 3:
                v0 = new com.google.android.finsky.activities.bq(p0, p2, com.google.android.finsky.m.a.m(), com.google.android.finsky.m.a.o(), com.google.android.finsky.m.a.bw(), com.google.android.finsky.m.a.I(), com.google.android.finsky.m.a.ah());
                break;
            case 4:
                v0 = new com.google.android.finsky.activities.cm(p0, p2);
                break;
            case 5:
                v0 = new com.google.android.finsky.activities.cu(p0, p2);
                break;
            case 6:
                v0 = new com.google.android.finsky.activities.ck(p0, p2);
                break;
            default:
                v0 = new com.google.android.finsky.activities.cu(p0, p2);
                break;
        }
    }

}
