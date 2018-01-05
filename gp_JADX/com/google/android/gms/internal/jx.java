package com.google.android.gms.internal;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class jx extends nd {
    public jx(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 49);
    }

    protected final void mo4764a() {
        this.g.f26568P = Integer.valueOf(2);
        try {
            this.g.f26568P = Integer.valueOf(((Boolean) this.h.invoke(null, new Object[]{this.d.f27073c})).booleanValue() ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
