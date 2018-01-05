package com.google.android.finsky.api;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.volley.DisplayMessageError;
import java.io.IOException;

public static class com.google.android.finsky.api.m
{

    public static String a(Context p0, VolleyError p1) {
        if (p1 instanceof DisplayMessageError)
            v0 = ((DisplayMessageError)p1).a;
        else if (p1 instanceof AuthFailureError) {
            v0 = p1.getCause();
            if (v0 instanceof IOException && "NetworkError".equals(v0.getMessage()))
                v0 = p0.getString(2131952603);
            else
                v0 = p0.getString(2131951731);
        }
        else if (p1 instanceof ServerError)
            v0 = p0.getString(2131953124);
        else if (p1 instanceof TimeoutError)
            v0 = p0.getString(2131953260);
        else if (p1 instanceof NetworkError)
            v0 = p0.getString(2131952603);
        else {
            v1 = new Object[1];
            v1[0] = p1;
            FinskyLog.a("No specific error message for: %s", v1);
            v0 = p0.getString(2131952603);
        }
        return v0;
    }

    public static String b(Context p0, VolleyError p1) {
        if (p1 instanceof NetworkError)
            v0 = p0.getString(2131952607);
        else
            v0 = p0.getString(2131952119);
        return v0;
    }

    public static CharSequence c(Context p0, VolleyError p1) {
        if (p1 instanceof NetworkError) {
            v0 = p0.getPackageManager();
            v1 = new Intent("android.settings.WIFI_SETTINGS");
            v2 = new Intent("android.settings.NETWORK_OPERATOR_SETTINGS");
            if (v1.resolveActivity(v0) == 0 || v2.resolveActivity(v0) == 0)
                v0 = com.google.android.finsky.api.m.a(p0, p1);
            else
                v0 = UrlSpanUtils.b(UrlSpanUtils.b(Html.fromHtml(p0.getString(2131952604)), "settings_wifi_link", new com.google.android.finsky.api.n(p0, v1)), "settings_data_link", new com.google.android.finsky.api.o(p0, v2));
        }
        else
            v0 = com.google.android.finsky.api.m.a(p0, p1);
        return v0;
    }

}
