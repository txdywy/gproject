package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.youtube.player.internal.C6853w.C6852a;

public final class C6839c extends C6829a {
    public final C6840d mo5700a(Context context, String str, aj ajVar, ak akVar) {
        return new C6851v(context, str, context.getPackageName(), ar.m31126d(context), ajVar, akVar);
    }

    public final C6841g mo5701a(Activity activity, C6840d c6840d, boolean z) {
        Object a = c6840d.mo5734a();
        C6838b.m31127a((Object) activity);
        C6838b.m31127a(a);
        Object b = ar.m31123b((Context) activity);
        if (b == null) {
            throw new C6852a("Could not create remote context");
        }
        IBinder a2 = C6853w.m31216a(b.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", ao.m31116a(b).asBinder(), ao.m31116a((Object) activity).asBinder(), a, z);
        if (a2 == null) {
            return null;
        }
        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C6841g)) ? new C6842h(a2) : (C6841g) queryLocalInterface;
    }
}
