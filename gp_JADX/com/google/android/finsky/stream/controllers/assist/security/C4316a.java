package com.google.android.finsky.stream.controllers.assist.security;

import android.os.Bundle;
import com.google.android.finsky.p107l.C3646a;

public final class C4316a {
    public final String f21769a;
    public final byte[] f21770b;
    public final String f21771c;
    public final boolean f21772d;

    C4316a(Bundle bundle, C3646a c3646a, SecurityUtils securityUtils) {
        this.f21769a = bundle.getString("package_name");
        this.f21770b = bundle.getByteArray("sha256");
        this.f21771c = securityUtils.m20043a(this.f21769a);
        this.f21772d = c3646a.m17243a(this.f21769a).f18028c.f11422g;
    }
}
