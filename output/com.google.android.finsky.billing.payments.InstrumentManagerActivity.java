package com.google.android.finsky.billing.payments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.d.w;

protected final class InstrumentManagerActivity extends com.google.android.finsky.billing.payments.c
{

    InstrumentManagerActivity() {
        com.google.android.finsky.billing.payments.c();
    }

    public static Intent a(Context p0, String p1, byte[] p2, byte[] p3, Bundle p4, com.google.android.finsky.d.w p5, int p6) {
        v4 = new Intent(p0, InstrumentManagerActivity);
        InstrumentManagerActivity.a(p1, p2, p3, p4, v4, p6);
        p5.b(p1).a(v4);
        return v4;
    }

    protected final int f() {
        return 1600;
    }

}
