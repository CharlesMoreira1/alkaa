package com.escodro.domain.usecase

import com.escodro.domain.extension.applySchedulers
import com.escodro.domain.mapper.CategoryMapper
import com.escodro.local.provider.DaoProvider

/**
 * Use case to load a specific category from the database.
 */
class LoadCategory(private val daoProvider: DaoProvider, private val mapper: CategoryMapper) {

    /**
     * Loads the category based on the given id.
     *
     * @param categoryId category id
     *
     * @return an single observable to be subscribed
     */
    operator fun invoke(categoryId: Long) =
        daoProvider.getCategoryDao()
            .findCategory(categoryId)
            .map { mapper.toViewCategory(it) }
            .applySchedulers()
}