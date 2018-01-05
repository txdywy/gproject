package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

public final class ae extends CheckedTextView {
    public static final int[] f3086a = new int[]{16843016};
    public final bd f3087b;

    public ae(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ae(Context context, AttributeSet attributeSet, byte b) {
        super(gz.m3765a(context), attributeSet, 16843720);
        this.f3087b = bd.m3230a((TextView) this);
        this.f3087b.mo757a(attributeSet, 16843720);
        this.f3087b.mo756a();
        hc a = hc.m3769a(getContext(), attributeSet, f3086a, 16843720, 0);
        setCheckMarkDrawable(a.m3771a(0));
        a.f3558b.recycle();
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0436b.m2650b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3087b != null) {
            this.f3087b.m3237a(context, i);
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3087b != null) {
            this.f3087b.mo756a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return am.m3191a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
