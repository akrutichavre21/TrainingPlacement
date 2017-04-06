<g:applyLayout name = "mainLayout">
<html>
<head> </head>
<body>
<content tag = "body">

    <g:if test="${profile}">
        <div class="card" style="padding:10px 10px" >

                    <p>Name:${profile.fullName}</p>
                    <p>College: ${profile.college}</p>
                    <p>Contact: ${profile.contactNo}</p>
                    <p>DOB: ${profile.dateOfBirth}</p>
                   <g:link controller="settings" action="profile">
                    <button type="submit">Edit</button>
                   </g:link>
        </div>
    </g:if>

</content>
</body>
</html>
</g:applyLayout>
