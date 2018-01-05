package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue f2318b;
    public TypedValue f2319c;
    public TypedValue f2320d;
    public TypedValue f2321e;
    public TypedValue f2322f;
    public TypedValue f2323g;
    public final Rect f2324h;
    public bu f2325i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2324h = new Rect();
    }

    public final void m2484a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(bu buVar) {
        this.f2325i = buVar;
    }

    protected void onMeasure(int i, int i2) {
        TypedValue typedValue;
        int dimension;
        Object obj;
        TypedValue typedValue2;
        int dimension2;
        Object obj2 = null;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Object obj3 = displayMetrics.widthPixels < displayMetrics.heightPixels ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            typedValue = obj3 != null ? this.f2321e : this.f2320d;
            if (!(typedValue == null || typedValue.type == 0)) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    i = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f2324h.left + this.f2324h.right), MeasureSpec.getSize(i)), MemoryMappedFileBuffer.DEFAULT_SIZE);
                    obj = 1;
                    if (mode2 == Integer.MIN_VALUE) {
                        typedValue = obj3 == null ? this.f2322f : this.f2323g;
                        if (!(typedValue == null || typedValue.type == 0)) {
                            if (typedValue.type == 5) {
                                dimension = (int) typedValue.getDimension(displayMetrics);
                            } else if (typedValue.type != 6) {
                                dimension = (int) typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                            } else {
                                dimension = 0;
                            }
                            if (dimension > 0) {
                                i2 = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f2324h.top + this.f2324h.bottom), MeasureSpec.getSize(i2)), MemoryMappedFileBuffer.DEFAULT_SIZE);
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                    mode2 = getMeasuredWidth();
                    dimension = MeasureSpec.makeMeasureSpec(mode2, MemoryMappedFileBuffer.DEFAULT_SIZE);
                    if (obj == null && mode == Integer.MIN_VALUE) {
                        typedValue2 = obj3 == null ? this.f2319c : this.f2318b;
                        if (!(typedValue2 == null || typedValue2.type == 0)) {
                            dimension2 = typedValue2.type != 5 ? (int) typedValue2.getDimension(displayMetrics) : typedValue2.type != 6 ? (int) typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                            if (dimension2 > 0) {
                                dimension2 -= this.f2324h.left + this.f2324h.right;
                            }
                            if (mode2 < dimension2) {
                                dimension2 = MeasureSpec.makeMeasureSpec(dimension2, MemoryMappedFileBuffer.DEFAULT_SIZE);
                                obj2 = 1;
                                if (obj2 == null) {
                                    super.onMeasure(dimension2, i2);
                                }
                            }
                        }
                    }
                    dimension2 = dimension;
                    if (obj2 == null) {
                        super.onMeasure(dimension2, i2);
                    }
                }
            }
        }
        obj = null;
        if (mode2 == Integer.MIN_VALUE) {
            if (obj3 == null) {
            }
            if (typedValue.type == 5) {
                dimension = (int) typedValue.getDimension(displayMetrics);
            } else if (typedValue.type != 6) {
                dimension = 0;
            } else {
                dimension = (int) typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
            }
            if (dimension > 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f2324h.top + this.f2324h.bottom), MeasureSpec.getSize(i2)), MemoryMappedFileBuffer.DEFAULT_SIZE);
            }
        }
        super.onMeasure(i, i2);
        mode2 = getMeasuredWidth();
        dimension = MeasureSpec.makeMeasureSpec(mode2, MemoryMappedFileBuffer.DEFAULT_SIZE);
        if (obj3 == null) {
        }
        if (typedValue2.type != 5) {
            if (typedValue2.type != 6) {
            }
        }
        if (dimension2 > 0) {
            dimension2 -= this.f2324h.left + this.f2324h.right;
        }
        if (mode2 < dimension2) {
            dimension2 = MeasureSpec.makeMeasureSpec(dimension2, MemoryMappedFileBuffer.DEFAULT_SIZE);
            obj2 = 1;
            if (obj2 == null) {
                super.onMeasure(dimension2, i2);
            }
        }
        dimension2 = dimension;
        if (obj2 == null) {
            super.onMeasure(dimension2, i2);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2318b == null) {
            this.f2318b = new TypedValue();
        }
        return this.f2318b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2319c == null) {
            this.f2319c = new TypedValue();
        }
        return this.f2319c;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2320d == null) {
            this.f2320d = new TypedValue();
        }
        return this.f2320d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2321e == null) {
            this.f2321e = new TypedValue();
        }
        return this.f2321e;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2322f == null) {
            this.f2322f = new TypedValue();
        }
        return this.f2322f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2323g == null) {
            this.f2323g = new TypedValue();
        }
        return this.f2323g;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2325i != null) {
            this.f2325i.mo551a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2325i != null) {
            this.f2325i.mo552b();
        }
    }
}
