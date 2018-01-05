package com.google.android.finsky.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.Html;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.volley.DisplayMessageError;
import com.squareup.leakcanary.C7582R;
import java.io.IOException;

public final class C1290m {
    public static String m7702a(Context context, VolleyError volleyError) {
        if (volleyError instanceof DisplayMessageError) {
            return ((DisplayMessageError) volleyError).a;
        }
        if (volleyError instanceof AuthFailureError) {
            Throwable cause = volleyError.getCause();
            if ((cause instanceof IOException) && "NetworkError".equals(cause.getMessage())) {
                return context.getString(C7582R.string.network_error);
            }
            return context.getString(C7582R.string.auth_required_error);
        } else if (volleyError instanceof ServerError) {
            return context.getString(C7582R.string.server_error);
        } else {
            if (volleyError instanceof TimeoutError) {
                return context.getString(C7582R.string.timeout_error);
            }
            if (volleyError instanceof NetworkError) {
                return context.getString(C7582R.string.network_error);
            }
            FinskyLog.m21659a("No specific error message for: %s", volleyError);
            return context.getString(C7582R.string.network_error);
        }
    }

    public static String m7703b(Context context, VolleyError volleyError) {
        if (volleyError instanceof NetworkError) {
            return context.getString(C7582R.string.network_error_title);
        }
        return context.getString(C7582R.string.error);
    }

    public static CharSequence m7704c(Context context, VolleyError volleyError) {
        if (!(volleyError instanceof NetworkError)) {
            return C1290m.m7702a(context, volleyError);
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        Intent intent2 = new Intent("android.settings.NETWORK_OPERATOR_SETTINGS");
        if (intent.resolveActivity(packageManager) == null || intent2.resolveActivity(packageManager) == null) {
            return C1290m.m7702a(context, volleyError);
        }
        return UrlSpanUtils.b(UrlSpanUtils.b(Html.fromHtml(context.getString(C7582R.string.network_error_linked)), "settings_wifi_link", new C1291n(context, intent)), "settings_data_link", new C1292o(context, intent2));
    }
}
