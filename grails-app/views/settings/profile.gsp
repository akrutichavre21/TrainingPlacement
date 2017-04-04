<g:applyLayout name = "mainLayout">
<html>
<head> </head>
<body>
<content tag = "body">

<g:form controller="settings" action="save" method="post">

 FULLNAME:
 <input type="text" name="fullName" required >
 <br>
 <br>


 COLLEGE:
 <input type ="text"  name="college" required>
 <br>
 <br>


 CONTACT NUMBER:
 <input type ="number"  name="contactNumber" required>
 <br><br>

 DATE OF BIRTH:

 <input type ="date"  name="dateOfbirth" required>
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
