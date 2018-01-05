package com.google.android.libraries.play.entertainment.p345f;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.libraries.play.entertainment.media.C6084g;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.c;
import com.google.android.youtube.player.d;
import com.google.android.youtube.player.internal.ar;
import com.google.android.youtube.player.internal.t;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class C6085h implements C6084g {
    public final b f30232a;

    C6085h(b bVar) {
        this.f30232a = bVar;
    }

    public final Dialog mo5288a(Activity activity) {
        Intent b;
        b bVar = this.f30232a;
        Builder builder = new Builder(activity);
        switch (c.a[bVar.ordinal()]) {
            case 1:
            case 3:
                b = ar.b(ar.a(activity));
                break;
            case 2:
                b = ar.a(ar.a(activity));
                break;
            default:
                b = null;
                break;
        }
        OnClickListener dVar = new d(activity, b, MemoryMappedFileBuffer.DEFAULT_PADDING);
        t tVar = new t(activity);
        switch (c.a[bVar.ordinal()]) {
            case 1:
                return builder.setTitle(tVar.b).setMessage(tVar.c).setPositiveButton(tVar.d, dVar).create();
            case 2:
                return builder.setTitle(tVar.e).setMessage(tVar.f).setPositiveButton(tVar.g, dVar).create();
            case 3:
                return builder.setTitle(tVar.h).setMessage(tVar.i).setPositiveButton(tVar.j, dVar).create();
            default:
                String str = "Unexpected errorReason: ";
                String valueOf = String.valueOf(bVar.name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }
}
