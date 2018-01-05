package com.google.android.finsky.api.p125a;

import android.net.Uri;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.api.C1255p;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p186do.C2837a;
import com.google.protobuf.nano.C0757i;

public final class cr {
    public C1289l f7497a;
    public C2837a f7498b;
    public C2910a f7499c;
    public C1463g f7500d;

    cr(C2837a c2837a, C2910a c2910a, C1463g c1463g, C1289l c1289l) {
        this.f7498b = c2837a;
        this.f7499c = c2910a;
        this.f7500d = c1463g;
        this.f7497a = c1289l;
    }

    public final cp m7371a(String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1255p c1255p) {
        return new cp(str, c1251b, czVar, c0660x, c0657w, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a);
    }

    public final cp m7375b(String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1255p c1255p) {
        return new cp(str, c1251b, czVar, c0660x, c0657w, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a);
    }

    public final cp m7372a(String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1228w c1228w, C1255p c1255p) {
        return new cp(0, this.f7497a.f7683b, str, c1251b, czVar, c0660x, c0657w, c1228w, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a);
    }

    public final cp m7370a(Uri uri, String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1255p c1255p) {
        return new cp(0, uri, str, c1251b, czVar, c0660x, c0657w, null, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a);
    }

    public final co m7376c(String str, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1255p c1255p) {
        return new co(str, c1251b, czVar, c0660x, c0657w, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a);
    }

    public final db m7374a(String str, C0757i c0757i, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, C1255p c1255p) {
        return new db(str, c0757i, c1251b, czVar, c0660x, c0657w, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a);
    }

    public final db m7373a(String str, C0757i c0757i, C1251b c1251b, cz czVar, C0660x c0660x, C0657w c0657w, dc dcVar, C1255p c1255p) {
        return new cs(str, c0757i, c1251b, czVar, c0660x, c0657w, this.f7498b, this.f7499c, c1255p, this.f7500d, this.f7497a, dcVar);
    }
}
