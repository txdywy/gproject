package com.google.android.libraries.play.entertainment.story.model;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.wireless.android.finsky.dfe.g.a.aj;

final class bo extends bc {
    public static final ax f30641a = new bo();
    public static final int[] f30642b = new int[]{C6089g.publisher, C6089g.creation_time, C6089g.duration};

    private bo() {
        super(C6091h.panel_video);
    }

    public final C6121g mo5335b(View view, C6164u c6164u) {
        return super.mo5335b(view, c6164u).m28116a(view, C6089g.publisher, TextView.class).m28116a(view, C6089g.creation_time, TextView.class).m28116a(view, C6089g.duration, TextView.class);
    }

    private final void m28436a(bn bnVar, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        super.mo5333a((bb) bnVar, c6121g, c2980a, c6164u);
        ax.m28360a(bnVar, c6121g, e, f, f30642b, -1);
        aj ajVar = bnVar.f30640a;
        c6121g.m28125a(ajVar.f, C6089g.publisher);
        c6121g.m28121a((long) ajVar.g, C6089g.duration, null);
        long j = ajVar.h;
        TextView textView = (TextView) c6121g.m28129b(TextView.class, C6089g.creation_time);
        if (textView != null) {
            CharSequence relativeTimeSpanString;
            String str = "";
            if (j != 0) {
                relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(j, Math.max(j, System.currentTimeMillis()), 60000);
            } else {
                Object obj = str;
            }
            textView.setText(relativeTimeSpanString);
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
