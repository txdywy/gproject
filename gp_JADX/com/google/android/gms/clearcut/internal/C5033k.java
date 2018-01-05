package com.google.android.gms.clearcut.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.C5015c;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.od;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class C5033k implements C5015c {
    public static final Charset f25596a = Charset.forName("UTF-8");
    public static Boolean f25597b = null;
    public C5034l f25598c;

    public C5033k(Context context) {
        this(new C5034l(context));
    }

    private C5033k(C5034l c5034l) {
        this.f25598c = (C5034l) am.m23733a((Object) c5034l);
    }

    private static C5035m m23251a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        String str2 = "";
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            str2 = "LogSamplerImpl";
            String str3 = "Failed to parse the rule: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new C5035m(str2, parseLong, parseLong2);
            }
            Log.e("LogSamplerImpl", "negative values not supported: " + parseLong + "/" + parseLong2);
            return null;
        } catch (Throwable e) {
            Throwable th = e;
            str3 = "LogSamplerImpl";
            String str4 = "parseLong() failed while parsing: ";
            valueOf = String.valueOf(str);
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
            return null;
        }
    }

    public final boolean mo4530a(String str, int i) {
        if (str == null || str.isEmpty()) {
            Object valueOf = i >= 0 ? String.valueOf(i) : null;
        }
        if (valueOf == null) {
            return true;
        }
        String str2;
        C5034l c5034l = this.f25598c;
        long b = c5034l.f25599a == null ? 0 : od.m25268b(c5034l.f25599a, "android_id");
        C5034l c5034l2 = this.f25598c;
        if (c5034l2.f25599a == null) {
            str2 = null;
        } else {
            ContentResolver contentResolver = c5034l2.f25599a;
            String valueOf2 = String.valueOf("gms:playlog:service:sampling_");
            str2 = String.valueOf(valueOf);
            str2 = od.m25263a(contentResolver, str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2));
        }
        C5035m a = C5033k.m23251a(str2);
        if (a == null) {
            return true;
        }
        String str3 = a.f25600a;
        if (str3 == null || str3.isEmpty()) {
            b = C5030f.m23245a(ByteBuffer.allocate(8).putLong(b).array());
        } else {
            byte[] bytes = str3.getBytes(f25596a);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
            allocate.put(bytes);
            allocate.putLong(b);
            b = C5030f.m23245a(allocate.array());
        }
        long j = a.f25601b;
        long j2 = a.f25602c;
        if (j < 0 || j2 < 0) {
            throw new IllegalArgumentException("negative values not supported: " + j + "/" + j2);
        }
        if (j2 > 0) {
            if ((b >= 0 ? b % j2 : (((b & Long.MAX_VALUE) % j2) + ((Long.MAX_VALUE % j2) + 1)) % j2) < j) {
                return true;
            }
        }
        return false;
    }
}
