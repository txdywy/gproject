package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ai;
import android.support.v4.widget.C0370o;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0397d;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0400g;
import android.support.v7.p040a.C0401h;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.C0454d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.WeakHashMap;

public class SearchView extends dh implements C0454d {
    public static final boolean DBG = false;
    public static final gk HIDDEN_METHOD_INVOKER = new gk();
    public static final String IME_OPTION_NO_MICROPHONE = "nm";
    public static final String LOG_TAG = "SearchView";
    public Bundle mAppSearchData;
    public boolean mClearingFocus;
    public final ImageView mCloseButton;
    public final ImageView mCollapsedIcon;
    public int mCollapsedImeOptions;
    public final CharSequence mDefaultQueryHint;
    public final View mDropDownAnchor;
    public boolean mExpandedInActionView;
    public final ImageView mGoButton;
    public boolean mIconified;
    public boolean mIconifiedByDefault;
    public int mMaxWidth;
    public CharSequence mOldQueryText;
    public final OnClickListener mOnClickListener;
    public gl mOnCloseListener;
    public final OnEditorActionListener mOnEditorActionListener;
    public final OnItemClickListener mOnItemClickListener;
    public final OnItemSelectedListener mOnItemSelectedListener;
    public gm mOnQueryChangeListener;
    public OnFocusChangeListener mOnQueryTextFocusChangeListener;
    public OnClickListener mOnSearchClickListener;
    public gn mOnSuggestionListener;
    public final WeakHashMap mOutsideDrawablesCache;
    public CharSequence mQueryHint;
    public boolean mQueryRefinement;
    public Runnable mReleaseCursorRunnable;
    public final ImageView mSearchButton;
    public final View mSearchEditFrame;
    public final Drawable mSearchHintIcon;
    public final View mSearchPlate;
    public final SearchAutoComplete mSearchSrcTextView;
    public Rect mSearchSrcTextViewBounds;
    public Rect mSearchSrtTextViewBoundsExpanded;
    public SearchableInfo mSearchable;
    public final View mSubmitArea;
    public boolean mSubmitButtonEnabled;
    public final int mSuggestionCommitIconResId;
    public final int mSuggestionRowLayout;
    public C0370o mSuggestionsAdapter;
    public int[] mTemp;
    public int[] mTemp2;
    public OnKeyListener mTextKeyListener;
    public TextWatcher mTextWatcher;
    public gq mTouchDelegate;
    public final Runnable mUpdateDrawableStateRunnable;
    public CharSequence mUserQuery;
    public final Intent mVoiceAppSearchIntent;
    public final ImageView mVoiceButton;
    public boolean mVoiceButtonEnabled;
    public final Intent mVoiceWebSearchIntent;

