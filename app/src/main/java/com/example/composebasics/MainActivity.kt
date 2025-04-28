package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebasics.component.ButtonWithIcon
import com.example.composebasics.component.CornerCutShapeButton
import com.example.composebasics.component.EditTextExample
import com.example.composebasics.component.ElevatedButtonExample
import com.example.composebasics.component.ImageViewExample
import com.example.composebasics.component.NotOutlinedEditTextExample
import com.example.composebasics.component.RoundedCornerShapeButton
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxSize()
                            .padding(start = 12.dp, end = 12.dp)
                    ){
                        EditTextExample()
                        NotOutlinedEditTextExample()
                        ButtonWithIcon()
                        CornerCutShapeButton()
                        RoundedCornerShapeButton()
                        ElevatedButtonExample()
                        ImageViewExample()
                        
                }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBasicsTheme {
        Greeting("Android")
    }
}