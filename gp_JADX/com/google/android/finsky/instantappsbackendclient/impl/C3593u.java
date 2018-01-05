package com.google.android.finsky.instantappsbackendclient.impl;

import com.google.android.gms.common.util.C5150e;
import com.google.protobuf.nano.C0757i;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import org.chromium.net.e;

public final class C3593u implements C3570t {
    public final e f17899a;

    C3593u(e eVar) {
        this.f17899a = eVar;
    }

    public final af mo3544a(ac acVar) {
        String str = acVar.f17861d;
        Map unmodifiableMap = Collections.unmodifiableMap(acVar.f17860c);
        C0757i c0757i = acVar.f17859b;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f17899a.a(new URL(str));
        if (acVar.f17858a == 1) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.getOutputStream().write(C0757i.m4909a(c0757i));
        } else if (acVar.f17858a == 0) {
            httpURLConnection.setRequestMethod("GET");
        }
        String str2 = "Authorization";
        httpURLConnection.setRequestProperty(str2, (String) unmodifiableMap.get(str2));
        int i = "application/x-protobuf";
        httpURLConnection.setRequestProperty("Content-Type", i);
        try {
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C5150e.m23880a(inputStream, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            i = httpURLConnection.getResponseCode();
            return new C3595w(i, toByteArray);
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
