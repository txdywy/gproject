package com.google.android.play.headerlist;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.app.aa;

final class C6345j extends C6341g {
    public final /* synthetic */ C6344i f31901a;

    C6345j(C6344i c6344i) {
        this.f31901a = c6344i;
    }

    protected final aa mo5393a() {
        Context context = this.f31901a.f31900f;
        while ((context instanceof ContextWrapper) && !(context instanceof aa)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (aa) context;
    }
}
