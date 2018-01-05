package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    public final int f25616a;

    public GooglePlayServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.f25616a = i;
    }
}
