package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

@C5302b
public final class C5310i {
    public final Object f26953a = new Object();
    public final String f26954b;
    public Context f26955c;
    public zzajs f26956d;
    public String f26957e;

    public C5310i() {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C5313j c5313j = new C5313j();
        this.f26954b = C5337w.m25814a();
        C5318l c5318l = new C5318l();
    }

    public final String m24771a() {
        String str;
        synchronized (this.f26953a) {
            str = this.f26957e;
        }
        return str;
    }

    public final void m24772a(Throwable th, String str) {
        zk.m26046a(this.f26955c, this.f26956d).mo4695a(th, str);
    }
}
