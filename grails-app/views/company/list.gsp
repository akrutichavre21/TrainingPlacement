<g:applyLayout name = "mainLayout">
<html>
<head> </head>
<body>
<content tag = "body">



<g:each in="${abc}">

<div class="card" style=padding:"20px 20px 20px 20px">

<p> Company Name is: ${it.companyName}</p>
<p>  Biodata: ${it.bioData}</p>
<p>  Minimum Salary: ${it.salaryMin}</p>
<p>  Maximum Salary: ${it.salaryMax}</p>
<p>  Headquarters: ${it.headQuarters}</p>
<p>  Aggregate Criteria: ${it.criteriaAggregate}</p>
<p>   Backlog Criteria: ${it.criteriaBacklog}</p>
<p>    Tenth Criteria: ${it.criteriaTenth}</p>
<p>   Twelfth Criteria: ${it.criteriaTwelfth}</p>
<p>      Branch  Criteria: ${it.criteriaBranch}</p>



<g:link controller="company" action="edit" id= "${it.id}"> <button type ="button" name ="edit">EDIT</button></g:link>
<g:link controller="company" action="delete" id= "${it.id}"> <button type ="button" name ="delete">DELETE</button></g:link>

</div>

</g:each>


 </content>
 </body>
 </html>
 </g:applyLayout>



















