<g:applyLayout name = "mainLayoutStudent">
<html>
<head> </head>
<body>
<content tag = "body">

<g:form controller="settings" action="s_save" method="post">

<input type="hidden" name='id' value="${profile.id}">

 FULLNAME:
 <input type="text" name="fullname" value="${profile.fullName}" required >
 <br>
 <br>


 COLLEGE:
 <input type ="text"  name="college" value="${profile.college}" required>
 <br>
 <br>


 CONTACT NUMBER:
 <input type ="number"  name="contact" value="${profile.contactNo}" required>
 <br><br>

 DATE OF BIRTH:

 <input type ="date"  name="dob" required>
 <br>
 <br>

   GENDER:
  <select class="form-control" name="gender" id="gender" required="required"><br>
              <option disabled selected value="">--Select a status--</option>
               <option value="Male">Male</option>
               <option value="Female">Female</option>
                </select><br><br>


<input type = "submit" value = "submit">

 </g:form>

</content>
</body>
</html>
</g:applyLayout>
