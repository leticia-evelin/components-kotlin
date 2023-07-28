package br.senai.sp.jandira.componentes.components

import android.util.Log
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeTexto(
    texto: String,
    meuType: KeyboardType,
    estado: String,
    aoDigitar: (String) -> Unit //ao digitar executar uma funcao
) {
    OutlinedTextField(
        value = estado,
        onValueChange = {
            aoDigitar(it)
        },
        label = {
            Text(text = texto)
        },
        keyboardOptions =
        KeyboardOptions(keyboardType = meuType)  // personalizar para configurar o keyboardType de acordo com o uso necessario
    )
}