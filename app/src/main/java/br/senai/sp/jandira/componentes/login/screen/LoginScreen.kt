package br.senai.sp.jandira.componentes.login.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.componentes.login.components.Form
import br.senai.sp.jandira.componentes.login.components.Header

@Composable
fun LoginScreen(navController: NavController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)
    ) {
//        Header()
//        Form()
        Text(text = "LOGIN", color = Color.White, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(200.dp))
        Button(
            onClick = { navController.navigate("menu") },
            colors = ButtonDefaults.buttonColors(Color.White)) {

            Text(text = "Entrar", color = Color.Blue)
    }
    }
}



//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun LoginScreenPreview(navController: NavHostController) {
//    LoginScreen()
//}