package com.google.android.libraries.play.entertainment.p345f;

import android.text.TextUtils;
import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6054d;
import com.google.android.libraries.play.entertainment.p344d.C6061h;
import com.google.android.libraries.play.entertainment.p351m.C6118d;
import java.io.Closeable;
import java.io.InputStream;
import org.json.JSONObject;

final class C6076c implements C6038t {
    C6076c() {
    }

    public final C6061h mo5264a(C6061h c6061h, C6054d c6054d) {
        if (!c6061h.m27974a()) {
            return c6061h.m27977d();
        }
        Closeable b = ((C6099d) c6061h.m27975b()).mo5292b();
        C6061h a;
        try {
            Object optString = new JSONObject(C6118d.m28109a((InputStream) b)).optString("url");
            if (TextUtils.isEmpty(optString)) {
                a = C6061h.m27973a(new IllegalArgumentException("No url field in returned json"));
                return a;
            }
            a = C6061h.m27972a(optString);
            C6118d.m28110a(b);
            return a;
        } catch (Throwable e) {
            a = C6061h.m27973a(e);
            return a;
        } catch (Throwable e2) {
            a = C6061h.m27973a(e2);
            return a;
        } finally {
            C6118d.m28110a(b);
        }
    }
}
