import com.trainingPlacement.Profile.Profile
import com.trainingPlacement.SpringSecurity.*

class BootStrap {

    def init = { servletContext ->
        def adminrole = new Role(authority:'ROLE_ADMIN').save(flush:true)
        def testuser = new User(username:'admin',password:'admin').save(flush:true)
        UserRole.create testuser,adminrole

        def currentuser = User.findByUsername('admin')
        def currentuserid = currentuser.id;

            def profile = new Profile([
                    fullName: "Admin",
                    gender  : Profile.Gender.MALE,
                    user   : currentuserid,
                    contactNo:123,
                    dateOfBirth:new Date(),
                    college :"ssgi"
            ])

            profile.save()
            println "admin saved"
    }
    def destroy = {
    }
}
