package com.android.volley;

import android.content.Intent;

public class AuthFailureError extends VolleyError
{

    public Intent a;

    AuthFailureError() {
        VolleyError();
    }

    AuthFailureError(Intent p0) {
        VolleyError();
        this.a = p0;
    }

    AuthFailureError(com.android.volley.m p0) {
        VolleyError(p0);
    }

    AuthFailureError(String p0) {
        VolleyError(p0);
    }

    AuthFailureError(String p0, Exception p1) {
        VolleyError(p0, p1);
    }

    public String getMessage() {
        if (this.a != 0)
            v0 = "User needs to (re)enter credentials.";
        else
            v0 = super.getMessage();
        return v0;
    }

}
