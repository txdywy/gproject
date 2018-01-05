package com.google.android.finsky.stream.p251b;

import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3758b;
import com.google.android.finsky.utils.C4694z;
import java.util.ArrayList;
import java.util.Stack;

public final class C4241a implements C3758b {
    public final Stack f21462a = new C4694z();
    public ArrayList f21463b = new ArrayList();
    public boolean f21464c = false;
    public C3748a f21465d = null;

    public final void m19699a(boolean z) {
        m19705g();
        ((C4242b) this.f21462a.peek()).f21466a = z;
        for (int i = 0; i < this.f21463b.size(); i++) {
            ((C4243c) this.f21463b.get(i)).mo4166b(z);
        }
    }

    public final C4242b m19702d() {
        if (this.f21462a.empty()) {
            return null;
        }
        return (C4242b) this.f21462a.peek();
    }

    public final void m19703e() {
        m19705g();
        this.f21464c = true;
    }

    public final void m19704f() {
        this.f21462a.clear();
        this.f21463b.clear();
        this.f21464c = false;
    }

    public final void m19705g() {
        if (this.f21462a.empty()) {
            this.f21462a.push(new C4242b());
        } else if (this.f21462a.peek() == null) {
            this.f21462a.pop();
            this.f21462a.push(new C4242b());
        }
    }

    public final void mo4046a() {
        if (!this.f21462a.empty()) {
            this.f21462a.pop();
        }
        this.f21463b.clear();
        this.f21464c = false;
    }

    public final void mo4047b() {
        if (!this.f21464c || this.f21462a.empty() || this.f21462a.peek() == null) {
            this.f21462a.push(null);
        } else {
            this.f21462a.push((C4242b) ((C4242b) this.f21462a.peek()).clone());
        }
        this.f21463b.clear();
        this.f21464c = false;
    }

    public final void mo4048c() {
        m19704f();
    }
}
