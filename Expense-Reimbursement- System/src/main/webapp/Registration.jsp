<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
    <nav  class="navbar nav-pills navbar-expand-md">
        <a class="nav-link" href="index.jsp">Homepage</a>
        <a class="nav-link active" href="Registration.jsp">Create user account</a>
        <a class="nav-link" href="About.html">About_This_Project</a>
    </nav>
    <header class="header" style = "text-align: center;">
        <h1>Expense Reimbursement System </h1>
        <h1>Registration page</h1>
    </header>
    <section >
            <div class="col-md-6" >
                    <form method="post" action="http://localhost:8080/ERSSystem/EmployeeRegistrationController" class="form" >
                        <div class="form-group">
                            <span><label class="control-label" >User_Id </label></span>
                            <span><input name="empid" type="text" class="form-control" placeholder="type your id here*"
                required="required"></span>
                        </div>

                        <div class="form-group">
                            <span><label class="control-label" >Full Name</label></span>
                            <span><input name="empname" type="text" class="form-control" placeholder="type your name here*"
                required="required"></span>
                        </div>

                        <div class="form-group">
                            <span><label class="control-label">Department</label></span>
                            <span><input name="empldept" type="text" class="form-control" placeholder="type your dept here *"
                required="required" ></span>
                        </div>
                        <div class="form-group">
                            <span><label class="control-label">Designation</label></span>
                            <span><input name="empdesignation" type="text" class="form-control" placeholder="type your desgn here *"
                required="required" ></span>
                        </div>
                <div class="form-group">
                            <span><label class="control-label" >Email</label></span>
                            <span><input name="empemail" type="email" class="form-control" placeholder="type your Email here *"
                required="required"></span>
                        </div> 
                        
                        <div class="form-group">
                            <span><label class="control-label">DOB</label></span>
                            <span><input name="empdob" type="text" class="form-control" placeholder="type your dept here *"
                required="required" ></span> 
                </div> 
                
                <div class="form-group">
                            <span><label class="control-label">Contact No.</label></span>
                            <span><input name="empphoneno" type="number" class="form-control" placeholder="type your dept here *"
                required="required" ></span>
                </div>
                
                <div class="form-group">
                            <span><label class="control-label">Gender</label></span>
                            <span><input name="empgender" type="text" class="form-control" placeholder="type your dept here *"
                required="required" ></span>
                </div>
                <div class="form-group">
                            <span><label class="control-label">Address	</label></span>
                            <span><input name="empaddress" type="text" class="form-control" placeholder="type your dept here *"
                required="required" ></span>
                </div>

                        <div class="form-group">
                            <span><label class="control-label">Password</label></span>
                            <span><input name="emppassword" type="password" class="form-control" placeholder="type your Password here*"
                required="required" ></span>
                        </div>
                        <div class="form-group" style="font-size: large;">            
                            <input type="radio"  name="emptype" value="Employee">
                                <label class="control-label"> Employee</label>
                              <input type="radio"  name="emptype" value="Manager">
                             <label class="control-label">Manager</label><br>
                        </div>
                       <span><button class="btn">Create Account</button></span>
                    </form>
                </div>      
          
    </section>
    <footer>Himanshu KASH &#174;</footer>


    
</body>
</html>