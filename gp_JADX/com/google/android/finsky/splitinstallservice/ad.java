package com.google.android.finsky.splitinstallservice;

import android.content.Context;
import android.os.Bundle;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.util.ArrayList;
import java.util.Arrays;

final /* synthetic */ class ad implements Runnable {
    public final C4215q f21160a;
    public final C6279c f21161b;
    public final String f21162c;
    public final String[] f21163d;

    ad(C4215q c4215q, C6279c c6279c, String str, String[] strArr) {
        this.f21160a = c4215q;
        this.f21161b = c6279c;
        this.f21162c = str;
        this.f21163d = strArr;
    }

    public final void run() {
        C4215q c4215q = this.f21160a;
        C6279c c6279c = this.f21161b;
        String str = this.f21162c;
        String[] strArr = this.f21163d;
        C4215q.m19601a(0, c6279c);
        Context context = c4215q.f21272l;
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        bundle.putStringArrayList("module_names", new ArrayList(Arrays.asList(strArr)));
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        C4203f.m19580a(context, str, bundle);
    }
}
