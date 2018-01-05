package com.android.volley;

import android.content.Intent;

public class AuthFailureError extends VolleyError {
    public Intent f4024a;

    public AuthFailureError(Intent intent) {
        this.f4024a = intent;
    }

    public AuthFailureError(C0697m c0697m) {
        super(c0697m);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exception) {
        super(str, exception);
    }

    public String getMessage() {
        if (this.f4024a != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
