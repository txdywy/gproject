package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.v4.p037h.C0304u;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C5106e;
import com.google.android.gms.common.util.C5154i;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.dr;
import com.google.android.gms.p268a.C4884b;

public final class bg {
    public static final C0304u f26018a = new C0304u();

    private static String m23772a(Context context) {
        CharSequence charSequence;
        String packageName = context.getPackageName();
        try {
            dq a = dr.f26667b.m24299a(context);
            return a.f26666a.getPackageManager().getApplicationLabel(a.f26666a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (NameNotFoundException e) {
            charSequence = context.getApplicationInfo().name;
            return TextUtils.isEmpty(charSequence) ? charSequence : packageName;
        } catch (NullPointerException e2) {
            charSequence = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(charSequence)) {
            }
        }
    }

    public static String m23773a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4884b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C4884b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C4884b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m23774a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m23774a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m23774a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m23774a(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    private static String m23774a(Context context, String str) {
        synchronized (f26018a) {
            String str2 = (String) f26018a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b = C5106e.m23703b(context);
            if (b == null) {
                return null;
            }
            int identifier = b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                str2 = String.valueOf(str);
                Log.w(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
                return null;
            }
            Object string = b.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                str3 = "GoogleApiAvailability";
                str4 = "Got empty resource: ";
                str2 = String.valueOf(str);
                Log.w(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
                return null;
            }
            f26018a.put(str, string);
            return string;
        }
    }

    private static String m23775a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m23774a(context, str);
        if (a == null) {
            a = resources.getString(C4884b.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    public static String m23776b(Context context, int i) {
        String a = i == 6 ? m23774a(context, "common_google_play_services_resolution_required_title") : m23773a(context, i);
        return a == null ? context.getResources().getString(C4884b.common_google_play_services_notification_ticker) : a;
    }

    public static String m23777c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m23772a(context);
        switch (i) {
            case 1:
                return resources.getString(C4884b.common_google_play_services_install_text, new Object[]{a});
            case 2:
                if (C5154i.m23886a(context)) {
                    return resources.getString(C4884b.common_google_play_services_wear_update_text);
                }
                return resources.getString(C4884b.common_google_play_services_update_text, new Object[]{a});
            case 3:
                return resources.getString(C4884b.common_google_play_services_enable_text, new Object[]{a});
            case 5:
                return m23775a(context, "common_google_play_services_invalid_account_text", a);
            case 7:
                return m23775a(context, "common_google_play_services_network_error_text", a);
            case 9:
                return resources.getString(C4884b.common_google_play_services_unsupported_text, new Object[]{a});
            case 16:
                return m23775a(context, "common_google_play_services_api_unavailable_text", a);
            case 17:
                return m23775a(context, "common_google_play_services_sign_in_failed_text", a);
            case 18:
                return resources.getString(C4884b.common_google_play_services_updating_text, new Object[]{a});
            case 20:
                return m23775a(context, "common_google_play_services_restricted_profile_text", a);
            default:
                return resources.getString(C4884b.common_google_play_services_unknown_issue, new Object[]{a});
        }
    }

    public static String m23778d(Context context, int i) {
        return i == 6 ? m23775a(context, "common_google_play_services_resolution_required_text", m23772a(context)) : m23777c(context, i);
    }

    public static String m23779e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4884b.common_google_play_services_install_button);
            case 2:
                return resources.getString(C4884b.common_google_play_services_update_button);
            case 3:
                return resources.getString(C4884b.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }
}
