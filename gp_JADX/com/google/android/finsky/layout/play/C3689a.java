package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.google.wireless.android.finsky.dfe.nano.cd;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;

public abstract class C3689a extends AccessibleLinearLayout implements OnClickListener, ad {
    public static final int f18614a = Color.rgb(HprofParser.ROOT_UNKNOWN, 234, 154);
    public FifeImageView f18615b;
    public TextView f18616d;
    public int f18617e;
    public ColorStateList f18618f;
    public int f18619g;
    public int f18620h;
    public cc f18621i;
    public C3748a f18622j;
    public DfeToc f18623k;
    public PackageManager f18624l;
    public Document f18625m;
    public ad f18626n;
    public C2495w f18627o;
    public ce f18628p;
    public final boolean f18629q;
    public final RectF f18630r;
    public final Paint f18631s;
    public final Paint f18632t;
    public final float f18633u;
    public final int f18634v;

    public C3689a(Context context) {
        this(context, null);
    }

    protected abstract int getPlayStoreUiElementType();

    public C3689a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18630r = new RectF();
        this.f18631s = new Paint(1);
        this.f18632t = new Paint();
        Resources resources = getResources();
        this.f18620h = resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_radius) * 2;
        this.f18619g = resources.getDimensionPixelSize(getBadgeRadiusResId());
        setWillNotDraw(false);
        boolean z = C1473m.f7980a.mo2036P().f8184h && C1473m.f7980a.dj().mo2294a(12638807);
        this.f18629q = z;
        this.f18631s.setStyle(Style.FILL_AND_STROKE);
        this.f18632t.setStyle(Style.STROKE);
        this.f18632t.setAntiAlias(true);
        if (this.f18629q) {
            int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_avatar_decoration_threshold_min) / 2;
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.play_avatar_decoration_threshold_max) / 2;
            this.f18633u = C3689a.m17490a((float) dimensionPixelSize, (float) dimensionPixelSize2, (float) resources.getDimensionPixelSize(C7582R.dimen.play_avatar_drop_shadow_min), (float) resources.getDimensionPixelSize(C7582R.dimen.play_avatar_drop_shadow_max), (float) this.f18619g);
            this.f18634v = ((((int) C3689a.m17490a((float) dimensionPixelSize, (float) dimensionPixelSize2, (float) Color.alpha(resources.getColor(C7582R.color.discovery_badge_drop_shadow_alpha_min)), (float) Color.alpha(resources.getColor(C7582R.color.discovery_badge_drop_shadow_alpha_max)), (float) this.f18619g)) & HprofParser.ROOT_UNKNOWN) << 24) | (resources.getColor(C7582R.color.discovery_badge_drop_shadow_base_color) & 16777215);
            return;
        }
        this.f18633u = 0.0f;
        this.f18634v = 0;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18615b = (FifeImageView) findViewById(C7582R.id.icon);
        this.f18616d = (TextView) findViewById(C7582R.id.title);
        if (this.f18629q) {
            this.f18616d.setTextColor(getResources().getColor(C7582R.color.play_fg_secondary));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3583a(com.google.wireless.android.finsky.dfe.nano.cc r3, com.google.android.play.image.C1294w r4, com.google.android.finsky.navigationmanager.C3748a r5, com.google.android.finsky.dfemodel.Document r6, com.google.android.finsky.dfemodel.DfeToc r7, android.content.pm.PackageManager r8, com.google.android.finsky.p111d.ad r9, com.google.android.finsky.p111d.C2495w r10) {
        /*
        r2 = this;
        r2.f18621i = r3;
        r2.f18622j = r5;
        r2.f18623k = r7;
        r2.f18624l = r8;
        r2.f18625m = r6;
        r2.f18626n = r9;
        r2.f18627o = r10;
        r0 = r3.b;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x0096;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        if (r0 == 0) goto L_0x0021;
    L_0x0017:
        r0 = r3.f;
        r2.f18617e = r0;
        r0 = r2.f18617e;
        r1 = f18614a;
        if (r0 == r1) goto L_0x0045;
    L_0x0021:
        r0 = r2.getContext();
        r1 = r6.f14885a;
        r1 = r1.f12099f;
        r0 = com.google.android.finsky.bg.C1608h.m9243a(r0, r1);
        r2.f18617e = r0;
        r0 = r2.getContext();
        r1 = r6.f14885a;
        r1 = r1.f12099f;
        r0 = r0.getResources();
        r1 = com.google.android.finsky.bg.C1608h.m9254c(r1);
        r0 = r0.getColorStateList(r1);
        r2.f18618f = r0;
    L_0x0045:
        r2.mo3587a(r3);
        r0 = r2.f18616d;
        r1 = r3.c;
        r0.setText(r1);
        r0 = r2.f18621i;
        r0 = r0.g;
        if (r0 == 0) goto L_0x0068;
    L_0x0055:
        r1 = r0.d();
        if (r1 != 0) goto L_0x0065;
    L_0x005b:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0065;
    L_0x005f:
        r0 = r0.e();
        if (r0 == 0) goto L_0x0068;
    L_0x0065:
        r2.setOnClickListener(r2);
    L_0x0068:
        r0 = r2.getPlayStoreUiElementType();
        r0 = com.google.android.finsky.p111d.C2482j.m13283a(r0);
        r2.f18628p = r0;
        r0 = r2.f18628p;
        r1 = r3.h;
        com.google.android.finsky.p111d.C2482j.m13285a(r0, r1);
        r0 = r2.f18616d;
        r1 = 0;
        r0.setContentDescription(r1);
        r0 = r3.d;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0099;
    L_0x0087:
        r0 = r2.f18616d;
        r0 = r0.getText();
        r2.setContentDescription(r0);
    L_0x0090:
        r0 = r2.f18626n;
        r0.mo1219a(r2);
        return;
    L_0x0096:
        r0 = 0;
        goto L_0x0015;
    L_0x0099:
        r0 = r3.d;
        r2.setContentDescription(r0);
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.play.a.a(com.google.wireless.android.finsky.dfe.nano.cc, com.google.android.play.image.w, com.google.android.finsky.navigationmanager.a, com.google.android.finsky.dfemodel.Document, com.google.android.finsky.dfemodel.DfeToc, android.content.pm.PackageManager, com.google.android.finsky.d.ad, com.google.android.finsky.d.w):void");
    }

    protected void mo3587a(cc ccVar) {
        if (ccVar.e != null && this.f18615b != null) {
            mo3589a();
            C1473m.f7980a.ar().m9288a(this.f18615b, ccVar.e.f11860f, ccVar.e.f11863i);
            if (this.f18629q) {
                C3689a.m17491a(this.f18615b);
            }
        }
    }

    public void onClick(View view) {
        cd cdVar = this.f18621i.g;
        if (cdVar.d()) {
            this.f18622j.mo3660a(this.f18625m, cdVar.c, false, this.f18627o);
        } else if (cdVar.e()) {
            this.f18622j.mo3660a(this.f18625m, cdVar.d, true, this.f18627o);
        } else if (cdVar.b != null) {
            this.f18622j.mo3640a(cdVar.b, this.f18621i.c, this.f18623k, this.f18624l, this.f18627o);
        }
        this.f18627o.m13379b(new C2475d(this));
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f18629q) {
            if (isClickable() && this.f18618f != null) {
                this.f18617e = this.f18618f.getColorForState(getDrawableState(), this.f18617e);
            }
            invalidate();
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f18628p;
    }

    public ad getParentNode() {
        return this.f18626n;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    protected void mo3589a() {
    }

    protected int getBadgeRadiusResId() {
        return C7582R.dimen.discovery_badge_radius;
    }

    protected static void m17491a(FifeImageView fifeImageView) {
        fifeImageView.setClickable(false);
        fifeImageView.setDuplicateParentStateEnabled(false);
    }

    protected final void m17493a(Canvas canvas) {
        setDrawArea(this.f18630r);
        RectF rectF = this.f18630r;
        float f = this.f18633u;
        int i = this.f18634v;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        this.f18632t.setStrokeWidth(f);
        f2 += f / 3.0f;
        f3 += f;
        f = f4 - (f / 3.0f);
        this.f18632t.setColor(i);
        canvas.drawOval(f2, f3, f, f5, this.f18632t);
        this.f18631s.setColor(this.f18617e);
        canvas.drawOval(this.f18630r, this.f18631s);
    }

    protected void setDrawArea(RectF rectF) {
        rectF.set((float) ((getWidth() / 2) - this.f18619g), (float) (this.f18620h - (this.f18619g * 2)), (float) ((getWidth() / 2) + this.f18619g), (float) this.f18620h);
    }

    private static float m17490a(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f) {
            return f3;
        }
        if (f5 >= f2) {
            return f4;
        }
        return f != f2 ? f3 + (((f5 - f) * (f4 - f3)) / (f2 - f)) : f3;
    }
}
