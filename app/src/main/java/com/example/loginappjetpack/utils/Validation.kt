package com.example.loginappjetpack.utils

import android.widget.Toast

fun validateInputs(
    email: String,
    password: String,
    context: android.content.Context // Pass the context to show Toast
) {
    when {
        !email.contains("@") || !email.contains(".com") || email.any { it.isWhitespace() || !it.isLetterOrDigit() } -> {
            // Show toast for incorrect email
            Toast.makeText(context, "Incorrect email address", Toast.LENGTH_SHORT).show()
        }
        password.length < 10 -> {
            // Show toast for password less than 10 characters
            Toast.makeText(context, "Password less than 10 digits", Toast.LENGTH_SHORT).show()
        }
        else -> {
            // Show toast for successful sign-in
            Toast.makeText(context, "Sign in Successful", Toast.LENGTH_SHORT).show()
        }
    }
}
