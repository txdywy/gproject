package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.os.StrictMode;
import com.android.volley.a.ag;
import com.google.android.finsky.api.c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.contentfilterui.p extends com.google.android.finsky.contentfilterui.a
{

    public final com.google.android.finsky.api.c d;

    p(com.google.android.finsky.api.c p0, Context p1) {
        com.google.android.finsky.contentfilterui.a(p1, ContentFilters$ContentFilterSettingsResponse);
        this.d = p0;
    }

    private static void a(Exception p0) {
        v0 = p0.getCause();
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.getClass().getSimpleName();
        v2 = new Object[1];
        v2[0] = v0;
        FinskyLog.a("Unable to retrieve ContentFilterSettingsResponse: %s", v2);
    }

    public final ContentFilters$ContentFilterSettingsResponse d() {
  2:    StrictMode.noteSlowCall("DfeContentFilters.fetchOverNetwork");
  7:    v0 = new com.android.volley.a.ag();
 14:    this.d.a(v0, v0, 1, 0);
 21:    v0 = (ContentFilters$ContentFilterSettingsResponse)v0.get();
 23:    this.a(v0);
 26:    return v0;
 28:    com.google.android.finsky.contentfilterui.p.a(ex);
 31:    v0 = 0;
 32:    return v0;
 34:    com.google.android.finsky.contentfilterui.p.a(ex);
 37:    goto 31;
 38:    try
            run 17...26
        catch (InterruptedException ex) {
 17:        goto 27;
        }
        catch (ExecutionException ex) {
 17:        goto 33;
        }
    }

    public final ContentFilters$ContentFilterSettingsResponse e() {
        StrictMode.noteSlowCall("DfeContentFilters.fetchFromCache");
        v0 = (ContentFilters$ContentFilterSettingsResponse)this.b();
        this.b(v0);
        return v0;
    }

}
