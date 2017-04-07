<g:applyLayout name = "mainLayoutStudent">
<html>
<head> </head>
<body>
<content tag = "body">

<g:form controller="settings" action="s_changePassword" method="post">


Current Password:
 <input type="password" name="current_password" required >
 <br>
 <br>


 New Password:
  <input type="password" name="new_password" required >
  <br>
  <br>

  Confirm Password:
   <input type="password" name="confirm_password" required >
   <br>
   <br>

 <button type = "submit" name ="submit">SUBMIT</button>




 </g:form>

</content>
</body>
</html>
</g:applyLayout>