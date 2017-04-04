<g:applyLayout name="mainLayout">
 <html>
    <head> </head>
    <body>
        <content tag="body">

        <g:each in="${abc}">

        <div class="card" style="padding:20px 20px 20px 20px">
         <p> Company Name is : ${it.companydetails.companyName} </p>
         <p> Your Status is : ${it.status} </p>
         <p> Review : ${it.review} </p>
         <p> Date of Creation : ${it.dateCreated} </p>
         <p> Last Update : ${it.lastUpdate} </p>

         <g:link controller="feedback" action="edit" id="${it.id}"> <button type="button" name="edit"> EDIT </button> </g:link>
         <g:link controller="feedback" action="delete" id="${it.id}" > <button type="button" name="delete"> DELETE </button> </g:link>
         </div>

        </g:each>
        </content>
    </body>
 </html>
 </g:applyLayout>