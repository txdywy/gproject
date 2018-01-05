package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class C5501a {
    public static final ConcurrentHashMap f28315a = new ConcurrentHashMap();
    public static final String[] f28316g = new String[]{"key", "value"};
    public final ContentResolver f28317b;
    public final Uri f28318c;
    public final ContentObserver f28319d;
    public final Object f28320e = new Object();
    public volatile Map f28321f;

    C5501a(ContentResolver contentResolver, Uri uri) {
        this.f28317b = contentResolver;
        this.f28318c = uri;
        this.f28319d = new C5564w(this);
    }

    public static void m26415a() {
        for (C5501a c5501a : f28315a.values()) {
            synchronized (c5501a.f28320e) {
                c5501a.f28321f = null;
            }
        }
    }

    private final Map m26416b() {
        Map hashMap = new HashMap();
        Cursor query = this.f28317b.query(this.f28318c, f28316g, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return hashMap;
    }

    final String m26418a(String str) {
        Map b = ((Boolean) C5550i.m26531a(new C5554m(this))).booleanValue() ? m26416b() : this.f28321f;
        if (b == null) {
            synchronized (this.f28320e) {
                b = this.f28321f;
                if (b == null) {
                    b = m26416b();
                    this.f28321f = b;
                }
            }
        }
        return (String) b.get(str);
    }
}
