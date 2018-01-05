package com.squareup.okhttp.internal.p528c;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

public final class C7643b implements HostnameVerifier {
    public static final C7643b f39578a = new C7643b();
    public static final Pattern f39579b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C7643b() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean verify(java.lang.String r12, javax.net.ssl.SSLSession r13) {
        /*
        r11 = this;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        r0 = r13.getPeerCertificates();	 Catch:{ SSLException -> 0x00de }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ SSLException -> 0x00de }
        r1 = f39579b;	 Catch:{ SSLException -> 0x00de }
        r1 = r1.matcher(r12);	 Catch:{ SSLException -> 0x00de }
        r1 = r1.matches();	 Catch:{ SSLException -> 0x00de }
        if (r1 == 0) goto L_0x0038;
    L_0x0018:
        r1 = 7;
        r4 = com.squareup.okhttp.internal.p528c.C7643b.m36870a(r0, r1);	 Catch:{ SSLException -> 0x00de }
        r5 = r4.size();	 Catch:{ SSLException -> 0x00de }
        r1 = r3;
    L_0x0022:
        if (r1 >= r5) goto L_0x0036;
    L_0x0024:
        r0 = r4.get(r1);	 Catch:{ SSLException -> 0x00de }
        r0 = (java.lang.String) r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r12.equalsIgnoreCase(r0);	 Catch:{ SSLException -> 0x00de }
        if (r0 == 0) goto L_0x0032;
    L_0x0030:
        r0 = r2;
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0022;
    L_0x0036:
        r0 = r3;
        goto L_0x0031;
    L_0x0038:
        r1 = java.util.Locale.US;	 Catch:{ SSLException -> 0x00de }
        r6 = r12.toLowerCase(r1);	 Catch:{ SSLException -> 0x00de }
        r1 = 2;
        r7 = com.squareup.okhttp.internal.p528c.C7643b.m36870a(r0, r1);	 Catch:{ SSLException -> 0x00de }
        r8 = r7.size();	 Catch:{ SSLException -> 0x00de }
        r5 = r3;
        r1 = r3;
    L_0x0049:
        if (r5 >= r8) goto L_0x005e;
    L_0x004b:
        r1 = r7.get(r5);	 Catch:{ SSLException -> 0x00de }
        r1 = (java.lang.String) r1;	 Catch:{ SSLException -> 0x00de }
        r1 = com.squareup.okhttp.internal.p528c.C7643b.m36871a(r6, r1);	 Catch:{ SSLException -> 0x00de }
        if (r1 == 0) goto L_0x0059;
    L_0x0057:
        r0 = r2;
        goto L_0x0031;
    L_0x0059:
        r1 = r5 + 1;
        r5 = r1;
        r1 = r2;
        goto L_0x0049;
    L_0x005e:
        if (r1 != 0) goto L_0x01a5;
    L_0x0060:
        r0 = r0.getSubjectX500Principal();	 Catch:{ SSLException -> 0x00de }
        r2 = new com.squareup.okhttp.internal.c.a;	 Catch:{ SSLException -> 0x00de }
        r2.<init>(r0);	 Catch:{ SSLException -> 0x00de }
        r5 = "cn";
        r0 = 0;
        r2.f39573c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = 0;
        r2.f39574d = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = 0;
        r2.f39575e = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = 0;
        r2.f39576f = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.f39571a;	 Catch:{ SSLException -> 0x00de }
        r0 = r0.toCharArray();	 Catch:{ SSLException -> 0x00de }
        r2.f39577g = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.m36865a();	 Catch:{ SSLException -> 0x00de }
        if (r0 != 0) goto L_0x01a8;
    L_0x0085:
        r0 = r4;
    L_0x0086:
        if (r0 == 0) goto L_0x01a5;
    L_0x0088:
        r0 = com.squareup.okhttp.internal.p528c.C7643b.m36871a(r6, r0);	 Catch:{ SSLException -> 0x00de }
        goto L_0x0031;
    L_0x008d:
        r1 = r0;
    L_0x008e:
        r0 = "";
        r7 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.f39572b;	 Catch:{ SSLException -> 0x00de }
        if (r7 != r8) goto L_0x0098;
    L_0x0096:
        r0 = r4;
        goto L_0x0086;
    L_0x0098:
        r7 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r7 = r7[r8];	 Catch:{ SSLException -> 0x00de }
        switch(r7) {
            case 34: goto L_0x00b3;
            case 35: goto L_0x0147;
            case 43: goto L_0x00a5;
            case 44: goto L_0x00a5;
            case 59: goto L_0x00a5;
            default: goto L_0x00a1;
        };	 Catch:{ SSLException -> 0x00de }
    L_0x00a1:
        r0 = r2.m36867c();	 Catch:{ SSLException -> 0x00de }
    L_0x00a5:
        r1 = r5.equalsIgnoreCase(r1);	 Catch:{ SSLException -> 0x00de }
        if (r1 != 0) goto L_0x0086;
    L_0x00ab:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.f39572b;	 Catch:{ SSLException -> 0x00de }
        if (r0 < r1) goto L_0x014d;
    L_0x00b1:
        r0 = r4;
        goto L_0x0086;
    L_0x00b3:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.f39573c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r2.f39574d = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.f39574d;	 Catch:{ SSLException -> 0x00de }
        r2.f39575e = r0;	 Catch:{ SSLException -> 0x00de }
    L_0x00c1:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39572b;	 Catch:{ SSLException -> 0x00de }
        if (r0 != r7) goto L_0x00e2;
    L_0x00c7:
        r0 = new java.lang.IllegalStateException;	 Catch:{ SSLException -> 0x00de }
        r1 = new java.lang.StringBuilder;	 Catch:{ SSLException -> 0x00de }
        r4 = "Unexpected end of DN: ";
        r1.<init>(r4);	 Catch:{ SSLException -> 0x00de }
        r2 = r2.f39571a;	 Catch:{ SSLException -> 0x00de }
        r1 = r1.append(r2);	 Catch:{ SSLException -> 0x00de }
        r1 = r1.toString();	 Catch:{ SSLException -> 0x00de }
        r0.<init>(r1);	 Catch:{ SSLException -> 0x00de }
        throw r0;	 Catch:{ SSLException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        r0 = r3;
        goto L_0x0031;
    L_0x00e2:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r7];	 Catch:{ SSLException -> 0x00de }
        r7 = 34;
        if (r0 != r7) goto L_0x0109;
    L_0x00ec:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.f39573c = r0;	 Catch:{ SSLException -> 0x00de }
    L_0x00f2:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39572b;	 Catch:{ SSLException -> 0x00de }
        if (r0 >= r7) goto L_0x0137;
    L_0x00f8:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r7];	 Catch:{ SSLException -> 0x00de }
        r7 = 32;
        if (r0 != r7) goto L_0x0137;
    L_0x0102:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.f39573c = r0;	 Catch:{ SSLException -> 0x00de }
        goto L_0x00f2;
    L_0x0109:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r7];	 Catch:{ SSLException -> 0x00de }
        r7 = 92;
        if (r0 != r7) goto L_0x012a;
    L_0x0113:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39575e;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.m36868d();	 Catch:{ SSLException -> 0x00de }
        r0[r7] = r8;	 Catch:{ SSLException -> 0x00de }
    L_0x011d:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.f39573c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.f39575e;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.f39575e = r0;	 Catch:{ SSLException -> 0x00de }
        goto L_0x00c1;
    L_0x012a:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39575e;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r9 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r8 = r8[r9];	 Catch:{ SSLException -> 0x00de }
        r0[r7] = r8;	 Catch:{ SSLException -> 0x00de }
        goto L_0x011d;
    L_0x0137:
        r0 = new java.lang.String;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.f39574d;	 Catch:{ SSLException -> 0x00de }
        r9 = r2.f39575e;	 Catch:{ SSLException -> 0x00de }
        r10 = r2.f39574d;	 Catch:{ SSLException -> 0x00de }
        r9 = r9 - r10;
        r0.<init>(r7, r8, r9);	 Catch:{ SSLException -> 0x00de }
        goto L_0x00a5;
    L_0x0147:
        r0 = r2.m36866b();	 Catch:{ SSLException -> 0x00de }
        goto L_0x00a5;
    L_0x014d:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r1 = 44;
        if (r0 == r1) goto L_0x0182;
    L_0x0157:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r1 = 59;
        if (r0 == r1) goto L_0x0182;
    L_0x0161:
        r0 = r2.f39577g;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r1 = 43;
        if (r0 == r1) goto L_0x0182;
    L_0x016b:
        r0 = new java.lang.IllegalStateException;	 Catch:{ SSLException -> 0x00de }
        r1 = new java.lang.StringBuilder;	 Catch:{ SSLException -> 0x00de }
        r4 = "Malformed DN: ";
        r1.<init>(r4);	 Catch:{ SSLException -> 0x00de }
        r2 = r2.f39571a;	 Catch:{ SSLException -> 0x00de }
        r1 = r1.append(r2);	 Catch:{ SSLException -> 0x00de }
        r1 = r1.toString();	 Catch:{ SSLException -> 0x00de }
        r0.<init>(r1);	 Catch:{ SSLException -> 0x00de }
        throw r0;	 Catch:{ SSLException -> 0x00de }
    L_0x0182:
        r0 = r2.f39573c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.f39573c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.m36865a();	 Catch:{ SSLException -> 0x00de }
        if (r0 != 0) goto L_0x008d;
    L_0x018e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ SSLException -> 0x00de }
        r1 = new java.lang.StringBuilder;	 Catch:{ SSLException -> 0x00de }
        r4 = "Malformed DN: ";
        r1.<init>(r4);	 Catch:{ SSLException -> 0x00de }
        r2 = r2.f39571a;	 Catch:{ SSLException -> 0x00de }
        r1 = r1.append(r2);	 Catch:{ SSLException -> 0x00de }
        r1 = r1.toString();	 Catch:{ SSLException -> 0x00de }
        r0.<init>(r1);	 Catch:{ SSLException -> 0x00de }
        throw r0;	 Catch:{ SSLException -> 0x00de }
    L_0x01a5:
        r0 = r3;
        goto L_0x0031;
    L_0x01a8:
        r1 = r0;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.c.b.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }

    public static List m36869a(X509Certificate x509Certificate) {
        Collection a = C7643b.m36870a(x509Certificate, 7);
        Collection a2 = C7643b.m36870a(x509Certificate, 2);
        List arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    private static List m36870a(X509Certificate x509Certificate, int i) {
        List arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    private static boolean m36871a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str + '.';
        }
        if (!str2.endsWith(".")) {
            str2 = str2 + '.';
        }
        String toLowerCase = str2.toLowerCase(Locale.US);
        if (!toLowerCase.contains("*")) {
            return str.equals(toLowerCase);
        }
        if (!toLowerCase.startsWith("*.") || toLowerCase.indexOf(42, 1) != -1 || str.length() < toLowerCase.length() || "*.".equals(toLowerCase)) {
            return false;
        }
        toLowerCase = toLowerCase.substring(1);
        if (!str.endsWith(toLowerCase)) {
            return false;
        }
        int length = str.length() - toLowerCase.length();
        if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
            return true;
        }
        return false;
    }
}
