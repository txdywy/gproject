package com.google.android.finsky.at;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import com.squareup.leakcanary.C7582R;

public final class C1510d extends C0141p {
    public final Dialog mo143a(Bundle bundle) {
        m628b(false);
        Dialog progressDialog = new ProgressDialog(m603h());
        progressDialog.setProgressStyle(0);
        int i = this.f760q.getInt("message_id", C7582R.string.loading);
        if (this.f760q.containsKey("message")) {
            progressDialog.setMessage(this.f760q.getString("message"));
        } else if (i != 0) {
            progressDialog.setMessage(m605i().getString(i));
        }
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }
}
