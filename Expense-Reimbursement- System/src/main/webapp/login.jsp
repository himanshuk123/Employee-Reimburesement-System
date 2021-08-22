	<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css" type="text/css">
    <title>EmployeeLogin</title>
</head>
<body>
    <nav class="navbar nav-pills navbar-expand-md">
        <a class="nav-link" href="index.jsp">Homepage</a>
        <a class="nav-link active" href="login.jsp">Log In</a>
        <a class="nav-link" href="About.html">About_This_Project</a>
        
    </nav>
    <header class="header">
        <h1>Expense Reimbursement System </h1>

    </header>
    <section>

                <div class="col-md-6">
                    <form method="post" action="http://localhost:8080/ERSSystem/EmployeeLoginController" class="form" >
                        <div class="form-group">
                            <span><label class="control-label" >User id*</label></span>
                            <span><input name="empid" type="text" class="form-control" placeholder="employee id"
                required="required"></span>
                        </div>
                        <div class="form-group">
                            <span><label class="control-label">Password *</label></span>
                            <span><input name="emppassword" type="password" class="form-control" placeholder="Password"
                required="required" ></span>
                        </div>
                        
                       <div class="form-group" style="font-size: large;">            
                            <input type="radio"  name="emptype" value="Employee">
                                <label class="control-label"> Employee</label>
                              <input type="radio"  name="emptype" value="Manager">
                             <label class="control-label">Manager</label><br>
                        </div>
     

                       <span><button type="submit" class="btn">Log in</button></span>
                    </form>
                </div>
    </section>
     <footer>Himanshu KASH 1 &#174;</footer>
</body>
</html>