package com.google.android.finsky.bn;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.bn.g extends SQLiteOpenHelper
{

    g(Context p0, String p1) {
        SQLiteOpenHelper(p0, com.google.android.finsky.bn.f.b(p1), 0, 33);
    }

    private final void a(SQLiteDatabase p0) {
        try {
            p0.execSQL("DROP TABLE appstate");
        }
        catch (SQLException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.c("Unable to drop table: %s", v2);
        }
        this.onCreate(p0);
    }

    public final void onCreate(SQLiteDatabase p0) {
        p0.execSQL("CREATE TABLE appstate (package_name STRING, auto_update INTEGER, desired_version INTEGER, download_uri STRING, delivery_data BLOB, delivery_data_timestamp_ms INTEGER,installer_state INTEGER, first_download_ms INTEGER, referrer STRING, account STRING, title STRING,flags INTEGER, continue_url STRING, last_notified_version INTEGER, last_update_timestamp_ms INTEGER, account_for_update STRING, auto_acquire_tags STRING, external_referrer_timestamp_ms INTEGER, persistent_flags INTEGER, permissions_version INTEGER, delivery_token STRING,completed_split_ids STRING, active_split_id STRING, request_id STRING,managed_configuration_token BLOB, total_completed_bytes_downloaded INTEGER,app_details BLOB, install_client_event_id INTEGER,last_client_event_id INTEGER, requesting_package_name STRING,update_discovered_timestamp_ms INTEGER, install_logging_context BLOB, logging_context BLOB, install_request_timestamp_ms INTEGER, desired_derived_apk_id INTEGER, notification_intent STRING, auto_update_flow_policy BLOB, install_reason STRING, sandbox_version INTEGER,requested_modules TEXT, install_request_data BLOB,PRIMARY KEY (package_name))");
    }

    public final void onDowngrade(SQLiteDatabase p0, int p1, int p2) {
        v1 = new Object[2];
        v1[0] = Integer.valueOf(p1);
        v1[1] = Integer.valueOf(p2);
        FinskyLog.a("Downgrading InstallerDataStore from %d to %d", v1);
        this.a(p0);
    }

    public final void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
        switch (p1) {
            case 7:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN continue_url STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_data_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_notified_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_update_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN account_for_update STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 8:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_data_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_notified_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_update_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN account_for_update STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 9:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_notified_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_update_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN account_for_update STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 10:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_update_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN account_for_update STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 11:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN account_for_update STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 12:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 13:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 14:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 15:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 16:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 17:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 18:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 19:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 20:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN app_details BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 21:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 22:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requesting_package_name STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 23:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 24:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN logging_context BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 25:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 26:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 27:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN notification_intent STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 28:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 29:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_reason STRING");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 30:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 31:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN requested_modules TEXT");
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            case 32:
                p0.execSQL("ALTER TABLE appstate ADD COLUMN install_request_data BLOB");
                break;
            default:
                this.a(p0);
                break;
        }
    }

}
