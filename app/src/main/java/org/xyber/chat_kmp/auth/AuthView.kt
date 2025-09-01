package org.xyber.chat_kmp.auth

import AuthViewModel
import androidx.compose.foundation.BorderStroke
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
import androidx.navigation.NavController
import org.xyber.chat_kmp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthView(
    authViewModel: AuthViewModel,
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ElevatedButton(
            onClick = {
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
            Text(
                "Sign In", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily(Font(R.font.nunito))
                )
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedButton(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonColors(
                containerColor = Color.White,
                contentColor = Color(0xFFeb4d1c),
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray,
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 8.dp,
                pressedElevation = 0.dp,
                disabledElevation = 0.dp
            ),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, Color(0xFFeb4d1c))
        ) {
            Text(
                "Register", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily(Font(R.font.nunito))
                )
            )
        }
    }

}