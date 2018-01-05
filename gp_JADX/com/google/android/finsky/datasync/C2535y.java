package com.google.android.finsky.datasync;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0659a;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class C2535y {
    public static final Uri f13581a = Uri.parse((String) C0955b.f5908x.m28964b());
    public static final Uri f13582b = Uri.parse((String) C0955b.f5909y.m28964b());
    public static final Set f13583c = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.f5910z.m28964b())));
    public Uri f13584d;
    public C1254c f13585e;
    public C0659a f13586f;
    public C2495w f13587g;
    public final C2206c f13588h;

    public C2535y(C2206c c2206c) {
        this.f13588h = c2206c;
    }

    public final C0656n m13494a(String str, String str2, C0660x c0660x, C0657w c0657w, C1228w c1228w, C1254c c1254c, C2495w c2495w) {
        ip ipVar;
        UnsupportedOperationException e;
        this.f13585e = c1254c;
        this.f13586f = this.f13585e.mo1551a();
        this.f13587g = c2495w;
        try {
            String a;
            this.f13584d = Uri.parse(str);
            Uri uri = this.f13584d;
            String scheme = uri.getScheme();
            Object obj = ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) ? (C2535y.m13492a(f13581a, uri) || C2535y.m13492a(f13582b, uri)) ? 1 : null : null;
            if (obj != null) {
                uri = this.f13584d;
                if (TextUtils.isEmpty(C2535y.m13490a(uri))) {
                    obj = null;
                } else {
                    for (String a2 : uri.getQueryParameterNames()) {
                        if (f13583c.contains(a2)) {
                            obj = null;
                            break;
                        }
                    }
                    int i = 1;
                }
                if (obj != null) {
                    obj = 1;
                    if (obj == null) {
                        m13491a(false, 1);
                    }
                    if (obj != null) {
                        if (this.f13586f == null) {
                            a2 = C2535y.m13490a(this.f13584d);
                            obj = this.f13585e.mo1614a(C1289l.m7694a(a2), a2, C1804v.m9805b(this.f13588h.mo2811a(this.f13585e.mo1620b()))).mo1546e();
                            obj = (TextUtils.isEmpty(obj) || this.f13586f.mo1064a(obj) == null) ? null : 1;
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            m13491a(false, 2);
                        }
                        if (obj != null) {
                            m13491a(true, 0);
                            a2 = C2535y.m13490a(this.f13584d);
                            ipVar = new ip();
                            ipVar.m12805a(C1289l.m7694a(a2));
                            ipVar.f12673F = new ax();
                            ipVar.f12673F.f11833b = a2;
                            ipVar.f12673F.f11834c = 1;
                            ipVar.f12673F.f11835d = 3;
                            try {
                                c0660x.b_(ipVar);
                                if (ipVar != null) {
                                    return this.f13585e.mo1592a(str, str2, c0660x, c0657w, c1228w);
                                }
                                return null;
                            } catch (UnsupportedOperationException e2) {
                                e = e2;
                                try {
                                    FinskyLog.m21662b("URL Malformed %s\n", e);
                                    m13491a(false, 3);
                                    return ipVar != null ? this.f13585e.mo1592a(str, str2, c0660x, c0657w, c1228w) : null;
                                } catch (Throwable th) {
                                    return ipVar != null ? this.f13585e.mo1592a(str, str2, c0660x, c0657w, c1228w) : null;
                                }
                            }
                        }
                    }
                    ipVar = null;
                    if (ipVar != null) {
                        return null;
                    }
                    return this.f13585e.mo1592a(str, str2, c0660x, c0657w, c1228w);
                }
            }
            obj = null;
            if (obj == null) {
                m13491a(false, 1);
            }
            if (obj != null) {
                if (this.f13586f == null) {
                    obj = null;
                } else {
                    a2 = C2535y.m13490a(this.f13584d);
                    obj = this.f13585e.mo1614a(C1289l.m7694a(a2), a2, C1804v.m9805b(this.f13588h.mo2811a(this.f13585e.mo1620b()))).mo1546e();
                    if (!TextUtils.isEmpty(obj)) {
                    }
                }
                if (obj == null) {
                    m13491a(false, 2);
                }
                if (obj != null) {
                    m13491a(true, 0);
                    a2 = C2535y.m13490a(this.f13584d);
                    ipVar = new ip();
                    ipVar.m12805a(C1289l.m7694a(a2));
                    ipVar.f12673F = new ax();
                    ipVar.f12673F.f11833b = a2;
                    ipVar.f12673F.f11834c = 1;
                    ipVar.f12673F.f11835d = 3;
                    c0660x.b_(ipVar);
                    if (ipVar != null) {
                        return this.f13585e.mo1592a(str, str2, c0660x, c0657w, c1228w);
                    }
                    return null;
                }
            }
            ipVar = null;
            if (ipVar != null) {
                return null;
            }
            return this.f13585e.mo1592a(str, str2, c0660x, c0657w, c1228w);
        } catch (UnsupportedOperationException e3) {
            e = e3;
            ipVar = null;
            FinskyLog.m21662b("URL Malformed %s\n", e);
            m13491a(false, 3);
            if (ipVar != null) {
            }
        } catch (Throwable th2) {
            ipVar = null;
            if (ipVar != null) {
            }
        }
    }

    private static String m13490a(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        if (!C2535y.m13493a(f13582b.getAuthority(), uri.getAuthority(), false)) {
            return queryParameter;
        }
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = uri.getQueryParameter("doc");
        }
        if (queryParameter == null) {
            return queryParameter;
        }
        int indexOf = queryParameter.indexOf(45);
        if (indexOf <= 0) {
            return queryParameter;
        }
        if (queryParameter.startsWith("app-")) {
            return queryParameter.substring(indexOf + 1);
        }
        return "";
    }

    private final void m13491a(boolean z, int i) {
        C2474c c2474c;
        if (z) {
            c2474c = new C2474c(1109);
        } else {
            c2474c = new C2474c(1110).m13210a(i);
        }
        this.f13587g.m13367a(c2474c);
    }

    private static boolean m13492a(Uri uri, Uri uri2) {
        if (uri == null && uri2 == null) {
            return true;
        }
        if (uri == null || uri2 == null) {
            return false;
        }
        if (C2535y.m13493a(uri.getAuthority(), uri2.getAuthority(), true) && C2535y.m13493a(uri.getPath(), uri2.getPath(), false)) {
            return true;
        }
        return false;
    }

    private static boolean m13493a(String str, String str2, boolean z) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return z ? str.equalsIgnoreCase(str2) : str.equals(str2);
    }
}
