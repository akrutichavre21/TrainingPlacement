<g:applyLayout name="mainLayoutStudent">
 <html>
    <head>
    </head>
    <body>
        <content tag="body">

      <g:if test="${abc}">
         <g:each in="${abc}">

               <div class="card" style="padding:20px 20px 20px 20px">
                <p> Company Name is : ${it.companydetails.companyName} </p>
                <p> Arrival Date is : ${it.arrivalDate} </p>
                <p> Date of Creation : ${it.dateCreated} </p>
                <p> Last Update : ${it.lastUpdate} </p>
                <p> Notice : ${it.notice} </p>
                <p> Venue : ${it.venue} </p>

                <g:link controller="schedule" action="edit" id="${it.id}"> <button type="button" name="edit"> EDIT </button> </g:link>
                <g:link controller="schedule" action="delete" id="${it.id}" > <button type="button" name="delete"> DELETE </button> </g:link>
                </div>

               </g:each>
      </g:if>
      <g:else>
        <h3>No newsfeeds updated.</h3>
      </g:else>

        </content>
    </body>
 </html>
 </g:applyLayout>