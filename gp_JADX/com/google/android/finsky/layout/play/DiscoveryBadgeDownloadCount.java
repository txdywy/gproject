package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeDownloadCount extends C3689a {
    public int f18635A;
    public float f18636B;
    public int f18637C;
    public int f18638D;
    public int f18639E;
    public Paint f18640s;
    public TextView f18641w;
    public TextView f18642x;
    public Drawable f18643y;
    public RelativeLayout f18644z;

    public DiscoveryBadgeDownloadCount(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeDownloadCount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.g = resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_icon_container_size) / 2;
        this.f18643y = C0259a.m1526e(C0216d.m1112a(context, (int) C7582R.drawable.download_magnitude_background).mutate());
        this.f18640s = new Paint(1);
        this.f18635A = resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_download_count_stroke_width);
        this.f18636B = 0.5f * ((float) resources.getDimensionPixelSize(C7582R.dimen.play_avatar_noring_outline));
        this.f18637C = resources.getColor(C7582R.color.play_avatar_pressed_fill);
        this.f18638D = resources.getColor(C7582R.color.play_avatar_pressed_outline);
        this.f18639E = resources.getColor(C7582R.color.play_avatar_focused_outline);
        setWillNotDraw(false);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18641w = (TextView) findViewById(C7582R.id.download_count_number);
        this.f18642x = (TextView) findViewById(C7582R.id.download_magnitude);
        this.f18644z = (RelativeLayout) findViewById(C7582R.id.download_magnitude_container);
    }

    @SuppressLint({"NewApi"})
    public final void mo3583a(cc ccVar, C1294w c1294w, C3748a c3748a, Document document, DfeToc dfeToc, PackageManager packageManager, ad adVar, C2495w c2495w) {
        super.mo3583a(ccVar, c1294w, c3748a, document, dfeToc, packageManager, adVar, c2495w);
        Resources resources = getResources();
        if (ccVar.l.length() < 4) {
            this.f18641w.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_download_count_size_big));
        } else {
            this.f18641w.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.discovery_badge_download_count_size_small));
        }
        this.f18641w.setText(ccVar.l);
        this.f18642x.setText(ccVar.m);
        if (TextUtils.isEmpty(ccVar.m)) {
            this.f18644z.setVisibility(8);
        } else {
            this.f18644z.setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) this.f18644z.getLayoutParams();
            if (ccVar.m.length() == 1) {
                layoutParams.addRule(7, C7582R.id.icon_container);
            } else {
                layoutParams.addRule(14);
            }
            this.f18644z.setLayoutParams(layoutParams);
        }
        C0259a.m1514a(this.f18643y, this.e);
        if (VERSION.SDK_INT >= 16) {
            this.f18644z.setBackground(this.f18643y);
        } else {
            this.f18644z.setBackgroundDrawable(this.f18643y);
        }
        this.d.setText(ccVar.c);
        this.f18641w.setContentDescription(null);
        this.f18642x.setContentDescription(null);
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
        this.f18640s.setColor(this.e);
        this.f18640s.setStyle(Style.STROKE);
        this.f18640s.setStrokeWidth((float) this.f18635A);
        canvas.drawCircle((float) width, (float) i, (float) (this.g - ((this.f18635A * 2) / 3)), this.f18640s);
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() / 2;
        int i = this.g;
        Object obj = (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) ? 1 : null;
        if (obj != null) {
            this.f18640s.setColor(this.f18637C);
            this.f18640s.setStyle(Style.FILL);
            canvas.drawCircle((float) width, (float) i, (float) this.g, this.f18640s);
            this.f18640s.setColor(this.f18638D);
            this.f18640s.setStyle(Style.STROKE);
            this.f18640s.setStrokeWidth(this.f18636B);
            canvas.drawCircle((float) width, (float) i, (float) this.g, this.f18640s);
        } else if (isFocused()) {
            this.f18640s.setColor(this.f18639E);
            this.f18640s.setStyle(Style.STROKE);
            this.f18640s.setStrokeWidth(this.f18636B);
            canvas.drawCircle((float) width, (float) i, (float) this.g, this.f18640s);
        }
    }

    protected int getPlayStoreUiElementType() {
        return 1805;
    }
}
