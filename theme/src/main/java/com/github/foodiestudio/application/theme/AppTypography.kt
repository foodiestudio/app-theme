package com.github.foodiestudio.application.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

/**
 * FIXME 以下这些名称会比较稳定，单具体的数值后续可能还需要调整
 */

/**
 * (参考M3)定义限定的几种，有点类似于使用 markdown 来排版，一般页面设计来说够用了，个别情况单独处理就可以。
 */
@Immutable
data class AppTypography(
    // FIXME display 一般很少用到,暂时注释掉
//    val displayLarge: TextStyle,
//    val displayMedium: TextStyle,
//    val displaySmall: TextStyle,

    // 用于大标题
    val headlineLarge: TextStyle,
    val headlineMedium: TextStyle,
    val headlineSmall: TextStyle,

    // 用于小标题，相比正文要稍稍大一点以及粗一点
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,

    // 用于正文
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,

    // 用于可交互的控件，比如 Button
    val labelLarge: TextStyle,
    val labelMedium: TextStyle,
    val labelSmall: TextStyle
)