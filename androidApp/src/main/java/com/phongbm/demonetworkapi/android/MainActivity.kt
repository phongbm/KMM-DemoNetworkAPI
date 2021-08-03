package com.phongbm.demonetworkapi.android

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.phongbm.demonetworkapi.Greeting

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityContentView(::doCallApi)
        }
    }

    private fun doCallApi() {
        Log.d(TAG, "doCallApi()...")
        viewModel.callApi()
    }
}

@Composable
fun MainActivityContentView(doCallApi: () -> Unit) {
    MaterialTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = Greeting().greeting()
            )

            Button(
                onClick = {
                    doCallApi()
                },
                modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)
            ) {
                Text(text = "Call API")
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun MainActivityContentView_Preview() {
    MainActivityContentView {}
}