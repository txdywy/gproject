package com.android.ex.photo.p048a;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.p037h.C0304u;
import com.android.ex.photo.C0567e;
import com.android.ex.photo.p049b.C0548a;
import com.android.ex.photo.p051d.C0556a;

public final class C0544d extends C0542a {
    public C0304u f3736l = new C0304u(C0556a.f3757a.length);
    public final float f3737m;
    public boolean f3738n;

    public C0544d(Context context, ab abVar, float f, boolean z) {
        super(context, abVar);
        this.f3737m = f;
        this.f3738n = z;
    }

    public final Fragment mo967a(Cursor cursor, int i) {
        boolean z = false;
        String a = m4034a(cursor, "contentUri");
        String a2 = m4034a(cursor, "thumbnailUri");
        String a3 = m4034a(cursor, "_display_name");
        String a4 = m4034a(cursor, "loadingIndicator");
        boolean z2;
        if (a4 == null) {
            z2 = false;
        } else {
            z2 = Boolean.valueOf(a4).booleanValue();
        }
        if (a == null && r1) {
            z = true;
        }
        C0567e c0567e = new C0567e(this.c, C0548a.class);
        c0567e.f3778e = a;
        c0567e.f3780g = a2;
        c0567e.f3781h = a3;
        c0567e.f3792s = this.f3738n;
        c0567e.m4106a(this.f3737m);
        Intent a5 = c0567e.m4105a();
        Fragment c0548a = new C0548a();
        C0548a.m4047a(a5, i, z, c0548a);
        return c0548a;
    }

    public final Cursor mo966a(Cursor cursor) {
        int i = 0;
        this.f3736l.clear();
        if (cursor != null) {
            for (String str : C0556a.f3757a) {
                this.f3736l.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
            }
            String[] strArr = C0556a.f3758b;
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                int columnIndex = cursor.getColumnIndex(str2);
                if (columnIndex != -1) {
                    this.f3736l.put(str2, Integer.valueOf(columnIndex));
                }
                i++;
            }
        }
        return super.mo966a(cursor);
    }

    public final String m4034a(Cursor cursor, String str) {
        if (this.f3736l.containsKey(str)) {
            return cursor.getString(((Integer) this.f3736l.get(str)).intValue());
        }
        return null;
    }
}
