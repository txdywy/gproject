package com.google.android.volley.ok;

import java.io.IOException;

public class UrlRewriter$BlockedRequestException extends IOException {
    UrlRewriter$BlockedRequestException(String str) {
        String str2 = "Blocked by rule: ";
        String valueOf = String.valueOf(str);
        super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
