package br.com.rafaseron.residencialdigital

import android.os.Bundle
import android.widget.EditText
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import br.com.rafaseron.residencialdigital.databinding.ActivityMainBinding
import br.com.rafaseron.residencialdigital.navigation.NavHostComposable
import com.example.compose.AppTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Views code
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

    // Splash screen code
//    var splashTime = MutableStateFlow(true)
//    lifecycleScope.launch{
//        delay(500)
//        splashTime = MutableStateFlow(false)
//    }
//    installSplashScreen().apply {
//        setKeepOnScreenCondition {
//            splashTime.value
//        }
//    }

    setContent{
        val navController = rememberNavController()
        AppTheme {
            Scaffold { paddingValues ->
                Box(modifier = Modifier.padding(paddingValues)) {
                    NavHostComposable(navController = navController)
                }
            }
        }

    }

    }
}