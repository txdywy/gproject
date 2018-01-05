package com.google.android.finsky.stream.p248a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.ab;
import com.google.wireless.android.finsky.dfe.nano.ag;
import java.util.Arrays;
import java.util.HashSet;

public final class C4237g {
    public static final HashSet f21436a = new HashSet(Arrays.asList(new String[]{"FAMILY", "TV", "coll_1706"}));
    public final C1461c f21437b;
    public final C1556d f21438c;
    public final ab f21439d;
    public String f21440e;

    public C4237g(C1461c c1461c, C1556d c1556d, ab abVar) {
        this.f21437b = c1461c;
        this.f21438c = c1556d;
        this.f21439d = abVar;
    }

    private final boolean m19667b(String str, C2730u c2730u) {
        if (c2730u == null || c2730u.f14950a == null || c2730u.f14950a.f14908a == null) {
            return false;
        }
        int i = c2730u.f14950a.f14908a.f14885a.f12099f;
        C1552e dj = this.f21437b.dj();
        if (this.f21438c.m9022a()) {
            DfeToc dn;
            boolean z;
            if (dj.mo2294a(12620147)) {
                if (this.f21440e == null) {
                    dn = this.f21439d.dn();
                    if (dn != null) {
                        this.f21440e = Uri.parse(dn.f14881a.f31765h).getPath();
                    }
                    z = false;
                    if (z) {
                        return true;
                    }
                }
                if (str != null) {
                    Uri parse = Uri.parse(str);
                    if (TextUtils.equals(this.f21440e, parse.getPath())) {
                        String queryParameter = parse.getQueryParameter("cat");
                        if (parse.getQueryParameter("ht") == null && (queryParameter == null || f21436a.contains(queryParameter))) {
                            z = true;
                            if (z) {
                                return true;
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                    return true;
                }
            }
            if (dj.mo2294a(12619200)) {
                if (m19666a(str)) {
                    return true;
                }
                dn = this.f21439d.dn();
                if (dn != null) {
                    z = TextUtils.equals(str, dn.f14881a.f31766i);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            if (m19666a(str) || TextUtils.equals("homeV2?cat=GAME&c=3", str) || TextUtils.equals("homeV2?cat=FAMILY&c=3", str)) {
                z = true;
            } else {
                z = false;
            }
            if (z && i == 3) {
                return true;
            }
        }
        return false;
    }

    public final boolean m19669a(String str, C2730u c2730u, ag[] agVarArr) {
        return this.f21437b.dj().mo2294a(12617586) && agVarArr != null && agVarArr.length > 2 && m19667b(str, c2730u);
    }

    public final boolean m19668a(String str, C2730u c2730u) {
        return this.f21437b.dj().mo2294a(12617696) && m19667b(str, c2730u);
    }

    private final boolean m19666a(String str) {
        DfeToc dn = this.f21439d.dn();
        return dn != null ? TextUtils.equals(str, dn.f14881a.f31765h) : false;
    }
}
