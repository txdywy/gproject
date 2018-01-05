package com.google.android.finsky.settings;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.preference.ListPreference;
import android.preference.Preference.BaseSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;

public class SettingsListPreference extends ListPreference {

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new C4112w();
        public CharSequence[] f20494a;
        public CharSequence[] f20495b;
        public String f20496c;
        public CharSequence f20497d;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f20494a = m19038a(parcel);
            this.f20495b = m19038a(parcel);
            this.f20496c = parcel.readString();
            this.f20497d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            m19037a(parcel, this.f20494a);
            m19037a(parcel, this.f20495b);
            parcel.writeString(this.f20496c);
            TextUtils.writeToParcel(this.f20497d, parcel, 0);
        }

        private static void m19037a(Parcel parcel, CharSequence[] charSequenceArr) {
            if (charSequenceArr != null) {
                parcel.writeInt(r2);
                for (CharSequence writeToParcel : charSequenceArr) {
                    TextUtils.writeToParcel(writeToParcel, parcel, 0);
                }
                return;
            }
            parcel.writeInt(-1);
        }

        private static CharSequence[] m19038a(Parcel parcel) {
            int readInt = parcel.readInt();
            CharSequence[] charSequenceArr = new CharSequence[readInt];
            for (int i = 0; i < readInt; i++) {
                charSequenceArr[i] = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
            return charSequenceArr;
        }
    }

    public SettingsListPreference(Context context) {
        super(context);
    }

    public SettingsListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        setEntries(savedState.f20494a);
        setEntryValues(savedState.f20495b);
        setValue(savedState.f20496c);
        setSummary(savedState.f20497d);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20494a = getEntries();
        savedState.f20495b = getEntryValues();
        savedState.f20496c = getValue();
        savedState.f20497d = getSummary();
        return savedState;
    }
}
