package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;

public abstract class C6829a {
    public static final C6829a f33834a = C6829a.m31062a();

    private static C6829a m31062a() {
        try {
            return (C6829a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(C6829a.class).newInstance();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (ClassNotFoundException e3) {
            return new C6839c();
        }
    }

    public abstract C6840d mo5700a(Context context, String str, aj ajVar, ak akVar);

    public abstract C6841g mo5701a(Activity activity, C6840d c6840d, boolean z);
}
