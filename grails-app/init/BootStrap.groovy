import com.trainingPlacement.SpringSecurity.*

class BootStrap {

    def init = { servletContext ->
        def adminrole = new Role(authority:'ROLE_ADMIN').save(flush:true)
        def testuser = new User(username:'admin',password:'admin').save(flush:true)
        UserRole.create testuser,adminrole
    }
    def destroy = {
    }
}
