package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

final class C5239v extends C5223f {
    public final /* synthetic */ Intent f26330a;
    public /* synthetic */ Bitmap f26331u;
    public final /* synthetic */ File f26332v;
    public final /* synthetic */ Activity f26333w;
    public final /* synthetic */ C5234q f26334x;

    C5239v(C5234q c5234q, C5058o c5058o, Intent intent, Bitmap bitmap, File file, Activity activity) {
        this.f26334x = c5234q;
        this.f26330a = intent;
        this.f26331u = bitmap;
        this.f26332v = file;
        this.f26333w = activity;
        super(c5058o);
    }

    protected final void mo4665a(Context context, C5228k c5228k) {
        try {
            GoogleHelp googleHelp = (GoogleHelp) this.f26330a.getParcelableExtra("EXTRA_GOOGLE_HELP");
            c5228k.mo4659a(googleHelp, this.f26331u, new C5240w(this, googleHelp.f26262F, googleHelp.f26263G, context, this));
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            m23074c(C5234q.f26319a);
        }
    }
}
