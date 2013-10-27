package com.kanwal.twitter

import org.springframework.security.access.annotation.Secured

class StatusController {

    @Secured(['ROLE_USER'])
    def index() { }


    @Secured(['ROLE_USER'])
    def updateStatus() {
        render "Updated "+params?.message
    }
}
