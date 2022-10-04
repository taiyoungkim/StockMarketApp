package com.tycoding.stockmarketapp.company_listings

import com.tycoding.domain.model.CompanyListing

data class CompanyListingsState (
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)