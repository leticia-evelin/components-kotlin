package br.senai.sp.jandira.componentes.perfil.screen

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
fun PerfilScreen(navController: NavController, nome: String, idade: String) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)
    ) {

        Text(text = "PERFIL - $nome - $idade" , color = Color.White)
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate("menu") }, colors = ButtonDefaults.buttonColors(Color.White)) {

            Text(text = "Voltar", color = Color.Blue)
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun PerfilScreenPreview() {
//    PerfilScreen()
//}