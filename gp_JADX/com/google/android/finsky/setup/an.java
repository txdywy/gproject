package com.google.android.finsky.setup;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.setup.p243c.C4139a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Hashtable;
import java.util.Map;

final class an {
    public static final C0956c f20784b;
    public static final C0957n f20785c;
    public final C2471a f20786a;

    an(C2471a c2471a) {
        this.f20786a = c2471a;
    }

    public final Map m19228a() {
        synchronized (f20784b) {
            Map hashtable = new Hashtable();
            String str = (String) f20785c.m5760a();
            if (!TextUtils.isEmpty(str)) {
                try {
                    C4139a c4139a = (C4139a) C0757i.m4905a(new C4139a(), Base64.decode(str, 0));
                    if (c4139a == null) {
                        FinskyLog.m21665c("Retrieved null state while parsing LoggingContext map, returning empty map.", new Object[0]);
                        return hashtable;
                    }
                    for (int i = 0; i < c4139a.f20885a.length; i++) {
                        hashtable.put(new C4178k(c4139a.f20885a[i].f13309e, Integer.valueOf(c4139a.f20886b[i])), this.f20786a.m13183a(c4139a.f20885a[i]));
                    }
                } catch (InvalidProtocolBufferNanoException e) {
                    FinskyLog.m21665c("Retrieved null state while parsing LoggingContext map, returning empty map.", new Object[0]);
                    return hashtable;
                }
            }
        }
    }

    static {
        C0956c c0956c = new C0956c("finsky-restore-logging-context");
        f20784b = c0956c;
        f20785c = c0956c.m5753a("serialized_logging_context", "");
    }
}
