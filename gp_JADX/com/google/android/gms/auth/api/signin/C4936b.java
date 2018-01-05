package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C4936b {
    public Set f25391a = new HashSet();
    public boolean f25392b;
    public boolean f25393c;
    public boolean f25394d;
    public String f25395e;
    public Account f25396f;
    public String f25397g;
    public Map f25398h = new HashMap();

    public C4936b(GoogleSignInOptions googleSignInOptions) {
        am.m23733a((Object) googleSignInOptions);
        this.f25391a = new HashSet(googleSignInOptions.f25380f);
        this.f25392b = googleSignInOptions.f25383i;
        this.f25393c = googleSignInOptions.f25384j;
        this.f25394d = googleSignInOptions.f25382h;
        this.f25395e = googleSignInOptions.f25385k;
        this.f25396f = googleSignInOptions.f25381g;
        this.f25397g = googleSignInOptions.f25386l;
        this.f25398h = GoogleSignInOptions.m22956b(googleSignInOptions.f25387m);
    }

    public final C4936b m22967a() {
        this.f25391a.add(GoogleSignInOptions.f25375b);
        return this;
    }

    public final C4936b m22968a(Scope scope, Scope... scopeArr) {
        this.f25391a.add(scope);
        this.f25391a.addAll(Arrays.asList(scopeArr));
        return this;
    }

    public final GoogleSignInOptions m22969b() {
        if (this.f25394d && (this.f25396f == null || !this.f25391a.isEmpty())) {
            m22967a();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.f25391a), this.f25396f, this.f25394d, this.f25392b, this.f25393c, this.f25395e, this.f25397g, this.f25398h);
    }
}
