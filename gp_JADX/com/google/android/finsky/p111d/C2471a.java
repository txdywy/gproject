package com.google.android.finsky.p111d;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.p111d.p178a.C2470a;

public final class C2471a {
    public final C1463g f13311a;

    public C2471a(C1463g c1463g) {
        this.f13311a = c1463g;
    }

    public final C2495w m13184a(String str) {
        return C2495w.m13363a(str, this.f13311a);
    }

    public final C2495w m13178a(Account account) {
        return new C2495w(-1, null, false, account == null ? null : account.name, this.f13311a);
    }

    public final C2495w m13185b(String str) {
        return new C2495w(-1, null, false, str, this.f13311a);
    }

    public final C2495w m13179a(Bundle bundle) {
        C1463g c1463g = this.f13311a;
        return C2495w.m13361a(bundle, C2495w.m13363a(null, c1463g), c1463g);
    }

    public final C2495w m13182a(Bundle bundle, C2495w c2495w) {
        return C2495w.m13361a(bundle, c2495w, this.f13311a);
    }

    public final C2495w m13180a(Bundle bundle, Intent intent) {
        C1463g c1463g = this.f13311a;
        return C2495w.m13360a(bundle, intent, C2495w.m13363a(null, c1463g), c1463g);
    }

    public final C2495w m13181a(Bundle bundle, Intent intent, C2495w c2495w) {
        return C2495w.m13360a(bundle, intent, c2495w, this.f13311a);
    }

    public final C2495w m13183a(C2470a c2470a) {
        return new C2495w(c2470a.f13307c, c2470a.f13308d, c2470a.f13310f, c2470a.f13309e, this.f13311a);
    }
}
