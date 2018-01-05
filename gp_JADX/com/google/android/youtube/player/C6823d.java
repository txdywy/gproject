package com.google.android.youtube.player;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.youtube.player.internal.C6838b;
import com.google.android.youtube.player.internal.aq;

public final class C6823d implements OnClickListener {
    public final Activity f33816a;
    public final Intent f33817b;
    public final int f33818c;

    public C6823d(Activity activity, Intent intent, int i) {
        this.f33816a = (Activity) C6838b.m31127a((Object) activity);
        this.f33817b = (Intent) C6838b.m31127a((Object) intent);
        this.f33818c = ((Integer) C6838b.m31127a(Integer.valueOf(i))).intValue();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f33816a.startActivityForResult(this.f33817b, this.f33818c);
            dialogInterface.dismiss();
        } catch (Throwable e) {
            aq.m31119a("Can't perform resolution for YouTubeInitalizationError", e);
        }
    }
}
