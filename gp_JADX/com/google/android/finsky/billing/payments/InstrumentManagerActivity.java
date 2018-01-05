package com.google.android.finsky.billing.payments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.p111d.C2495w;

public class InstrumentManagerActivity extends C2040c {
    public static Intent m10735a(Context context, String str, byte[] bArr, byte[] bArr2, Bundle bundle, C2495w c2495w, int i) {
        Intent intent = new Intent(context, InstrumentManagerActivity.class);
        C2040c.m10729a(str, bArr, bArr2, bundle, intent, i);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }

    protected final int mo2368f() {
        return 1600;
    }
}
