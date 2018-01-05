package com.google.android.finsky.detailspage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.PlaylistControlButtons;
import com.google.android.finsky.layout.SongSnippet;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;
import java.util.List;
import java.util.Set;

public class SongListModuleLayout extends LinearLayout {
    public final C2471a f14058a = C1473m.f7980a.aR();
    public boolean f14059b;
    public LinearLayout f14060c;
    public TextView f14061d;
    public TextView f14062e;
    public PlaylistControlButtons f14063f;

    public SongListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14061d = (TextView) findViewById(C7582R.id.header);
        this.f14062e = (TextView) findViewById(C7582R.id.subheader);
        this.f14060c = (LinearLayout) findViewById(C7582R.id.songs);
        this.f14063f = (PlaylistControlButtons) findViewById(C7582R.id.song_list_control);
    }

    final void m13786a(boolean z, int i, List list, boolean z2, C1294w c1294w, Document document, boolean z3, C3748a c3748a, Set set, String str, ad adVar) {
        boolean isEmpty = TextUtils.isEmpty(str);
        int childCount = this.f14060c.getChildCount();
        boolean z4 = isEmpty;
        LayoutInflater layoutInflater = null;
        int i2 = 0;
        while (i2 < i) {
            SongSnippet songSnippet;
            LayoutInflater layoutInflater2;
            if (i2 < childCount) {
                SongSnippet songSnippet2 = (SongSnippet) this.f14060c.getChildAt(i2);
                songSnippet2.setVisibility(0);
                songSnippet = songSnippet2;
                Object obj = null;
                layoutInflater2 = layoutInflater;
            } else {
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                songSnippet = (SongSnippet) layoutInflater.inflate(C7582R.layout.music_song_snippet, null);
                int i3 = 1;
                layoutInflater2 = layoutInflater;
            }
            if (z) {
                Object obj2 = i2 == 0 ? 1 : null;
                songSnippet.f18410x = true;
                if (obj2 == null) {
                    songSnippet.setVisibility(4);
                }
                isEmpty = z4;
            } else {
                int i4;
                Document document2 = (Document) list.get(i2);
                if (z2) {
                    i4 = document2.m14628Q().f12831e;
                } else {
                    i4 = i2 + 1;
                }
                boolean contains = set.contains(document2.f14885a.f12096c);
                songSnippet.f18397k = c1294w;
                songSnippet.f18399m = z3;
                songSnippet.f18398l = document;
                songSnippet.f18400n = document2;
                songSnippet.f18401o = c3748a;
                songSnippet.f18402p = i4;
                songSnippet.f18405s = contains;
                songSnippet.f18409w = adVar;
                songSnippet.f18403q = songSnippet.f18400n.m14628Q();
                songSnippet.f18404r = songSnippet.f18403q.f12829c;
                isEmpty = (songSnippet.f18404r == null || songSnippet.f18404r.f12377d <= 0 || TextUtils.isEmpty(songSnippet.f18403q.f12832f)) ? false : true;
                songSnippet.f18407u = isEmpty;
                C2482j.m13285a(songSnippet.f18408v, songSnippet.f18400n.f14885a.f12087D);
                songSnippet.f18409w.mo1219a(songSnippet);
                if (!this.f14059b && document2.f14885a.f12096c.equals(str)) {
                    songSnippet.setState(2);
                } else if (obj != null) {
                    songSnippet.setState(0);
                }
                if (z4 && songSnippet.f18407u) {
                    if (!songSnippet.f18406t) {
                        songSnippet.setState(1);
                        songSnippet.f18406t = true;
                    }
                    isEmpty = false;
                } else {
                    isEmpty = z4;
                }
            }
            if (obj != null) {
                this.f14060c.addView(songSnippet);
            } else if (!z) {
                songSnippet.m17349a();
            }
            i2++;
            z4 = isEmpty;
            layoutInflater = layoutInflater2;
        }
        while (i < childCount) {
            this.f14060c.getChildAt(i).setVisibility(8);
            i++;
        }
    }

    static boolean m13785a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((Document) list.get(i)).f14885a.f12088E) {
                return true;
            }
        }
        return false;
    }

    static boolean m13784a(Document document, List list) {
        if (document.m14655j() != null) {
            CharSequence charSequence = document.m14655j().f13207d;
        } else {
            Object obj = ((Document) list.get(0)).f14885a.f12102i;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(charSequence, ((Document) list.get(i)).f14885a.f12102i)) {
                return true;
            }
        }
        return false;
    }
}
