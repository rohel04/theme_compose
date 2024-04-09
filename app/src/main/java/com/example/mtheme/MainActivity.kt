package com.example.mtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.mtheme.ui.theme.AppTheme
import com.example.mtheme.ui.theme.MThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    val theme = remember {
        mutableStateOf(false)
    }
    AppTheme(theme.value) {
        Column (
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
        ){
            CustomText(theme.value)
            Button(onClick = {
                theme.value=!theme.value

            }) {
                Text(text = "Change Theme")
            }
            
        }
    }
}

@Composable
fun CustomText(isLightTheme:Boolean){
//    val textColor=if(isLightTheme){
//        Color.White
//    }else{
//        Color.Black
//    }
    Text(text = "Hello", style = MaterialTheme.typography.headlineLarge.copy(color = MaterialTheme.colorScheme.surface))

}