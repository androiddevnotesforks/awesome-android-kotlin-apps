package com.github.aaka.utils

import java.text.SimpleDateFormat
import java.util.*

object DateTimeUtils {

    /**
     * To convert UTC time string to UTC millis
     */
    fun fromUtcToUtcMillis(updatedAt: String?): Long? {
        if (updatedAt == null) {
            return null
        }

        return utcFormat.parse(updatedAt).time
    }

    private val utcFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH).apply {
        timeZone = TimeZone.getTimeZone("UTC")
    }
}