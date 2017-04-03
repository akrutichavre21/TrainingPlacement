<g:applyLayout name = "mainLayout">
<html>
<head></head>
<body>
<content tag = "body">

<g:form controller="company" action="update" method="post">
<input type="hidden" name = "id" value= "${editinstance.id}">

 Enter Company Name:
 <input type="text" name="companyname"  value ="${editinstance.companyName}" required >
 <br>
 <br>



  Enter Biodata:
  <input type="text" name="biodata"    value ="${editinstance.bioData}"  required >
  <br>
  <br>



   Enter Headquarters:
   <input type="text" name="headquarters"   value ="${editinstance.headQuarters}" required >
   <br>
   <br>


 Enter Minimum salary:
 <input type="number" name="salarymin"  value ="${editinstance.salaryMin}"  required >
 <br>
 <br>



 Enter Maximum salary:
 <input type="number" name="salarymax"  value ="${editinstance.salaryMax}" required >
 <br>
 <br>



 Enter Aggregate Criteria:
 <input type="number" name="criteriaaggregate" value ="${editinstance.criteriaAggregate}" required >
  <br>
  <br>


 Enter Backlog criteria:
  <input type="number" name="criteriabacklog"  value ="${editinstance.criteriaBacklog}" required>
  <br>
   <br>


  Enter Tenth criteria:
    <input type="number" name="criteriatenth" value ="${editinstance.criteriaTenth}"  required >
   <br>
   <br>


   Enter Twelfth criteria:
   <input type="number" name="criteriatwelfth"  value ="${editinstance.criteriaTwelfth}"  required >
    <br>
    <br>



   Enter Branch criteria:
   <input type="text" name="criteriabranch"  value ="${editinstance.criteriaBranch}" required >
     <br>
     <br>

     <input type="submit" value="submit">



 </g:form>

</content>
</body>
</html>
</g:applyLayout>