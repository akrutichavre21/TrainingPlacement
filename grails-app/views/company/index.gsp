<g:applyLayout name="mainLayout">
 <html>
    <head> </head>
    <body>
        <content tag="body">

         <g:form controller="schedule" action="save" method="post">
            Company Name :
            <input type="text" name="cname" required>
            <br>
            <br>
            Biodata :
            <input type="text" name="biodata" required>
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