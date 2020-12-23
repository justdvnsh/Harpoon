package divyansh.tech.harpoon

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HarpoonAppplication: Application() {

    override fun onCreate() = super.onCreate()
}