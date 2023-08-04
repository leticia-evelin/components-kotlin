package br.senai.sp.jandira.componentes.menu.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)
    ) {

        Text(text = "MENU", color = Color.White, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate("perfil/Leticia Evelin/18") }) {

            Text(text = "Perfil", color = Color.White)
        }

        Button(onClick = { navController.navigate("pedidos") }, colors = ButtonDefaults.buttonColors(Color.White)) {

            Text(text = "Pedidos", color = Color.Blue)
        }
        Button(onClick = { navController.navigate("login") }, colors = ButtonDefaults.buttonColors(Color.White)) {

            Text(text = "Sair", color = Color.Blue)
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun MenuScreenPreview() {
//    MenuScreen()
//}