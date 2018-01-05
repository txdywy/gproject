package com.google.android.finsky.stream.base.playcluster;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.C1419m;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.d;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class PlayCardClusterViewContent extends ViewGroup implements ae {
    public ao f21593a;
    public C4281c f21594b;
    public LayoutInflater f21595c;
    public Document f21596d;
    public Document f21597e;
    public List f21598f;
    public String f21599g;
    public int f21600h;
    public int f21601i;
    public int f21602j;
    public final int f21603k;
    public final int f21604l;
    public C3748a f21605m;
    public C4808a f21606n;
    public ad f21607o;
    public C2495w f21608p;

    public PlayCardClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C1419m) C3947d.m18649a(C1419m.class)).mo1916a(this);
        this.f21595c = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardClusterViewContent);
        this.f21601i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21602j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        Resources resources = context.getResources();
        this.f21603k = resources.getDimensionPixelSize(C7582R.dimen.play_small_card_content_min_height);
        this.f21604l = resources.getDimensionPixelSize(C7582R.dimen.play_card_default_inset);
    }

    public void setClusterDocumentData(Document document) {
        if (this.f21598f != null) {
            throw new IllegalStateException("Already initialized with loose documents");
        }
        this.f21596d = document;
        this.f21599g = this.f21596d.f14885a.f12096c;
    }

    public final void m19875a(List list, String str) {
        if (this.f21596d != null) {
            throw new IllegalStateException("Already initialized with cluster document");
        }
        this.f21598f = list;
        this.f21599g = str;
    }

    public final void Z_() {
        this.f21596d = null;
        this.f21598f = null;
    }

    public Document getClusterLoggingDocument() {
        if (this.f21597e == null) {
            return this.f21596d;
        }
        return this.f21597e;
    }

    public void setClusterLoggingDocument(Document document) {
        this.f21597e = document;
    }

    public void setCardContentVerticalPadding(int i) {
        this.f21601i = i;
        this.f21602j = i;
        requestLayout();
    }

    public void setCardContentHorizontalPadding(int i) {
        if (this.f21600h != i) {
            this.f21600h = i;
            requestLayout();
        }
    }

    public int getCardContentHorizontalPadding() {
        return this.f21600h;
    }

    public final int getDocCount() {
        if (this.f21596d != null) {
            return this.f21596d.m14638a();
        }
        return this.f21598f.size();
    }

    public final Document m19872a(int i) {
        if (i < 0 || i >= getDocCount()) {
            return null;
        }
        if (this.f21596d != null) {
            return this.f21596d.m14641a(i);
        }
        return (Document) this.f21598f.get(i);
    }

    public C4281c getMetadata() {
        return this.f21594b;
    }

    public int getIndexOfFirstCard() {
        return 0;
    }

    public final d m19876b(int i) {
        return (d) getChildAt(getIndexOfFirstCard() + i);
    }

    public int getCardChildCount() {
        return getChildCount() - getIndexOfFirstCard();
    }

    public void mo4244a(C3748a c3748a, ab abVar, C4285g c4285g, ad adVar, C2495w c2495w, Document document, int i) {
        this.f21605m = c3748a;
        this.f21607o = adVar;
        this.f21608p = c2495w;
        int numberOfTilesToBind = getNumberOfTilesToBind();
        int i2 = 0;
        while (i2 < this.f21594b.m19884a()) {
            C3906g c3906g = this.f21594b.m19886a(i2).f21635a;
            View a = c4285g.m19888a(c3906g, this.f21595c, null);
            a.setThumbnailAspectRatio(c3906g.f19738d);
            m19870a(a, i2, i2 < numberOfTilesToBind ? mo4246c(i2) : -1, i + i2, abVar);
            addView(a);
            i2++;
        }
    }

    public int getNumberOfTilesToBind() {
        return this.f21594b.m19884a();
    }

    public int mo4246c(int i) {
        return i;
    }

    public final void m19873a(int i, int i2, int i3, ab abVar) {
        m19870a(m19876b(i), i, i2, i3, abVar);
    }

    private final void m19870a(d dVar, int i, int i2, int i3, ab abVar) {
        Document a = m19872a(i2);
        if (a == null) {
            dVar.d();
            return;
        }
        float a2;
        C3906g c3906g = this.f21594b.m19886a(i).f21635a;
        C4281c c4281c = this.f21594b;
        Object obj = (c4281c.f21631f || ((C4282d) c4281c.f21629d.get(i)).f21638d) ? 1 : null;
        if (obj != null) {
            a2 = C1617r.m9292a(a.f14885a.f12098e);
        } else {
            a2 = c3906g.f19738d;
        }
        dVar.setThumbnailAspectRatio(a2);
        ((FifeImageView) dVar.getThumbnail().getImageView()).I = true;
        boolean be = a.be();
        boolean z = be && abVar != null && this.f21606n.m22588a(a.f14885a.f12096c);
        this.f21593a.m18516a(dVar, a, i3, this.f21599g, this.f21605m, z, be ? abVar : null, this.f21607o, false, false, a.aZ(), this.f21608p, null);
    }

    private final float m19871d(int i) {
        return (((float) i) - ((float) (this.f21600h * 2))) / ((float) this.f21594b.f21626a);
    }

    private final float m19869a(float f) {
        C3906g c3906g = this.f21594b.f21632g;
        if (c3906g == null) {
            return f;
        }
        return (((c3906g.f19738d * ((((float) c3906g.f19736b) * f) - ((float) (this.f21604l * 2)))) + ((float) this.f21603k)) + ((float) (this.f21604l * 2))) / ((float) c3906g.f19737c);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = this.f21594b.f21627b;
        float d = m19871d(size);
        float a = m19869a(d);
        boolean z = this.f21594b.f21630e;
        int a2 = this.f21594b.m19884a();
        int indexOfFirstCard = getIndexOfFirstCard();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < a2; i6++) {
            C4282d a3 = this.f21594b.m19886a(i6);
            int i7 = a3.f21635a.f19736b;
            int i8 = a3.f21635a.f19737c;
            View childAt = getChildAt(indexOfFirstCard + i6);
            i8 = (int) (((float) i8) * a);
            i7 = MeasureSpec.makeMeasureSpec((int) (((float) i7) * d), MemoryMappedFileBuffer.DEFAULT_SIZE);
            if (z) {
                childAt.measure(i7, 0);
                i5 = Math.max(i5, childAt.getMeasuredHeight());
            } else {
                childAt.measure(i7, MeasureSpec.makeMeasureSpec(i8, MemoryMappedFileBuffer.DEFAULT_SIZE));
            }
            if (childAt.getVisibility() == 0) {
                i4++;
            }
        }
        if (i4 == 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        i4 = this.f21601i + this.f21602j;
        if (z) {
            i5 += i4;
        } else {
            i5 = ((int) (((float) i3) * a)) + i4;
        }
        setMeasuredDimension(size, i5);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        if (ai.f1848a.mo400k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        int width = getWidth();
        float d = m19871d(width);
        float a = m19869a(d);
        int i5 = this.f21600h;
        int a2 = this.f21594b.m19884a();
        int i6 = this.f21594b.f21627b;
        int indexOfFirstCard = getIndexOfFirstCard();
        int extraColumnOffset = getExtraColumnOffset();
        for (int i7 = 0; i7 < a2; i7++) {
            C4282d a3 = this.f21594b.m19886a(i7);
            int i8 = a3.f21636b + extraColumnOffset;
            int i9 = a3.f21637c;
            int i10 = i5 + ((int) (((float) i8) * d));
            d dVar = (d) getChildAt(indexOfFirstCard + i7);
            int i11 = height - this.f21602j;
            if (!this.f21594b.f21630e) {
                i11 -= (int) (((float) (i6 - (a3.f21635a.f19737c + i9))) * a);
            }
            int measuredWidth = dVar.getMeasuredWidth();
            i9 = k.a(width, measuredWidth, z2, i10);
            dVar.layout(i9, i11 - dVar.getMeasuredHeight(), measuredWidth + i9, i11);
            ((FifeImageView) dVar.getThumbnail().getImageView()).a(true);
        }
    }

    protected int getExtraColumnOffset() {
        int i = 0;
        int a = this.f21594b.m19884a();
        int indexOfFirstCard = getIndexOfFirstCard();
        if (!this.f21594b.f21634i) {
            return 0;
        }
        int i2 = this.f21594b.f21626a;
        for (int i3 = 0; i3 < a; i3++) {
            if (getChildAt(indexOfFirstCard + i3).getVisibility() != 4) {
                C4282d a2 = this.f21594b.m19886a(i3);
                i = Math.max(i, a2.f21635a.f19736b + a2.f21636b);
            }
        }
        if (i == 0) {
            return i2 - this.f21594b.f21633h;
        }
        return i2 - i;
    }
}
