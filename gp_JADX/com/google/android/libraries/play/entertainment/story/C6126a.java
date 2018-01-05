package com.google.android.libraries.play.entertainment.story;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.play.article.C6129j;
import com.google.android.play.article.C6248b;
import com.google.android.play.article.C6251d;
import com.google.android.play.article.C6260q;
import com.google.android.play.article.NewsstandArticleView;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import java.util.HashSet;
import java.util.Set;

public final class C6126a extends bd {
    public static final C6090b f30371b = C6090b.m28050a();
    public NewsstandArticleView f30372c;
    public C6132c f30373d;

    public static C6126a m28193a(ai aiVar, C2980a c2980a) {
        C6116b.m28099a(aiVar.d);
        Bundle a = bd.m28185a(aiVar, null, c2980a);
        Fragment c6126a = new C6126a();
        c6126a.m600f(a);
        return c6126a;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C6091h.fragment_article, viewGroup, false);
        this.f30372c = (NewsstandArticleView) inflate.findViewById(C6089g.article_view);
        this.f30373d = new C6132c(C2998a.m15496l().m15511n(), C2998a.m15496l().m15516s().mo5274a(), this.f30239a);
        return inflate;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        aa();
    }

    public final void g_() {
        super.g_();
        Object obj = m28190Y().d;
        C6116b.m28100a(this.f30373d);
        C6116b.m28100a(this.f30372c);
        C6116b.m28100a(obj);
        C6132c c6132c = this.f30373d;
        NewsstandArticleView newsstandArticleView = this.f30372c;
        C6129j c6130b = new C6130b(obj);
        c6132c.f30482f.m27994e();
        c6132c.f30478b = System.currentTimeMillis();
        C6248b c6248b = c6132c.f30479c;
        newsstandArticleView.f31262d = -1;
        newsstandArticleView.m28758a(false);
        newsstandArticleView.m28760c(false);
        newsstandArticleView.m28759b(true);
        C6260q c6260q = new C6260q(newsstandArticleView, c6248b, c6130b);
        if (C6248b.m28762a()) {
            Set set = (Set) c6248b.f31269e.get(obj);
            if (set == null) {
                set = new HashSet();
                c6248b.f31269e.put(obj, set);
            }
            set.add(c6260q);
            String str = c6248b.f31266b ? (String) c6248b.f31268d.m1692a(obj) : null;
            String str2;
            String valueOf;
            if (str != null) {
                str2 = C6248b.f31265a;
                String str3 = "Returning post from cache. Post ID: ";
                valueOf = String.valueOf(obj);
                Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                c6248b.m28763a(obj, str);
                return;
            } else if (c6248b.f31270f.contains(obj)) {
                str = C6248b.f31265a;
                str2 = "Ignoring post load; request in flight. Post ID: ";
                valueOf = String.valueOf(obj);
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return;
            } else {
                str = C6248b.f31265a;
                str2 = "Fetching post. Post ID: ";
                valueOf = String.valueOf(obj);
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                c6248b.f31270f.add(obj);
                c6248b.f31271g.mo5321a(Uri.parse(c6248b.f31267c ? "https://internal-newsstand.sandbox.google.com/newsstand/web/api/html/" : "https://play.google.com/newsstand/web/api/html/").buildUpon().appendEncodedPath(obj).build(), new C6251d(c6248b, obj));
                return;
            }
        }
        throw new IllegalStateException("Must be called from the main thread");
    }

    public final void mo1346w() {
        if (this.f30372c != null) {
            if (C6115a.m28097a(21)) {
                this.f30372c.f31259a.destroy();
            } else {
                int childCount = this.f30372c.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f30372c.getChildAt(i);
                    if (childAt instanceof WebView) {
                        ((WebView) childAt).loadUrl("about:blank");
                    }
                }
            }
        }
        super.mo1346w();
    }
}
