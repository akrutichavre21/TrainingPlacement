<g:applyLayout name="mainLayoutStudent">
 <html>
    <head> </head>
    <body>
        <content tag="body">

         <g:form controller="feedback" action="update" method="post">
           <input type="hidden" name="id" value="${editInstance.id}">
          Company Name :
          <select name="cname">
           <option selected disabled value="${editInstance.companydetails.companyName}"> ${editInstance.companydetails.companyName} </option>
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
          ${editInstance.review}
          </textarea>
          <br>
          <br>

         <input type="submit" name="Submit">
         </g:form>

        </content>
    </body>
 </html>
 </g:applyLayout>