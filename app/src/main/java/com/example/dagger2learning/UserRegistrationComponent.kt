package com.example.dagger2learning

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService

    fun getEmailService() : EmailService
}