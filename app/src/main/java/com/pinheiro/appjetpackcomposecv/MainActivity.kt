package com.pinheiro.appjetpackcomposecv

import android.media.Image
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

            Column {
                //declaracao de variaves:
                val boxHeight = remember {
                    140.dp
                }
                val imageHeight = remember {
                    boxHeight
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Color(0xFF2d333b), shape = RoundedCornerShape(
                                bottomStart = 12.dp,
                                bottomEnd = 12.dp
                            )
                        )
                        .height(boxHeight)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.perfil),
                        contentDescription = "Author",
                        modifier = Modifier
                            .size(128.dp)
                            .clip(CircleShape) // coloca no círculo
                            .border(1.dp, Color.DarkGray, CircleShape) // borda do círculo
                    )
                    Spacer(modifier = Modifier.height(imageHeight / 2 ))
                    Column(
                        Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                                                  
                        Text("Mateus Pinheiro", color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp)
                        Text("Dev Android Jr.", color = Color.White)
                        Text("GitHub: mateeuspinheiro", color = Color.White,
                            fontStyle = FontStyle.Italic)
                    }
                }
                Column (Modifier
                    .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Graduate Systems Analyst. Extensive experiencie with databases {Oracle / Postgres / Firebird / MySql / Sqlite." +
                            "+8 years of experience working as mobile development team supervisor and deployment team")
                }
            }
}

@Preview
@Composable
fun Screen() {
    AuthorInformation()
}