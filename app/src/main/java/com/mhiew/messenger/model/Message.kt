package com.mhiew.messenger.model

import androidx.annotation.DrawableRes
import java.util.*

/**
 * Created by Min Hiew on 2023-04-20.
 * Copyright (c) 2023
 */
data class Message(
    val id: String,
    val direction: MessageDirection,
    val dateTime: Calendar,
    val sender: String,
    val message: String? = null,
    @DrawableRes
    val image: Int? = null,
    val altText: String? = null
)
