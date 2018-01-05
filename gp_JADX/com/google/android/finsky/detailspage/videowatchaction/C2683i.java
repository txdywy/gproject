package com.google.android.finsky.detailspage.videowatchaction;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C2683i implements OnClickListener, C1003o {
    public lx f14796a;
    public WatchActionSummaryView f14797b;
    public final Context f14798c;
    public final ad f14799d;
    public final C3748a f14800e;
    public final C2495w f14801f;
    public final C1254c f14802g;
    public final Map f14803h = new HashMap();
    public Set f14804i = new HashSet();
    public OnClickListener f14805j = new C2684j(this);

    public C2683i(Context context, ad adVar, C3748a c3748a, C2495w c2495w, C1254c c1254c) {
        this.f14798c = context;
        this.f14799d = adVar;
        this.f14800e = c3748a;
        this.f14801f = c2495w;
        this.f14802g = c1254c;
        C1473m.f7980a.bw().mo3481a((C1003o) this);
    }

    public final void m14522a(WatchActionSummaryView watchActionSummaryView, lx lxVar) {
        this.f14797b = watchActionSummaryView;
        this.f14796a = lxVar;
        this.f14797b.setVisibility(0);
        m14518a(false);
        m14525b();
    }

    public final void m14521a() {
        C1473m.f7980a.bw().mo3484b((C1003o) this);
    }

    public final void mo1205a(C3369m c3369m) {
        if (this.f14796a != null && c3369m.m16819a().equals(this.f14796a.f13074c)) {
            m14525b();
        }
    }

    public final void onClick(View view) {
        if (m14519c()) {
            String str = this.f14796a.f13074c;
            String str2 = this.f14796a.f13078g.f12323c;
            PackageManager packageManager = view.getContext().getPackageManager();
            Intent intent = null;
            try {
                intent = Intent.parseUri(str2, 0);
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Failed to create watch intent. Invalid uri: %s", str2);
            }
            if (intent != null) {
                intent.setPackage(str);
                intent.putExtra("android.intent.extra.START_PLAYBACK", true);
                intent.putExtra("source", "play-guide");
                intent.addFlags(335544320);
                if (packageManager.queryIntentActivities(intent, 65536).isEmpty()) {
                    FinskyLog.m21667d("Invalid watch intent. Uri: %s", str2);
                } else {
                    try {
                        view.getContext().startActivity(intent);
                        this.f14801f.m13379b(new C2475d(this.f14799d).m13256a(1241).m13257a(new cf().a(str)));
                        return;
                    } catch (ActivityNotFoundException e2) {
                        FinskyLog.m21667d("Failed to launch watch intent. Uri: %s", str2);
                    }
                }
            }
            Toast.makeText(this.f14798c, this.f14798c.getResources().getString(C7582R.string.unable_to_play_video, new Object[]{this.f14796a.f13081j}), 0).show();
            return;
        }
        m14518a(true);
    }

    final void m14525b() {
        int i;
        int i2 = 8;
        C3371p m = C1473m.f7980a.mo2256o().mo3459m(this.f14796a.f13074c);
        WatchActionSummaryView watchActionSummaryView = this.f14797b;
        C1473m.f7980a.bV();
        int i3 = !m14520d() ? 1 : 0;
        Resources resources = this.f14798c.getResources();
        int i4 = m14519c() ? C7582R.string.watch_on_app_name : m14520d() ? C7582R.string.installing_app_name : C7582R.string.install_app_name;
        String string = resources.getString(i4, new Object[]{this.f14796a.f13081j});
        OnClickListener onClickListener = this.f14805j;
        watchActionSummaryView.f14771a.mo2588a(4, string, (OnClickListener) this);
        PlayActionButtonV2 playActionButtonV2 = watchActionSummaryView.f14771a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = 8;
        }
        playActionButtonV2.setVisibility(i);
        ViewGroup viewGroup = watchActionSummaryView.f14772b;
        if (i3 == 0) {
            i2 = 0;
        }
        viewGroup.setVisibility(i2);
        watchActionSummaryView.f14776f.setOnClickListener(onClickListener);
        C1527a.m8947a(watchActionSummaryView.getContext(), m, watchActionSummaryView.f14773c, watchActionSummaryView.f14774d, watchActionSummaryView.f14775e);
    }

    private final void m14518a(boolean z) {
        String str = this.f14796a.f13074c;
        if (this.f14803h.containsKey(str)) {
            Document document = (Document) this.f14803h.get(str);
            m14525b();
            if (z) {
                m14523a(document);
                return;
            }
            return;
        }
        if (z) {
            this.f14804i.add(str);
            m14525b();
        }
        C2335k c2719i = new C2719i(this.f14802g, C1289l.m7694a(str), true, null, null);
        c2719i.m11918a(new C2686l(this, c2719i, z));
        c2719i.m11917a(new C2687m(this, str, z));
    }

    final void m14523a(Document document) {
        String cf = document.cf();
        this.f14801f.m13379b(new C2475d(this.f14799d).m13256a(1243).m13257a(new cf().a(cf)));
        if (this.f14800e.mo3700d()) {
            bb.m21792a(new C2685k(this, cf, document), new Void[0]);
        } else {
            m14525b();
        }
    }

    private final boolean m14519c() {
        return C1473m.f7980a.bu().m15635a(this.f14796a.f13074c);
    }

    private final boolean m14520d() {
        if (!this.f14804i.contains(this.f14796a.f13074c)) {
            C1473m.f7980a.bu();
            if (!C3028c.m15628a(C1473m.f7980a.mo2256o().mo3458l(this.f14796a.f13074c))) {
                return false;
            }
        }
        return true;
    }
}
