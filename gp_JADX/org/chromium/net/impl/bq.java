package org.chromium.net.impl;

enum bq {
    NOT_STARTED,
    STARTED,
    REDIRECT_RECEIVED,
    AWAITING_FOLLOW_REDIRECT,
    AWAITING_READ,
    READING,
    ERROR,
    COMPLETE,
    CANCELLED
}
