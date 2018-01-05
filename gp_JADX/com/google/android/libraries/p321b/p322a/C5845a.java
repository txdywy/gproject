package com.google.android.libraries.p321b.p322a;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class C5845a {
    public static final ConcurrentHashMap f29328a = new ConcurrentHashMap();
    public static final String[] f29329g = new String[]{"key", "value"};
    public final ContentResolver f29330b;
    public final Uri f29331c;
    public final ContentObserver f29332d;
    public final Object f29333e = new Object();
    public volatile Map f29334f;

    C5845a(ContentResolver contentResolver, Uri uri) {
        this.f29330b = contentResolver;
        this.f29331c = uri;
        this.f29332d = new C5846b(this);
    }

    public final Map m27272a() {
        Map b = C5847c.m27277b("gms:phenotype:phenotype_flag:debug_disable_caching") ? m27271b() : this.f29334f;
        if (b == null) {
            synchronized (this.f29333e) {
                b = this.f29334f;
                if (b == null) {
                    b = m27271b();
                    this.f29334f = b;
                }
            }
        }
        return b;
    }

    private final Map m27271b() {
        Map hashMap = new HashMap();
        Cursor query = this.f29330b.query(this.f29331c, f29329g, null, null, null);
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
}
