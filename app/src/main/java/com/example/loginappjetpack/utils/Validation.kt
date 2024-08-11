package com.example.loginappjetpack.utils

import android.content.Context
import android.widget.Toast

fun validateInputs(
    email: String,
    password: String,
    context: Context
): Boolean {
    val emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$".toRegex()
    val passwordPattern = "^[A-Za-z0-9]{10,}$".toRegex()

    return when {
        !emailPattern.matches(email) -> {
            Toast.makeText(context, "Incorrect email address", Toast.LENGTH_SHORT).show()
            false
        }
        !passwordPattern.matches(password) -> {
            Toast.makeText(context, "Password less than 10 digits", Toast.LENGTH_SHORT).show()
            false
        }
        else -> {
            Toast.makeText(context, "Sign in Successful", Toast.LENGTH_SHORT).show()
            true
        }
    }
}