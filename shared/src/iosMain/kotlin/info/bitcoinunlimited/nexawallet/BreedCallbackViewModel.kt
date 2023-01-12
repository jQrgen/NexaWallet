package info.bitcoinunlimited.nexawallet

import co.touchlab.kampkit.db.Breed
import co.touchlab.kermit.Logger
import info.bitcoinunlimited.nexawallet.models.BreedRepository
import info.bitcoinunlimited.nexawallet.models.BreedViewModel
import info.bitcoinunlimited.nexawallet.models.CallbackViewModel

@Suppress("Unused") // Members are called from Swift
class BreedCallbackViewModel(
    breedRepository: BreedRepository,
    log: Logger
) : CallbackViewModel() {

    override val viewModel = BreedViewModel(breedRepository, log)

    val breeds = viewModel.breedState.asCallbacks()

    fun refreshBreeds() {
        viewModel.refreshBreeds()
    }

    fun updateBreedFavorite(breed: Breed) {
        viewModel.updateBreedFavorite(breed)
    }
}
