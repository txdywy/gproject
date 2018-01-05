package com.google.android.libraries.bind.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.C0330d;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.eo;
import android.support.v7.widget.ew;
import android.support.v7.widget.fe;
import android.support.v7.widget.fl;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.bind.C5877c;
import com.google.android.libraries.bind.data.C5905o;
import com.google.android.libraries.bind.data.C5908r;
import com.google.android.libraries.bind.p324c.C5875b;
import com.google.android.libraries.bind.p325d.C5884a;
import com.google.android.libraries.bind.p325d.C5893b;
import com.google.android.libraries.bind.widget.C5915d;
import com.google.android.libraries.flowlayoutmanager.FlowLayoutManager;
import java.io.Serializable;
import java.util.Locale;

public class BindRecyclerView extends RecyclerView {
    public static final C5875b aG = C5875b.m27305a(BindRecyclerView.class);
    public final C5915d aH;
    public C5888f aI;
    public fe aJ;
    public SavedState aK;
    public boolean aL;
    public boolean aM;
    public boolean aN;
    public final eo aO;

    public class SavedState implements Parcelable {
        public static final Creator CREATOR = new C5887e();
        public static final SavedState f29395a = new SavedState();
        public final Parcelable f29396b;
        public final Object f29397c;
        public final int f29398d;
        public final float f29399e;

        SavedState() {
            this.f29396b = null;
            this.f29397c = null;
            this.f29398d = 0;
            this.f29399e = 0.0f;
        }

        SavedState(Parcelable parcelable, Object obj, int i, float f) {
            if (parcelable == f29395a) {
                parcelable = null;
            }
            this.f29396b = parcelable;
            this.f29397c = obj;
            this.f29398d = i;
            this.f29399e = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f29396b, i);
            Object obj = this.f29397c;
            boolean z = obj instanceof Parcelable;
            parcel.writeByte((byte) (z ? 1 : 0));
            if (z) {
                parcel.writeParcelable((Parcelable) obj, i);
            } else {
                parcel.writeSerializable((Serializable) obj);
            }
            parcel.writeInt(this.f29398d);
            parcel.writeFloat(this.f29399e);
        }

        public String toString() {
            return this.f29397c == null ? null : this.f29397c.toString();
        }

        SavedState(Parcel parcel) {
            Object readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(RecyclerView.class.getClassLoader());
            if (readParcelable2 == null) {
                readParcelable2 = f29395a;
            }
            this.f29396b = readParcelable2;
            ClassLoader classLoader = SavedState.class.getClassLoader();
            if (parcel.readByte() == (byte) 1) {
                readParcelable = parcel.readParcelable(classLoader);
            } else {
                readParcelable = parcel.readSerializable();
            }
            this.f29397c = readParcelable;
            this.f29398d = parcel.readInt();
            this.f29399e = parcel.readFloat();
        }

