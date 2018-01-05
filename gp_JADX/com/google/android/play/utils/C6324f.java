package com.google.android.play.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import com.google.android.play.utils.p354b.C6322j;

public final class C6324f {
    public static C1457g f31614a;

    public static int m28966a(Context context) {
        if (((Boolean) C6322j.f31571A.m28964b()).booleanValue()) {
            return ((Integer) C6322j.f31572B.m28964b()).intValue();
        }
        NetworkInfo networkInfo;
        if (f31614a == null) {
            PlayCommonLog.d("NetworkInfoCache instance is not set in NetworkInfoUtil", new Object[0]);
            networkInfo = null;
        } else {
            networkInfo = f31614a.mo2010a(context);
        }
        return C6324f.m28967a(networkInfo);
    }

    public static int m28967a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 8;
        }
        if (networkInfo.getType() == 1) {
            return 4;
        }
        if (networkInfo.getType() == 6) {
            return 3;
        }
        if (networkInfo.getType() == 0) {
            switch (networkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 1;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 2;
                case 13:
                    return 3;
                default:
                    return 5;
            }
        } else if (networkInfo.getType() == 9) {
            return 6;
        } else {
            if (networkInfo.getType() == 7) {
                return 7;
            }
            return 0;
        }
    }

    @TargetApi(17)
    public static boolean m28968b(Context context) {
        if (VERSION.SDK_INT < 17) {
            if (System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } else if (Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
