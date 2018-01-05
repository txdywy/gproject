package com.google.android.finsky.api.p126b;

import android.util.Base64;
import android.util.Log;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.ab;
import com.squareup.okhttp.ac;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ai;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.v;
import e.f;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

public final class C1281a implements aa {
    public final ak mo1669a(ab abVar) {
        String encodeToString;
        ag a = abVar.a();
        String str = "FinskyHttp";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("curl ");
        stringBuilder.append("-X ");
        stringBuilder.append(a.b);
        stringBuilder.append(" ");
        for (String encodeToString2 : a.c.a()) {
            stringBuilder.append("--header \"");
            stringBuilder.append(encodeToString2);
            stringBuilder.append(": ");
            List b = a.b(encodeToString2);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                stringBuilder.append((String) b.get(i));
                if (i < size - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("\" ");
        }
        stringBuilder.append("\"");
        stringBuilder.append(a.a());
        stringBuilder.append("\"");
        ai aiVar = a.d;
        if (aiVar != null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f fVar = new f();
            aiVar.a(fVar);
            fVar.b(byteArrayOutputStream);
            fVar.a(byteArrayOutputStream);
            if (C1281a.m7685a(a.c, aiVar.a())) {
                encodeToString2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                stringBuilder.insert(0, new StringBuilder(String.valueOf(encodeToString2).length() + 35).append("echo '").append(encodeToString2).append("' | base64 -d > /tmp/$$.bin; ").toString());
                stringBuilder.append(" --data-binary @/tmp/$$.bin");
            } else {
                stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
            }
        }
        C1281a.m7684a(str, stringBuilder.toString());
        return abVar.a(a);
    }

    private static void m7684a(String str, String str2) {
        for (int i = 0; i < str2.length(); i += 2000) {
            Log.println(2, str, str2.substring(i, Math.min(str2.length(), i + 2000)));
        }
    }

    private static boolean m7685a(v vVar, ac acVar) {
        String str;
        List<String> c = vVar.c("Content-Encoding");
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
        str2 = acVar.d;
        String str3 = acVar.e;
        if ("text".equals(str2)) {
            return false;
        }
        if ("application".equals(str2)) {
            return ("xml".equals(str3) || "json".equals(str3)) ? false : true;
        } else {
            return true;
        }
    }
}
