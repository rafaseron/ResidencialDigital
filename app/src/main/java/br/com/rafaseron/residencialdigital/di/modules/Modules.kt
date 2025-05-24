package br.com.rafaseron.residencialdigital.di.modules

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule =
    module {
        single { provideKtorClient() }
        single { provideAuthDataStore(androidContext()) }
    }

fun provideKtorClient() =
    HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
        install(HttpRequestRetry)
        install(Logging)
    }

val Context.authDataStore: DataStore<Preferences> by preferencesDataStore(name = "auth")

fun provideAuthDataStore(context: Context): DataStore<Preferences> = context.authDataStore
