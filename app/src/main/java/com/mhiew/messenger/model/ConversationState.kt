package com.mhiew.messenger.model

/**
 * Created by Min Hiew on 2023-04-20.
 * Copyright (c) 2023
 */
data class ConversationState(
    val message: List<Message> = emptyList()
)