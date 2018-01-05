package com.google.android.finsky.api.p125a;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1255p;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p186do.C2837a;
import com.google.protobuf.nano.C0757i;

public class db extends co {
    public final C0757i f7501Z;

    public db(String str, C0757i c0757i, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C2837a c2837a, C2910a c2910a, C1255p c1255p, C1463g c1463g, C1289l c1289l) {
        super(str, c1251b, czVar, c0660x, c0657w, c2837a, c2910a, c1255p, c1463g, c1289l);
        this.f7501Z = c0757i;
    }

    public final String mo1060l() {
        return "application/x-protobuf";
    }

    public final byte[] mo1061m() {
        return this.f7501Z == null ? null : C0757i.m4909a(this.f7501Z);
    }
}
