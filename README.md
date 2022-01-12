# WeatherApp
Kotlin Weather App developed using OpenWeatherMap API.

Retrofit 2 (REST API) was used to fetch the Open Weather Data in order to create this weather app.
This app retrives weather location for your current locatin
Hence,the starting point is getting the user's location.

I used Location Manager instead of the new fused location provider
because Fused Location Provider is depedent on Google Play Services
Hence it will not be compatible with
Android Devices without Google Play Services (e.g Huawei )
Meaning the App wouldn't have worked properly on Huawei Devices
if we had used Fused Location Provider

This App gives users the current weather data and a 5 day forecast.

