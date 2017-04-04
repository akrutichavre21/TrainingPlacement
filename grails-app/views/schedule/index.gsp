<g:applyLayout name="mainLayout">
 <html>
    <head> </head>
    <body>
        <content tag="body">

         <g:form controller="schedule" action="save" method="post">
          Company Name :
           <select name="cname">
             <g:each in="${abc}">
                 <option value="${it.companyName}">${it.companyName}</option>
             </g:each>
           </select>
          <br>
          <br>
          Arrival Date :
          <input type="date" name="arrival" required>
          <br>
          <br>
          Notice :
          <input type="text" name="notice" required>
          <br>
          <br>
          Venue :
          <input type="text" name="venue" required>
          <br>
          <br>
         <input type="submit" name="Submit">
         </g:form>

        </content>
    </body>
 </html>
 </g:applyLayout>