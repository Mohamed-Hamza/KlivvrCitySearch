package com.hamzathedev.klivvrcitysearch.ui.view.composables

import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.text.input.TextFieldValue

val TextFieldValueSaver: Saver<TextFieldValue, *> = Saver(
    save = { it.text },
    restore = { TextFieldValue(it) }
)