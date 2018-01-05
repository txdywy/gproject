package com.google.android.instantapps.p309a;

import java.io.File;

final /* synthetic */ class C5696b implements C5695c {
    public static final C5695c f28848a = new C5696b();

    private C5696b() {
    }

    public final Object mo5133a(Object obj, File file) {
        boolean z = file.delete() && ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }
}
