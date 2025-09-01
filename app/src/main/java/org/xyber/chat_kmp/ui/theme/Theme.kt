package org.xyber.chat_kmp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import org.xyber.chat_kmp.R

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun Chat_KMPTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(
            displayLarge = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            displayMedium = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            displaySmall = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),

            headlineLarge = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            headlineMedium = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            headlineSmall = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),

            titleLarge = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            titleMedium = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            titleSmall = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),

            bodyLarge = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            bodyMedium = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            bodySmall = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),

            labelLarge = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            labelMedium = TextStyle(fontFamily = FontFamily(Font(R.font.nunito))),
            labelSmall = TextStyle(fontFamily = FontFamily(Font(R.font.nunito)))
        ),
        content = content
    )
}