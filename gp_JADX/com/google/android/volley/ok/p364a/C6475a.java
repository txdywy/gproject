package com.google.android.volley.ok.p364a;

import android.util.Base64;
import android.util.Log;
import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.ab;
import com.squareup.okhttp.ac;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ai;
import com.squareup.okhttp.ak;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;
import p526e.C7726f;

public final class C6475a implements aa {
    public final String f32469a;
    public final int f32470b = 2;

    public C6475a(String str) {
        this.f32469a = str;
    }

    public final ak m29526a(ab abVar) {
        ag a = abVar.mo6419a();
        int i = this.f32470b;
        String str = this.f32469a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("curl ");
        stringBuilder.append("-X ");
        stringBuilder.append(a.f39289b);
        stringBuilder.append(" ");
        for (String str2 : a.f39290c.m37015a()) {
            String str22;
            stringBuilder.append("--header \"");
            stringBuilder.append(str22);
            stringBuilder.append(": ");
            List b = a.m36633b(str22);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                stringBuilder.append((String) b.get(i2));
                if (i2 < size - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("\" ");
        }
        URI a2 = a.m36631a();
        stringBuilder.append("\"");
        stringBuilder.append(a2);
        stringBuilder.append("\"");
        if (a.f39291d != null) {
            ai aiVar = a.f39291d;
            if (aiVar != null) {
                if (aiVar.mo6418b() < 1024) {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C7726f c7726f = new C7726f();
                    aiVar.mo6417a(c7726f);
                    c7726f.m37385b(byteArrayOutputStream);
                    c7726f.m37377a(byteArrayOutputStream);
                    if (C6475a.m29525a(a.f39290c, aiVar.mo6416a())) {
                        str22 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        stringBuilder.insert(0, new StringBuilder(String.valueOf(str22).length() + 35).append("echo '").append(str22).append("' | base64 -d > /tmp/$$.bin; ").toString());
                        stringBuilder.append(" --data-binary @/tmp/$$.bin");
                    } else {
                        stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                    }
                } else {
                    stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        Log.println(i, str, stringBuilder.toString());
        return abVar.mo6420a(a);
    }

    private static boolean m29525a(C7689v c7689v, ac acVar) {
        String str;
        List<String> c = c7689v.m37019c("Content-Encoding");
        if (c != null) {
            for (String str2 : c) {
                if (str2.equalsIgnoreCase("gzip")) {
                    return true;
                }
            }
        }
        if (acVar == null) {
            return true;
        }
        str2 = acVar.f39284d;
        String str3 = acVar.f39285e;
        if (str2 != null) {
            if (str2.equals("text")) {
                return false;
            }
            if (str2.equals("application") && str3 != null) {
                return (str3.equals("xml") || str3.equals("json")) ? false : true;
            }
        }
        return true;
    }
}
