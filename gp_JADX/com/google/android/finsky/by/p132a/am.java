package com.google.android.finsky.by.p132a;

import android.database.Cursor;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.by.C2230i;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.by.C2232j;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;

final class am implements Iterator {
    public final /* synthetic */ Cursor f11029a;

    am(Cursor cursor) {
        this.f11029a = cursor;
    }

    public final boolean hasNext() {
        if (this.f11029a.isAfterLast() || this.f11029a.isLast()) {
            this.f11029a.close();
            return false;
        } else if (this.f11029a.isClosed()) {
            return false;
        } else {
            return true;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected final void finalize() {
        if (!this.f11029a.isClosed()) {
            this.f11029a.close();
        }
        super.finalize();
    }

    public final /* synthetic */ Object next() {
        if (!this.f11029a.moveToNext()) {
            return null;
        }
        long j;
        String intern = this.f11029a.getString(0).intern();
        String string = this.f11029a.getString(1);
        int i = this.f11029a.getInt(2);
        String string2 = this.f11029a.getString(3);
        int i2 = this.f11029a.getInt(4);
        int i3 = this.f11029a.getInt(5);
        long j2 = this.f11029a.getLong(6);
        boolean z = this.f11029a.getInt(16) > 0;
        boolean z2 = this.f11029a.getInt(18) > 0;
        String string3 = this.f11029a.getString(19);
        int i4 = this.f11029a.getInt(20);
        long j3 = this.f11029a.getLong(21);
        if (this.f11029a.isNull(7)) {
            j = Long.MAX_VALUE;
        } else {
            j = this.f11029a.getLong(7);
        }
        if (string == null) {
            string = C2229h.m11636a(i);
            FinskyLog.m21659a("Library id for doc id %s is restored from backend %d to value %s", string2, Integer.valueOf(i), string);
        }
        if (!C2229h.m11637a(string)) {
            if (i2 == 1) {
                return new C2228f(intern, string2, i3, j2, C4680k.m21818a(this.f11029a.getString(8)), this.f11029a.getLong(9), this.f11029a.getLong(10), this.f11029a.getInt(17) > 0, z2, string3, i4, j3);
            } else if (C2726q.m14753b(i2) || i3 == 13) {
                if (i == 3) {
                    boolean z3 = this.f11029a.getInt(11) > 0;
                    long j4 = this.f11029a.getLong(12);
                    long j5 = this.f11029a.getLong(13);
                    String str = "";
                    if (!this.f11029a.isNull(14)) {
                        str = this.f11029a.getString(14);
                    }
                    String str2 = "";
                    if (!this.f11029a.isNull(15)) {
                        str2 = this.f11029a.getString(15);
                    }
                    return new C2232j(intern, string, i, string2, i2, i3, j2, j, j4, j5, z3, str, str2, j3);
                }
                return new C2231n(intern, string, i, string2, i2, i3, j2, Long.valueOf(j), this.f11029a.getLong(12), this.f11029a.getLong(13), this.f11029a.getInt(11) > 0, z2, string3, i4, j3);
            } else if (C2726q.m14750a(i2)) {
                String string4 = this.f11029a.getString(14);
                String string5 = this.f11029a.getString(15);
                if (!(string4 == null || string5 == null)) {
                    return new C2230i(intern, string, string2, i2, i3, string4, string5, j2, j3);
                }
            }
        }
        return new C2227g(intern, string, i, string2, i2, i3, j2, j, z, z2, string3, i4, j3);
    }
}
