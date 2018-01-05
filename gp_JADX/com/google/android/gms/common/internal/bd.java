package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.internal.mu;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bd {
    public final Account f26004a;
    public final Set f26005b;
    public final Set f26006c;
    public final Map f26007d;
    public final String f26008e;
    public final String f26009f;
    public final mu f26010g;
    public Integer f26011h;

    public bd(Account account, Set set, Map map, String str, String str2, mu muVar) {
        this.f26004a = account;
        this.f26005b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f26007d = map;
        this.f26008e = str;
        this.f26009f = str2;
        this.f26010g = muVar;
        Set hashSet = new HashSet(this.f26005b);
        for (bf bfVar : this.f26007d.values()) {
            hashSet.addAll(bfVar.f26017a);
        }
        this.f26006c = Collections.unmodifiableSet(hashSet);
    }
}
