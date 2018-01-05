package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cu.C2415b;
import com.google.android.finsky.cu.C2417d;
import com.google.android.finsky.cu.C2418l;
import com.google.android.finsky.cv.p177a.jw;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.bb;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;

public class PlaylistControlButtons extends PlayActionButtonV2 implements OnClickListener {
    public final C2415b f18271a;
    public Collection f18272b;
    public boolean f18273c;
    public final C2418l f18274d;

    public PlaylistControlButtons(Context context) {
        this(context, null);
    }

    public PlaylistControlButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18272b = new ArrayList();
        this.f18273c = false;
        this.f18274d = new av(this);
        this.f18271a = new C2415b(this.f18274d);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18271a.m12125a();
        m17328a(C2415b.f11723a.f11728c.size() > 0);
    }

    protected void onDetachedFromWindow() {
        this.f18271a.m12126b();
        super.onDetachedFromWindow();
    }

    public void onClick(View view) {
        if (this.f18273c) {
            C2415b.f11723a.m12131c();
            return;
        }
        Collection<Document> collection = this.f18272b;
        C2417d c2417d = C2415b.f11723a;
        bb.m21791a();
        c2417d.f11728c.clear();
        for (Document Q : collection) {
            jw Q2 = Q.m14628Q();
            if (!(Q2 == null || !Q2.bB_() || TextUtils.isEmpty(Q2.f12832f))) {
                c2417d.f11728c.add(Q2);
            }
        }
        c2417d.m12130b();
        c2417d.m12131c();
        m17328a(true);
    }

    final void m17328a(boolean z) {
        this.f18273c = z;
        m6000a(2, this.f18273c ? C7582R.string.skip_track : C7582R.string.play_all, null);
    }
}
