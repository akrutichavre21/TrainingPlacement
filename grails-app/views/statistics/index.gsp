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

        </div>

       </g:each>

        </content>
    </body>
 </html>
 </g:applyLayout>