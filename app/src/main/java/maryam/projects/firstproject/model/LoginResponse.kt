package maryam.projects.firstproject.model

data class LoginResponse(
    val data: LoginData,
    val message: String,
    val status: Boolean,
    val token: String
)