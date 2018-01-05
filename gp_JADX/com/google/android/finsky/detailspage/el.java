package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.fl;
import com.google.android.finsky.cv.p177a.jk;
import com.google.android.finsky.cv.p177a.jw;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class el extends ck implements C0657w, C0999d, C1031w {
    public boolean f14476d;
    public C2720j f14477e;
    public boolean f14478f;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.song_list_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((em) this.b).f14481c == null || ((em) this.b).f14481c.isEmpty()) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2 = true;
        int i = document.f14885a.f12098e;
        boolean z3 = i == 2 || i == 3;
        if (!z3 || TextUtils.isEmpty(document.m14654i())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 && this.b == null) {
            String str;
            C2600d emVar = new em();
            emVar.f14479a = document;
            if (document.f14885a.f12098e != 2) {
                z2 = false;
            }
            emVar.f14483e = z2;
            jk aR = document.aR();
            if (aR != null) {
                emVar.f14484f = aR.f12790b;
            }
            C2440m c2440m = document.f14885a.f12115v;
            if (c2440m == null || c2440m.f13122c == null) {
                str = "";
            } else {
                str = c2440m.f13122c.f12776c;
            }
            emVar.f14486h = str;
            emVar.f14480b = document.m14654i();
            this.b = emVar;
            ((em) this.b).f14485g = new HashSet();
            this.f14476d = false;
            m14233a();
        }
    }

    public final void mo2976b(View view, int i) {
        SongListModuleLayout songListModuleLayout = (SongListModuleLayout) view;
        if (this.b == null || ((em) this.b).f14481c == null) {
            songListModuleLayout.f14063f.setVisibility(4);
            songListModuleLayout.f14061d.setText(songListModuleLayout.getResources().getString(C7582R.string.song_list_header));
            songListModuleLayout.f14062e.setVisibility(8);
            songListModuleLayout.m13786a(true, 10, null, false, null, null, false, null, null, null, null);
        } else if (!songListModuleLayout.f14059b || this.f14478f) {
            Object arrayList;
            int i2;
            String c = this.w.mo1636c();
            C3748a c3748a = this.z;
            C1294w c1294w = this.y;
            Document document = ((em) this.b).f14479a;
            List list = ((em) this.b).f14481c;
            CharSequence charSequence = ((em) this.b).f14486h;
            CharSequence charSequence2 = ((em) this.b).f14487i;
            boolean z = ((em) this.b).f14483e;
            Set set = ((em) this.b).f14485g;
            ad adVar = this.I;
            String str = ((em) this.b).f14484f;
            View findViewById = songListModuleLayout.findViewById(C7582R.id.song_list_header);
            songListModuleLayout.f14061d.setText(charSequence);
            if (TextUtils.isEmpty(charSequence2)) {
                songListModuleLayout.f14062e.setVisibility(8);
            } else {
                songListModuleLayout.f14062e.setText(charSequence2);
                songListModuleLayout.f14062e.setVisibility(0);
            }
            int size = list.size();
            if (document.f14885a.f12098e == 3) {
                size = Math.min(list.size(), 5);
                arrayList = new ArrayList(size);
                for (i2 = 0; i2 < size; i2++) {
                    arrayList.add((Document) list.get(i2));
                }
            } else {
                arrayList = list;
            }
            int i3 = 0;
            i2 = 0;
            while (i2 < size) {
                int i4;
                jw Q = ((Document) arrayList.get(i2)).m14628Q();
                if (Q == null || !Q.bB_() || TextUtils.isEmpty(Q.f12832f)) {
                    i4 = i3;
                } else {
                    i4 = i3 + 1;
                }
                i2++;
                i3 = i4;
            }
            if (i3 < 2) {
                songListModuleLayout.f14063f.setVisibility(8);
                findViewById.setOnClickListener(null);
                findViewById.setClickable(false);
            } else {
                songListModuleLayout.f14063f.setVisibility(0);
                PlayActionButtonV2 playActionButtonV2 = songListModuleLayout.f14063f;
                playActionButtonV2.f18272b = arrayList;
                playActionButtonV2.m6000a(2, (int) C7582R.string.play_all, null);
                findViewById.setOnClickListener(new en(songListModuleLayout, SongListModuleLayout.m13785a(arrayList), c));
                findViewById.setClickable(true);
            }
            songListModuleLayout.m13786a(false, size, arrayList, z, c1294w, document, SongListModuleLayout.m13784a(document, arrayList), c3748a, set, str, adVar);
            songListModuleLayout.f14059b = true;
            this.f14478f = false;
        }
    }

    public final void mo2980h() {
        super.mo2980h();
        if (this.f14477e != null) {
            this.f14477e.m11922b((C1031w) this);
            this.f14477e.m11921b((C0657w) this);
        }
        this.D.mo2819b(this);
    }

    public final void mo3037c(View view, int i) {
        ((SongListModuleLayout) view).f14059b = false;
    }

    private final void m14233a() {
        C1473m.f7980a.aO();
        this.f14477e = C2721l.m14733a(this.w, ((em) this.b).f14480b, false, true);
        this.f14477e.m11918a((C1031w) this);
        this.f14477e.m11917a((C0657w) this);
        this.f14477e.m14699n();
    }

    public final void m_() {
        int m = this.f14477e.m14698m();
        List arrayList = new ArrayList(m);
        for (int i = 0; i < m; i++) {
            Document document = (Document) this.f14477e.m14679a(i, true);
            fl flVar = document.m14628Q().f12829c;
            if (flVar != null && flVar.f12377d > 0) {
                arrayList.add(document);
            }
        }
        ((em) this.b).f14481c = arrayList;
        if (mo2979f() && !this.f14476d) {
            m14234b();
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.t, C1290m.m7702a(this.t, volleyError), 0).show();
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (mo2979f() && !this.f14476d) {
            m14234b();
        }
    }

    private final void m14234b() {
        boolean z = ((em) this.b).f14482d == null;
        if (z) {
            ((em) this.b).f14482d = new HashSet();
        }
        for (int i = 0; i < ((em) this.b).f14481c.size(); i++) {
            Document document = (Document) ((em) this.b).f14481c.get(i);
            if (C1473m.f7980a.mo2045Y().m11647a(document, this.D)) {
                if (z) {
                    ((em) this.b).f14482d.add(document.f14885a.f12096c);
                } else if (!((em) this.b).f14482d.contains(document.f14885a.f12096c)) {
                    ((em) this.b).f14485g.add(document.f14885a.f12096c);
                }
            }
        }
        this.f14478f = true;
        this.u.mo3033a(this, true);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((em) c2600d);
        if (this.b != null && ((em) this.b).f14481c == null) {
            m14233a();
        }
        this.D.mo2814a((C0999d) this);
    }
}
