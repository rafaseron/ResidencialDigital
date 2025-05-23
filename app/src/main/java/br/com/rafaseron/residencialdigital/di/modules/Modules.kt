package br.com.rafaseron.residencialdigital.di.modules

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val authModule =
    module {
        //single { provideKtorClient() }
        single { provideAuthDataStore(androidContext()) }
    }

//fun provideKtorClient(){
//
//}

val Context.authDataStore: DataStore<Preferences> by preferencesDataStore(name = "auth")

fun provideAuthDataStore(context: Context): DataStore<Preferences>{
    return context.authDataStore
}