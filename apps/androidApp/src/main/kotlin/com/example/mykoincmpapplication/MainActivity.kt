package com.example.mykoincmpapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.module1.di.feature1Module
import com.example.module2.di.feature2Module
import org.koin.core.context.loadKoinModules

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        initKoin {
            modules(
                feature1Module(dependency1 = { Dependency1() })
            )
        }

        loadKoinModules(
            feature2Module(dependency2 = { Dependency2() })
        )

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}