        public int describeContents() {
            return 0;
        }
    }

    public BindRecyclerView(Context context) {
        this(context, null);
    }

    public BindRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BindRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aH = new C5915d();
        this.aI = new C5888f();
        this.aL = true;
        this.aM = false;
        this.aO = new C5883a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5877c.BindRecyclerView);
        setNestedScrollingEnabled(obtainStyledAttributes.getBoolean(C5877c.BindRecyclerView_bind__nestedScrollingEnabled, true));
        this.aN = obtainStyledAttributes.getBoolean(C5877c.BindRecyclerView_bind__offsetSavedStateEnabled, true);
        obtainStyledAttributes.recycle();
        super.setOnScrollListener(this.aH);
        if (!isInEditMode()) {
            m278a(new C5889g());
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2951a(this.aI);
    }

    public C5905o getAdapter() {
        return (C5905o) super.getAdapter();
    }

    public void setAdapter(em emVar) {
        if (emVar == null || (emVar instanceof C5905o)) {
            C5905o c5905o = (C5905o) getAdapter();
            if (c5905o != null) {
                c5905o.mo5197b(this.aO);
            }
            super.setAdapter(emVar);
            if (emVar != null) {
                emVar.mo5196a(this.aO);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Adapter must be a RecyclerViewAdapter, got %s instead", new Object[]{emVar.getClass().getSimpleName()}));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0330d.m1728a(String.valueOf(getClass().getSimpleName()).concat(" onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        C0330d.m1727a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAdapter(null);
        mo5180c();
    }

    public Parcelable onSaveInstanceState() {
        View view;
        Parcelable savedState;
        C5884a c5885b = new C5885b();
        if (getLayoutManager() != null) {
            int p = getLayoutManager().m3060p();
            for (int i = 0; i != p; i++) {
                View f = getLayoutManager().m3051f(i);
                if (c5885b.mo5192a(f)) {
                    view = f;
                    break;
                }
            }
        }
        view = null;
        if (view != null) {
            RecyclerView.m262d(view);
            Object d = ((C5905o) getAdapter()).f29450l == null ? null : C5908r.m27388d();
            if (d != null) {
                int top;
                Parcelable onSaveInstanceState = super.onSaveInstanceState();
                if (this.aN) {
                    top = view.getTop();
                } else {
                    top = 0;
                }
                savedState = new SavedState(onSaveInstanceState, d, top, (float) this.aI.f29411c);
                return savedState != null ? super.onSaveInstanceState() : savedState;
            }
        }
        savedState = null;
        if (savedState != null) {
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C5875b c5875b = aG;
        String str = "onRestoreInstanceState";
        Object[] objArr = new Object[0];
        if (c5875b.m27308a()) {
            C5875b.f29391b.mo5179a(4, c5875b.f29393c, C5875b.m27306b(str, objArr));
        }
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f29396b);
            m27311a(savedState);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!(view == null || view.getParent() == null)) {
            C5875b.f29391b.mo5179a(6, aG.f29393c, C5875b.m27306b("Attempt to add child: %s with parent: %s to RecyclerView.", view, view.getParent()));
        }
        super.addView(view, i, layoutParams);
    }

    final void m27311a(SavedState savedState) {
        C5905o c5905o = (C5905o) getAdapter();
        C5875b c5875b;
        if (c5905o.m27383b()) {
            Object obj = savedState.f29397c;
            int f = c5905o.f29450l == null ? -1 : C5908r.m27390f();
            if (f != -1) {
                this.aI.f29411c = (int) savedState.f29399e;
                int i = savedState.f29398d;
                ew layoutManager = getLayoutManager();
                if (layoutManager instanceof FlowLayoutManager) {
                    FlowLayoutManager flowLayoutManager = (FlowLayoutManager) layoutManager;
                    flowLayoutManager.f29497l = f;
                    flowLayoutManager.f29498m = i;
                    flowLayoutManager.m3056l();
                } else if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).m3094a(f, i);
                } else {
                    throw new UnsupportedOperationException(String.format(Locale.US, "Attempting to restore saved state with unsupported LayoutManager: %s", new Object[]{layoutManager.getClass().getSimpleName()}));
                }
                c5875b = aG;
                String str = "Restoring to position %d";
                Object[] objArr = new Object[]{Integer.valueOf(f)};
                if (c5875b.m27308a()) {
                    C5875b.f29391b.mo5179a(4, c5875b.f29393c, C5875b.m27306b(str, objArr));
                    return;
                }
                return;
            }
            return;
        }
        this.aK = savedState;
        c5875b = aG;
        String str2 = "Stashing restore state";
        Object[] objArr2 = new Object[0];
        if (c5875b.m27308a()) {
            C5875b.f29391b.mo5179a(4, c5875b.f29393c, C5875b.m27306b(str2, objArr2));
        }
    }

    public final void mo5181e(int i) {
        ew layoutManager = getLayoutManager();
        if (layoutManager != null) {
            fl c5886c = new C5886c(this, getContext(), layoutManager);
            c5886c.f3396g = i;
            layoutManager.m3014a(c5886c);
        }
    }

    public void setUserInteractionEnabled(boolean z) {
        this.aL = z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.aL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.aM) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.aM) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected final fe getOnScrollListener() {
        return this.aH;
    }

    public void setOnScrollListener(fe feVar) {
        if (feVar != null) {
            C5893b.m27342a(this.aJ == null);
            this.aJ = feVar;
            mo2951a(this.aJ);
        } else if (this.aJ != null) {
            mo2952b(this.aJ);
            this.aJ = null;
        }
    }

    public final void mo2951a(fe feVar) {
        this.aH.f29481a.add(feVar);
    }

    public final void mo2952b(fe feVar) {
        this.aH.f29481a.remove(feVar);
    }

    public final void mo5180c() {
        this.aH.f29481a.clear();
    }
}
