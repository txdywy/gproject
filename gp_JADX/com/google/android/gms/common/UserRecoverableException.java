package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {
    public final Intent f25615b;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f25615b = intent;
    }
}
