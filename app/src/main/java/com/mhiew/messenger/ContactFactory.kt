package com.mhiew.messenger

import com.mhiew.messenger.model.Contact

/**
 * Created by Min Hiew on 2023-04-20.
 * Copyright (c) 2023
 */
object ContactFactory {
    fun generateContacts(): List<Contact> {
        return listOf(
            Contact("Joe"),
            Contact("Ellie"),
            Contact("Anna"),
            Contact("Rachel"),
            Contact("Ross"),
            Contact("Ross"),
            Contact("Mark"),
            Contact("Min"),
        )
    }
}