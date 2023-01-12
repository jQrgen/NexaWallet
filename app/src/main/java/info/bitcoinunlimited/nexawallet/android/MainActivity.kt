package info.bitcoinunlimited.nexawallet.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import co.touchlab.kermit.Logger
import info.bitcoinunlimited.nexawallet.android.theme.KaMPKitTheme
import info.bitcoinunlimited.nexawallet.injectLogger
import info.bitcoinunlimited.nexawallet.models.BreedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinComponent

class MainActivity : ComponentActivity(), KoinComponent {

    private val log: Logger by injectLogger("MainActivity")
    private val viewModel: BreedViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KaMPKitTheme {
                MainScreen(viewModel, log)
            }
        }
    }
}
