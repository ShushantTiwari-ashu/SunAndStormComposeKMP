package dev.shushant.cleanmiles.network

import dev.shushant.cleanmiles.listing.Country

interface CountriesApi {
    suspend fun getCountriesList(): List<Country>
}