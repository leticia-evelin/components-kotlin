package br.senai.sp.jandira.componentes.login.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.componentes.components.CaixaDeTexto

@Composable
fun Form() {
    var emailState by remember {
        mutableStateOf("")
    }

    var senhaState by remember {
        mutableStateOf("")
    }

    Card() {
        Column() {
           CaixaDeTexto(
               texto = "E-mail",
               meuType = KeyboardType.Email,
               emailState,
               //passar uma funcao para ser executado dentro de outra
               aoDigitar = {
                    emailState = it // it é o valor que a funcao me passou ao digitar
               }
           )
           CaixaDeTexto(
               texto = "Senha",
               meuType = KeyboardType.Password,
               senhaState,
               aoDigitar = {
                    senhaState = it // ao digitar esta voltado para mim
               }
           )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}