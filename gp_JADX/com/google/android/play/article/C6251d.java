package com.google.android.play.article;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import org.json.JSONObject;

public final class C6251d implements C6250h {
    public final /* synthetic */ String f31272a;
    public final /* synthetic */ C6248b f31273b;

    public C6251d(C6248b c6248b, String str) {
        this.f31273b = c6248b;
        this.f31272a = str;
    }

    public final void mo5360a(String str) {
        try {
            Runnable c6252e = new C6252e(this, new JSONObject(C6248b.m28761a(str)).getJSONObject("data").getString("html"));
            if (C6248b.m28762a()) {
                c6252e.run();
            } else {
                new Handler(Looper.getMainLooper()).post(c6252e);
            }
        } catch (Throwable e) {
            Log.e(C6248b.f31265a, "Could not parse JSON", e);
            mo5359a();
        }
    }

    public final void mo5359a() {
        Runnable c6253f = new C6253f(this);
        if (C6248b.m28762a()) {
            c6253f.run();
        } else {
            new Handler(Looper.getMainLooper()).post(c6253f);
        }
    }
}
