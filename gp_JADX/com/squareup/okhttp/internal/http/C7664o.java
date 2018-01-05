package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class C7664o {
    public static final TimeZone f39672a = TimeZone.getTimeZone("GMT");
    public static final ThreadLocal f39673b = new C7665p();
    public static final String[] f39674c = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    public static final DateFormat[] f39675d = new DateFormat[15];

    public static Date m36960a(String str) {
        int i = 0;
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f39673b.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f39674c) {
            int length = f39674c.length;
            while (i < length) {
                DateFormat dateFormat = f39675d[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f39674c[i], Locale.US);
                    dateFormat.setTimeZone(f39672a);
                    f39675d[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                parse = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse;
                }
                i++;
            }
            return null;
        }
    }
}
