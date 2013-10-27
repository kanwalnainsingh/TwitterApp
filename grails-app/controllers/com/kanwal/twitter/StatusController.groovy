package com.kanwal.twitter

import com.kanwal.twitter.auth.Person
import org.springframework.security.access.annotation.Secured

class StatusController {

    def springSecurityService
    @Secured(['ROLE_USER'])
    def index() { }


    @Secured(['ROLE_USER'])
    def updateStatus() {

        def status = new Status(message: params)
        status.author = lookupPerson()
        status.save()
        def messages = currentUserTimeline()
        render template:"messages" , collection: messages, var: 'message'
    }

    private currentUserTimeline(){

      def messages = Status .withCriteria {
          author{

              eq 'username',lookupPerson()
          }
          memoizeAtLeast 10
          order 'dateCreated','desc'

      }

    }

    private lookupPerson(){

        Person.get(springSecurityService.principal.id)

    }
}
