package com.google.android.finsky.billing.payments;

import com.google.android.finsky.bg.h;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;

public static class com.google.android.finsky.billing.payments.f
{

    public static int a(int p0) {
        v0 = 2132017933;
        switch (p0) {
            case 1:
                v0 = 2132017937;
                break;
            case 2:
                v0 = 2132017936;
                break;
            case 3:
                if (com.google.android.finsky.bg.h.b == 0)
                    v0 = 2132017932;
                break;
            case 4:
                v0 = 2132017938;
                break;
            case 5:
                if (com.google.android.finsky.bg.h.b != 0) {
                }
                else
                    v0 = 2132017935;
                break;
            case 6:
                v0 = 2132017934;
                break;
            default:
                if (com.google.android.finsky.bg.h.b != 0) {
                }
                else
                    v0 = 2132017935;
                break;
        }
        return v0;
    }

    public static int a(SetupWizardParams p0) {
        if (p0 == 0)
            v0 = 2132017931;
        else if (p0.c != 0)
            v0 = 2132018149;
        else
            v0 = 2132017944;
        return v0;
    }

}