    class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new go();
        public boolean f2978a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2978a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2978a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2978a + "}";
        }
    }

    public class SearchAutoComplete extends ab {
        public int f2982d;
        public SearchView f2983e;
        public boolean f2984f;
        public final Runnable f2985g;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0394a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2985g = new gp(this);
            this.f2982d = getThreshold();
        }

        protected void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (i2 >= 600 || (i2 >= 640 && i3 >= 480)) {
                i = 192;
            } else {
                i = 160;
            }
            setMinWidth((int) TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2982d = i;
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2983e.hasFocus() && getVisibility() == 0) {
                this.f2984f = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    SearchView.HIDDEN_METHOD_INVOKER.m3733a(this);
                }
            }
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2983e.onTextFocusChanged();
        }

        public boolean enoughToFilter() {
            return this.f2982d <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2983e.clearFocus();
                        m3126a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2984f) {
                removeCallbacks(this.f2985g);
                post(this.f2985g);
            }
            return onCreateInputConnection;
        }

        final void m3126a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2984f = false;
                removeCallbacks(this.f2985g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2984f = false;
                removeCallbacks(this.f2985g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2984f = true;
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new ga(this);
        this.mReleaseCursorRunnable = new gc(this);
        this.mOutsideDrawablesCache = new WeakHashMap();
        this.mOnClickListener = new gf(this);
        this.mTextKeyListener = new gg(this);
        this.mOnEditorActionListener = new gh(this);
        this.mOnItemClickListener = new gi(this);
        this.mOnItemSelectedListener = new gj(this);
        this.mTextWatcher = new gb(this);
        hc a = hc.m3769a(context, attributeSet, C0403j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.m3783g(C0403j.SearchView_layout, C0400g.abc_search_view), this, true);
        this.mSearchSrcTextView = (SearchAutoComplete) findViewById(C0399f.search_src_text);
        this.mSearchSrcTextView.f2983e = this;
        this.mSearchEditFrame = findViewById(C0399f.search_edit_frame);
        this.mSearchPlate = findViewById(C0399f.search_plate);
        this.mSubmitArea = findViewById(C0399f.submit_area);
        this.mSearchButton = (ImageView) findViewById(C0399f.search_button);
        this.mGoButton = (ImageView) findViewById(C0399f.search_go_btn);
        this.mCloseButton = (ImageView) findViewById(C0399f.search_close_btn);
        this.mVoiceButton = (ImageView) findViewById(C0399f.search_voice_btn);
        this.mCollapsedIcon = (ImageView) findViewById(C0399f.search_mag_icon);
        ai.m1826a(this.mSearchPlate, a.m3771a(C0403j.SearchView_queryBackground));
        ai.m1826a(this.mSubmitArea, a.m3771a(C0403j.SearchView_submitBackground));
        this.mSearchButton.setImageDrawable(a.m3771a(C0403j.SearchView_searchIcon));
        this.mGoButton.setImageDrawable(a.m3771a(C0403j.SearchView_goIcon));
        this.mCloseButton.setImageDrawable(a.m3771a(C0403j.SearchView_closeIcon));
        this.mVoiceButton.setImageDrawable(a.m3771a(C0403j.SearchView_voiceIcon));
        this.mCollapsedIcon.setImageDrawable(a.m3771a(C0403j.SearchView_searchIcon));
        this.mSearchHintIcon = a.m3771a(C0403j.SearchView_searchHintIcon);
        hn.m3839a(this.mSearchButton, getResources().getString(C0401h.abc_searchview_description_search));
        this.mSuggestionRowLayout = a.m3783g(C0403j.SearchView_suggestionRowLayout, C0400g.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = a.m3783g(C0403j.SearchView_commitIcon, 0);
        this.mSearchButton.setOnClickListener(this.mOnClickListener);
        this.mCloseButton.setOnClickListener(this.mOnClickListener);
        this.mGoButton.setOnClickListener(this.mOnClickListener);
        this.mVoiceButton.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
        this.mSearchSrcTextView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mSearchSrcTextView.setOnItemClickListener(this.mOnItemClickListener);
        this.mSearchSrcTextView.setOnItemSelectedListener(this.mOnItemSelectedListener);
        this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        this.mSearchSrcTextView.setOnFocusChangeListener(new gd(this));
        setIconifiedByDefault(a.m3772a(C0403j.SearchView_iconifiedByDefault, true));
        int e = a.m3779e(C0403j.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.mDefaultQueryHint = a.m3776c(C0403j.SearchView_defaultQueryHint);
        this.mQueryHint = a.m3776c(C0403j.SearchView_queryHint);
        e = a.m3770a(C0403j.SearchView_android_imeOptions, -1);
        if (e != -1) {
            setImeOptions(e);
        }
        e = a.m3770a(C0403j.SearchView_android_inputType, -1);
        if (e != -1) {
            setInputType(e);
        }
        setFocusable(a.m3772a(C0403j.SearchView_android_focusable, true));
        a.f3558b.recycle();
        this.mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent.addFlags(268435456);
        this.mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent.addFlags(268435456);
        this.mDropDownAnchor = findViewById(this.mSearchSrcTextView.getDropDownAnchor());
        if (this.mDropDownAnchor != null) {
            this.mDropDownAnchor.addOnLayoutChangeListener(new ge(this));
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (this.mSearchable != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        this.mVoiceButtonEnabled = hasVoiceSearch();
        if (this.mVoiceButtonEnabled) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(isIconified());
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.m3126a(false);
        this.mClearingFocus = false;
    }

    public void setOnQueryTextListener(gm gmVar) {
        this.mOnQueryChangeListener = gmVar;
    }

    public void setOnCloseListener(gl glVar) {
        this.mOnCloseListener = glVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnSuggestionListener(gn gnVar) {
        this.mOnSuggestionListener = gnVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            this.mSearchSrcTextView.setSelection(this.mSearchSrcTextView.length());
            this.mUserQuery = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public CharSequence getQueryHint() {
        if (this.mQueryHint != null) {
            return this.mQueryHint;
        }
        if (this.mSearchable == null || this.mSearchable.getHintId() == 0) {
            return this.mDefaultQueryHint;
        }
        return getContext().getText(this.mSearchable.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            updateViewsVisibility(z);
            updateQueryHint();
        }
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        if (this.mSuggestionsAdapter instanceof gu) {
            ((gu) this.mSuggestionsAdapter).f3527s = z ? 2 : 1;
        }
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public void setSuggestionsAdapter(C0370o c0370o) {
        this.mSuggestionsAdapter = c0370o;
        this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
    }

    public C0370o getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    protected void onMeasure(int i, int i2) {
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.mMaxWidth <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.mMaxWidth, size);
                    break;
                }
            case 0:
                if (this.mMaxWidth <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.mMaxWidth;
                    break;
                }
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                if (this.mMaxWidth > 0) {
                    size = Math.min(this.mMaxWidth, size);
                    break;
                }
                break;
        }
        int mode2 = MeasureSpec.getMode(i2);
        mode = MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
                mode = Math.min(getPreferredHeight(), mode);
                break;
            case 0:
                mode = getPreferredHeight();
                break;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(mode, MemoryMappedFileBuffer.DEFAULT_SIZE));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, i4 - i2);
            if (this.mTouchDelegate == null) {
                this.mTouchDelegate = new gq(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
                setTouchDelegate(this.mTouchDelegate);
                return;
            }
            this.mTouchDelegate.m3739a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int i = this.mTemp[1] - this.mTemp2[1];
        int i2 = this.mTemp[0] - this.mTemp2[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0397d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0397d.abc_search_view_preferred_height);
    }

    private void updateViewsVisibility(boolean z) {
        boolean z2;
        boolean z3 = true;
        int i = 8;
        this.mIconified = z;
        int i2 = z ? 0 : 8;
        if (TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mSearchButton.setVisibility(i2);
        updateSubmitButton(z2);
        View view = this.mSearchEditFrame;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (!(this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault)) {
            i = 0;
        }
        this.mCollapsedIcon.setVisibility(i);
        updateCloseButton();
        if (z2) {
            z3 = false;
        }
        updateVoiceButton(z3);
        updateSubmitArea();
    }

    private boolean hasVoiceSearch() {
        if (this.mSearchable == null || !this.mSearchable.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
            intent = this.mVoiceWebSearchIntent;
        } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
            intent = this.mVoiceAppSearchIntent;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void updateSubmitButton(boolean z) {
        int i = 8;
        if (this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z || !this.mVoiceButtonEnabled)) {
            i = 0;
        }
        this.mGoButton.setVisibility(i);
    }

    private void updateSubmitArea() {
        int i = 8;
        if (isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) {
            i = 0;
        }
        this.mSubmitArea.setVisibility(i);
    }

    private void updateCloseButton() {
        int i = 1;
        int i2 = 0;
        int i3 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText()) ? 1 : 0;
        if (i3 == 0 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            i = 0;
        }
        ImageView imageView = this.mCloseButton;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(i3 != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        background = this.mSubmitArea.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        invalidate();
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable == null || this.mSuggestionsAdapter == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
        }
        if (i != 21 && i != 22) {
            return (i == 19 && this.mSearchSrcTextView.getListSelection() == 0) ? false : false;
        } else {
            int i2;
            if (i == 21) {
                i2 = 0;
            } else {
                i2 = this.mSearchSrcTextView.length();
            }
            this.mSearchSrcTextView.setSelection(i2);
            this.mSearchSrcTextView.setListSelection(0);
            this.mSearchSrcTextView.clearListSelection();
            HIDDEN_METHOD_INVOKER.m3733a(this.mSearchSrcTextView);
            return true;
        }
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        int i = 1;
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        if (this.mSuggestionsAdapter != null) {
            this.mSuggestionsAdapter.mo472a(null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            this.mSuggestionsAdapter = new gu(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
            gu guVar = (gu) this.mSuggestionsAdapter;
            if (this.mQueryRefinement) {
                i = 2;
            }
            guVar.f3527s = i;
        }
    }

    private void updateVoiceButton(boolean z) {
        int i;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            i = 0;
            this.mGoButton.setVisibility(8);
        } else {
            i = 8;
        }
        this.mVoiceButton.setVisibility(i);
    }

    void onTextChanged(CharSequence charSequence) {
        boolean z = true;
        CharSequence text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean z2 = !TextUtils.isEmpty(text);
        updateSubmitButton(z2);
        if (z2) {
            z = false;
        }
        updateVoiceButton(z);
        updateCloseButton();
        updateSubmitArea();
        if (!(this.mOnQueryChangeListener == null || TextUtils.equals(charSequence, this.mOldQueryText))) {
            gm gmVar = this.mOnQueryChangeListener;
            charSequence.toString();
            gmVar.m3736b();
        }
        this.mOldQueryText = charSequence.toString();
    }

    void onSubmitQuery() {
        CharSequence text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.mOnQueryChangeListener != null) {
                gm gmVar = this.mOnQueryChangeListener;
                text.toString();
                if (gmVar.m3735a()) {
                    return;
                }
            }
            if (this.mSearchable != null) {
                launchQuerySearch(0, null, text.toString());
            }
            this.mSearchSrcTextView.m3126a(false);
            dismissSuggestions();
        }
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.m3126a(true);
        } else if (!this.mIconifiedByDefault) {
        } else {
            if (this.mOnCloseListener == null || !this.mOnCloseListener.m3734a()) {
                clearFocus();
                updateViewsVisibility(true);
            }
        }
    }

    void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.m3126a(true);
        if (this.mOnSearchClickListener != null) {
            this.mOnSearchClickListener.onClick(this);
        }
    }

    void onVoiceClicked() {
        if (this.mSearchable != null) {
            SearchableInfo searchableInfo = this.mSearchable;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException e) {
                Log.w(LOG_TAG, "Could not find voice search activity");
            }
        }
    }

    void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    public void onActionViewExpanded() {
        if (!this.mExpandedInActionView) {
            this.mExpandedInActionView = true;
            this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
            this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions | 33554432);
            this.mSearchSrcTextView.setText("");
            setIconified(false);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2978a = isIconified();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f542e);
            updateViewsVisibility(savedState.f2978a);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            int dimensionPixelSize;
            int i;
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = id.m3869a(this);
            if (this.mIconifiedByDefault) {
                dimensionPixelSize = resources.getDimensionPixelSize(C0397d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C0397d.abc_dropdownitem_icon_width);
            } else {
                dimensionPixelSize = 0;
            }
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i);
            this.mSearchSrcTextView.setDropDownWidth((dimensionPixelSize + ((this.mDropDownAnchor.getWidth() + rect.left) + rect.right)) - paddingLeft);
        }
    }

    boolean onItemClicked(int i, int i2, String str) {
        if (this.mOnSuggestionListener != null && this.mOnSuggestionListener.m3738b()) {
            return false;
        }
        launchSuggestion(i, 0, null);
        this.mSearchSrcTextView.m3126a(false);
        dismissSuggestions();
        return true;
    }

    boolean onItemSelected(int i) {
        if (this.mOnSuggestionListener != null && this.mOnSuggestionListener.m3737a()) {
            return false;
        }
        rewriteQueryFromSuggestion(i);
        return true;
    }

    private void rewriteQueryFromSuggestion(int i) {
        CharSequence text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.f2082c;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence b = this.mSuggestionsAdapter.mo473b(cursor);
                if (b != null) {
                    setQuery(b);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.f2082c;
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursor, i2, str));
        return true;
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (Throwable e) {
                Log.e(LOG_TAG, "Failed launch activity: " + intent, e);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.mAppSearchData != null) {
            intent.putExtra("app_data", this.mAppSearchData);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        String str2 = "calling_package";
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra(str2, str);
        return intent2;
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String string;
        String string2;
        String str = null;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        Parcelable activity = PendingIntent.getActivity(getContext(), 0, intent2, MemoryMappedFileBuffer.DEFAULT_SIZE);
        Bundle bundle = new Bundle();
        if (this.mAppSearchData != null) {
            bundle.putParcelable("app_data", this.mAppSearchData);
        }
        Intent intent3 = new Intent(intent);
        String str2 = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        if (searchableInfo.getVoicePromptTextId() != 0) {
            string = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            string = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string2 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            string2 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        str2 = "calling_package";
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra(str2, str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        try {
            String a = gu.m3748a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.mSearchable.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String a2 = gu.m3748a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.mSearchable.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = gu.m3748a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    a2 = a2 + "/" + Uri.encode(a3);
                }
            }
            return createIntent(a, a2 == null ? null : Uri.parse(a2), gu.m3748a(cursor, "suggest_intent_extra_data"), gu.m3748a(cursor, "suggest_intent_query"), i, str);
        } catch (Throwable e) {
            int position;
            Throwable th = e;
            try {
                position = cursor.getPosition();
            } catch (RuntimeException e2) {
                position = -1;
            }
            Log.w(LOG_TAG, "Search suggestions cursor at row " + position + " returned exception.", th);
            return null;
        }
    }

    void forceSuggestionQuery() {
        gk gkVar = HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (gkVar.f3511a != null) {
            try {
                gkVar.f3511a.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception e) {
            }
        }
        gkVar = HIDDEN_METHOD_INVOKER;
        searchAutoComplete = this.mSearchSrcTextView;
        if (gkVar.f3512b != null) {
            try {
                gkVar.f3512b.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception e2) {
            }
        }
    }

    static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
