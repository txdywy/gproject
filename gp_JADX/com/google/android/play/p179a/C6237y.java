package com.google.android.play.p179a;

import android.content.ContentResolver;
import android.text.TextUtils;
import com.google.android.common.http.UrlRules;
import com.google.android.play.utils.PlayCommonLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public final class C6237y {
    public static Long f31236d = null;
    public final String f31237a;
    public final ContentResolver f31238b;
    public final int f31239c;

    public C6237y(String str, ContentResolver contentResolver, int i) {
        this.f31237a = str;
        this.f31238b = contentResolver;
        this.f31239c = i;
    }

    final Long m28749a() {
        Long l = null;
        try {
            HttpURLConnection httpURLConnection;
            Object a = UrlRules.m5671a(this.f31238b).m5672a(this.f31237a).m5673a(this.f31237a);
            if (TextUtils.isEmpty(a)) {
                httpURLConnection = l;
            } else {
                PlayCommonLog.a("Connecting to server for timestamp: %s", new Object[]{a});
                httpURLConnection = (HttpURLConnection) new URL(a).openConnection();
                httpURLConnection.setConnectTimeout(this.f31239c);
                httpURLConnection.setReadTimeout(this.f31239c);
                httpURLConnection.connect();
            }
            if (httpURLConnection != null) {
                try {
                    l = C6237y.m28748a(httpURLConnection);
                } catch (IOException e) {
                    PlayCommonLog.c("Failed to connect to server for server timestamp: %s", new Object[]{e.toString()});
                } finally {
                    httpURLConnection.disconnect();
                }
            } else {
                PlayCommonLog.a("Failed to connect to server for server timestamp: request was blocked", new Object[0]);
            }
        } catch (IOException e2) {
            PlayCommonLog.c("Failed to connect to server for server timestamp: %s", new Object[]{e2.toString()});
        }
        return l;
    }

    private static Long m28748a(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        Throwable th;
        NumberFormatException e;
        Long l = null;
        int responseCode = httpURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 300) {
            try {
                errorStream = httpURLConnection.getErrorStream();
                try {
                    PlayCommonLog.a("Failed to get server timestamp, Code = %s.", new Object[]{Integer.valueOf(responseCode)});
                    errorStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    errorStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                errorStream = null;
                th = th4;
                errorStream.close();
                throw th;
            }
        }
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[128];
                int read;
                do {
                    read = inputStream.read(bArr);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                        continue;
                    }
                } while (read >= 0);
                l = Long.valueOf(Long.parseLong(new String(byteArrayOutputStream.toByteArray())));
                inputStream.close();
            } catch (NumberFormatException e2) {
                e = e2;
                try {
                    PlayCommonLog.a("Failed to parse respoonse into server timestamp, e = %s.", new Object[]{e});
                    inputStream.close();
                    return l;
                } catch (Throwable th5) {
                    th = th5;
                    inputStream.close();
                    throw th;
                }
            }
        } catch (NumberFormatException e3) {
            e = e3;
            inputStream = null;
            PlayCommonLog.a("Failed to parse respoonse into server timestamp, e = %s.", new Object[]{e});
            inputStream.close();
            return l;
        } catch (Throwable th32) {
            inputStream = null;
            th = th32;
            inputStream.close();
            throw th;
        }
        return l;
    }
}
