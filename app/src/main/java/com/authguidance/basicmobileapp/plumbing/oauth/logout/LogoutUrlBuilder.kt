package com.authguidance.basicmobileapp.plumbing.oauth.logout

import net.openid.appauth.AuthorizationServiceConfiguration

/*
 * An abstraction to allow us to implement logout differently for Cognito and Okta
 */
interface LogoutUrlBuilder {

    // Form the full logout request URL with query string parameters
    fun getEndSessionRequestUrl(metadata: AuthorizationServiceConfiguration, idTokenHint: String): String
}