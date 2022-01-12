package com.sphephelo.weatherapp



import androidx.test.core.app.ActivityScenario.launch
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest {
    @Test
    fun ForecastTest() {

        val activityScenario = launch(MainActivity::class.java);
        val result = MainActivity().startForecast("hellow");
        assertTrue(result);


    }
}
