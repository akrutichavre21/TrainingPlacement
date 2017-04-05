<g:applyLayout name="mainLayout">
  <!DOCTYPE html>
  <html>
  	<head>
  	</head>
  	<body>
      <content tag="body">
      <g:form controller="question" action ="save" method= "post">

        Company Name :
                 <select name="cname">
                   <g:each in="${abc}">
                       <option value="${it.companyName}">${it.companyName}</option>
                   </g:each>
                 </select><br><br>

      Question:<br>
       <textarea name="question" rows="3" cols="50" ></textarea>
        <br><br>
       Answer:<br>
        <textarea name="answer" rows="3" cols="50"></textarea>
        <button type="submit" name="submit">SUBMIT</button>
        </g:form>
         </content>
  	</body>
  </html>
  </g:applyLayout>
