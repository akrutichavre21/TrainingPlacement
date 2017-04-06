<g:applyLayout name="mainLayout">
  <html>
     <head> </head>
     <body>
         <content tag="body">

          <g:form controller="schedule" action="update" method="post">
           <input type="hidden" name="id" value="${editInstance.id}">
           Company Name :
           <input type="text" name="cname" value="${editInstance.companydetails.companyName}" disabled>
           <br>
           <br>
           Arrival Date :
           <input type="date" name="arrival" value="${editInstance.arrivalDate}" required>
           <br>
           <br>
           Notice :
           <input type="text" name="notice" value="${editInstance.notice}" required>
           <br>
           <br>
           Venue :
           <input type="text" name="venue" value="${editInstance.venue}" required>
           <br>
           <br>
          <input type="submit" name="Submit">
          </g:form>

         </content>
     </body>
  </html>
  </g:applyLayout>