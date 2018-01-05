package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.os.StrictMode;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;

public final class C2352p extends C2336a {
    public final C1254c f11552d;

    public C2352p(C1254c c1254c, Context context) {
        super(context, ContentFilterSettingsResponse.class);
        this.f11552d = c1254c;
    }

    public final ContentFilterSettingsResponse m11969d() {
        StrictMode.noteSlowCall("DfeContentFilters.fetchOverNetwork");
        C0660x agVar = new ag();
        this.f11552d.mo1557a(agVar, (C0657w) agVar, true, false);
        try {
            C0757i c0757i = (ContentFilterSettingsResponse) agVar.get();
            m11930a(c0757i);
            return c0757i;
        } catch (Exception e) {
            C2352p.m11968a(e);
        } catch (Exception e2) {
            C2352p.m11968a(e2);
        }
        return null;
    }

    public final ContentFilterSettingsResponse m11970e() {
        StrictMode.noteSlowCall("DfeContentFilters.fetchFromCache");
        ContentFilterSettingsResponse contentFilterSettingsResponse = (ContentFilterSettingsResponse) m11932b();
        m11933b(contentFilterSettingsResponse);
        return contentFilterSettingsResponse;
    }

    private static void m11968a(Exception exception) {
        Throwable cause = exception.getCause();
        String simpleName = cause == null ? null : cause.getClass().getSimpleName();
        FinskyLog.m21659a("Unable to retrieve ContentFilterSettingsResponse: %s", simpleName);
    }
}
