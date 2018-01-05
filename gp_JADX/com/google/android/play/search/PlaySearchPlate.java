package com.google.android.play.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.play.g;

public class PlaySearchPlate extends FrameLayout {
    public PlaySearchNavigationButton f32306a;
    public PlaySearchPlateTextContainer f32307b;
    public PlaySearchActionButtonsContainer f32308c;

    public PlaySearchPlate(Context context) {
        this(context, null);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32306a = (PlaySearchNavigationButton) findViewById(g.navigation_button);
        this.f32307b = (PlaySearchPlateTextContainer) findViewById(g.text_container);
        this.f32308c = (PlaySearchActionButtonsContainer) findViewById(g.search_plate_actions_container);
    }

    public void setPlaySearchController(C6420m c6420m) {
        this.f32306a.setPlaySearchController(c6420m);
        this.f32307b.setPlaySearchController(c6420m);
        this.f32308c.setPlaySearchController(c6420m);
    }

    public void setHint(CharSequence charSequence) {
        this.f32307b.setHint(charSequence);
    }

    public int getFocusViewId() {
        return g.search_box_text_input;
    }

    public void setIdleModeDrawerIconState(int i) {
        this.f32306a.setIdleModeDrawerIconState(i);
    }

    public void setBurgerMenuOpenDescription(int i) {
        this.f32306a.setBurgerMenuOpenDescription(i);
    }

    public void setIdleBackgroundDrawable(Drawable drawable) {
        this.f32307b.setIdleBackgroundDrawable(drawable);
    }

    public void setIdleContentDescription(CharSequence charSequence) {
        this.f32307b.setIdleContentDescription(charSequence);
    }

    public void setUseHintOnIdle(boolean z) {
        this.f32307b.setUseHintOnIdle(z);
    }
}
