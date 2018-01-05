package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;

public final class jd {
    public String f27043a = "googleads.g.doubleclick.net";
    public String f27044b = "/pagead/ads";
    public String f27045c = "ad.doubleclick.net";
    public String[] f27046d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public ge f27047e;

    static {
        String[] strArr = new String[]{"/aclk", "/pcs/click"};
    }

    public jd(ge geVar) {
        this.f27047e = geVar;
    }

    private final boolean m24879c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f27045c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final Uri m24880a(Uri uri, Context context) {
        try {
            return m24881a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    final Uri m24881a(Uri uri, Context context, String str, boolean z) {
        try {
            boolean c = m24879c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzcw("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzcw("Query parameter already exists: ms");
            }
            String a = z ? this.f27047e.mo4747a(context, str) : this.f27047e.mo4746a(context);
            String uri2;
            String encodedPath;
            if (c) {
                String str2 = "dc_ms";
                uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str2).append("=").append(a).append(";").append(uri2.substring(indexOf + 1)).toString());
                }
                encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str2).append("=").append(a).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
            }
            uri2 = "ms";
            encodedPath = uri.toString();
            int indexOf3 = encodedPath.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = encodedPath.indexOf("?adurl");
            }
            return indexOf3 != -1 ? Uri.parse(new StringBuilder(encodedPath.substring(0, indexOf3 + 1)).append(uri2).append("=").append(a).append("&").append(encodedPath.substring(indexOf3 + 1)).toString()) : uri.buildUpon().appendQueryParameter(uri2, a).build();
        } catch (UnsupportedOperationException e) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final boolean m24882a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f27043a) && uri.getPath().equals(this.f27044b);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final boolean m24883b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f27046d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
