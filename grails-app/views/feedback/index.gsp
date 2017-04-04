<g:applyLayout name="mainLayout">
 <html>
    <head> </head>
    <body>
        <content tag="body">

         <g:form controller="feedback" action="save" method="post">
          Company Name :
          <input type="text" name="cname" required>
          <br>
          <br>
          Status :
          <input type="radio" name="selected" value="1"> Selected <br>
          <input type="radio" name="rejected" value="2"> Rejected <br>
          <br>
          <br>
          Review :
          <textarea name="review" rows="4" cols="50">
          </textarea>
          <br>
          <br>

         <input type="submit" name="Submit">
         </g:form>

        </content>
    </body>
 </html>
 </g:applyLayout>