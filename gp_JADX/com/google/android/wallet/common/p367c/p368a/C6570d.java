package com.google.android.wallet.common.p367c.p368a;

import android.support.v4.h.a;
import android.util.Log;
import com.android.volley.a.z;
import com.android.volley.m;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import java.util.Map;
import org.json.JSONObject;

public class C6570d extends z {
    public static final boolean f32694t = Log.isLoggable("ImJson", 2);
    public final Map f32695u;

    public C6570d(String str, Map map, x xVar, w wVar) {
        super(str, null, xVar, wVar);
        this.f32695u = map;
        if (this.f32695u == null || this.f32695u.isEmpty()) {
            throw new IllegalArgumentException("extraHeaders should not be null or empty");
        }
    }

    public final Map m29813h() {
        Map h = super.h();
        if (h.isEmpty()) {
            return this.f32695u;
        }
        Map aVar = new a(this.f32695u.size() + h.size());
        aVar.putAll(h);
        aVar.putAll(this.f32695u);
        return aVar;
    }

    protected final v m29812a(m mVar) {
        v a = super.a(mVar);
        if (a.a()) {
            JSONObject jSONObject = (JSONObject) a.a;
            String d = d();
            if (f32694t) {
                if (((Boolean) com.google.android.wallet.a.a.i.a()).booleanValue()) {
                    synchronized (C6570d.class) {
                        Log.v("ImJson", d);
                        try {
                            for (Object valueOf : jSONObject.toString(4).split("\n")) {
                                String str = "ImJson";
                                String str2 = "| ";
                                String valueOf2 = String.valueOf(valueOf);
                                Log.v(str, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                            }
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                Log.v("ImJson", "allowPiiLogging needs to be enabled for JSON logging");
            }
        }
        return a;
    }
}
