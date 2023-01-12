package info.bitcoinunlimited.nexawallet.ktor

import info.bitcoinunlimited.nexawallet.response.BreedResult

interface DogApi {
    suspend fun getJsonFromApi(): BreedResult
}
