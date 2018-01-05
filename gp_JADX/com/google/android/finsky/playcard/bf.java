package com.google.android.finsky.playcard;

import android.content.res.Resources;
import android.support.v4.widget.bg;
import android.text.TextUtils;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

final class bf extends C3901z {
    public final /* synthetic */ ao f19639a;

    bf(ao aoVar) {
        this.f19639a = aoVar;
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        dVar = (PlayCardViewListingSmall) dVar;
        super.mo3861a(dVar, document, c3748a, c2495w);
        boolean z = document.bo() || document.m14658m() || !TextUtils.isEmpty(document.aG());
        dVar.setSnippetVisible(z);
        if (this.f19639a.f19606u.dj().mo2294a(12611622) && document.m14624M()) {
            int i;
            if ((document.m14625N().f13161a & 128) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                dVar.setDownloadsCountVisbility(0);
                String str = document.m14625N().f13170j;
                for (CharSequence charSequence : str.split(" ")) {
                    if (charSequence.matches(".*\\d+.*")) {
                        break;
                    }
                }
                Object obj = str;
                if (dVar.f19485l == null) {
                    Resources resources = dVar.getContext().getResources();
                    dVar.f19485l = C0722q.m4782a(resources, (int) C7582R.raw.ic_get_app_black_12px, new as().m4593b(resources.getColor(C7582R.color.play_secondary_text)));
                    bg.m2222a(dVar.f19482i, null, null, dVar.f19485l, null);
                }
                dVar.f19482i.setText(charSequence);
                dVar.f19482i.setContentDescription(dVar.getContext().getString(C7582R.string.download_count, new Object[]{charSequence}));
                ao.m18499a(this.f19639a, dVar, (int) C7582R.dimen.play_title_size);
            }
        }
        dVar.setDownloadsCountVisbility(8);
        ao.m18499a(this.f19639a, dVar, (int) C7582R.dimen.play_title_size);
    }
}
