package com.google.android.play.dfe.api;

import android.accounts.Account;
import android.net.Uri;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0659a;
import com.android.volley.C0660x;
import com.android.volley.C0684b;
import com.android.volley.C0689z;
import com.android.volley.C0697m;
import com.android.volley.C0704v;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.p060a.C0673n;
import com.google.android.finsky.cv.p177a.gy;
import com.google.android.finsky.cv.p177a.gz;
import com.google.android.finsky.cv.p177a.hc;
import com.google.android.finsky.cv.p177a.jq;
import com.google.android.play.dfe.api.DfeResponseVerifier.DfeResponseVerifierException;
import com.google.android.play.dfe.p353a.C6283a;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.p354b.C6322j;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public final class C6285b extends C0656n {
    public static final boolean f31343q = Log.isLoggable("DfeProto", 2);
    public boolean f31344k;
    public C0660x f31345r;
    public final Class f31346s;
    public final C6288e f31347t;
    public boolean f31348u;
    public Map f31349v;
    public StringBuilder f31350w;
    public DfeResponseVerifier f31351x;

    public C6285b(String str, C6288e c6288e, Class cls, C0660x c0660x, C0657w c0657w) {
        this(str, c6288e, cls, c0660x, c0657w, (byte) 0);
    }

    private C6285b(String str, C6288e c6288e, Class cls, C0660x c0660x, C0657w c0657w, byte b) {
        super(0, Uri.withAppendedPath(C6287d.f31354a, str).toString(), c0657w);
        this.f31348u = false;
        if (TextUtils.isEmpty(str)) {
            PlayCommonLog.d("Empty DFE URL", new Object[0]);
        }
        this.f4034i = !((Boolean) C6322j.f31605s.m28964b()).booleanValue();
        this.f4038m = new C6286c(c6288e);
        this.f31347t = c6288e;
        this.f31345r = c0660x;
        this.f31346s = cls;
    }

    public final String mo1545d() {
        Object obj;
        char c = '&';
        Object obj2 = 1;
        String d = super.mo1545d();
        Object obj3 = !TextUtils.isEmpty((CharSequence) C6322j.f31599m.m28964b()) ? 1 : null;
        if (TextUtils.isEmpty((CharSequence) C6322j.f31588b.m28964b())) {
            obj = null;
        } else {
            obj = 1;
        }
        boolean booleanValue = ((Boolean) C6322j.f31605s.m28964b()).booleanValue();
        boolean booleanValue2 = ((Boolean) C6322j.f31606t.m28964b()).booleanValue();
        boolean booleanValue3 = ((Boolean) C6322j.f31607u.m28964b()).booleanValue();
        if (obj3 == null && obj == null && !booleanValue && !booleanValue2 && !booleanValue3) {
            return d;
        }
        char c2;
        StringBuilder stringBuilder = new StringBuilder(d);
        Object obj4 = d.indexOf(63) != -1 ? 1 : null;
        if (obj3 != null) {
            if (obj4 != null) {
                c2 = '&';
            } else {
                c2 = '?';
            }
            stringBuilder.append(c2);
            stringBuilder.append("ipCountryOverride=");
            stringBuilder.append((String) C6322j.f31599m.m28964b());
            obj4 = 1;
        }
        if (obj != null) {
            if (obj4 != null) {
                c2 = '&';
            } else {
                c2 = '?';
            }
            stringBuilder.append(c2);
            stringBuilder.append("mccmncOverride=");
            stringBuilder.append((String) C6322j.f31588b.m28964b());
            obj4 = 1;
        }
        if (booleanValue) {
            if (obj4 != null) {
                c2 = '&';
            } else {
                c2 = '?';
            }
            stringBuilder.append(c2);
            stringBuilder.append("skipCache=true");
            obj4 = 1;
        }
        if (booleanValue2) {
            if (obj4 != null) {
                c2 = '&';
            } else {
                c2 = '?';
            }
            stringBuilder.append(c2);
            stringBuilder.append("showStagingData=true");
        } else {
            obj2 = obj4;
        }
        if (booleanValue3) {
            if (obj2 == null) {
                c = '?';
            }
            stringBuilder.append(c);
            stringBuilder.append("p13n=false");
        }
        return stringBuilder.toString();
    }

    public final Map mo1547h() {
        Map b = this.f31347t.m28848b();
        if (this.f31349v != null) {
            b.putAll(this.f31349v);
        }
        if (this.f31351x != null) {
            try {
                b.put("X-DFE-Signature-Request", this.f31351x.mo1549a());
            } catch (DfeResponseVerifierException e) {
                PlayCommonLog.b("Couldn't create signature request: %s", new Object[]{e});
                mo1057f();
            }
        }
        C0689z c0689z = this.f4038m;
        Object obj = "timeoutMs=" + c0689z.mo1077a();
        int b2 = c0689z.mo1079b();
        if (b2 > 0) {
            String valueOf = String.valueOf(obj);
            obj = new StringBuilder(String.valueOf(valueOf).length() + 26).append(valueOf).append("; retryAttempt=").append(b2).toString();
        }
        b.put("X-DFE-Request-Params", obj);
        return b;
    }

    public final C0704v mo1055a(C0697m c0697m) {
        if (Log.isLoggable("PlayCommon", 2)) {
            int i;
            if (c0697m.f4168c == null || !c0697m.f4168c.containsKey("X-DFE-Content-Length")) {
                i = 0;
            } else {
                i = Integer.parseInt((String) c0697m.f4168c.get("X-DFE-Content-Length")) / MemoryMappedFileBuffer.DEFAULT_PADDING;
            }
            Object[] objArr = new Object[]{mo1545d(), Integer.valueOf(i)};
        }
        gz a = m28825a(c0697m, false);
        if (a == null) {
            return C0704v.m4516a(new ParseError(c0697m));
        }
        if (f31343q) {
            String str = (String) C6322j.f31589c.m28964b();
            if (mo1545d().matches(str)) {
                synchronized (j.class) {
                    String str2 = "DfeProto";
                    String str3 = "Response for ";
                    str = String.valueOf(mo1545d());
                    Log.v(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
                    for (Object valueOf : j.a(a).split("\n")) {
                        String str4 = "DfeProto";
                        String str5 = "| ";
                        str = String.valueOf(valueOf);
                        Log.v(str4, str.length() != 0 ? str5.concat(str) : new String(str5));
                    }
                }
            } else {
                String d = mo1545d();
                Log.v("DfeProto", new StringBuilder((String.valueOf(d).length() + 41) + String.valueOf(str).length()).append("Url does not match regexp: url=").append(d).append(" / regexp=").append(str).toString());
            }
        }
        C0704v a2 = m28824a(a);
        if (a2 != null) {
            return a2;
        }
        C0684b c0684b;
        if (this.f31351x != null) {
            c0684b = null;
        } else {
            c0684b = C6285b.m28829b(c0697m);
        }
        if (c0684b != null) {
            m28826a(a, c0684b);
        }
        a2 = C0704v.m4517a(a, c0684b);
        PlayCommonLog.f("DFE response %s", new Object[]{mo1545d()});
        return a2;
    }

    private final void m28826a(gz gzVar, C0684b c0684b) {
        if (gzVar.f12521c.length > 0 || gzVar.f12520b != null) {
            C0659a c0659a = this.f31347t.f31360d;
            long currentTimeMillis = System.currentTimeMillis();
            for (hc hcVar : gzVar.f12521c) {
                C0684b c0684b2 = new C0684b();
                c0684b2.f4131a = hcVar.f12538d;
                c0684b2.f4132b = hcVar.f12539e;
                c0684b2.f4133c = c0684b.f4133c;
                c0684b2.f4135e = hcVar.f12540f + currentTimeMillis;
                c0684b2.f4136f = hcVar.f12541g + currentTimeMillis;
                c0659a.mo1066a(m28830c(Uri.withAppendedPath(C6287d.f31354a, hcVar.f12537c).toString()), c0684b2);
            }
            gzVar.f12521c = hc.bh_();
            gzVar.f12520b = null;
            c0684b.f4131a = C0757i.m4909a((C0757i) gzVar);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.gz m28825a(com.android.volley.C0697m r9, boolean r10) {
        /*
        r8 = this;
        r2 = 0;
        r4 = 1;
        r7 = 0;
    L_0x0003:
        r0 = r9.f4168c;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r1 = "X-DFE-Signature-Response";
        r0 = r0.get(r1);	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r0 = (java.lang.String) r0;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        if (r10 == 0) goto L_0x003e;
    L_0x000f:
        r3 = new java.util.zip.GZIPInputStream;	 Catch:{ all -> 0x0031 }
        r1 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x0031 }
        r5 = r9.f4167b;	 Catch:{ all -> 0x0031 }
        r1.<init>(r5);	 Catch:{ all -> 0x0031 }
        r3.<init>(r1);	 Catch:{ all -> 0x0031 }
        r5 = com.google.android.play.dfe.api.C6285b.m28828a(r3);	 Catch:{ all -> 0x007b }
        r1 = com.google.android.finsky.cv.p177a.gz.m12689a(r5);	 Catch:{ all -> 0x007b }
        r6 = r8.f31351x;	 Catch:{ all -> 0x007b }
        if (r6 == 0) goto L_0x002c;
    L_0x0027:
        r6 = r8.f31351x;	 Catch:{ all -> 0x007b }
        r6.mo1550a(r5, r0);	 Catch:{ all -> 0x007b }
    L_0x002c:
        r3.close();	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r0 = r1;
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        r1 = r2;
    L_0x0033:
        if (r1 == 0) goto L_0x0038;
    L_0x0035:
        r1.close();	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
    L_0x0038:
        throw r0;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
    L_0x0039:
        r0 = move-exception;
        if (r10 != 0) goto L_0x0056;
    L_0x003c:
        r10 = r4;
        goto L_0x0003;
    L_0x003e:
        r1 = r9.f4167b;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r1 = com.google.android.finsky.cv.p177a.gz.m12689a(r1);	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r3 = r8.f31351x;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        if (r3 == 0) goto L_0x0054;
    L_0x0048:
        r3 = r8.f31351x;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r5 = r9.f4167b;	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r3.mo1550a(r5, r0);	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
        r0 = "signature-verification-succeeded";
        r8.m4366a(r0);	 Catch:{ InvalidProtocolBufferNanoException -> 0x0039, IOException -> 0x005f, DfeResponseVerifierException -> 0x0068 }
    L_0x0054:
        r0 = r1;
        goto L_0x0030;
    L_0x0056:
        r0 = "Cannot parse response as PlayResponseWrapper proto.";
        r1 = new java.lang.Object[r7];
        com.google.android.play.utils.PlayCommonLog.b(r0, r1);
    L_0x005d:
        r0 = r2;
        goto L_0x0030;
    L_0x005f:
        r0 = move-exception;
        r0 = "IOException while manually unzipping request.";
        r1 = new java.lang.Object[r7];
        com.google.android.play.utils.PlayCommonLog.b(r0, r1);
        goto L_0x005d;
    L_0x0068:
        r0 = move-exception;
        r1 = "signature-verification-failed";
        r8.m4366a(r1);
        r1 = "Could not verify request: %s, exception %s";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r3[r7] = r8;
        r3[r4] = r0;
        com.google.android.play.utils.PlayCommonLog.c(r1, r3);
        goto L_0x005d;
    L_0x007b:
        r0 = move-exception;
        r1 = r3;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.dfe.api.b.a(com.android.volley.m, boolean):com.google.android.finsky.cv.a.gz");
    }

    private static C0684b m28829b(C0697m c0697m) {
        C0684b a = C0673n.m4460a(c0697m);
        if (a == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str = (String) c0697m.f4168c.get("X-DFE-Soft-TTL");
            if (str != null) {
                a.f4136f = Long.parseLong(str) + currentTimeMillis;
            }
            str = (String) c0697m.f4168c.get("X-DFE-Hard-TTL");
            if (str != null) {
                a.f4135e = currentTimeMillis + Long.parseLong(str);
            }
        } catch (NumberFormatException e) {
            PlayCommonLog.b("Invalid TTL: %s", new Object[]{c0697m.f4168c});
            a.f4136f = 0;
            a.f4135e = 0;
        }
        a.f4135e = Math.max(a.f4135e, a.f4136f);
        return a;
    }

    protected final VolleyError mo1543b(VolleyError volleyError) {
        if (!(volleyError instanceof ServerError) || volleyError.f4022b == null) {
            return volleyError;
        }
        if (volleyError.f4022b.f4166a == 502 && this.f31347t.f31364h) {
            String str = (String) volleyError.f4022b.f4168c.get("x-obscura-nonce");
            if (str != null) {
                C6288e.m28844a(str);
                PlayCommonLog.b("Obscura nonce updated. Authorize the session from the console and retry", new Object[0]);
            }
        }
        gz a = m28825a(volleyError.f4022b, false);
        if (a == null) {
            return volleyError;
        }
        C0704v a2 = m28824a(a);
        if (a2 != null) {
            return a2.f4193c;
        }
        PlayCommonLog.c("Received a null response in ResponseWrapper, error %d", new Object[]{Integer.valueOf(volleyError.f4022b.f4166a)});
        return volleyError;
    }

    private final C0704v m28824a(gz gzVar) {
        if (gzVar.f12520b == null) {
            return null;
        }
        jq jqVar = gzVar.f12520b;
        if (jqVar.bA_()) {
            PlayCommonLog.a("%s", new Object[]{jqVar.f12811d});
        }
        if (jqVar.f12809b) {
            this.f31347t.f31360d.mo1068b();
        }
        if (jqVar.bz_()) {
            return C0704v.m4516a(new DfeServerError(jqVar.f12810c));
        }
        return null;
    }

    public final void mo1544c(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            this.f31347t.m28847a();
        }
        if (this.f31344k) {
            PlayCommonLog.a("Not delivering error response for request=[%s], error=[%s] because response already delivered.", new Object[]{this, volleyError});
            return;
        }
        super.mo1544c(volleyError);
    }

    private final String m28830c(String str) {
        StringBuilder append = new StringBuilder(256).append(str).append("/account=");
        Account account = this.f31347t.f31359c.f4063b;
        StringBuilder append2 = append.append(account == null ? null : account.name);
        if (this.f31350w != null) {
            append2.append(this.f31350w);
        }
        return append2.toString();
    }

    public final String mo1546e() {
        return m28830c(super.mo1545d());
    }

    public final void mo1057f() {
        super.mo1057f();
        this.f31345r = null;
    }

    private static byte[] m28828a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C6285b.m28827a(inputStream, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            return toByteArray;
        } finally {
            byteArrayOutputStream.close();
        }
    }

    private static void m28827a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[eq.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            } finally {
                inputStream.close();
            }
        }
    }

    public final /* synthetic */ void mo1056a(Object obj) {
        try {
            C0757i a = C6283a.m28819a(((gz) obj).f12519a, gy.class, this.f31346s);
            if (a == null) {
                PlayCommonLog.c("Null parsed response for request=[%s]", new Object[]{this});
                mo1544c(new VolleyError());
            } else if (this.f31348u || !this.f31344k) {
                if (this.f31345r != null) {
                    this.f31345r.b_(a);
                }
                this.f31344k = true;
            } else {
                PlayCommonLog.a("Not delivering second response for request=[%s]", new Object[]{this});
            }
        } catch (Throwable e) {
            PlayCommonLog.c("Null wrapper parsed for request=[%s]", new Object[]{this});
            mo1544c(new ParseError(e));
        }
    }
}
