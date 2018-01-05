package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.C6383k;
import com.google.android.play.b.i;
import com.google.android.play.b.j;
import com.google.android.play.d;
import com.google.android.play.e;
import com.google.android.play.g;
import com.google.android.play.utils.C6451j;

public abstract class C6388d extends C6387b {
    public static final boolean f32183P = (VERSION.SDK_INT <= 13);
    public final int F_;
    public Object f32184Q;
    public int f32185R;
    public Object f32186S;
    public boolean f32187T;
    public PlayCardThumbnail f32188U;
    public TextView f32189V;
    public TextView f32190W;
    public TextView aa;
    public PlayTextView ab;
    public PlayTextView ac;
    public StarRatingBar ad;
    public PlayTextView ae;
    public ImageView af;
    public TextView ag;
    public PlayCardLabelView ah;
    public PlayTextView ai;
    public PlayCardSnippet aj;
    public PlayCardSnippet ak;
    public View al;
    public float am;
    public final int an;
    public final Rect ao;
    public final Rect ap;
    public boolean aq;
    public Drawable ar;
    public final boolean as;
    public boolean at;
    public final int au;
    public final int av;
    public final int aw;
    public boolean ax;
    public boolean ay;

    public C6388d(Context context) {
        this(context, null, 0);
    }

    public abstract int getCardType();

