package com.google.android.finsky.utils;

import android.content.Context;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class C4683n {
    public static final DateFormat f24064a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public final DateFormat f24065b;
    public final DateFormat f24066c;
    public final DateFormat f24067d;
    public final Context f24068e;

    public C4683n(Context context) {
        this.f24068e = context;
        this.f24065b = android.text.format.DateFormat.getLongDateFormat(context);
        this.f24066c = android.text.format.DateFormat.getDateFormat(context);
        this.f24067d = android.text.format.DateFormat.getDateFormat(context);
        this.f24067d.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public final String m21827a(String str) {
        try {
            Date parse;
            synchronized (f24064a) {
                parse = f24064a.parse(str);
            }
            str = m21829b(parse);
        } catch (ParseException e) {
            if (!Pattern.matches("^\\d\\d\\d\\d$", str)) {
                throw e;
            }
        }
        return str;
    }

    public static Date m21825a(String str, String str2) {
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            FinskyLog.m21669e("Cannot parse date %s", str);
            return null;
        }
    }

    public static String m21823a(Date date) {
        String format;
        synchronized (f24064a) {
            format = f24064a.format(date);
        }
        return format;
    }

    public static String m21824a(Date date, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    public final String m21826a(long j) {
        String format;
        synchronized (this.f24066c) {
            format = this.f24066c.format(new Date(j));
        }
        return format;
    }

    public final String m21828b(long j) {
        String format;
        synchronized (this.f24067d) {
            format = this.f24067d.format(new Date(j));
        }
        return format;
    }

    public static int m21822a(Calendar calendar, Calendar calendar2) {
        int i = calendar2.get(1) - calendar.get(1);
        if (calendar.get(2) > calendar2.get(2) || (calendar.get(2) == calendar2.get(2) && calendar.get(5) > calendar2.get(5))) {
            return i - 1;
        }
        return i;
    }

    public final String m21829b(Date date) {
        String format;
        synchronized (this.f24065b) {
            format = this.f24065b.format(date);
        }
        return format;
    }
}
