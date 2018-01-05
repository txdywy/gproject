package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.c.a.a.a.a.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.reflect.Field;

public class dw extends ListView {
    public final Rect f3280f = new Rect();
    public int f3281g = 0;
    public int f3282h = 0;
    public int f3283i = 0;
    public int f3284j = 0;
    public int f3285k;
    public Field f3286l;
    public dx f3287m;

    public dw(Context context, int i) {
        super(context, null, i);
        try {
            this.f3286l = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3286l.setAccessible(true);
        } catch (Throwable e) {
            a.a.a(e);
        }
    }

    public void setSelector(Drawable drawable) {
        this.f3287m = drawable != null ? new dx(drawable) : null;
        super.setSelector(this.f3287m);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3281g = rect.left;
        this.f3282h = rect.top;
        this.f3283i = rect.right;
        this.f3284j = rect.bottom;
    }

    protected void drawableStateChanged() {
        boolean z = true;
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null) {
            if (!(mo786a() && isPressed())) {
                z = false;
            }
            if (z) {
                selector.setState(getDrawableState());
            }
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        if (!this.f3280f.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f3280f);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f3285k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected boolean mo786a() {
        return false;
    }

    public final int m3403a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        listPaddingBottom += listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            View view2;
            listPaddingTop = adapter.getItemViewType(i4);
            if (listPaddingTop != i3) {
                i3 = listPaddingTop;
                view2 = null;
            } else {
                view2 = view;
            }
            view = adapter.getView(i4, view2, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                listPaddingTop = MeasureSpec.makeMeasureSpec(layoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE);
            } else {
                listPaddingTop = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, listPaddingTop);
            view.forceLayout();
            if (i4 > 0) {
                listPaddingTop = listPaddingBottom + dividerHeight;
            } else {
                listPaddingTop = listPaddingBottom;
            }
            listPaddingBottom = view.getMeasuredHeight() + listPaddingTop;
            if (listPaddingBottom >= i2) {
                return i2;
            }
        }
        return listPaddingBottom;
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.f3287m != null) {
            this.f3287m.f3416a = z;
        }
    }
}
