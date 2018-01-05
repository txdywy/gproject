package com.google.android.volley;

import com.android.volley.VolleyError;

public class DisplayMessageError extends VolleyError {
    public String f32440a;

    public DisplayMessageError(String str) {
        this.f32440a = str;
    }

    public String toString() {
        String str = this.f32440a;
        return new StringBuilder(String.valueOf(str).length() + 21).append("DisplayErrorMessage[").append(str).append("]").toString();
    }
}
