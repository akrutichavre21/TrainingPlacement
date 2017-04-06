<g:applyLayout name="mainLayout">
<!DOCTYPE html>
<html>
	<head>

		<style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: left;
        }


        </style>
	</head>
	<body>
    <content tag="body">


	<center><h1>${abc.profile.fullName}</h1></center>
     <table width=100%>
        <tr>
           <th rowspan="2">address:<p>${abc.address}</p></th>
           <td><b>phone no:</b> ${abc.profile.contactNo}</td>
           </tr>
           <tr>
           <td>email-id:<p>${abc.address}</p></td>
        </tr>

     </table>
     <br><br>

     <table width="100%"  >
     <tr>
     <th>about:<p>${abc.bioData}</p></th></tr>
     </table>
     <br><br>

     <table width="100%">
      <tr><th>twelfth:${abc.twelfthPercentage}</th></tr>
       <tr><th>tenth:${abc.tenthPercentage}</th></tr>
        <tr><th>aggregate:${abc.aggregate}</th></tr>
        <tr><th>college:${abc.profile.college}</th></tr>
     </table>
      <br><br>
     <table width="100%">
     	<tr><th>achievments:<p>${abc.achievements}</th></tr>
     </table>
     <center><h2>personal details:</h2></center>
     <table width="100%">
     	<tr><th>name:${abc.profile.fullName}</th></tr>
     	<tr><th>fathername:${abc.fatherName}</th></tr>
     	<tr><th>mothername:${abc.motherName}</th></tr>
     	<tr><th>hobbies:${abc.hobbies}</th></tr>
     	<tr><th>DOB:${abc.profile.dateOfBirth}</th></tr>
     </table>


		<g:link controller="resume" action="edit" id="${abc.id}">
		<button type="button" name="edit">EDIT</button>
		</g:link>
       </content>
	</body>
</html>
</g:applyLayout>



