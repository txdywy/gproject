package com.google.android.finsky.api.p125a;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.support.v4.p037h.C0305a;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0659a;
import com.android.volley.C0660x;
import com.android.volley.C0684b;
import com.android.volley.C0689z;
import com.android.volley.C0697m;
import com.android.volley.C0700r;
import com.android.volley.C0704v;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.p060a.C0673n;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.api.C1253j;
import com.google.android.finsky.api.C1255p;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.api.C1286g;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1299v;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cv.p177a.dk;
import com.google.android.finsky.cv.p177a.hc;
import com.google.android.finsky.cv.p177a.jq;
import com.google.android.finsky.cv.p177a.jr;
import com.google.android.finsky.cv.p177a.lg;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p186do.C2837a;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.C4778c;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.play.dfe.api.DfeResponseVerifier.DfeResponseVerifierException;
import com.google.android.play.utils.C6324f;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.j;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.dfe.nano.fl;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class cp extends C1253j {
    public static final boolean f7460r = Log.isLoggable("DfeProto", 2);
    public StringBuilder f7461A;
    public lg f7462B;
    public boolean f7463C = true;
    public boolean f7464D;
    public boolean f7465E;
    public boolean f7466F = true;
    public DfeResponseVerifier f7467G;
    public long f7468H;
    public NetworkInfo f7469I;
    public int f7470J;
    public boolean f7471K;
    public boolean f7472L;
    public C1228w f7473M;
    public boolean f7474N;
    public String f7475O;
    public C1299v f7476P;
    public C2910a f7477Q;
    public C1463g f7478R;
    public C1255p f7479S;
    public C1289l f7480T;
    public boolean f7481U;
    public long f7482V;
    public long f7483W;
    public int f7484X;
    public boolean f7485k;
    public C0660x f7486s;
    public final cz f7487t;
    public final C1251b f7488u;
    public boolean f7489v;
    public long f7490w;
    public int f7491x;
    public String f7492y;
    public Map f7493z;

    cp(String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C2837a c2837a, C2910a c2910a, C1255p c1255p, C1463g c1463g, C1289l c1289l) {
        this(0, str, c1251b, czVar, c0660x, c0657w, c2837a, c2910a, c1255p, c1463g, c1289l);
    }

    public cp(int i, String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C2837a c2837a, C2910a c2910a, C1255p c1255p, C1463g c1463g, C1289l c1289l) {
        this(i, c1289l.f7683b, str, c1251b, czVar, c0660x, c0657w, null, c2837a, c2910a, c1255p, c1463g, c1289l);
    }

    cp(int i, Uri uri, String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1228w c1228w, C2837a c2837a, C2910a c2910a, C1255p c1255p, C1463g c1463g, C1289l c1289l) {
        super(i, Uri.withAppendedPath(uri, str).toString(), c0657w);
        this.f7489v = false;
        this.f7490w = -1;
        this.f7491x = 0;
        this.f7492y = null;
        this.f7466F = false;
        this.f7481U = false;
        this.f7482V = -1;
        this.f7483W = -1;
        this.f7484X = 0;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21669e("Empty DFE URL", new Object[0]);
        }
        this.f4034i = !((Boolean) C1285f.f7590H.m28964b()).booleanValue();
        this.f4038m = new cx(c2837a.m14993a(), c1251b);
        this.f7488u = c1251b;
        this.f7486s = c0660x;
        this.f7487t = czVar;
        this.f7469I = this.f7488u.m7295g();
        this.f7473M = c1228w;
        this.f7477Q = c2910a;
        this.f7479S = c1255p;
        this.f7478R = c1463g;
        this.f7480T = c1289l;
        C1552e c1552e = c1251b.f7428g;
        if (c1552e != null && c1552e.mo2294a(12629642)) {
            this.f7471K = ((Boolean) C0955b.iy.m28964b()).booleanValue();
        }
    }

    public final boolean mo1541a() {
        return this.f7466F;
    }

    public final void m7367s() {
        if (((Boolean) C0955b.iy.m28964b()).booleanValue()) {
            this.f7471K = true;
        }
    }

    public final void m7361c(String str) {
        this.f7474N = true;
        this.f7475O = str;
    }

    public final String mo1545d() {
        Object obj;
        char c = '&';
        Object obj2 = 1;
        String d = super.mo1545d();
        Object obj3 = !TextUtils.isEmpty((CharSequence) C1285f.f7610g.m28964b()) ? 1 : null;
        if (TextUtils.isEmpty((CharSequence) C1285f.f7604a.m28964b())) {
            obj = null;
        } else {
            obj = 1;
        }
        boolean booleanValue = ((Boolean) C1285f.f7590H.m28964b()).booleanValue();
        boolean booleanValue2 = ((Boolean) C1285f.f7591I.m28964b()).booleanValue();
        boolean booleanValue3 = ((Boolean) C1285f.f7592J.m28964b()).booleanValue();
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
            stringBuilder.append((String) C1285f.f7610g.m28964b());
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
            stringBuilder.append((String) C1285f.f7604a.m28964b());
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
        C1251b c1251b;
        CharSequence charSequence;
        Boolean bool = null;
        Map e = this.f7488u.m7293e();
        if (this.f7493z != null) {
            e.putAll(this.f7493z);
        }
        if (this.f7467G != null) {
            try {
                e.put("X-DFE-Signature-Request", this.f7467G.mo1549a());
            } catch (DfeResponseVerifierException e2) {
                FinskyLog.m21665c("Couldn't create signature request: %s", e2);
                mo1057f();
            }
        }
        C0689z c0689z = this.f4038m;
        Object obj = "timeoutMs=" + c0689z.mo1077a();
        int b = c0689z.mo1079b();
        if (b > 0) {
            String valueOf = String.valueOf(obj);
            obj = new StringBuilder(String.valueOf(valueOf).length() + 26).append(valueOf).append("; retryAttempt=").append(b).toString();
        }
        e.put("X-DFE-Request-Params", obj);
        e.put("X-DFE-Network-Type", Integer.toString(C6324f.m28966a(this.f7488u.f7427f)));
        if (this.f7463C) {
            this.f7488u.m7286a(e);
        }
        if (this.f7462B != null) {
            C1251b.m7281a(this.f7462B, e);
        }
        if (this.f7464D) {
            c1251b = this.f7488u;
            if (c1251b.f7436o != null && c1251b.f7436o.m8818a()) {
                e.put("X-DFE-Managed-Context", "true");
            }
        }
        if (this.f7465E) {
            this.f7488u.m7289b(e);
        }
        if (this.f7471K) {
            c1251b = this.f7488u;
            StrictMode.noteSlowCall("DfeApiContext.getAdIdBlocking");
            if (c1251b.f7442u == null) {
                charSequence = null;
            } else {
                charSequence = c1251b.f7442u.mo2828a();
            }
            if (TextUtils.isEmpty(charSequence)) {
                if ((this.f7488u.f7442u != null ? 1 : 0) == 0) {
                    valueOf = "no_ad_id_provider";
                } else {
                    valueOf = "ad_id_fetch_done_no_id_set";
                }
                this.f7478R.dc().m13319a(new C2474c(1101).m13244b(valueOf).f13342a, null);
            } else {
                e.put("X-Ad-Id", charSequence);
                C2482j dc = this.f7478R.dc();
                C2474c c2474c = new C2474c(1113);
                Object d = mo1545d();
                if (!TextUtils.isEmpty(d)) {
                    bo boVar = c2474c.f13342a;
                    if (d == null) {
                        throw new NullPointerException();
                    }
                    boVar.f31701a |= 67108864;
                    boVar.av = d;
                }
                dc.m13319a(c2474c.f13342a, null);
            }
            c1251b = this.f7488u;
            if (c1251b.f7442u != null) {
                bool = c1251b.f7442u.mo2830b();
            }
            if (bool != null) {
                e.put("X-Limit-Ad-Tracking-Enabled", bool.toString());
            }
        }
        if (this.f7472L) {
            c1251b = this.f7488u;
            charSequence = c1251b.f7426e.m12117a(c1251b.f7427f);
            if (!TextUtils.isEmpty(charSequence)) {
                e.put("X-DFE-ms", charSequence);
            }
        }
        if (this.f7474N) {
            C1251b c1251b2 = this.f7488u;
            charSequence = c1251b2.f7426e.m12118a(c1251b2.f7427f, this.f7475O != null ? this.f7475O : "");
            if (!TextUtils.isEmpty(charSequence)) {
                e.put("X-DFE-ms", charSequence);
            }
        }
        if (this.f7488u.f7439r.m7139a()) {
            e.put("X-DFE-Data-Saver", "1");
        }
        c1251b = this.f7488u;
        if (c1251b.f7437p != null) {
            if (c1251b.f7429h == null) {
                charSequence = c1251b.f7437p.m14570d();
                if (!TextUtils.isEmpty(charSequence)) {
                    e.put("X-DFE-Device-Config", charSequence);
                }
            } else {
                charSequence = c1251b.f7437p.mo3111a(c1251b.m7287b());
                if (!TextUtils.isEmpty(charSequence)) {
                    e.put("X-DFE-Device-Config-Token", charSequence);
                }
            }
        }
        c1251b = this.f7488u;
        if (c1251b.m7296h()) {
            c1251b.m7286a(e);
            c1251b.m7289b(e);
            e.put("X-DFE-Build-Fingerprint", Build.FINGERPRINT);
        }
        c1251b = this.f7488u;
        if (c1251b.f7445x != null) {
            valueOf = c1251b.f7445x.m8964a(c1251b.m7287b());
            if (valueOf != null) {
                e.put("X-DFE-Enterprise-AclConsistencyToken", valueOf);
            }
        }
        return e;
    }

    public final C0704v mo1055a(C0697m c0697m) {
        String c;
        String str;
        long b = C4678i.m21813b();
        if (c0697m.f4168c != null && c0697m.f4168c.containsKey("X-DFE-Content-Length")) {
            this.f7470J = Integer.parseInt((String) c0697m.f4168c.get("X-DFE-Content-Length"));
        }
        this.f7468H = c0697m.f4171f;
        if (this.f7488u.f7428g.mo2294a(12627544) && this.f7468H > 0) {
            c = C1289l.m7697c(mo1546e());
            C0659a c0659a = this.f7488u.f7430i;
            if (c != null && (c0659a instanceof C4778c)) {
                C4778c c4778c = (C4778c) c0659a;
                if (c4778c.f24746g) {
                    c = (String) c4778c.f24741b.get(C4688t.m21838a(c.getBytes()));
                    if (c == null) {
                        str = null;
                    } else {
                        str = c4778c.m22409d(c);
                    }
                } else {
                    str = null;
                }
                this.f7492y = str;
            }
        }
        int i = 0;
        if (c0697m.f4168c != null && c0697m.f4168c.containsKey("X-DFE-Content-Length")) {
            i = Integer.parseInt((String) c0697m.f4168c.get("X-DFE-Content-Length")) / MemoryMappedFileBuffer.DEFAULT_PADDING;
        }
        Object[] objArr = new Object[]{mo1545d(), Integer.valueOf(i)};
        C0757i a = m7347a(c0697m, false);
        if (a == null) {
            return C0704v.m4516a(new ParseError(c0697m));
        }
        if (f7460r) {
            str = (String) C1285f.f7605b.m28964b();
            if (mo1545d().matches(str)) {
                synchronized (j.class) {
                    c = "DfeProto";
                    String str2 = "Response for ";
                    str = String.valueOf(mo1545d());
                    Log.v(c, str.length() != 0 ? str2.concat(str) : new String(str2));
                    for (Object valueOf : j.a(a).split("\n")) {
                        String str3 = "DfeProto";
                        String str4 = "| ";
                        str = String.valueOf(valueOf);
                        Log.v(str3, str.length() != 0 ? str4.concat(str) : new String(str4));
                    }
                }
            } else {
                String d = mo1545d();
                Log.v("DfeProto", new StringBuilder((String.valueOf(d).length() + 41) + String.valueOf(str).length()).append("Url does not match regexp: url=").append(d).append(" / regexp=").append(str).toString());
            }
        }
        C0704v a2 = m7346a((fl) a);
        if (a2 != null) {
            return a2;
        }
        C0684b c0684b;
        if (a.f != null) {
            jr jrVar = a.f;
            if (((jrVar.f12813a & 1) != 0 ? 1 : null) != null) {
                this.f7490w = jrVar.f12814b;
            }
        }
        if (this.f7468H == 0 && c0697m.f4168c != null && "1".equals(c0697m.f4168c.get("X-DFE-Synced-Content"))) {
            this.f7491x = 2;
        }
        m7352b((fl) a);
        if (!(a.g == null || this.f7488u.f7428g == null)) {
            this.f7488u.f7428g.mo2292a(a.g);
        }
        if (((a.a & 1) != 0 ? 1 : null) != null) {
            C0954a.f5836f.m5777b(this.f7488u.m7287b()).m5763a(Base64.encodeToString(a.i, 0));
        }
        if (!(this.f7488u.m7287b() == null || this.f7479S == null)) {
            this.f7479S.mo1619a(this.f7488u.m7287b(), a);
        }
        if (this.f7467G != null) {
            c0684b = null;
        } else {
            c0684b = m7351b(c0697m);
        }
        if (c0684b != null || this.f7488u.f7428g.mo2294a(12620843)) {
            m7349a((fl) a, c0684b, c0697m.f4168c);
        }
        if (c0684b != null && (a.d.length > 0 || a.c != null || a.e.length > 0 || a.h.length > 0)) {
            a.d = hc.bh_();
            a.c = null;
            a.e = ab.d();
            a.g = null;
            a.h = dk.aT_();
            c0684b.f4131a = C0757i.m4909a(a);
        }
        a2 = C0704v.m4517a(a, c0684b);
        FinskyLog.m21670f("DFE response %s", mo1545d());
        this.f7483W = C4678i.m21813b() - b;
        return a2;
    }

    private final void m7349a(fl flVar, C0684b c0684b, Map map) {
        if (flVar.d.length != 0) {
            long j;
            if (c0684b != null) {
                j = c0684b.f4133c;
            } else {
                String str = (String) map.get("Date");
                if (str != null) {
                    j = C0673n.m4459a(str);
                } else {
                    j = 0;
                }
            }
            C0659a c0659a = this.f7488u.f7430i;
            long currentTimeMillis = System.currentTimeMillis();
            boolean contains = mo1545d().contains("/bulkDataFetch");
            for (hc hcVar : flVar.d) {
                C0684b c0684b2 = new C0684b();
                c0684b2.f4131a = hcVar.f12538d;
                c0684b2.f4132b = hcVar.f12539e;
                c0684b2.f4133c = j;
                c0684b2.f4135e = hcVar.f12540f + currentTimeMillis;
                c0684b2.f4136f = hcVar.f12541g + currentTimeMillis;
                if (this.f7480T.m7701a()) {
                    cp.m7348a(c0684b2, hcVar.f12542h, hcVar.f12543i);
                }
                if (contains) {
                    Map c0305a;
                    if (c0684b2.f4137g == null || c0684b2.f4137g.isEmpty()) {
                        c0305a = new C0305a(1);
                    } else {
                        c0305a = c0684b2.f4137g;
                    }
                    c0305a.put("X-DFE-Synced-Content", "1");
                    c0684b2.f4137g = c0305a;
                }
                c0659a.mo1066a(this.f7480T.m7699a(Uri.withAppendedPath(C1286g.f7656a, hcVar.f12537c).toString(), this.f7488u.m7287b(), this.f7488u.f7432k, this.f7488u.f7433l, this.f7461A), c0684b2);
            }
            if (this.f7476P != null) {
                this.f7476P.mo2935a(flVar.d);
            }
        }
    }

    private final fl m7347a(C0697m c0697m, boolean z) {
        String str;
        fl a;
        while (true) {
            try {
                str = (String) c0697m.f4168c.get("X-DFE-Signature-Response");
                if (!z) {
                    break;
                }
                InputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(c0697m.f4167b));
                byte[] a2 = C4692x.m21844a(gZIPInputStream);
                a = fl.a(a2);
                if (this.f7467G != null) {
                    this.f7467G.mo1550a(a2, str);
                }
                gZIPInputStream.close();
                return a;
            } catch (InvalidProtocolBufferNanoException e) {
                if (z) {
                    FinskyLog.m21665c("Cannot parse response as ResponseWrapper proto.", new Object[0]);
                } else {
                    z = true;
                }
            } catch (IOException e2) {
                FinskyLog.m21665c("IOException while manually unzipping request.", new Object[0]);
            } catch (DfeResponseVerifierException e3) {
                m4366a("signature-verification-failed");
                FinskyLog.m21667d("Could not verify request: %s, exception %s", this, e3);
            } catch (Throwable th) {
                gZIPInputStream.close();
            }
        }
        a = fl.a(c0697m.f4167b);
        if (this.f7467G != null) {
            this.f7467G.mo1550a(c0697m.f4167b, str);
            m4366a("signature-verification-succeeded");
        }
        return a;
        return null;
    }

    private final C0684b m7351b(C0697m c0697m) {
        long j;
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
                a.f4135e = Long.parseLong(str) + currentTimeMillis;
            }
            if (this.f7480T.m7701a()) {
                str = (String) c0697m.f4168c.get("X-DFE-Firm-TTL");
                if (str != null) {
                    currentTimeMillis = Long.parseLong(str);
                } else {
                    currentTimeMillis = 0;
                }
                try {
                    str = (String) c0697m.f4168c.get("X-DFE-Firm-Rpc-Timeout");
                    if (str != null) {
                        long j2 = currentTimeMillis;
                        currentTimeMillis = Long.parseLong(str);
                        j = j2;
                    } else {
                        j = currentTimeMillis;
                        currentTimeMillis = 0;
                    }
                } catch (NumberFormatException e) {
                    j = currentTimeMillis;
                    FinskyLog.m21665c("Invalid TTL: %s", c0697m.f4168c);
                    a.f4136f = 0;
                    a.f4135e = 0;
                    currentTimeMillis = 0;
                    a.f4135e = Math.max(a.f4135e, a.f4136f);
                    cp.m7348a(a, j, currentTimeMillis);
                    return a;
                }
            }
            j = 0;
            currentTimeMillis = 0;
        } catch (NumberFormatException e2) {
            j = 0;
            FinskyLog.m21665c("Invalid TTL: %s", c0697m.f4168c);
            a.f4136f = 0;
            a.f4135e = 0;
            currentTimeMillis = 0;
            a.f4135e = Math.max(a.f4135e, a.f4136f);
            cp.m7348a(a, j, currentTimeMillis);
            return a;
        }
        a.f4135e = Math.max(a.f4135e, a.f4136f);
        if (this.f7480T.m7701a() && c0697m.f4171f > 0) {
            cp.m7348a(a, j, currentTimeMillis);
        }
        return a;
    }

    public final synchronized void mo1057f() {
        if (!mo1073g()) {
            super.mo1057f();
            if (this.f7473M != null) {
                this.f7473M.ah_();
                this.f7473M = null;
            }
            this.f7486s = null;
        }
    }

    public final synchronized boolean mo1073g() {
        return super.mo1073g();
    }

    protected final VolleyError mo1543b(VolleyError volleyError) {
        if (!(volleyError instanceof ServerError) || volleyError.f4022b == null) {
            return volleyError;
        }
        if (volleyError.f4022b.f4166a == 502 && this.f7488u.f7446y) {
            String str = (String) volleyError.f4022b.f4168c.get("x-obscura-nonce");
            if (str != null) {
                C1251b.m7282a(str);
            }
        }
        fl a = m7347a(volleyError.f4022b, false);
        if (a == null) {
            return volleyError;
        }
        C0704v a2 = m7346a(a);
        if (a2 != null) {
            return a2.f4193c;
        }
        FinskyLog.m21667d("Received a null response in ResponseWrapper, error %d", Integer.valueOf(volleyError.f4022b.f4166a));
        return volleyError;
    }

    private final C0704v m7346a(fl flVar) {
        if (flVar.c == null) {
            return null;
        }
        jq jqVar = flVar.c;
        if (jqVar.bA_()) {
            FinskyLog.m21659a("%s", jqVar.f12811d);
        }
        if (jqVar.f12809b) {
            this.f7488u.f7430i.mo1068b();
        }
        if (jqVar.f12812e.length > 0) {
            new Handler(Looper.getMainLooper()).post(new cq(this, jqVar));
        }
        if (jqVar.bz_()) {
            return C0704v.m4516a(new DfeServerError(jqVar.f12810c));
        }
        return null;
    }

    private final void m7352b(fl flVar) {
        if (flVar.e.length != 0 && this.f7488u.m7292d() != null) {
            for (ab a : flVar.e) {
                this.f7488u.m7292d().mo1163a(a);
            }
        }
    }

    private final void m7350a(boolean z, VolleyError volleyError) {
        if (this.f7488u.f7435n != null) {
            boolean z2 = false;
            if (z && this.f7468H <= 0) {
                z2 = true;
            }
            if (this.f7488u.f7435n.m13331a(z2, false)) {
                float f;
                long j = this.f7468H;
                if (z && this.f7480T.m7701a()) {
                    j = m7345a(z2);
                }
                long j2 = -1;
                if (this.f7482V > 0) {
                    j2 = C4678i.m21813b() - this.f7482V;
                }
                if (this.f4038m instanceof cx) {
                    f = ((cx) this.f4038m).f4153d;
                } else {
                    f = 0.0f;
                }
                Boolean bool = null;
                if (volleyError instanceof NoConnectionError) {
                    bool = Boolean.valueOf(C6324f.m28968b(this.f7488u.f7427f));
                }
                this.f7488u.f7435n.m13330a(mo1545d(), j, mo1542b(), j2, this.f7483W, this.f4038m.mo1079b() + 1, this.f4038m.mo1077a(), f, z, volleyError, this.f7469I, this.f7488u.m7295g(), this.f7470J, z2, this.f7484X, bool, this.f7491x, this.f7492y);
            }
        }
    }

    private final long m7345a(boolean z) {
        if (this.f7484X == 3) {
            try {
                return Long.parseLong((String) this.f4039n.f4137g.get("X-DFE-Firm-Rpc-Timeout"));
            } catch (NumberFormatException e) {
                FinskyLog.m21669e("Cache hit type is firm TTL timeout, but can't read timeout.", new Object[0]);
                return this.f7468H;
            } catch (NullPointerException e2) {
                FinskyLog.m21669e("Cache hit type is firm TTL timeout, but can't read timeout.", new Object[0]);
                return this.f7468H;
            }
        } else if (this.f7484X != 0) {
            return this.f7468H;
        } else {
            if (this.f7481U) {
                this.f7484X = 4;
                return this.f7468H;
            } else if (z) {
                this.f7484X = 1;
                return this.f7468H;
            } else {
                if (this.f4039n == null) {
                    this.f7484X = 6;
                } else {
                    this.f7484X = 5;
                }
                return this.f7468H;
            }
        }
    }

    public final void mo1544c(VolleyError volleyError) {
        this.f7468H = volleyError.f4023c;
        if (volleyError instanceof AuthFailureError) {
            this.f7488u.m7291c();
        }
        if (this.f7485k) {
            FinskyLog.m21659a("Not delivering error response for request=[%s], error=[%s] because response already delivered.", this, volleyError);
            return;
        }
        m7350a(false, volleyError);
        super.mo1544c(volleyError);
    }

    public String mo1546e() {
        return this.f7480T.m7699a(super.mo1545d(), this.f7488u.m7287b(), this.f7488u.f7432k, this.f7488u.f7433l, this.f7461A);
    }

    public final long mo1542b() {
        return this.f7490w;
    }

    private static void m7348a(C0684b c0684b, long j, long j2) {
        if (j != 0 && j2 != 0) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            if (currentTimeMillis < c0684b.f4136f || currentTimeMillis > c0684b.f4135e) {
                FinskyLog.m21669e("TTLs don't line up: soft = %d, firm = %d, hard = %d", Long.valueOf(c0684b.f4136f), Long.valueOf(currentTimeMillis), Long.valueOf(c0684b.f4135e));
                currentTimeMillis = 0;
                j2 = 0;
                j = 0;
            }
            Map c0305a = (c0684b.f4137g == null || c0684b.f4137g.isEmpty()) ? new C0305a(3) : c0684b.f4137g;
            c0305a.put("X-DFE-Firm-TTL", Long.toString(j));
            c0305a.put("X-DFE-Firm-Rpc-Timeout", Long.toString(j2));
            c0305a.put("Cache-Firm-TTL", Long.toString(currentTimeMillis));
            c0684b.f4137g = c0305a;
        }
    }

    final void m7355a(int i) {
        if (this.f7484X != 0) {
            FinskyLog.m21669e("Attempting to change cache hit type after already setting it.", new Object[0]);
        } else {
            this.f7484X = i;
        }
    }

    public final C0656n mo1540a(C0700r c0700r) {
        this.f7482V = C4678i.m21813b();
        return super.mo1540a(c0700r);
    }

    public final /* synthetic */ void mo1056a(Object obj) {
        try {
            C0757i a = this.f7487t.mo1536a(((fl) obj).b);
            if (a == null) {
                FinskyLog.m21667d("Null parsed response for request=[%s]", this);
                mo1544c(new VolleyError());
            } else if (this.f7489v || !this.f7485k) {
                if (this.f7486s != null) {
                    this.f7486s.b_(a);
                }
                this.f7485k = true;
                m7350a(true, null);
            } else {
                FinskyLog.m21659a("Not delivering second response for request=[%s]", this);
            }
        } catch (Throwable e) {
            FinskyLog.m21667d("Null wrapper parsed for request=[%s]", this);
            mo1544c(new ParseError(e));
        }
    }
}
