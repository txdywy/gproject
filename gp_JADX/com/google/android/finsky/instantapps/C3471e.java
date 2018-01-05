package com.google.android.finsky.instantapps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.finsky.instantappsbackendclient.C3565a;
import com.google.android.instantapps.common.p221d.p222a.af;
import java.io.InputStream;
import java.net.URL;

final class C3471e implements Runnable {
    public final /* synthetic */ C3565a f17661a;
    public final /* synthetic */ af f17662b;
    public final /* synthetic */ EphemeralInstallerActivity f17663c;

    C3471e(EphemeralInstallerActivity ephemeralInstallerActivity, C3565a c3565a, af afVar) {
        this.f17663c = ephemeralInstallerActivity;
        this.f17661a = c3565a;
        this.f17662b = afVar;
    }

    public final void run() {
        try {
            InputStream openStream = new URL(this.f17661a.f17838b.toString()).openStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
            openStream.close();
            this.f17663c.f17293K.post(new C3495f(this, decodeStream));
        } catch (Throwable e) {
            Log.e("EphemeralInstallerAct", "Couldn't read app icon!", e);
        }
    }
}
