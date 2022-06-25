package com.pinheiro.appjetpackcomposecv

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.pinheiro.appjetpackcomposecv.ui.theme.AppJetpackComposeCvTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppJetpackComposeCvTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Screen()
                                   }
            }
        }
    }
}

@Composable
fun AuthorInformation() {
        Row(verticalAlignment = Alignment.Top) {
                Column {
                    Row(verticalAlignment = Alignment.Top) {
                        Image(
                            painter = painterResource(id = R.drawable.perfil),
                            contentDescription = "Author"
                        )
                    }
            Text("Mateus Pinheiro")
            Text("Dev Android Jr.")
            Text("GitHub: mateeuspinheiro")
        }
        Column {
            Text("Graduate Systems Analyst")
            Text("Extensive experiencie with databases {Oracle / Postgres / Firebird / MySql / Sqlite")
            Text("+8 years of experience working as mobile development team supervisor and deployment team")


        }
    }
}

@Preview
@Composable
fun Screen() {
    AuthorInformation()
}