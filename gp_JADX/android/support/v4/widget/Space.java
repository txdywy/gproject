package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class Space extends View {
    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Space(Context context) {
        this(context, null);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    private static int m2129a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                return size;
            default:
                return i;
        }
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m2129a(getSuggestedMinimumWidth(), i), m2129a(getSuggestedMinimumHeight(), i2));
    }
}
