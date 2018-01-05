package com.google.android.finsky.splitinstallservice;

import android.support.v4.p037h.C0305a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;

public final class ar {
    public final C1203f f21216a;
    public C1202e f21217b;

    public ar(C1203f c1203f) {
        this.f21216a = c1203f;
    }

    final C4809e m19563a(String str, int i) {
        return m19560a().mo1521a(m19559b(str, i));
    }

    final C4809e m19562a(String str) {
        return m19560a().mo1519a(new C1215q("package_name", (Object) str));
    }

    final C4809e m19561a(C4196a c4196a) {
        return m19560a().mo1524b((Object) c4196a).mo4397a(new aw(c4196a));
    }

    final C4809e m19564b(String str) {
        return m19560a().mo1520a(C1215q.m7189a(new C1215q("package_name", (Object) str), new C1215q("active_in_installer_state", Integer.valueOf(2)), "AND"), "creation_timestamp desc", "1").mo4397a(ax.f21223a);
    }

    static C4196a m19558a(byte[] bArr) {
        try {
            return (C4196a) C0757i.m4905a(new C4196a(), bArr);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IllegalStateException("Invalid protocol buffer.");
        }
    }

    static String m19559b(String str, int i) {
        return new StringBuilder(String.valueOf(str).length() + 12).append(str).append(":").append(i).toString();
    }

    public final synchronized C1202e m19560a() {
        if (this.f21217b == null) {
            Map c0305a = new C0305a(2);
            c0305a.put("package_name", "TEXT");
            c0305a.put("active_in_installer_state", "INTEGER");
            c0305a.put("creation_timestamp", "INTEGER");
            this.f21217b = this.f21216a.mo1518a("split_install_service", new C1201d("split_install_sessions", "TEXT", c0305a), as.f21218a, at.f21219a, au.f21220a, av.f21221a);
        }
        return this.f21217b;
    }
}
