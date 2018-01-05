package com.google.android.libraries.play.entertainment.story;

import android.net.Uri;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C6109a;
import com.google.android.libraries.play.entertainment.p192l.C6113c;
import com.google.android.libraries.play.entertainment.p344d.C6070w;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.play.article.C6131i;
import com.google.android.play.article.C6248b;
import com.google.android.play.article.C6250h;
import java.util.concurrent.Executor;

final class C6132c implements C6131i {
    public static final C6090b f30477a = C6090b.m28050a();
    public long f30478b;
    public final C6248b f30479c = new C6248b(new C6134d(this));
    public final C2983e f30480d;
    public final Executor f30481e;
    public final C6070w f30482f;

    C6132c(C2983e c2983e, Executor executor, C6070w c6070w) {
        C6116b.m28100a((Object) c2983e);
        C6116b.m28100a((Object) executor);
        C6116b.m28100a((Object) c6070w);
        this.f30480d = c2983e;
        this.f30481e = executor;
        this.f30482f = new C6070w(c6070w);
    }

    public final void mo5321a(Uri uri, C6250h c6250h) {
        this.f30480d.mo3213a(new C6113c(new C6109a(uri.toString()), 0)).m27965a(this.f30482f, this.f30481e, new C6135e(this, c6250h, uri));
    }
}
