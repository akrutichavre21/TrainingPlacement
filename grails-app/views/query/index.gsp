<g:applyLayout name="mainLayout">
  <!DOCTYPE html>
  <html>
  	<head>
  	</head>
  	<body>
      <content tag="body">
      <g:form controller="query" action ="save" method= "post">
      Query Title:<br>
       <textarea name="querytitle" rows="3" cols="50" ></textarea>
        <br><br>
       Query body:<br>
        <textarea name="querybody" rows="3" cols="50"></textarea>
        <button type="submit" name="submit">SUBMIT</button>
        </g:form>
         </content>
  	</body>
  </html>
  </g:applyLayout>

