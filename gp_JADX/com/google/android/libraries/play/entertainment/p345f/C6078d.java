package com.google.android.libraries.play.entertainment.p345f;

import android.content.Context;
import com.google.android.libraries.play.entertainment.media.C6074a;
import com.google.android.libraries.play.entertainment.media.C6077c;
import com.google.android.libraries.play.entertainment.media.C6123b;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.concurrent.Executor;

public final class C6078d implements C6077c {
    public final Context f30223a;
    public final C2983e f30224b;
    public final Executor f30225c;

    public C6078d(Context context, C2983e c2983e, Executor executor) {
        this.f30223a = context;
        this.f30224b = (C2983e) C6116b.m28100a((Object) c2983e);
        this.f30225c = (Executor) C6116b.m28100a((Object) executor);
    }

    public final C6074a mo5281a(C6123b c6123b) {
        return new C6075b(this.f30223a, this.f30224b, this.f30225c, (C6123b) C6116b.m28100a((Object) c6123b));
    }
}
