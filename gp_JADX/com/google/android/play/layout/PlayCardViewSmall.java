package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.play.e;
import com.google.android.play.g;
import com.google.android.play.utils.C6452k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PlayCardViewSmall extends C6388d {
    public int f32197d;
    public View f32198e;
    public View f32199f;
    public int f32200g;
    public final int f32201h;
    public int f32202i;

    public PlayCardViewSmall(Context context) {
        this(context, null);
    }

    public PlayCardViewSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32197d = 1;
        this.f32200g = -1;
        Resources resources = context.getResources();
        this.f32200g = resources.getDimensionPixelSize(e.play_small_card_content_min_height);
        this.f32201h = resources.getDimensionPixelSize(e.play_card_extra_vspace);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32198e = findViewById(g.rating_badge_container);
        this.f32199f = findViewById(g.li_ad_label_container);
    }

    private final boolean m29314b(int i) {
        return (this.f32197d & i) != 0;
    }

    public void setTextContentFlags(int i) {
        boolean z = true;
        if (i != this.f32197d) {
            this.f32197d = i;
            boolean b = m29314b(2);
            this.at = !b;
            int i2 = b ? 1 : m29314b(4) ? 3 : 2;
            if (m29314b(8)) {
                i2++;
            }
            TextView textView = this.V;
            if (i2 != 1) {
                z = false;
            }
            textView.setSingleLine(z);
            this.V.setMaxLines(i2);
            this.f32200g = -1;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        Object obj;
        m29309c(i);
        int size = MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i4 = (size - paddingLeft) - paddingRight;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        int mode = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int i5 = paddingTop + marginLayoutParams.height;
        if (this.f32200g == -1) {
            Resources resources = getResources();
            if (m29314b(8)) {
                paddingRight = e.play_small_card_content_min_height_tall;
            } else {
                paddingRight = e.play_small_card_content_min_height;
            }
            this.f32200g = resources.getDimensionPixelSize(paddingRight);
        }
        paddingRight = (Math.max(this.f32200g, i4 / 2) + i5) + paddingBottom;
        if (mode != MemoryMappedFileBuffer.DEFAULT_SIZE || size2 <= 0) {
            i3 = paddingRight;
        } else {
            i3 = size2;
        }
        int i6 = (i4 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        this.U.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ah.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.f32198e.getLayoutParams();
        MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.ak.getLayoutParams();
        if (this.f32199f != null) {
            if (this.W == null || this.W.getVisibility() == 8) {
                this.f32199f.setVisibility(8);
            } else {
                this.f32199f.setVisibility(0);
                this.f32199f.measure(MeasureSpec.makeMeasureSpec((i6 - this.U.getPaddingLeft()) - this.U.getPaddingRight(), Integer.MIN_VALUE), 0);
            }
        }
        this.ah.measure(MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams4.leftMargin) - marginLayoutParams4.rightMargin, Integer.MIN_VALUE), 0);
        int measuredWidth = (this.ah.getMeasuredWidth() + marginLayoutParams4.leftMargin) + marginLayoutParams4.rightMargin;
        int b = r.b(marginLayoutParams2);
        if (this.af != null) {
            this.af.measure(0, 0);
            MarginLayoutParams marginLayoutParams7 = (MarginLayoutParams) this.af.getLayoutParams();
            if (this.af.getVisibility() != 8) {
                i6 = Math.max(b, marginLayoutParams7.rightMargin + (this.af.getMeasuredWidth() + marginLayoutParams7.leftMargin));
                this.V.measure(MeasureSpec.makeMeasureSpec((i4 - r.a(marginLayoutParams2)) - i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                if (this.al.getVisibility() == 0) {
                    this.f32198e.measure(MeasureSpec.makeMeasureSpec(Math.max(0, ((i4 - measuredWidth) - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin), Integer.MIN_VALUE), 0);
                    obj = m29314b(2) ? 1 : null;
                    if (this.ab.getVisibility() != 8) {
                        if (obj == null) {
                            i6 = (i4 - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin;
                        } else {
                            i6 = (i4 - marginLayoutParams3.leftMargin) - measuredWidth;
                        }
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        if (m29314b(16)) {
                            this.ab.measure(0, 0);
                            if (this.ab.getMeasuredWidth() > i6) {
                                this.ab.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                            }
                        } else {
                            this.ab.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                        }
                    }
                    if (this.ak.getVisibility() != 8) {
                        this.ak.measure(MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams6.leftMargin) - marginLayoutParams6.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MemoryMappedFileBuffer.DEFAULT_SIZE);
                    }
                    paddingRight = (((marginLayoutParams2.bottomMargin + (marginLayoutParams2.topMargin + this.V.getMeasuredHeight())) + marginLayoutParams3.topMargin) + this.ab.getMeasuredHeight()) + marginLayoutParams3.bottomMargin;
                    if (obj != null) {
                        paddingRight += (marginLayoutParams4.topMargin + this.ah.getMeasuredHeight()) + marginLayoutParams4.bottomMargin;
                    } else if (this.ak.getVisibility() != 8) {
                        paddingRight += (marginLayoutParams6.topMargin + this.ak.getMeasuredHeight()) + marginLayoutParams6.bottomMargin;
                    }
                    paddingLeft = (((i3 - paddingTop) - paddingBottom) - marginLayoutParams.height) - paddingRight;
                    if (paddingLeft > 0) {
                        paddingLeft /= 2;
                    } else {
                        paddingLeft = Math.min(paddingLeft / 4, this.f32201h);
                    }
                    this.f32202i = paddingLeft;
                } else {
                    this.f32202i = 0;
                }
                this.al.measure(0, 0);
                setMeasuredDimension(size, i3);
            }
        }
        i6 = b;
        this.V.measure(MeasureSpec.makeMeasureSpec((i4 - r.a(marginLayoutParams2)) - i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        if (this.al.getVisibility() == 0) {
            this.f32202i = 0;
        } else {
            this.f32198e.measure(MeasureSpec.makeMeasureSpec(Math.max(0, ((i4 - measuredWidth) - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin), Integer.MIN_VALUE), 0);
            if (m29314b(2)) {
            }
            if (this.ab.getVisibility() != 8) {
                if (obj == null) {
                    i6 = (i4 - marginLayoutParams3.leftMargin) - measuredWidth;
                } else {
                    i6 = (i4 - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                if (m29314b(16)) {
                    this.ab.measure(0, 0);
                    if (this.ab.getMeasuredWidth() > i6) {
                        this.ab.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                    }
                } else {
                    this.ab.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                }
            }
            if (this.ak.getVisibility() != 8) {
                this.ak.measure(MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams6.leftMargin) - marginLayoutParams6.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MemoryMappedFileBuffer.DEFAULT_SIZE);
            }
            paddingRight = (((marginLayoutParams2.bottomMargin + (marginLayoutParams2.topMargin + this.V.getMeasuredHeight())) + marginLayoutParams3.topMargin) + this.ab.getMeasuredHeight()) + marginLayoutParams3.bottomMargin;
            if (obj != null) {
                paddingRight += (marginLayoutParams4.topMargin + this.ah.getMeasuredHeight()) + marginLayoutParams4.bottomMargin;
            } else if (this.ak.getVisibility() != 8) {
                paddingRight += (marginLayoutParams6.topMargin + this.ak.getMeasuredHeight()) + marginLayoutParams6.bottomMargin;
            }
            paddingLeft = (((i3 - paddingTop) - paddingBottom) - marginLayoutParams.height) - paddingRight;
            if (paddingLeft > 0) {
                paddingLeft = Math.min(paddingLeft / 4, this.f32201h);
            } else {
                paddingLeft /= 2;
            }
            this.f32202i = paddingLeft;
        }
        this.al.measure(0, 0);
        setMeasuredDimension(size, i3);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        int a;
        if (ai.a.k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int l = ai.a.l(this);
        int m = ai.a.m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.U.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.f32198e.getLayoutParams();
        MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.ah.getLayoutParams();
        if (this.af != null) {
            marginLayoutParams = (MarginLayoutParams) this.af.getLayoutParams();
        } else {
            marginLayoutParams = null;
        }
        MarginLayoutParams marginLayoutParams7 = (MarginLayoutParams) this.ak.getLayoutParams();
        int measuredWidth = this.U.getMeasuredWidth();
        int a2 = r.a(marginLayoutParams2);
        int measuredHeight = this.U.getMeasuredHeight();
        int a3 = C6452k.m29502a(width, measuredWidth, z2, l + a2);
        this.U.layout(a3, marginLayoutParams2.topMargin + paddingTop, measuredWidth + a3, (marginLayoutParams2.topMargin + paddingTop) + measuredHeight);
        if (!(this.f32199f == null || this.f32199f.getVisibility() == 8)) {
            measuredWidth = this.f32199f.getMeasuredWidth();
            a3 = ai.a.l(this.U);
            i5 = paddingTop + measuredHeight;
            if (this.ax) {
                i6 = 0;
            } else {
                i6 = this.U.getPaddingTop();
            }
            i6 = (i5 - i6) - this.f32199f.getMeasuredHeight();
            a2 = C6452k.m29502a(width, measuredWidth, z2, a2 + (a3 + l));
            this.f32199f.layout(a2, i6, measuredWidth + a2, this.f32199f.getMeasuredHeight() + i6);
        }
        i6 = this.V.getMeasuredWidth();
        a2 = ((paddingTop + measuredHeight) + marginLayoutParams3.topMargin) + this.f32202i;
        measuredWidth = C6452k.m29502a(width, i6, z2, r.a(marginLayoutParams3) + l);
        measuredHeight = this.V.getMeasuredHeight();
        this.V.layout(measuredWidth, a2, i6 + measuredWidth, a2 + measuredHeight);
        if (!(this.af == null || this.af.getVisibility() == 8)) {
            i6 = this.af.getMeasuredWidth();
            measuredWidth = r.b(marginLayoutParams);
            i7 = marginLayoutParams.topMargin + a2;
            measuredWidth = C6452k.m29506b(width, i6, z2, measuredWidth + m);
            this.af.layout(measuredWidth, i7, i6 + measuredWidth, this.af.getMeasuredHeight() + i7);
        }
        measuredWidth = Math.max(this.f32202i, 0);
        Object obj = !m29314b(2) ? 1 : null;
        a3 = this.ah.getMeasuredWidth();
        i5 = this.ah.getMeasuredHeight();
        if (obj != null) {
            i7 = (((height - paddingBottom) - marginLayoutParams6.bottomMargin) - i5) - this.f32202i;
        } else {
            i7 = (this.V.getBottom() + marginLayoutParams6.topMargin) + measuredWidth;
        }
        int b = C6452k.m29506b(width, a3, z2, r.b(marginLayoutParams6) + m);
        this.ah.layout(b, i7, a3 + b, i5 + i7);
        if (this.ab.getVisibility() != 8) {
            b = this.ab.getMeasuredWidth();
            a3 = r.a(marginLayoutParams4);
            if (obj != null) {
                i6 = (((a2 + measuredHeight) + marginLayoutParams3.bottomMargin) + marginLayoutParams4.topMargin) + measuredWidth;
            } else {
                i6 = (this.ah.getBaseline() + i7) - this.ab.getBaseline();
            }
            a = C6452k.m29502a(width, b, z2, l + a3);
            this.ab.layout(a, i6, b + a, this.ab.getMeasuredHeight() + i6);
        }
        if (this.f32198e.getVisibility() != 8) {
            int baseline = (this.ah.getBaseline() + i7) - this.f32198e.getBaseline();
            i6 = C6452k.m29502a(width, this.f32198e.getMeasuredWidth(), z2, r.a(marginLayoutParams5) + l);
            this.f32198e.layout(i6, baseline, this.f32198e.getMeasuredWidth() + i6, this.f32198e.getMeasuredHeight() + baseline);
        }
        if (this.ak.getVisibility() != 8) {
            i6 = this.ak.getMeasuredWidth();
            baseline = ((height - paddingBottom) - marginLayoutParams7.bottomMargin) - this.f32202i;
            a = C6452k.m29502a(width, i6, z2, r.a(marginLayoutParams7) + l);
            this.ak.layout(a, baseline - this.ak.getMeasuredHeight(), i6 + a, baseline);
        }
        i6 = ((((width - l) - m) - this.al.getMeasuredWidth()) / 2) + l;
        a = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
        this.al.layout(i6, a, this.al.getMeasuredWidth() + i6, this.al.getMeasuredHeight() + a);
        m29312e();
    }

    public int getCardType() {
        return 1;
    }
}
