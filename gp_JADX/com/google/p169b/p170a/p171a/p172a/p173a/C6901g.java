package com.google.p169b.p170a.p171a.p172a.p173a;

import java.util.List;

final class C6901g extends ao {
    public final List f34198a;

    C6901g(List list) {
        if (list == null) {
            throw new NullPointerException("Null spans");
        }
        this.f34198a = list;
    }

    public final List mo5814a() {
        return this.f34198a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        return this.f34198a.equals(((ao) obj).mo5814a());
    }

    public final int hashCode() {
        return 1000003 ^ this.f34198a.hashCode();
    }
}
