package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class C7665p extends ThreadLocal {
    C7665p() {
    }

    protected final /* synthetic */ Object initialValue() {
        DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(C7664o.f39672a);
        return simpleDateFormat;
    }
}
