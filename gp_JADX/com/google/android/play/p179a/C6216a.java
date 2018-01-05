package com.google.android.play.p179a;

import android.net.NetworkInfo;
import com.google.android.play.utils.C6324f;

public final class C6216a {
    public static int m28694a(NetworkInfo networkInfo) {
        switch (C6324f.m28967a(networkInfo)) {
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 2;
            case 7:
                return 8;
            case 8:
                return 1;
            default:
                return 0;
        }
    }
}
