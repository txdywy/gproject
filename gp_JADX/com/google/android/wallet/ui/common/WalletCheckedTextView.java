package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import com.google.android.wallet.p383e.C6625i;

public class WalletCheckedTextView extends CheckedTextView {
    public String f33488a;

    public WalletCheckedTextView(Context context) {
        super(context);
    }

    public WalletCheckedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public WalletCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public WalletCheckedTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.f33488a)) {
            accessibilityNodeInfo.setText(getResources().getString(C6625i.wallet_uic_accessibility_form_spinner_item, new Object[]{this.f33488a, getText()}));
        }
    }

    public static View m30692a(View view, String str) {
        WalletCheckedTextView a = m30693a(view);
        if (a != null) {
            a.f33488a = str;
        }
        return view;
    }

    private static WalletCheckedTextView m30693a(View view) {
        if (view instanceof WalletCheckedTextView) {
            return (WalletCheckedTextView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m30693a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
