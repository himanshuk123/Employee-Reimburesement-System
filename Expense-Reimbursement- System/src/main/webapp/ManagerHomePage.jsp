<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css" type="text/css">
    <title>Manager</title>
</head>
<body>
    <nav class="navbar nav-pills navbar-expand-md">
        <a class="nav-link" href="index.jsp">Homepage</a>
        <a class="nav-link active" href="ManagerHomePage.jsp"> Manager</a>
        <a class="nav-link" href="About.html">About_This_Project</a>
    </nav>
    <header class="header">
        <h1>Expense Reimbursement System </h1>
        <h1>Manager Homepage</h1>
    </header>
    <section>
   <div class="container demo">
        <div class="row">
           <div class="col-sm-3">
<form action="http://localhost:8080/ERSSystem/DisplayEmployees"  method="post">
<input type="submit" value="List Employee" style = " margin: 20px;
    							color:white;
   					 				background-color: rgb(97, 97, 228);
   					 				font-size : 27px;
   					 				border: none;
   					 				
				">
</form></div>
           
            
            <div class="col-sm-3">
<form action="http://localhost:8080/ERSSystem/DisplayAllReimbursement"  method="post">
<input type="submit" value="Reimburse Details" style = " margin: 20px;
    							color:white;
   					 				background-color: rgb(97, 97, 228);
   					 				font-size : 27px;
   					 				border: none;
   					 				
				">
</form></div>


            <div class="col-sm-3">
<form action="http://localhost:8080/ERSSystem/UpdateReim"  method="post">
<input type="submit" value="acc/rej req" style = " margin: 20px;
    							color:white;
   					 				background-color: rgb(97, 97, 228);
   					 				font-size : 27px;
   					 				border: none;
   					 				
				">
</form></div>
        
         <div class="col-sm-3">
<form action="http://localhost:8080/ERSSystem/AllAcceptedReim"  method="post">
<input type="submit" value="Accepted requests" style = " margin: 20px;
    							color:white;
   					 				background-color: rgb(97, 97, 228);
   					 				font-size : 27px;
   					 				border: none;
   					 				
				">
</form></div>
        <div class="col-sm-3">
<form action="http://localhost:8080/ERSSystem/AllRejectedReim"  method="post">
<input type="submit" value="Rejected requests" style = " margin: 20px;
    							color:white;
   					 				background-color: rgb(97, 97, 228);
   					 				font-size : 27px;
   					 				border: none;
   					 				
				">
</form></div>
            <div class="col-sm-3">
                <p><a id="tab" href="index.jsp">Logout</a></p>
            </div>
        </div>
      </div>
       
    </section>
    <footer>Himanshu KASH  &#174;</footer>
</body>
</html>