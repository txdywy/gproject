package com.squareup.leakcanary.internal;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;
import com.squareup.leakcanary.Exclusion;
import com.squareup.leakcanary.LeakTrace;
import com.squareup.leakcanary.LeakTraceElement;
import com.squareup.leakcanary.LeakTraceElement.Holder;
import com.squareup.leakcanary.internal.DisplayLeakConnectorView.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class DisplayLeakAdapter extends BaseAdapter {
    public static final int NORMAL_ROW = 1;
    public static final int TOP_ROW = 0;
    public List elements = Collections.emptyList();
    public boolean[] opened = new boolean[0];
    public String referenceKey;
    public String referenceName = "";

    DisplayLeakAdapter() {
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        Context context = viewGroup.getContext();
        if (getItemViewType(i) == 0) {
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C7582R.layout.leak_canary_ref_top_row, viewGroup, false);
            }
            ((TextView) findById(view, C7582R.id.leak_canary_row_text)).setText(context.getPackageName());
        } else {
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C7582R.layout.leak_canary_ref_row, viewGroup, false);
            }
            TextView textView = (TextView) findById(view, C7582R.id.leak_canary_row_text);
            boolean z2 = i == 1;
            if (i == getCount() - 1) {
                z = true;
            }
            String elementToHtmlString = elementToHtmlString((LeakTraceElement) getItem(i), z2, this.opened[i]);
            if (z && !this.referenceName.equals("") && this.opened[i]) {
                elementToHtmlString = String.valueOf(elementToHtmlString);
                String str = this.referenceName;
                elementToHtmlString = new StringBuilder((String.valueOf(elementToHtmlString).length() + 30) + String.valueOf(str).length()).append(elementToHtmlString).append(" <font color='#919191'>").append(str).append("</font>").toString();
            }
            textView.setText(Html.fromHtml(elementToHtmlString));
            DisplayLeakConnectorView displayLeakConnectorView = (DisplayLeakConnectorView) findById(view, C7582R.id.leak_canary_row_connector);
            if (z2) {
                displayLeakConnectorView.setType(Type.START);
            } else if (z) {
                displayLeakConnectorView.setType(Type.END);
            } else {
                displayLeakConnectorView.setType(Type.NODE);
            }
            ((MoreDetailsView) findById(view, C7582R.id.leak_canary_row_more)).setOpened(this.opened[i]);
        }
        return view;
    }

    private final String elementToHtmlString(LeakTraceElement leakTraceElement, boolean z, boolean z2) {
        String valueOf;
        String toLowerCase;
        String str;
        Object obj = "";
        if (leakTraceElement.referenceName == null) {
            obj = String.valueOf(obj).concat("leaks ");
        } else if (!z) {
            obj = String.valueOf(obj).concat("references ");
        }
        if (leakTraceElement.type == LeakTraceElement.Type.STATIC_FIELD) {
            obj = String.valueOf(obj).concat("<font color='#c48a47'>static</font> ");
        }
        if (leakTraceElement.holder == Holder.ARRAY || leakTraceElement.holder == Holder.THREAD) {
            valueOf = String.valueOf(obj);
            toLowerCase = leakTraceElement.holder.name().toLowerCase();
            obj = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(toLowerCase).length()).append(valueOf).append("<font color='#f3cf83'>").append(toLowerCase).append("</font> ").toString();
        }
        int lastIndexOf = leakTraceElement.className.lastIndexOf(46);
        if (lastIndexOf == -1) {
            str = "";
            toLowerCase = leakTraceElement.className;
        } else {
            str = leakTraceElement.className.substring(0, lastIndexOf + 1);
            toLowerCase = leakTraceElement.className.substring(lastIndexOf + 1);
        }
        if (z2) {
            valueOf = String.valueOf(obj);
            obj = new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(str).length()).append(valueOf).append("<font color='#919191'>").append(str).append("</font>").toString();
        }
        toLowerCase = new StringBuilder(String.valueOf(toLowerCase).length() + 29).append("<font color='#ffffff'>").append(toLowerCase).append("</font>").toString();
        str = String.valueOf(obj);
        valueOf = String.valueOf(toLowerCase);
        obj = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        if (leakTraceElement.referenceName != null) {
            valueOf = String.valueOf(obj);
            toLowerCase = leakTraceElement.referenceName.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(toLowerCase).length()).append(valueOf).append(".<font color='#998bb5'>").append(toLowerCase).append("</font>").toString();
        } else {
            valueOf = String.valueOf(obj).concat(" <font color='#f3cf83'>instance</font>");
        }
        if (z2 && leakTraceElement.extra != null) {
            valueOf = String.valueOf(valueOf);
            toLowerCase = leakTraceElement.extra;
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(toLowerCase).length()).append(valueOf).append(" <font color='#919191'>").append(toLowerCase).append("</font>").toString();
        }
        Exclusion exclusion = leakTraceElement.exclusion;
        if (exclusion == null) {
            return valueOf;
        }
        if (!z2) {
            return String.valueOf(valueOf).concat(" (excluded)");
        }
        obj = String.valueOf(valueOf).concat("<br/><br/>Excluded by rule");
        if (exclusion.name != null) {
            valueOf = String.valueOf(obj);
            str = exclusion.name;
            obj = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(str).length()).append(valueOf).append(" <font color='#ffffff'>").append(str).append("</font>").toString();
        }
        valueOf = String.valueOf(obj);
        str = exclusion.matching;
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append(valueOf).append(" matching <font color='#f3cf83'>").append(str).append("</font>").toString();
        if (exclusion.reason == null) {
            return valueOf;
        }
        valueOf = String.valueOf(valueOf);
        toLowerCase = exclusion.reason;
        return new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(toLowerCase).length()).append(valueOf).append(" because <font color='#f3cf83'>").append(toLowerCase).append("</font>").toString();
    }

    public final void update(LeakTrace leakTrace, String str, String str2) {
        if (!str.equals(this.referenceKey)) {
            this.referenceKey = str;
            this.referenceName = str2;
            this.elements = new ArrayList(leakTrace.elements);
            this.opened = new boolean[(this.elements.size() + 1)];
            notifyDataSetChanged();
        }
    }

    public final void toggleRow(int i) {
        this.opened[i] = !this.opened[i];
        notifyDataSetChanged();
    }

    public final int getCount() {
        return this.elements.size() + 1;
    }

    public final LeakTraceElement getItem(int i) {
        if (getItemViewType(i) == 0) {
            return null;
        }
        return (LeakTraceElement) this.elements.get(i - 1);
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    private static View findById(View view, int i) {
        return view.findViewById(i);
    }
}
