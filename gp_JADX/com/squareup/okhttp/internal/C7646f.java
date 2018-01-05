package com.squareup.okhttp.internal;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class C7646f {
    public static final C7646f f39583a = C7646f.m36886b();

    public static String m36885a() {
        return "OkHttp";
    }

    public void mo6462a(SSLSocket sSLSocket, String str, List list) {
    }

    public void mo6464a(SSLSocket sSLSocket) {
    }

    public String mo6463b(SSLSocket sSLSocket) {
        return null;
    }

    public void mo6461a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.squareup.okhttp.internal.C7646f m36886b() {
        /*
        r1 = 0;
        r0 = "com.android.org.conscrypt.OpenSSLSocketImpl";
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x006f }
    L_0x0006:
        r3 = new com.squareup.okhttp.internal.e;	 Catch:{ ClassNotFoundException -> 0x0076 }
        r0 = 0;
        r2 = "setUseSessionTickets";
        r4 = 1;
        r4 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0076 }
        r5 = 0;
        r6 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0076 }
        r4[r5] = r6;	 Catch:{ ClassNotFoundException -> 0x0076 }
        r3.<init>(r0, r2, r4);	 Catch:{ ClassNotFoundException -> 0x0076 }
        r4 = new com.squareup.okhttp.internal.e;	 Catch:{ ClassNotFoundException -> 0x0076 }
        r0 = 0;
        r2 = "setHostname";
        r5 = 1;
        r5 = new java.lang.Class[r5];	 Catch:{ ClassNotFoundException -> 0x0076 }
        r6 = 0;
        r7 = java.lang.String.class;
        r5[r6] = r7;	 Catch:{ ClassNotFoundException -> 0x0076 }
        r4.<init>(r0, r2, r5);	 Catch:{ ClassNotFoundException -> 0x0076 }
        r0 = "android.net.TrafficStats";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r2 = "tagSocket";
        r5 = 1;
        r5 = new java.lang.Class[r5];	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r6 = 0;
        r7 = java.net.Socket.class;
        r5[r6] = r7;	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r0.getMethod(r2, r5);	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r2 = "untagSocket";
        r5 = 1;
        r5 = new java.lang.Class[r5];	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r6 = 0;
        r7 = java.net.Socket.class;
        r5[r6] = r7;	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r0.getMethod(r2, r5);	 Catch:{ ClassNotFoundException -> 0x0103, NoSuchMethodException -> 0x010a }
        r0 = "android.net.Network";
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00fe, NoSuchMethodException -> 0x010a }
        r0 = new com.squareup.okhttp.internal.e;	 Catch:{ ClassNotFoundException -> 0x00fe, NoSuchMethodException -> 0x010a }
        r2 = byte[].class;
        r5 = "getAlpnSelectedProtocol";
        r6 = 0;
        r6 = new java.lang.Class[r6];	 Catch:{ ClassNotFoundException -> 0x00fe, NoSuchMethodException -> 0x010a }
        r0.<init>(r2, r5, r6);	 Catch:{ ClassNotFoundException -> 0x00fe, NoSuchMethodException -> 0x010a }
        r2 = new com.squareup.okhttp.internal.e;	 Catch:{ ClassNotFoundException -> 0x010f, NoSuchMethodException -> 0x010d }
        r5 = 0;
        r6 = "setAlpnProtocols";
        r7 = 1;
        r7 = new java.lang.Class[r7];	 Catch:{ ClassNotFoundException -> 0x010f, NoSuchMethodException -> 0x010d }
        r8 = 0;
        r9 = byte[].class;
        r7[r8] = r9;	 Catch:{ ClassNotFoundException -> 0x010f, NoSuchMethodException -> 0x010d }
        r2.<init>(r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x010f, NoSuchMethodException -> 0x010d }
        r1 = r2;
        r2 = r0;
    L_0x0069:
        r0 = new com.squareup.okhttp.internal.g;	 Catch:{ ClassNotFoundException -> 0x0076 }
        r0.<init>(r3, r4, r2, r1);	 Catch:{ ClassNotFoundException -> 0x0076 }
    L_0x006e:
        return r0;
    L_0x006f:
        r0 = move-exception;
        r0 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl";
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0076 }
        goto L_0x0006;
    L_0x0076:
        r0 = move-exception;
        r0 = "org.eclipse.jetty.alpn.ALPN";
        r3 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r1 = r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = "$Provider";
        r1 = r1.append(r2);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r1 = r1.toString();	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r4 = "$ClientProvider";
        r2 = r2.append(r4);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r4 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0 = r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = "$ServerProvider";
        r0 = r0.append(r2);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r5 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0 = "put";
        r2 = 2;
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r6 = 0;
        r7 = javax.net.ssl.SSLSocket.class;
        r2[r6] = r7;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r6 = 1;
        r2[r6] = r1;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r1 = r3.getMethod(r0, r2);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0 = "get";
        r2 = 1;
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r6 = 0;
        r7 = javax.net.ssl.SSLSocket.class;
        r2[r6] = r7;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r2 = r3.getMethod(r0, r2);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0 = "remove";
        r6 = 1;
        r6 = new java.lang.Class[r6];	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r7 = 0;
        r8 = javax.net.ssl.SSLSocket.class;
        r6[r7] = r8;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r3 = r3.getMethod(r0, r6);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0 = new com.squareup.okhttp.internal.h;	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ ClassNotFoundException -> 0x00f6, NoSuchMethodException -> 0x0108 }
        goto L_0x006e;
    L_0x00f6:
        r0 = move-exception;
    L_0x00f7:
        r0 = new com.squareup.okhttp.internal.f;
        r0.<init>();
        goto L_0x006e;
    L_0x00fe:
        r0 = move-exception;
        r0 = r1;
    L_0x0100:
        r2 = r0;
        goto L_0x0069;
    L_0x0103:
        r0 = move-exception;
        r0 = r1;
    L_0x0105:
        r2 = r0;
        goto L_0x0069;
    L_0x0108:
        r0 = move-exception;
        goto L_0x00f7;
    L_0x010a:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0105;
    L_0x010d:
        r2 = move-exception;
        goto L_0x0105;
    L_0x010f:
        r2 = move-exception;
        goto L_0x0100;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.f.b():com.squareup.okhttp.internal.f");
    }
}
