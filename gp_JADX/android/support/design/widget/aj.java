package android.support.design.widget;

import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class aj extends C0132b {
    public final /* synthetic */ CheckableImageButton f779a;

    aj(CheckableImageButton checkableImageButton) {
        this.f779a = checkableImageButton;
    }

    public final void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo145a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f779a.isChecked());
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        c0333b.m1770a(true);
        c0333b.m1774b(this.f779a.isChecked());
    }
}
