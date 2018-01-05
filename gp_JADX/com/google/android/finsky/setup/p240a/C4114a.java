package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.fo;

public final class C4114a implements C2918a {
    public final String f20726a;

    public C4114a(String str) {
        this.f20726a = str;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        Object obj2 = 1;
        fo foVar = (fo) obj;
        if (foVar == null) {
            return null;
        }
        Object obj3;
        Object bundle = new Bundle();
        bundle.putString("authAccount", this.f20726a);
        if (((foVar.b & 1) != 0 ? 1 : null) != null) {
            bundle.putLong("android_id", foVar.c);
        }
        if ((foVar.b & 2) != 0) {
            obj3 = 1;
        } else {
            obj3 = null;
        }
        if (obj3 != null) {
            bundle.putString("name", foVar.d);
        }
        if ((foVar.b & 8) != 0) {
            obj3 = 1;
        } else {
            obj3 = null;
        }
        if (obj3 != null) {
            bundle.putLong("last_checkin_time", foVar.f);
        }
        if ((foVar.b & 16) == 0) {
            obj2 = null;
        }
        if (obj2 == null) {
            return bundle;
        }
        bundle.putInt("screen_layout", foVar.g);
        return bundle;
    }
}
