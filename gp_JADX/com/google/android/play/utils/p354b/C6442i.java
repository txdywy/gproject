package com.google.android.play.utils.p354b;

import android.content.ContentResolver;
import com.google.android.c.e;
import com.google.android.c.g;

final class C6442i implements C6441h {
    public final ContentResolver f32403a;

    public C6442i(ContentResolver contentResolver, String[] strArr) {
        this.f32403a = contentResolver;
        g.b(this.f32403a, strArr);
    }

    public final Boolean mo5438a(String str, Boolean bool) {
        return Boolean.valueOf(g.a(this.f32403a, str, bool.booleanValue()));
    }

    public final Integer mo5440a(String str, Integer num) {
        return Integer.valueOf(g.a(this.f32403a, str, num.intValue()));
    }

    public final Float mo5439a(String str, Float f) {
        String a = g.a(this.f32403a, str, null);
        if (a != null) {
            try {
                f = Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException e) {
            }
        }
        return f;
    }

    public final Long mo5441a(String str, Long l) {
        return Long.valueOf(g.a(this.f32403a, str, l.longValue()));
    }

    public final String mo5442a(String str, String str2) {
        return g.a(this.f32403a, str, str2);
    }

    public final String mo5443b(String str, String str2) {
        return e.a(this.f32403a, str, str2);
    }
}
