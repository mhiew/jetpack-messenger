package com.mhiew.messenger

import androidx.annotation.StringRes
import androidx.test.platform.app.InstrumentationRegistry

/**
 * Created by Min Hiew on 2023-04-20.
 * Copyright (c) 2023
 */

fun getString(@StringRes id: Int, vararg formatArgs: Any): String {
    return InstrumentationRegistry.getInstrumentation().targetContext.getString(id, *formatArgs)
}