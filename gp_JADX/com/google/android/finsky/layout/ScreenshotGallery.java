package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.google.android.finsky.adapters.C1174q;
import com.google.android.finsky.adapters.C1176s;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2572y;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.utils.bb;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScreenshotGallery extends FrameLayout implements C1176s, C2572y, C2573z, C1043h {
    public Resources f18357a;
    public C3748a f18358b;
    public C1294w f18359c;
    public Document f18360d;
    public boolean f18361e;
    public C3166e f18362f;
    public HorizontalStrip f18363g;
    public C1174q f18364h;
    public int f18365i;
    public int f18366j;
    public AsyncTask f18367k;
    public List f18368l;
    public final List f18369m;
    public SparseArray f18370n;
    public final Handler f18371o;
    public final Runnable f18372p;

    public ScreenshotGallery(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenshotGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18369m = new ArrayList();
        this.f18370n = new SparseArray();
        this.f18371o = new Handler(Looper.myLooper());
        this.f18372p = new bp(this);
        this.f18370n.put(1, Collections.emptyList());
        this.f18370n.put(3, Collections.emptyList());
        this.f18370n.put(13, Collections.emptyList());
        this.f18357a = context.getResources();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18363g = (HorizontalStrip) findViewById(C7582R.id.strip);
        this.f18362f = new C3166e(this, this);
        this.f18362f.m16126a(500);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m17344a();
    }

    public final void m17344a() {
        int height = getHeight();
        if (height != 0 && height != this.f18365i && this.f18359c != null && getVisibility() != 8) {
            Object c;
            if (this.f18360d.ak()) {
                c = this.f18360d.m14644c(1);
            } else {
                List emptyList = Collections.emptyList();
            }
            if (!c.isEmpty()) {
                if (this.f18360d != null && this.f18360d.f14885a.f12096c.equals(this.f18360d.f14885a.f12096c) && getVisibility() == 0) {
                    List list = (List) this.f18370n.get(1);
                    if (c.size() != list.size()) {
                        height = 0;
                    } else {
                        for (int i = 0; i < c.size(); i++) {
                            if (!((bd) c.get(i)).f11860f.equals(((bd) list.get(i)).f11860f)) {
                                height = 0;
                                break;
                            }
                        }
                        boolean z = true;
                    }
                    if (height != 0) {
                        return;
                    }
                }
                this.f18370n.clear();
                this.f18370n.put(1, c);
                this.f18368l = new ArrayList(c);
                if (this.f18364h != null) {
                    this.f18364h.f7225d.unregisterAll();
                }
                height = c.size();
                int[] iArr = new int[height];
                Arrays.fill(iArr, 2);
                this.f18363g.setAppScreenshotStates(iArr);
                this.f18364h = new C1174q(height, this);
                this.f18363g.setAdapter(this.f18364h);
                this.f18365i = getHeight();
                m17343b();
                if (this.f18367k != null) {
                    this.f18367k.cancel(true);
                }
                this.f18367k = new bq(this);
                bb.m21792a(this.f18367k, new Void[0]);
            } else if (this.f18361e) {
                setVisibility(8);
            }
        }
    }

    public final void mo3010a(int i) {
        this.f18358b.mo3651a(this.f18360d, i);
    }

    public final void n_() {
        this.f18365i = 0;
        m17344a();
    }

    private final void m17343b() {
        for (x xVar : this.f18369m) {
            if (xVar != null) {
                xVar.a();
            }
        }
        this.f18369m.clear();
    }

    protected void onDetachedFromWindow() {
        if (this.f18367k != null) {
            this.f18367k.cancel(true);
        }
        if (this.f18364h != null) {
            this.f18364h.f7225d.unregisterAll();
        }
        this.f18371o.removeCallbacks(this.f18372p);
        this.f18363g.setAdapter(null);
        this.f18364h = null;
        super.onDetachedFromWindow();
    }
}
