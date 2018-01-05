package com.google.android.finsky.bm;

import com.google.android.youtube.player.l;
import java.lang.reflect.Field;

public final class C2124h extends l {
    public C2124h() {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("f");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.valueOf(true));
        } catch (Exception e) {
        }
    }
}
