package com.google.android.libraries.play.entertainment.story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p348i.C6093b;

public final class az extends C6093b {
    public Class f30460d = ai.class;
    public String f30461e;
    public int f30462f;
    public C2980a f30463g;

    public az(Activity activity, String str) {
        super(activity);
        this.f30461e = str;
    }

    public final Intent mo5317a() {
        Intent intent = new Intent(this.f30246a, this.f30460d);
        if (this.f30248c) {
            intent.addFlags(67108864);
            intent.addFlags(268435456);
        }
        if (this.f30247b) {
            intent.addFlags(32768);
        }
        intent.putExtra("storyId", this.f30461e);
        if (this.f30462f != 0) {
            intent.putExtra("bgColor", this.f30462f);
        }
        if (this.f30463g != null) {
            Bundle c = C2998a.m15496l().m15515r().mo3232c(this.f30463g);
            if (c != null) {
                intent.putExtra("causeNode", c);
            }
        }
        return intent;
    }
}
