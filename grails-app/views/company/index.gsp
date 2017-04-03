<g:applyLayout name = "mainLayout">
<html>
<head></head>
<body>
<content tag = "body">

<g:form controller="company" action="save" method="post">

 Enter Company Name:
 <input type="text" name="companyname" required >
 <br>
 <br>



  Enter Biodata:
  <input type="text" name="biodata" required >
  <br>
  <br>



   Enter Headquarters:
   <input type="text" name="headquarters" required >
   <br>
   <br>


 Enter Minimum salary:
 <input type="number" name="salarymin" required >
 <br>
 <br>



 Enter Maximum salary:
 <input type="number" name="salarymax" required >
 <br>
 <br>



 Enter Aggregate Criteria:
 <input type="number" name="criteriaaggregate" required >
  <br>
  <br>


 Enter Backlog criteria:
  <input type="number" name="criteriabacklog" required>
  <br>
   <br>


  Enter Tenth criteria:
    <input type="number" name="criteriatenth" required >
   <br>
   <br>


   Enter Twelfth criteria:
   <input type="number" name="criteriatwelfth" required >
    <br>
    <br>



   Enter Branch criteria:
   <input type="text" name="criteriabranch" required >
     <br>
     <br>

     <input type="submit" value="submit">



 </g:form>

</content>
</body>
</html>
</g:applyLayout>