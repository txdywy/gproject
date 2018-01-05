package com.google.android.finsky.ak;

import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class com.google.android.finsky.ak.j implements com.google.android.finsky.z.b
{

    public final Object a;

    j(Object p0) {
        this.a = p0;
    }

    public final Object a(Object p0) {
        if (((List)p0).isEmpty())
            v0 = 0;
        else {
            if (((List)p0).size() > 1) {
                v1 = new Object[2];
                v1[0] = Integer.valueOf(((List)p0).size());
                v1[1] = this.a;
                FinskyLog.e("Got %d records from primary key(%s) lookup", v1);
            }
            v0 = ((List)p0).get(0);
        }
        return v0;
    }

}
