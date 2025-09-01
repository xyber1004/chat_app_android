package org.xyber.chat_kmp.auth

import AuthViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.xyber.chat_kmp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterView(authViewModel: AuthViewModel) {

    var emailController by remember { mutableStateOf("") }
    var passwordController by remember { mutableStateOf("") }
    var confirmPasswordController by remember { mutableStateOf("") }

    return Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        OutlinedTextField(
            value = emailController,
            onValueChange = { emailController = it },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFeb4d1c).copy(alpha = 0.1f), shape = RoundedCornerShape(10.dp)),
            shape = RoundedCornerShape(10.dp,),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFeb4d1c),
                unfocusedBorderColor = Color(0xFFeb4d1c).copy(alpha = 0.5f),
                cursorColor = Color(0xFFeb4d1c)
            ),
            textStyle = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
            ),
            placeholder = { Text("Email", style = TextStyle(
                fontFamily = FontFamily(Font(R.font.nunito)),
                fontWeight = FontWeight.SemiBold),) },

            )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = passwordController,
            onValueChange = { passwordController = it },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFeb4d1c).copy(alpha = 0.1f), shape = RoundedCornerShape(10.dp)),
            shape = RoundedCornerShape(10.dp,),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFeb4d1c),
                unfocusedBorderColor = Color(0xFFeb4d1c).copy(alpha = 0.5f),
                cursorColor = Color(0xFFeb4d1c)
            ),
            textStyle = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
            ),
            placeholder = { Text("Password", style = TextStyle(fontFamily = FontFamily(Font(R.font.nunito)),fontWeight = FontWeight.SemiBold),) },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = confirmPasswordController,
            onValueChange = { confirmPasswordController = it },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFeb4d1c).copy(alpha = 0.1f), shape = RoundedCornerShape(10.dp)),
            shape = RoundedCornerShape(10.dp,),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFeb4d1c),
                unfocusedBorderColor = Color(0xFFeb4d1c).copy(alpha = 0.5f),
                cursorColor = Color(0xFFeb4d1c)
            ),
            textStyle = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
            ),
            placeholder = { Text("Password", style = TextStyle(fontFamily = FontFamily(Font(R.font.nunito)),fontWeight = FontWeight.SemiBold),) },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedButton(
            onClick = {
//                println("Email Controller: $emailController")
//                println("Password Controller: $passwordController")
                authViewModel.register(emailController, passwordController)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonColors(
                containerColor = Color(0xFFeb4d1c),
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 8.dp,
                pressedElevation = 0.dp,
                disabledElevation = 0.dp
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text("Register", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily(Font(R.font.nunito))
                )
            )
        }

    }
}