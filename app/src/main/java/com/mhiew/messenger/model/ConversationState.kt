package com.mhiew.messenger.model

import com.mhiew.messenger.ContactFactory
import com.mhiew.messenger.MessageFactory

/**
 * Created by Min Hiew on 2023-04-20.
 * Copyright (c) 2023
 */
data class ConversationState(
    val message: List<Message> = MessageFactory.generateMessages(),
    val contacts: List<Contact> = ContactFactory.generateContacts(),
    val selectedMessage: Message? = null,
)