package com.google.android.agera;

import java.util.ArrayList;
import java.util.List;

public static class com.google.android.agera.u
{

    static com.google.android.agera.t a(int p0, t[] p1) {
  3:    if (p1.length == 0) {
  9:        v0 = new com.google.android.agera.w(p0, new t[0]);
 12:        return v0;
        }
 14:    if (p1.length == 1) {
 20:        if (p1[0] instanceof com.google.android.agera.w && ((com.google.android.agera.w)p1[0]).d == 0)
 35:            v0 = new com.google.android.agera.w(p0, ((com.google.android.agera.w)p1[0]).i);
            else {
 41:            v3 = new t[1];
 43:            v3[0] = p1[0];
 45:            v0 = new com.google.android.agera.w(p0, v3);
            }
 38:        return v0;
        }
 51:    v4 = new ArrayList();
 55:    v3 = 0;
 56:    if (v3 >= p1.length) {
123:        v0 = new com.google.android.agera.w(p0, (t[])v4.toArray(new t[v4.size()]));
124:        return v0;
        }
 62:    if (!(p1[v3] instanceof com.google.android.agera.w)) goto 93;
 69:    if (((com.google.android.agera.w)p1[v3]).d != 0) goto 93;
 76:    v0 = 0;
 77:    while (v0 < ((com.google.android.agera.w)p1[v3]).i.length) {
 85:        if (!v4.contains(((com.google.android.agera.w)p1[v3]).i[v0]))
 87:            v4.add(((com.google.android.agera.w)p1[v3]).i[v0]);
 90:        v0 = v0 + 1;
        }
 92:    goto 102;
 97:    if (!v4.contains(p1[v3]))
 99:        v4.add(p1[v3]);
104:    v3 = v3 + 1;
105:    goto 56;
    }

    public static com.google.android.agera.t a(t[] p0) {
        return com.google.android.agera.u.a(0, p0);
    }

}
