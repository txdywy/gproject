package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

abstract class cb extends AbstractSet {
    cb() {
    }

    public boolean removeAll(Collection collection) {
        return ca.m31782a((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        return super.retainAll((Collection) C6937m.m31623a((Object) collection));
    }
}
