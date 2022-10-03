package com.tycoding.domain.repository

import com.tycoding.domain.model.CompanyListing
import com.tycoding.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}