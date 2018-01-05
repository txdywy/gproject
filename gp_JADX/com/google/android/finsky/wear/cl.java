package com.google.android.finsky.wear;

import android.net.Uri;
import java.util.List;

public final class cl {
    public static final Uri f24957a = Uri.parse("wear:/device_configuration");
    public static final Uri f24958b = Uri.parse("wear:/liveness");
    public static final Uri f24959c = Uri.parse("wear:/intermediate_request_status");
    public static final Uri f24960d = Uri.parse("wear:/wearable_info");
    public static final Uri f24961e = Uri.parse("wear:/install_wearable");
    public static final Uri f24962f = Uri.parse("wear:/uninstall_wearable");
    public static final Uri f24963g = Uri.parse("wear:/request_status");
    public static final Uri f24964h = Uri.parse("wear:/zapp_modules_request");

    public static String m22515a(Uri uri) {
        List pathSegments = uri.getPathSegments();
        return (String) pathSegments.get(pathSegments.size() - 1);
    }

    public static String m22517b(Uri uri) {
        return uri.getHost();
    }

    public static String m22516a(String str) {
        String valueOf = String.valueOf("/phone_installed_apps/");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static {
        Uri.parse("wear:/phone_installed_apps");
    }
}
