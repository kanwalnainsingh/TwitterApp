import com.kanwal.twitter.auth.Authority
import com.kanwal.twitter.auth.Person
import com.kanwal.twitter.auth.PersonAuthority

class BootStrap {

    def springSecurityService
    def init = { servletContext ->

      if(!Person.count()) {

          def userRole =  new Authority(authority: "ROLE_USER").save()
          def person = new Person(realName: 'Kanwal Nain Singh',password: '123',username: 'kns').save()
          PersonAuthority.create(person,userRole,true)
      }
    }
    def destroy = {
    }
}
