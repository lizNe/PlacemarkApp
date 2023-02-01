package ie.setu.placemarkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import timber.log.Timber.i

class PlacemarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)

        Timber.plant(Timber.DebugTree())
       // Timber.i("Placemark Activity started..")

        i("Placemark Activity started...")





    }
}