    public C6388d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6388d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.an = context.getResources().getDimensionPixelSize(e.play_card_overflow_touch_extend);
        this.ao = new Rect();
        this.ap = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlayCardBaseView);
        this.as = obtainStyledAttributes.getBoolean(C6383k.PlayCardBaseView_card_show_inline_creator_badge, false);
        this.at = obtainStyledAttributes.getBoolean(C6383k.PlayCardBaseView_card_supports_subtitle_and_rating, false);
        this.au = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlayCardBaseView_card_text_only_snippet_margin_left, context.getResources().getDimensionPixelSize(e.play_card_snippet_text_extra_margin_left));
        this.av = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlayCardBaseView_card_avatar_snippet_margin_left, 0);
        this.aw = obtainStyledAttributes.getInt(C6383k.PlayCardBaseView_card_owned_status_rendering_type, 1);
        obtainStyledAttributes.recycle();
        this.F_ = context.getResources().getDimensionPixelSize(e.play_card_default_inset);
        m29305a(this.F_, this.F_, this.F_, this.F_);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6391e.f32243b.m29325a(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6391e.f32243b.m29327b(this);
    }

    public i getCardViewGroupDelegate() {
        return j.a;
    }

    public void setBackgroundColor(int i) {
        getCardViewGroupDelegate().a(this, i);
    }

    public void setBackgroundResource(int i) {
        getCardViewGroupDelegate().b(this, i);
    }

    public Object getData() {
        return this.f32184Q;
    }

    public void setLoggingData(Object obj) {
        this.f32186S = obj;
    }

    public Object getLoggingData() {
        return this.f32186S;
    }

    public PlayCardThumbnail getThumbnail() {
        return this.f32188U;
    }

    public TextView getTitle() {
        return this.f32189V;
    }

    public final void m29306a(float f) {
        this.f32189V.setTextSize(0, f);
    }

    public void setTitleContentDescription(String str) {
        this.f32189V.setContentDescription(str);
    }

    public void setTitleVisibility(int i) {
        this.f32189V.setVisibility(i);
    }

    public void setTitleText(CharSequence charSequence) {
        this.f32189V.setText(charSequence);
    }

    public TextView getAdLabel() {
        return this.f32190W;
    }

    public boolean m29310c() {
        return this.f32190W != null;
    }

    public void setAdLabelVisibility(int i) {
        this.f32190W.setVisibility(i);
    }

    public void setAdLabelText(CharSequence charSequence) {
        this.f32190W.setText(charSequence);
    }

    public void setAdLabelBackgroundTint(int i) {
        a.a(this.f32190W.getBackground(), i);
    }

    public TextView getAdCreative() {
        return this.aa;
    }

    public PlayTextView getSubtitle() {
        return this.ab;
    }

    public C6390a getSubtitleDelegate() {
        return (C6390a) this.ab;
    }

    public PlayTextView getSubtitle2() {
        return this.ac;
    }

    public StarRatingBar getRatingBar() {
        return this.ad;
    }

    public C6389n getRatingBarDelegate() {
        return this.ad;
    }

    public PlayTextView getItemBadge() {
        return this.ae;
    }

    public TextView getAppSize() {
        return this.ag;
    }

    public PlayCardLabelView getLabel() {
        return this.ah;
    }

    public C6384c getLabelDelegate() {
        return this.ah;
    }

    public PlayTextView getDescription() {
        return this.ai;
    }

    public ImageView getOverflow() {
        return this.af;
    }

    public PlayCardSnippet getSnippet1() {
        return this.aj;
    }

    public PlayCardSnippet getSnippet2() {
        return this.ak;
    }

    public View getLoadingIndicator() {
        return this.al;
    }

    public boolean at_() {
        return this.at;
    }

    public int getOwnershipRenderingType() {
        return this.aw;
    }

    public int getTextOnlySnippetMarginLeft() {
        return this.au;
    }

    public int getAvatarSnippetMarginLeft() {
        return this.av;
    }

    public TextView getRanking() {
        return null;
    }

    public void setDisplayAsDisabled(boolean z) {
        if (this.aq != z) {
            int i;
            this.aq = z;
            if (this.aq) {
                i = 393216;
            } else {
                i = 131072;
            }
            setDescendantFocusability(i);
            invalidate();
        }
    }

    public void setItemOwned(boolean z) {
        this.f32187T = z;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32188U = (PlayCardThumbnail) findViewById(g.li_thumbnail_frame);
        this.f32189V = (TextView) findViewById(g.li_title);
        this.ab = (PlayTextView) findViewById(g.li_subtitle);
        this.ac = (PlayTextView) findViewById(g.li_subtitle_2);
        this.ad = (StarRatingBar) findViewById(g.li_rating);
        this.ae = (PlayTextView) findViewById(g.li_badge);
        this.ai = (PlayTextView) findViewById(g.li_description);
        this.af = (ImageView) findViewById(g.li_overflow);
        this.ag = (TextView) findViewById(g.li_app_size);
        this.ah = (PlayCardLabelView) findViewById(g.li_label);
        this.aj = (PlayCardSnippet) findViewById(g.li_snippet_1);
        this.ak = (PlayCardSnippet) findViewById(g.li_snippet_2);
        this.al = findViewById(g.loading_progress_bar);
        this.f32190W = (TextView) findViewById(g.li_ad_label);
        this.aa = (TextView) findViewById(g.li_ad_creative);
        if (f32183P) {
            setNextFocusRightId(-1);
            if (this.af != null) {
                this.af.setFocusable(false);
                this.af.setNextFocusLeftId(-1);
            }
        }
    }

    public final void m29309c(int i) {
        int size = MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f32188U.getLayoutParams();
        if (this.f32188U.getVisibility() != 8) {
            marginLayoutParams.height = (int) (((float) ((((size - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin)) * this.am);
            if (this.ax) {
                marginLayoutParams.height -= this.f32188U.getAppThumbnailPadding();
                return;
            }
            return;
        }
        marginLayoutParams.height = 0;
    }

    public void m29307a(int i) {
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f32188U.getLayoutParams();
        if (this.f32188U.getVisibility() != 8) {
            marginLayoutParams.width = (int) (((float) ((((size - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin)) / this.am);
        } else {
            marginLayoutParams.width = 0;
        }
    }

    public void setThumbnailAspectRatio(float f) {
        if (this.am != f) {
            this.am = f;
            requestLayout();
        }
    }

    public void setShouldRemoveExtraSpaceOnCard(boolean z) {
        if (this.ax != z) {
            this.ax = z;
            requestLayout();
        }
    }

    public void m29308b() {
        setOnClickListener(null);
        setClickable(false);
        setContentDescription(null);
        this.al.setVisibility(0);
        this.f32189V.setVisibility(8);
        if (this.ab != null) {
            this.ab.setVisibility(8);
        }
        if (this.ac != null) {
            this.ac.setVisibility(8);
        }
        this.f32188U.setVisibility(8);
        if (this.ag != null) {
            this.ag.setVisibility(8);
        }
        if (this.ah != null) {
            this.ah.setVisibility(8);
        }
        if (this.ad != null) {
            this.ad.setVisibility(8);
        }
        if (this.ae != null) {
            this.ae.setVisibility(8);
        }
        if (this.ai != null) {
            this.ai.setVisibility(8);
        }
        if (this.af != null) {
            this.af.setVisibility(8);
        }
        if (this.f32190W != null) {
            this.f32190W.setVisibility(8);
        }
        if (this.aa != null) {
            this.aa.setVisibility(8);
        }
        setVisibility(0);
    }

    public final void m29311d() {
        this.f32188U.setVisibility(8);
        setVisibility(4);
    }

    public void onMeasure(int i, int i2) {
        int i3 = 0;
        super.onMeasure(i, i2);
        if (this.ai != null && this.ai.getVisibility() == 0 && !TextUtils.isEmpty(this.ai.getText())) {
            int measuredHeight = this.ai.getMeasuredHeight();
            Layout layout = this.ai.getLayout();
            if (layout != null) {
                for (int i4 = 0; i4 < layout.getLineCount(); i4++) {
                    if (layout.getLineBottom(i4) > measuredHeight) {
                        PlayTextView playTextView = this.ai;
                        if (i4 < 2) {
                            i3 = 4;
                        }
                        playTextView.setVisibility(i3);
                        return;
                    }
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m29312e();
    }

    public final void m29312e() {
        if (this.af != null && this.af.getVisibility() != 8) {
            this.af.getHitRect(this.ao);
            Rect rect = this.ao;
            rect.top -= this.an;
            rect = this.ao;
            rect.bottom += this.an;
            rect = this.ao;
            rect.left -= this.an;
            rect = this.ao;
            rect.right += this.an;
            if (this.ao.top != this.ap.top || this.ao.bottom != this.ap.bottom || this.ao.left != this.ap.left || this.ao.right != this.ap.right) {
                setTouchDelegate(new C6451j(this.ao, this.af));
                this.ap.set(this.ao);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.aq) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.aq) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.aq) {
            if (this.ar == null) {
                this.ar = new PaintDrawable(getResources().getColor(d.play_dismissed_overlay));
            }
            this.ar.setBounds(0, 0, width, height);
            this.ar.draw(canvas);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z;
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (this.aq && accessibilityEvent.getEventType() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return dispatchPopulateAccessibilityEvent;
        }
        accessibilityEvent.setEnabled(false);
        return true;
    }

    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(!this.aq);
    }

    public void setIsCardWishlistButtonVisible(boolean z) {
        this.ay = z;
    }
}
