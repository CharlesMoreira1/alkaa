package com.escodro.search.model

import android.graphics.Color

/**
 * UI representation of Task results.
 */
internal data class TaskSearch(
    val id: Long = 0,
    val completed: Boolean,
    val title: String,
    val categoryColor: Int?,
    val isRepeating: Boolean
)
