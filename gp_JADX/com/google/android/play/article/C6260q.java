package com.google.android.play.article;

import java.util.Locale;

public final class C6260q implements C6129j {
    public final /* synthetic */ C6248b f31287a;
    public final /* synthetic */ C6129j f31288b;
    public final /* synthetic */ NewsstandArticleView f31289c;

    public C6260q(NewsstandArticleView newsstandArticleView, C6248b c6248b, C6129j c6129j) {
        this.f31289c = newsstandArticleView;
        this.f31287a = c6248b;
        this.f31288b = c6129j;
    }

    public final void mo5319a(String str) {
        String str2;
        C6254k c6254k = this.f31289c.f31259a;
        boolean z = this.f31287a.f31267c;
        if (c6254k.m28770a() == null || str == null || str.contains("<html data-ns-viewer")) {
            str2 = str;
        } else {
            CharSequence charSequence = "<html";
            String str3 = "<html ";
            String valueOf = String.valueOf(String.format(Locale.US, "data-ns-viewer='%s'", new Object[]{valueOf}));
            str2 = str.replace(charSequence, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        c6254k.loadDataWithBaseURL(z ? "https://internal-newsstand.sandbox.google.com/newsstand/web/" : "https://play.google.com/newsstand/web/", str2, "text/html", "UTF-8", null);
        if (this.f31288b != null) {
            this.f31288b.mo5319a(str);
        }
    }

    public final void mo5318a() {
        this.f31289c.m28758a(true);
        this.f31289c.m28759b(false);
        this.f31289c.m28760c(false);
        if (this.f31288b != null) {
            this.f31288b.mo5318a();
        }
    }
}
