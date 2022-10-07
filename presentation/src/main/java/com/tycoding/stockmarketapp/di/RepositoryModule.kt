package com.tycoding.stockmarketapp.di

import com.tycoding.data.csv.CSVParser
import com.tycoding.data.csv.CompanyListingsParser
import com.tycoding.data.repository.StockRepositoryImpl
import com.tycoding.domain.model.CompanyListing
import com.tycoding.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}