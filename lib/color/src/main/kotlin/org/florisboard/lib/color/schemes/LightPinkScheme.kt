/*
 * Copyright (C) 2025 The FlorisBoard Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.florisboard.lib.color.schemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

private val primaryLight = Color(0xFF8B4A61)
private val onPrimaryLight = Color(0xFFFFFFFF)
private val primaryContainerLight = Color(0xFFFFD9E3)
private val onPrimaryContainerLight = Color(0xFF6F334A)
private val secondaryLight = Color(0xFF74565F)
private val onSecondaryLight = Color(0xFFFFFFFF)
private val secondaryContainerLight = Color(0xFFFFD9E3)
private val onSecondaryContainerLight = Color(0xFF5A3F48)
private val tertiaryLight = Color(0xFF7D5635)
private val onTertiaryLight = Color(0xFFFFFFFF)
private val tertiaryContainerLight = Color(0xFFFFDCC2)
private val onTertiaryContainerLight = Color(0xFF623F20)
private val errorLight = Color(0xFFBA1A1A)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFFFDAD6)
private val onErrorContainerLight = Color(0xFF93000A)
private val backgroundLight = Color(0xFFFFF8F8)
private val onBackgroundLight = Color(0xFF22191C)
private val surfaceLight = Color(0xFFFFF8F8)
private val onSurfaceLight = Color(0xFF22191C)
private val surfaceVariantLight = Color(0xFFF2DDE2)
private val onSurfaceVariantLight = Color(0xFF514347)
private val outlineLight = Color(0xFF837377)
private val outlineVariantLight = Color(0xFFD5C2C6)
private val scrimLight = Color(0xFF000000)
private val inverseSurfaceLight = Color(0xFF372E30)
private val inverseOnSurfaceLight = Color(0xFFFDEDF0)
private val inversePrimaryLight = Color(0xFFFFB0C9)
private val surfaceDimLight = Color(0xFFE6D6D9)
private val surfaceBrightLight = Color(0xFFFFF8F8)
private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
private val surfaceContainerLowLight = Color(0xFFFFF0F2)
private val surfaceContainerLight = Color(0xFFFAEAED)
private val surfaceContainerHighLight = Color(0xFFF5E4E7)
private val surfaceContainerHighestLight = Color(0xFFEFDFE1)

private val primaryDark = Color(0xFFFFB0C9)
private val onPrimaryDark = Color(0xFF541D33)
private val primaryContainerDark = Color(0xFF6F334A)
private val onPrimaryContainerDark = Color(0xFFFFD9E3)
private val secondaryDark = Color(0xFFE2BDC7)
private val onSecondaryDark = Color(0xFF422931)
private val secondaryContainerDark = Color(0xFF5A3F48)
private val onSecondaryContainerDark = Color(0xFFFFD9E3)
private val tertiaryDark = Color(0xFFEFBC94)
private val onTertiaryDark = Color(0xFF48290C)
private val tertiaryContainerDark = Color(0xFF623F20)
private val onTertiaryContainerDark = Color(0xFFFFDCC2)
private val errorDark = Color(0xFFFFB4AB)
private val onErrorDark = Color(0xFF690005)
private val errorContainerDark = Color(0xFF93000A)
private val onErrorContainerDark = Color(0xFFFFDAD6)
private val backgroundDark = Color(0xFF191113)
private val onBackgroundDark = Color(0xFFEFDFE1)
private val surfaceDark = Color(0xFF191113)
private val onSurfaceDark = Color(0xFFEFDFE1)
private val surfaceVariantDark = Color(0xFF514347)
private val onSurfaceVariantDark = Color(0xFFD5C2C6)
private val outlineDark = Color(0xFF9E8C90)
private val outlineVariantDark = Color(0xFF514347)
private val scrimDark = Color(0xFF000000)
private val inverseSurfaceDark = Color(0xFFEFDFE1)
private val inverseOnSurfaceDark = Color(0xFF372E30)
private val inversePrimaryDark = Color(0xFF8B4A61)
private val surfaceDimDark = Color(0xFF191113)
private val surfaceBrightDark = Color(0xFF403739)
private val surfaceContainerLowestDark = Color(0xFF140C0E)
private val surfaceContainerLowDark = Color(0xFF22191C)
private val surfaceContainerDark = Color(0xFF261D20)
private val surfaceContainerHighDark = Color(0xFF31282A)
private val surfaceContainerHighestDark = Color(0xFF3C3235)


val lightPinkLightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

val lightPinkDarkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)
