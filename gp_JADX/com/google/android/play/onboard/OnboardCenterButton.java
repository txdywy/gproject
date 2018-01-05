package com.google.android.play.onboard;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.play.e;
import com.google.android.play.g;
import com.google.android.play.utils.C6451j;

public class OnboardCenterButton extends FrameLayout {
    public final int f32266a = getResources().getDimensionPixelSize(e.play_onboard__onboard_v2_touch_extension);
    public Button f32267b;
    public Rect f32268c = new Rect();
    public Rect f32269d = new Rect();

    public OnboardCenterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32267b = (Button) findViewById(g.play_onboard_center_button);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f32267b.getVisibility() != 8) {
            this.f32267b.getHitRect(this.f32268c);
            Rect rect = this.f32268c;
            rect.left -= this.f32266a;
            rect = this.f32268c;
            rect.top -= this.f32266a;
            rect = this.f32268c;
            rect.right += this.f32266a;
            rect = this.f32268c;
            rect.bottom += this.f32266a;
            if (!this.f32269d.equals(this.f32268c)) {
                setTouchDelegate(new C6451j(this.f32268c, this.f32267b));
                this.f32269d.set(this.f32268c);
            }
        }
    }
}
