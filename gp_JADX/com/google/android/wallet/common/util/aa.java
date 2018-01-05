package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SmsMessage;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class aa {
    public static String m29902a(SmsMessage[] smsMessageArr) {
        int i = 0;
        if (smsMessageArr.length == 1) {
            return m29901a(smsMessageArr[0].getDisplayMessageBody());
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = smsMessageArr.length;
        while (i < length) {
            try {
                stringBuilder.append(smsMessageArr[i].getDisplayMessageBody());
            } catch (NullPointerException e) {
            }
            i++;
        }
        return m29901a(stringBuilder.toString());
    }

    private static String m29901a(String str) {
        return str == null ? "" : str.replace('\f', '\n');
    }

    @TargetApi(19)
    public static ArrayList m29903a(Context context, long j, Pattern pattern) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[]{"address", "date", "body"};
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("date > ").append(j);
        Cursor query = context.getContentResolver().query(Uri.parse("content://sms/inbox"), strArr, stringBuilder.toString(), null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    Object string = query.getString(0);
                    if (pattern == null || pattern.matcher(string).matches()) {
                        ContentValues contentValues = new ContentValues(3);
                        contentValues.put("address", string);
                        contentValues.put("date", Long.valueOf(query.getLong(1)));
                        contentValues.put("body", query.getString(2));
                        arrayList.add(contentValues);
                    }
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }
}
