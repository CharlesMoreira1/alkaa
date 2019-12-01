package com.escodro.category.mapper

import com.escodro.category.model.Category as ViewCategory
import com.escodro.domain.model.Category as DomainCategory

/**
 * Maps Category between View and Domain.
 */
internal class CategoryMapper {

    /**
     * Maps Category from Domain to View.
     *
     * @param domainCategoryList the list of Category to be converted.
     *
     * @return the converted list of Category
     */
    fun fromDomain(domainCategoryList: List<DomainCategory>): List<ViewCategory> =
        domainCategoryList.map { fromDomain(it) }

    /**
     * Maps Category from Domain to View.
     *
     * @param domainCategory the Category to be converted.
     *
     * @return the converted Category
     */
    fun fromDomain(domainCategory: DomainCategory): ViewCategory =
        ViewCategory(
            id = domainCategory.id,
            name = domainCategory.name,
            color = domainCategory.color
        )

    fun toDomain(viewCategory: ViewCategory): DomainCategory =
        DomainCategory(
            id = viewCategory.id,
            name = viewCategory.name,
            color = viewCategory.color
        )
}
