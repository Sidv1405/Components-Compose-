package com.dvsi.demoallcomponentscompose.component.badge

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable


@Composable
fun BadgeBasicExample() {
    BadgedBox(
        badge = {
            Badge()
        }
    ) {
        Icon(
            imageVector = Icons.Filled.Email,
            contentDescription = "Email"
        )
    }
}