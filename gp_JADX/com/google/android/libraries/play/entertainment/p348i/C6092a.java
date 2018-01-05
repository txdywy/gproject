package com.google.android.libraries.play.entertainment.p348i;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public abstract class C6092a {
    public final Context f30246a;

    protected C6092a(Context context) {
        C6116b.m28100a((Object) context);
        this.f30246a = context;
    }

    public abstract Intent mo5317a();

    public String toString() {
        Intent a = mo5317a();
        StringBuilder stringBuilder = new StringBuilder();
        if (a.getComponent() != null) {
            stringBuilder.append(a.getComponent().toString());
        }
        if (a.getData() != null) {
            stringBuilder.append("\n  Data: ").append(a.getData());
        }
        if (a.getAction() != null) {
            stringBuilder.append("\n  Action: ").append(a.getAction());
        }
        Bundle extras = a.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                stringBuilder.append("\n  ").append(str).append(": ").append(extras.get(str));
            }
        }
        return stringBuilder.toString();
    }
}
