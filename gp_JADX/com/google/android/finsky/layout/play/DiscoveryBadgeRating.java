package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.StarRatingBar;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeRating extends C3689a {
    public int f18647A;
    public float f18648B;
    public PointF[] f18649C;
    public float f18650D;
    public int f18651E;
    public int f18652F;
    public int f18653G;
    public TextView f18654w;
    public StarRatingBar f18655x;
    public TextView f18656y;
    public Path f18657z;

    public DiscoveryBadgeRating(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeRating(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.g = resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_icon_container_size) / 2;
        this.f18657z = new Path();
        this.f18657z.setFillType(FillType.EVEN_ODD);
        this.f18649C = new PointF[8];
        for (int i = 0; i < 8; i++) {
            this.f18649C[i] = new PointF();
        }
        this.f18647A = resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_rating_white_stroke_width);
        this.f18648B = (float) ((this.g - this.f18647A) - (this.f18647A / 2));
        this.f18651E = resources.getColor(C7582R.color.play_avatar_pressed_fill);
        this.f18652F = resources.getColor(C7582R.color.play_avatar_pressed_outline);
        this.f18653G = resources.getColor(C7582R.color.play_avatar_focused_outline);
        this.f18650D = 0.5f * ((float) resources.getDimensionPixelSize(C7582R.dimen.play_avatar_noring_outline));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18654w = (TextView) findViewById(C7582R.id.average_value);
        this.f18655x = (StarRatingBar) findViewById(C7582R.id.discovery_summary_rating_bar);
        this.f18656y = (TextView) findViewById(C7582R.id.title);
    }

    public final void mo3583a(cc ccVar, C1294w c1294w, C3748a c3748a, Document document, DfeToc dfeToc, PackageManager packageManager, ad adVar, C2495w c2495w) {
        super.mo3583a(ccVar, c1294w, c3748a, document, dfeToc, packageManager, adVar, c2495w);
        this.f18654w.setText(aa.m9202b(ccVar.j));
        this.f18655x.setRating(aa.m9201a(ccVar.j));
        this.f18655x.setShowEmptyStars(false);
        this.f18656y.setText(ccVar.c);
        this.f18654w.setContentDescription(null);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (!this.q) {
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int i = this.g;
        this.s.setColor(this.e);
        this.s.setStyle(Style.FILL);
        m17503a((float) width, (float) i, (float) this.g);
        canvas.drawPath(this.f18657z, this.s);
        this.s.setStrokeWidth((float) this.f18647A);
        this.s.setColor(-1);
        this.s.setStyle(Style.STROKE);
        m17503a((float) width, (float) i, this.f18648B);
        canvas.drawPath(this.f18657z, this.s);
        if (!this.q) {
            Object obj = (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) ? 1 : null;
            if (obj != null) {
                m17503a((float) width, (float) i, (float) this.g);
                this.s.setColor(this.f18651E);
                this.s.setStyle(Style.FILL);
                canvas.drawPath(this.f18657z, this.s);
                this.s.setColor(this.f18652F);
                this.s.setStyle(Style.STROKE);
                this.s.setStrokeWidth(this.f18650D);
                canvas.drawPath(this.f18657z, this.s);
            } else if (isFocused()) {
                this.s.setColor(this.f18653G);
                this.s.setStyle(Style.STROKE);
                this.s.setStrokeWidth(this.f18650D);
                m17503a((float) width, (float) i, (float) this.g);
                canvas.drawPath(this.f18657z, this.s);
            }
        }
    }

    private final void m17503a(float f, float f2, float f3) {
        int i = 1;
        double sin = Math.sin(0.7853981633974483d);
        this.f18649C[0].x = -1.0f * f3;
        this.f18649C[0].y = 0.0f;
        this.f18649C[1].x = (float) (-((int) (((double) f3) * sin)));
        this.f18649C[1].y = (float) (-((int) (((double) f3) * sin)));
        this.f18649C[2].x = 0.0f;
        this.f18649C[2].y = -f3;
        this.f18649C[3].x = (float) ((int) (((double) f3) * sin));
        this.f18649C[3].y = (float) (-((int) (((double) f3) * sin)));
        this.f18649C[4].x = f3;
        this.f18649C[4].y = 0.0f;
        this.f18649C[5].x = (float) ((int) (((double) f3) * sin));
        this.f18649C[5].y = (float) ((int) (((double) f3) * sin));
        this.f18649C[6].x = 0.0f;
        this.f18649C[6].y = f3;
        this.f18649C[7].x = (float) (-((int) (((double) f3) * sin)));
        this.f18649C[7].y = (float) ((int) (sin * ((double) f3)));
        for (PointF pointF : this.f18649C) {
            pointF.x += f;
            pointF.y += f2;
        }
        this.f18657z.reset();
        this.f18657z.moveTo(this.f18649C[0].x, this.f18649C[0].y);
        while (i < this.f18649C.length) {
            this.f18657z.lineTo(this.f18649C[i].x, this.f18649C[i].y);
            i++;
        }
        this.f18657z.close();
    }

    protected int getPlayStoreUiElementType() {
        return 1802;
    }
}
