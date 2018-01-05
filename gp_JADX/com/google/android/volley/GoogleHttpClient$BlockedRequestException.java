package com.google.android.volley;

import com.google.android.common.http.c;
import java.io.IOException;

public class GoogleHttpClient$BlockedRequestException extends IOException {
    GoogleHttpClient$BlockedRequestException(c cVar) {
        String str = "Blocked by rule: ";
        String valueOf = String.valueOf(cVar.a);
        super(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
