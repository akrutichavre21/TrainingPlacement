<g:applyLayout name="mainLayout">
 <html>
    <head> </head>
    <body>
        <content tag="body">

         <g:form controller="feedback" action="save" method="post">
          Company Name :
          <select name="cname">
            <g:each in="${abc}">
                <option value="${it.companyName}">${it.companyName}</option>
            </g:each>
          </select>

          <br>
          <br>
          Status :
          <br>
          <input type="radio" name="status" value="1"> Selected <br>
          <input type="radio" name="status" value="2"> Rejected <br>
          <br>
          <br>
          Review :
          <br>
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