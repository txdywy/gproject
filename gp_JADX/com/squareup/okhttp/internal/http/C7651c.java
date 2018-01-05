package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;

public final class C7651c {
    public final ag f39618a;
    public final ak f39619b;

    public C7651c(ag agVar, ak akVar) {
        this.f39618a = agVar;
        this.f39619b = akVar;
    }

    public static boolean m36920a(ak akVar, ag agVar) {
        switch (akVar.f39306c) {
            case 200:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501:
                break;
            case 302:
            case 307:
                if (akVar.m36651a("Expires") == null && akVar.m36653c().f39337c == -1 && !akVar.m36653c().f39340f && !akVar.m36653c().f39339e) {
                    return false;
                }
            default:
                return false;
        }
        if (akVar.m36653c().f39336b || agVar.m36634c().f39336b) {
            return false;
        }
        return true;
    }
}
