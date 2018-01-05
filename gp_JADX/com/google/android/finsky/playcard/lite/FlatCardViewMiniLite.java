package com.google.android.finsky.playcard.lite;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.text.Layout.Alignment;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.finsky.dj.C2823a;
import com.google.android.finsky.playcard.C3893r;
import com.google.android.finsky.playcard.co;
import com.google.android.finsky.playcard.cp;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public class FlatCardViewMiniLite extends C3893r implements co, cp {
    public int f19740a;
    public boolean f19741b;
    public boolean f19742d;
    public Drawable f19743e;
    public Drawable f19744f;
    public boolean f19745g;
    public final C3912c f19746h;
    public final C3913d f19747i;
    public final C3910a f19748j;
    public final C3914e f19749k;
    public final C3911b f19750l;
    public final int f19751m;
    public final int f19752n;
    public final int f19753r;
    public final int f19754s;
    public final int f19755t;
    public final int f19756u;
    public final int f19757v;

    public FlatCardViewMiniLite(Context context) {
        this(context, null);
    }

    public FlatCardViewMiniLite(Context context, AttributeSet attributeSet) {
        int dimensionPixelSize;
        super(context, attributeSet);
        this.f19740a = -1;
        this.f19741b = false;
        Resources resources = context.getResources();
        this.f19740a = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_content_min_height);
        this.f19743e = m18405c(false);
        this.f19744f = m18405c(true);
        this.f19747i = new C3913d(resources, resources.getDimension(C7582R.dimen.flat_mini_card_label_size), this);
        this.f19751m = C0216d.m1116c(context, C7582R.color.flat_card_star_icon_color_dark_theme);
        this.f19752n = C0216d.m1116c(context, C7582R.color.flat_card_subtitle_text_color_dark_theme);
        this.f19753r = C0216d.m1116c(context, C7582R.color.flat_card_subtitle_text_color);
        this.f19754s = C0216d.m1116c(context, C7582R.color.flat_card_title_text_color);
        this.f19755t = C0216d.m1116c(context, C7582R.color.flat_card_title_text_color_dark_theme);
        this.f19756u = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_label_start_margin);
        this.f19757v = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_top_margin);
        this.f19749k = new C3914e(resources, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_rating_bar_text_gap), resources.getDimensionPixelSize(C7582R.dimen.flat_rating_bar_text_size), resources.getDimensionPixelSize(C7582R.dimen.flat_rating_bar_star_height), this);
        this.f19748j = new C3910a(resources, this);
        this.f19750l = new C3911b(resources, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_subtitle_size), resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_subtitle_drawable_margin), this);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_size);
        if (this.q.dj().mo2294a(12632790)) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_card_title_fading_edge_width);
        } else {
            dimensionPixelSize = 0;
        }
        this.f19746h = new C3912c((float) dimensionPixelSize2, (float) dimensionPixelSize, this);
        this.f19749k.m18588a(this.f19753r, this.f19753r);
        this.f19750l.m18580b(this.f19753r);
        this.f19746h.m18583a(this.f19754s);
        setWillNotDraw(false);
    }

    public void setTitleVisibility(int i) {
        C3912c c3912c = this.f19746h;
        if (c3912c.f19798o != i) {
            c3912c.f19798o = i;
            c3912c.f19788e.requestLayout();
            c3912c.f19788e.invalidate();
        }
    }

    public void setTitleText(CharSequence charSequence) {
        C3912c c3912c = this.f19746h;
        if (charSequence == null) {
            charSequence = "";
        }
        if (!c3912c.f19789f.equals(charSequence)) {
            c3912c.f19789f = charSequence;
            c3912c.f19790g = null;
            c3912c.f19791h = null;
            c3912c.f19788e.requestLayout();
            c3912c.f19788e.invalidate();
        }
    }

    public void setTitleContentDescription(String str) {
        this.f19746h.f19799p = str;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.q.dj().mo2294a(12631598)) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_side_padding_v2);
            setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        }
        this.af.setImageDrawable(this.f19743e);
    }

    public C3913d getLabelDelegate() {
        return this.f19747i;
    }

    public C3914e getRatingBarDelegate() {
        return this.f19749k;
    }

    public C3911b getSubtitleDelegate() {
        return this.f19750l;
    }

    public final boolean m18574c() {
        return true;
    }

    public void setAdLabelVisibility(int i) {
        C3910a c3910a = this.f19748j;
        if (c3910a.f19767j != i) {
            c3910a.f19767j = i;
            c3910a.f19765h.requestLayout();
            c3910a.f19765h.invalidate();
        }
    }

    public void setAdLabelText(CharSequence charSequence) {
        C3910a c3910a = this.f19748j;
        c3910a.f19768k = charSequence;
        c3910a.f19765h.requestLayout();
        c3910a.f19765h.invalidate();
    }

    public void setAdLabelBackgroundTint(int i) {
        C3910a c3910a = this.f19748j;
        C0259a.m1514a(c3910a.f19759b, i);
        c3910a.f19765h.invalidate();
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f19748j.f19767j == 0) {
            C3910a c3910a = this.f19748j;
            c3910a.f19758a.draw(canvas);
            c3910a.f19759b.draw(canvas);
            canvas.drawText(c3910a.f19768k, 0, c3910a.f19768k.length(), c3910a.f19769l, c3910a.f19770m, c3910a.f19760c);
        }
    }

    public void onDraw(Canvas canvas) {
        float f = 0.0f;
        if (this.al.getVisibility() == 8) {
            float f2;
            if (this.f19746h.f19798o == 0) {
                C3912c c3912c = this.f19746h;
                if (c3912c.f19790g != null) {
                    int width = c3912c.f19790g.getWidth();
                    if (c3912c.f19794k == -1) {
                        if (!(c3912c.f19796m == 0.0f && c3912c.f19797n == 1 && c3912c.f19802s == ((float) width))) {
                            c3912c.f19796m = 0.0f;
                            c3912c.f19797n = 1;
                            c3912c.f19802s = (float) width;
                            c3912c.m18582a(0.0f, 1, (float) width, c3912c.f19792i);
                        }
                        canvas.translate(c3912c.f19800q, c3912c.f19801r);
                        c3912c.f19790g.draw(canvas);
                        canvas.translate(-c3912c.f19800q, -c3912c.f19801r);
                    } else {
                        if (c3912c.f19794k != 0) {
                            canvas.save();
                            canvas.translate(c3912c.f19800q, c3912c.f19801r);
                            canvas.clipRect(0, 0, width, c3912c.f19794k);
                            c3912c.f19790g.draw(canvas);
                            canvas.restore();
                        }
                        int paragraphDirection = c3912c.f19791h.getParagraphDirection(0);
                        if (paragraphDirection != 1) {
                            f = (float) (16777216 - width);
                        }
                        if (!(c3912c.f19796m == f && c3912c.f19797n == paragraphDirection && c3912c.f19802s == ((float) width))) {
                            c3912c.f19796m = f;
                            c3912c.f19797n = paragraphDirection;
                            c3912c.f19802s = (float) width;
                            c3912c.m18582a(f, paragraphDirection, (float) width, c3912c.f19792i);
                        }
                        f = c3912c.f19800q - f;
                        f2 = c3912c.f19801r + ((float) c3912c.f19794k);
                        canvas.translate(f, f2);
                        c3912c.f19791h.draw(canvas);
                        canvas.translate(-f, -f2);
                    }
                }
            }
            if (this.f19747i.getVisibility() == 0) {
                C3913d c3913d = this.f19747i;
                if (c3913d.f19815m != null) {
                    c3913d.f19815m.draw(canvas);
                }
                if (c3913d.f19820r) {
                    canvas.drawText(c3913d.f19817o, (float) c3913d.f19819q, (float) c3913d.f19821s, c3913d.f19812j);
                }
                if (c3913d.f19818p != null) {
                    canvas.drawText(c3913d.f19818p, (float) c3913d.f19822t, (float) c3913d.f19821s, c3913d.f19813k);
                }
            }
            if (this.f19749k.f19836n == 0) {
                C3914e c3914e = this.f19749k;
                canvas.drawText(c3914e.f19834l, (float) c3914e.f19837o, (float) (c3914e.f19838p + c3914e.f19831i), c3914e.f19829g);
                float f3 = ((((float) c3914e.f19837o) + c3914e.f19824b) + c3914e.f19835m) + (2.0f * c3914e.f19823a);
                f2 = (((float) ((c3914e.f19838p + Math.max(c3914e.f19830h, c3914e.f19825c)) - (c3914e.f19830h / 2))) + c3914e.f19826d) - c3914e.f19824b;
                canvas.translate(f3, f2);
                canvas.drawPath(c3914e.f19827e, c3914e.f19828f);
                canvas.translate(-f3, -f2);
            }
            if (this.f19750l.f19776f == 0) {
                C3911b c3911b = this.f19750l;
                canvas.translate((float) c3911b.f19781k, (float) c3911b.f19782l);
                c3911b.f19780j.draw(canvas);
                canvas.translate((float) (-c3911b.f19781k), (float) (-c3911b.f19782l));
                if (c3911b.f19783m != null) {
                    Bitmap b = c3911b.f19783m.b();
                    if (b != null) {
                        canvas.drawBitmap(b, null, c3911b.f19774d, c3911b.f19772b);
                    }
                }
            }
        }
    }

    public void setTitleMaxLines(int i) {
        if (this.f19746h.f19793j != i) {
            C3912c c3912c = this.f19746h;
            if (c3912c.f19793j != i) {
                c3912c.f19793j = i;
                c3912c.f19790g = null;
                c3912c.f19791h = null;
            }
        }
    }

    public void setAlwaysShowSubtitle(boolean z) {
        this.f19741b = z;
    }

    private final int m18572f() {
        if (this.f19740a == -1) {
            this.f19740a = getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_content_min_height);
        }
        return this.f19740a;
    }

    public void setIsPartOfMixedContentCluster(boolean z) {
        this.f19742d = z;
    }

    private static boolean m18571b(int i) {
        return i <= 1;
    }

    public final boolean at_() {
        if (m18571b(this.f19746h.f19793j)) {
            return true;
        }
        return super.at_();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m18573a(int r5) {
        /*
        r4 = this;
        r1 = android.view.View.MeasureSpec.getSize(r5);
        r0 = r4.U;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r2 = r4.U;
        r2 = r2.getVisibility();
        r3 = 8;
        if (r2 == r3) goto L_0x0051;
    L_0x0016:
        r2 = r4.getPaddingTop();
        r1 = r1 - r2;
        r2 = r4.getPaddingBottom();
        r1 = r1 - r2;
        r2 = r0.topMargin;
        r1 = r1 - r2;
        r2 = r0.bottomMargin;
        r1 = r1 - r2;
        r2 = r4.m18572f();
        r1 = r1 - r2;
        r0.height = r1;
        r2 = r4.am;
        r1 = r4.U;
        r1 = r1.getImageView();
        r3 = r1 instanceof com.google.android.finsky.detailscomponents.DocImageView;
        if (r3 == 0) goto L_0x0055;
    L_0x0039:
        r1 = (com.google.android.finsky.detailscomponents.DocImageView) r1;
        r1 = r1.getAspectRatio();
        r3 = java.lang.Float.isNaN(r1);
        if (r3 != 0) goto L_0x0055;
    L_0x0045:
        r2 = r0.height;
        r2 = (float) r2;
        r1 = r2 / r1;
        r1 = java.lang.Math.round(r1);
        r0.width = r1;
    L_0x0050:
        return;
    L_0x0051:
        r1 = 0;
        r0.width = r1;
        goto L_0x0050;
    L_0x0055:
        r1 = r2;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.playcard.lite.FlatCardViewMiniLite.a(int):void");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
            CharSequence stringBuilder = new StringBuilder();
            if (this.f19748j.f19767j == 0) {
                stringBuilder.append(this.f19748j.f19768k).append('\n');
            }
            if (this.f19746h.f19798o == 0) {
                stringBuilder.append(this.f19746h.f19799p).append('\n');
            }
            if (this.f19750l.f19776f == 0 && this.f19750l.f19779i) {
                CharSequence charSequence = this.f19750l.f19778h;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = this.f19750l.getText();
                }
                stringBuilder.append(charSequence).append('\n');
            }
            if (this.f19749k.f19836n == 0) {
                C3914e c3914e = this.f19749k;
                Resources resources = getResources();
                if (c3914e.f19840r == null) {
                    Locale locale;
                    if (c3914e.f19839q == null) {
                        c3914e.f19839q = resources.getString(C7582R.string.play_star_rating_content_description);
                    }
                    if (VERSION.SDK_INT < 24) {
                        locale = resources.getConfiguration().locale;
                    } else {
                        locale = resources.getConfiguration().getLocales().get(0);
                    }
                    c3914e.f19840r = String.format(locale, c3914e.f19839q, new Object[]{c3914e.f19834l});
                }
                stringBuilder.append(c3914e.f19840r).append('\n');
            }
            if (this.f19747i.getVisibility() == 0) {
                stringBuilder.append(this.f19747i.f19811i).append('\n');
            }
            accessibilityNodeInfo.setContentDescription(stringBuilder);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        if (this.f19742d) {
            a(i2);
        } else {
            c(i);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int i4 = marginLayoutParams.height;
        int f = ((m18572f() + i4) + getPaddingTop()) + getPaddingBottom();
        if (mode != MemoryMappedFileBuffer.DEFAULT_SIZE || size <= 0) {
            size = f;
        }
        f = getPaddingLeft();
        mode = getPaddingRight();
        if (this.f19742d) {
            i3 = (marginLayoutParams.width + f) + mode;
        } else {
            i3 = MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, size);
        if (this.al.getVisibility() != 8) {
            this.al.measure(0, 0);
            return;
        }
        Object obj;
        Object obj2;
        int i5 = (i3 - f) - mode;
        this.U.measure(MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.f19748j.f19767j != 8) {
            C3910a c3910a = this.f19748j;
            c3910a.f19766i = (Math.round(c3910a.f19760c.measureText(c3910a.f19768k, 0, c3910a.f19768k.length())) + c3910a.f19761d) + (c3910a.f19762e * 2);
        }
        if (this.f19747i.getVisibility() != 8) {
            C3913d c3913d = this.f19747i;
            c3913d.f19820r = false;
            obj = c3913d.f19818p != null ? 1 : null;
            obj2 = c3913d.f19817o != null ? 1 : null;
            if (c3913d.f19815m != null) {
                c3913d.f19809g = c3913d.f19815m.getIntrinsicWidth();
                if (!(obj == null && obj2 == null)) {
                    c3913d.f19809g += c3913d.f19806d;
                }
                c3913d.f19810h = Math.max(c3913d.f19804b, c3913d.f19815m.getIntrinsicHeight());
            } else {
                c3913d.f19809g = 0;
                c3913d.f19810h = c3913d.f19804b;
            }
            if (obj != null) {
                c3913d.f19808f = (int) c3913d.f19813k.measureText(c3913d.f19818p);
                c3913d.f19809g += c3913d.f19808f;
            } else {
                c3913d.f19808f = 0;
            }
            if (obj2 != null) {
                c3913d.f19807e = (int) c3913d.f19812j.measureText(c3913d.f19817o);
                i3 = (obj != null ? c3913d.f19805c : 0) + c3913d.f19807e;
                if (c3913d.f19809g + i3 <= i5) {
                    c3913d.f19809g = i3 + c3913d.f19809g;
                    c3913d.f19820r = true;
                } else {
                    c3913d.f19820r = false;
                }
            } else {
                c3913d.f19807e = 0;
            }
        }
        int i6 = this.f19747i.f19809g;
        marginLayoutParams = (MarginLayoutParams) this.af.getLayoutParams();
        this.af.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.af.getVisibility() != 8) {
            i3 = Math.max(0, (C0361r.m2051b(marginLayoutParams) + this.af.getMeasuredWidth()) - getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_overflow_overlap));
        } else {
            i3 = 0;
        }
        i4 = i5 - i3;
        obj = ai.f1848a.mo400k(this) == 0 ? 1 : null;
        C3912c c3912c = this.f19746h;
        f = c3912c.f19789f.length();
        if (f == 0) {
            c3912c.f19790g = null;
            c3912c.f19791h = null;
        } else {
            TruncateAt truncateAt;
            if (c3912c.f19795l == 0.0f) {
                truncateAt = TruncateAt.END;
            } else {
                truncateAt = null;
            }
            Alignment alignment = obj != null ? C3912c.f19784a : C3912c.f19785b;
            if (!(c3912c.f19790g != null && c3912c.f19790g.getWidth() == i4 && c3912c.f19790g.getAlignment() == alignment)) {
                c3912c.f19790g = C2823a.m14945a(c3912c.f19789f, 0, f, c3912c.f19786c, i4, alignment, true, truncateAt, c3912c.f19793j);
            }
            if (truncateAt == null) {
                i3 = c3912c.f19790g.getLineCount();
                if (i3 == c3912c.f19793j && c3912c.f19790g.getLineEnd(i3 - 1) != f) {
                    i3--;
                    c3912c.f19794k = c3912c.f19790g.getLineTop(i3);
                    c3912c.f19791h = C2823a.m14945a(c3912c.f19789f, c3912c.f19790g.getLineStart(i3), f, c3912c.f19787d, 16777216, Alignment.ALIGN_NORMAL, false, null, 1);
                }
            }
            c3912c.f19794k = -1;
            c3912c.f19791h = null;
        }
        obj = this.f19750l.f19776f != 8 ? 1 : null;
        obj2 = this.f19749k.f19836n != 8 ? 1 : null;
        f = this.f19746h.m18581a();
        if (obj != null && m18571b(f)) {
            this.f19750l.m18577a(i5);
            obj = null;
        }
        f = (i5 - this.f19756u) - i6;
        if (obj != null) {
            if (this.f19741b || f >= i5 / 2) {
                this.f19750l.m18577a(f);
                obj = null;
            }
        } else if (obj2 != null) {
            C3914e c3914e = this.f19749k;
            c3914e.f19835m = c3914e.f19829g.measureText(c3914e.f19834l);
            if (this.f19749k.m18587a() <= f) {
                obj2 = null;
            }
        }
        if (obj != null) {
            this.f19750l.setVisibility(4);
        }
        if (obj2 != null) {
            this.f19749k.setVisibility(4);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        if (this.al.getVisibility() != 8) {
            int measuredWidth = ((((width - l) - m) - this.al.getMeasuredWidth()) / 2) + l;
            int measuredHeight = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
            this.al.layout(measuredWidth, measuredHeight, this.al.getMeasuredWidth() + measuredWidth, this.al.getMeasuredHeight() + measuredHeight);
            return;
        }
        boolean z2;
        int i5;
        int i6;
        if (ai.f1848a.mo400k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.af.getLayoutParams();
        int measuredWidth2 = this.U.getMeasuredWidth();
        int measuredHeight2 = this.U.getMeasuredHeight();
        int a = k.a(width, measuredWidth2, z2, l);
        this.U.layout(a, paddingTop, measuredWidth2 + a, paddingTop + measuredHeight2);
        if (this.f19748j.f19767j != 8) {
            int paddingTop2 = ((paddingTop + measuredHeight2) - (this.ax ? 0 : this.U.getPaddingTop())) - this.f19748j.m18575a();
            measuredWidth2 = ai.f1848a.mo401l(this.U) + l;
            if (!z2) {
                measuredWidth2 = width - measuredWidth2;
            }
            C3910a c3910a = this.f19748j;
            int a2 = paddingTop2 + c3910a.m18575a();
            if (z2) {
                i5 = measuredWidth2 + c3910a.f19766i;
                i6 = measuredWidth2;
                int i7 = measuredWidth2;
                measuredWidth2 = i5 - c3910a.f19761d;
                a = i7;
            } else {
                i5 = measuredWidth2 - c3910a.f19766i;
                a = c3910a.f19761d + i5;
                i6 = i5;
                i5 = measuredWidth2;
            }
            c3910a.f19758a.setBounds(i6, paddingTop2, i5, a2);
            i5 = c3910a.f19761d + paddingTop2;
            c3910a.f19759b.setBounds(a, i5, measuredWidth2, a2);
            c3910a.f19769l = (float) (c3910a.f19762e + a);
            c3910a.f19770m = (float) (c3910a.f19763f + i5);
        }
        C3912c c3912c = this.f19746h;
        if (c3912c.f19790g == null) {
            measuredWidth2 = 0;
        } else {
            measuredWidth2 = c3912c.f19790g.getWidth();
        }
        i5 = this.f19757v + (paddingTop + measuredHeight2);
        measuredWidth2 = k.a(width, measuredWidth2, z2, l);
        C3912c c3912c2 = this.f19746h;
        c3912c2.f19800q = (float) measuredWidth2;
        c3912c2.f19801r = (float) i5;
        measuredWidth2 = C0361r.m2051b(marginLayoutParams);
        a = this.af.getMeasuredWidth();
        measuredWidth = marginLayoutParams.topMargin + i5;
        measuredWidth2 = k.b(width, a, z2, measuredWidth2 + m);
        this.af.layout(measuredWidth2, measuredWidth, a + measuredWidth2, this.af.getMeasuredHeight() + measuredWidth);
        i6 = this.f19747i.f19810h;
        paddingTop = height - paddingBottom;
        paddingBottom = paddingTop - i6;
        if (z2) {
            measuredWidth = (width - this.f19747i.f19809g) - m;
        } else {
            measuredWidth = this.f19747i.f19809g + m;
        }
        C3913d c3913d = this.f19747i;
        if (c3913d.f19815m != null) {
            a = c3913d.f19815m.getIntrinsicWidth();
            height = c3913d.f19815m.getIntrinsicHeight();
            if (z2) {
                measuredWidth2 = measuredWidth + a;
                a = (a + c3913d.f19806d) + measuredWidth;
                i7 = measuredWidth2;
                measuredWidth2 = measuredWidth;
                measuredWidth = i7;
            } else {
                measuredWidth2 = measuredWidth - a;
                a = measuredWidth - (a + c3913d.f19806d);
            }
            measuredHeight2 = ((c3913d.f19810h - height) / 2) + paddingBottom;
            c3913d.f19815m.setBounds(measuredWidth2, measuredHeight2, measuredWidth, height + measuredHeight2);
        } else {
            a = measuredWidth;
        }
        if (!c3913d.f19820r) {
            measuredWidth = a;
            a = 0;
        } else if (z2) {
            measuredWidth = (c3913d.f19807e + c3913d.f19805c) + a;
        } else {
            measuredWidth = a - (c3913d.f19807e + c3913d.f19805c);
            a -= c3913d.f19807e;
        }
        if (!z2) {
            measuredWidth -= c3913d.f19808f;
        }
        c3913d.f19819q = a;
        c3913d.f19821s = c3913d.f19803a + paddingBottom;
        c3913d.f19822t = measuredWidth;
        m = this.f19747i.f19803a;
        if (this.f19750l.f19776f == 0) {
            measuredWidth = z2 ? l : width - l;
            if (m18571b(this.f19746h.m18581a())) {
                c3912c = this.f19746h;
                if (c3912c.f19790g == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = c3912c.f19790g.getHeight();
                }
                measuredWidth2 += i5;
            } else {
                measuredWidth2 = ((paddingTop - i6) + m) - this.f19750l.f19780j.getLineBaseline(0);
            }
            C3911b c3911b = this.f19750l;
            if (z2) {
                c3911b.f19781k = measuredWidth;
            } else {
                c3911b.f19781k = measuredWidth - c3911b.f19780j.getWidth();
            }
            c3911b.f19782l = measuredWidth2;
            if (c3911b.f19783m != null) {
                i6 = c3911b.f19783m.d();
                if (z2) {
                    a = c3911b.f19775e + (measuredWidth + c3911b.f19780j.getWidth());
                    measuredWidth = a + i6;
                } else {
                    measuredWidth = (measuredWidth - c3911b.f19780j.getWidth()) - c3911b.f19775e;
                    a = measuredWidth - i6;
                }
                c3911b.f19774d.set(a, measuredWidth2, measuredWidth, i6 + measuredWidth2);
            }
        }
        if (this.f19749k.f19836n == 0) {
            if (!z2) {
                l = (width - l) - this.f19749k.m18587a();
            }
            measuredWidth = (paddingBottom + m) - this.f19749k.f19831i;
            C3914e c3914e = this.f19749k;
            c3914e.f19837o = l;
            c3914e.f19838p = measuredWidth;
        }
        e();
    }

    public int getCardType() {
        return 30;
    }

    public void setUseDarkTheme(boolean z) {
        if (this.f19745g != z) {
            this.f19745g = z;
            this.af.setImageDrawable(z ? this.f19744f : this.f19743e);
            if (z) {
                this.f19749k.m18588a(this.f19751m, this.f19752n);
                this.f19750l.m18580b(this.f19752n);
                this.f19746h.m18583a(this.f19755t);
                return;
            }
            this.f19749k.m18588a(this.f19753r, this.f19753r);
            this.f19750l.m18580b(this.f19753r);
            this.f19746h.m18583a(this.f19754s);
        }
    }

    public boolean getUseDarkTheme() {
        return this.f19745g;
    }
}
